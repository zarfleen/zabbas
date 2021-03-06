package org.burnix.zabbas.content;

import android.net.Uri;
import android.provider.BaseColumns;

public class SlotHistory implements BaseColumns
{
	public static final class JSON
	{
		public static final String IDENTIFIER = "nzo_id";
		public static final String FILENAME = "nzb_name";
		public static final String STATUS = "status";
	}
	
	public static final String HOST_ID = "host_id";
	public static final String IDENTIFIER = "nzo_id";
	public static final String DATA = "data";

	public static final String DEFAULT_ORDER_BY = _ID;

	public static final String MIME_DIR_PREFIX =
		"vnd.android.cursor.dir";
	public static final String MIME_ITEM_PREFIX =
		"vnd.android.cursor.item";
	public static final String MIME_ITEM = "vnd.burnix.zabbas.content.slothistory";
	public static final String MIME_TYPE_SINGLE =
		MIME_ITEM_PREFIX + "/" + MIME_ITEM;
	public static final String MIME_TYPE_MULTIPLE =
		MIME_DIR_PREFIX + "/" + MIME_ITEM;
	public static final String AUTHORITY = "org.burnix.zabbas.content";
	public static final String PATH_SINGLE = "slothistory/#";
	public static final String PATH_MULTIPLE = "slothistory";
	public static final Uri CONTENT_URI =
		Uri.parse("content://" + AUTHORITY + "/" + PATH_MULTIPLE);
}
