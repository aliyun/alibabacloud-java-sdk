// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaTablesResponseBody extends TeaModel {
    /**
     * <p>The response code of the operation. A value of Success indicates success. An error code is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of event tables bound to the Agent. All results are returned at once without pagination.</p>
     */
    @NameInMap("Data")
    public ListLumaTablesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaTablesResponseBody self = new ListLumaTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaTablesResponseBody setData(ListLumaTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaTablesResponseBodyData getData() {
        return this.data;
    }

    public ListLumaTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaTablesResponseBodyData extends TeaModel {
        /**
         * <p>The list of event tables bound to the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_table&quot;,&quot;Namespace&quot;:&quot;my_namespace&quot;}]</p>
         */
        @NameInMap("Tables")
        public java.util.List<LumaTable> tables;

        public static ListLumaTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaTablesResponseBodyData self = new ListLumaTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaTablesResponseBodyData setTables(java.util.List<LumaTable> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<LumaTable> getTables() {
            return this.tables;
        }

    }

}
