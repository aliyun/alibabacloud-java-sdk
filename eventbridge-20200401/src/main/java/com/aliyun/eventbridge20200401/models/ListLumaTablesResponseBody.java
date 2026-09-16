// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaTablesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of event tables bound to the agent, including entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListLumaTablesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value Operation success is returned if the call succeeds. A specific error description is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of this request, which is used for troubleshooting and ticket submission.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates a successful call.</p>
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
         * <p>The effective page size for this request. If the Limit parameter is not specified, the server default value is used. If the specified value exceeds the upper limit, the value is adjusted to the maximum allowed value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The token for the next page. Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The list of event tables bound to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_table&quot;,&quot;Namespace&quot;:&quot;my_namespace&quot;}]</p>
         */
        @NameInMap("Tables")
        public java.util.List<LumaTable> tables;

        /**
         * <p>The total number of event tables bound to the agent, regardless of the number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaTablesResponseBodyData self = new ListLumaTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaTablesResponseBodyData setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ListLumaTablesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaTablesResponseBodyData setTables(java.util.List<LumaTable> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<LumaTable> getTables() {
            return this.tables;
        }

        public ListLumaTablesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
