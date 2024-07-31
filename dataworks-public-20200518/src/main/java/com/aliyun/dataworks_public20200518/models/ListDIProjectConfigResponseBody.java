// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the query.</p>
     */
    @NameInMap("Data")
    public ListDIProjectConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The default global configuration of synchronization solutions. The value indicates the processing rules of different types of DDL messages. Example: {&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
         * <p>Field description:</p>
         * <ul>
         * <li>RENAMECOLUMN: renames a column.</li>
         * <li>DROPTABLE: deletes a table.</li>
         * <li>CREATETABLE: creates a table.</li>
         * <li>MODIFYCOLUMN: changes the data type of a column.</li>
         * <li>TRUNCATETABLE: clears a table.</li>
         * <li>DROPCOLUMN: deletes a column.</li>
         * <li>ADDCOLUMN: creates a column.</li>
         * <li>RENAMETABLE: renames a table.</li>
         * </ul>
         * <p>DataWorks processes a DDL message of a specific type based on the following rules:</p>
         * <ul>
         * <li>WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.</li>
         * <li>IGNORE: discards the message and does not send it to the destination.</li>
         * <li>CRITICAL: terminates the real-time synchronization node and sets the node status to Failed.</li>
         * <li>NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
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
