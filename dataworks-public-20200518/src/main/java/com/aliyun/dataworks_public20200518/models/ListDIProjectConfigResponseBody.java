// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the query operation.</p>
     */
    @NameInMap("Data")
    public ListDIProjectConfigResponseBodyData data;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDIProjectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigResponseBody self = new ListDIProjectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigResponseBody setData(ListDIProjectConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDIProjectConfigResponseBodyData getData() {
        return this.data;
    }

    public ListDIProjectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDIProjectConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDIProjectConfigResponseBodyData extends TeaModel {
        /**
         * <p>The default global configuration of sync solutions. The value indicates the processing rules of different types of DDL messages. Example:</p>
         * <br>
         * <p>{"RENAMECOLUMN":"WARNING","DROPTABLE":"WARNING","CREATETABLE":"WARNING","MODIFYCOLUMN":"WARNING","TRUNCATETABLE":"WARNING","DROPCOLUMN":"WARNING","ADDCOLUMN":"WARNING","RENAMETABLE":"WARNING"}</p>
         * <br>
         * <p>Field description:</p>
         * <br>
         * <p>*   RENAMECOLUMN: renames the column.</p>
         * <p>*   DROPTABLE: deletes the table.</p>
         * <p>*   CREATETABLE: creates a table.</p>
         * <p>*   MODIFYCOLUMN: changes the column data type.</p>
         * <p>*   TRUNCATETABLE: clears the table.</p>
         * <p>*   DROPCOLUMN: deletes the column.</p>
         * <p>*   ADDCOLUMN: creates a column.</p>
         * <p>*   RENAMETABLE: renames the table.</p>
         * <br>
         * <p>DataWorks processes a DDL message of a specific type based on the following policies after it receives the message:</p>
         * <br>
         * <p>*   WARNING: ignores the message and records an alert in real-time sync logs. The alert contains information about the situation that the message is ignored because of an execution error.</p>
         * <p>*   IGNORE: discards the message and does not send it to the destination data source.</p>
         * <p>*   CRITICAL: terminates the real-time sync node and sets the node status to Failed.</p>
         * <p>*   NORMAL: sends the message to the destination data source to process the message. Each destination data source may process DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.</p>
         */
        @NameInMap("Config")
        public String config;

        public static ListDIProjectConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDIProjectConfigResponseBodyData self = new ListDIProjectConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDIProjectConfigResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
