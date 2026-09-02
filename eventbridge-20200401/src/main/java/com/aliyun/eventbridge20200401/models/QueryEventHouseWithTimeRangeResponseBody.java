// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventHouseWithTimeRangeResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. Success indicates a successful call. Other values indicate specific error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The structured result data returned by the SQL query.</p>
     */
    @NameInMap("Data")
    public QueryEventHouseWithTimeRangeResponseBodyData data;

    /**
     * <p>A success message if the call succeeds, or a specific error message if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEventHouseWithTimeRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventHouseWithTimeRangeResponseBody self = new QueryEventHouseWithTimeRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventHouseWithTimeRangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventHouseWithTimeRangeResponseBody setData(QueryEventHouseWithTimeRangeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEventHouseWithTimeRangeResponseBodyData getData() {
        return this.data;
    }

    public QueryEventHouseWithTimeRangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEventHouseWithTimeRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventHouseWithTimeRangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventHouseWithTimeRangeResponseBodyData extends TeaModel {
        /**
         * <p>The list of result rows returned by the SQL query.</p>
         */
        @NameInMap("Rows")
        public java.util.List<Row> rows;

        /**
         * <p>The number of result rows actually returned by the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryEventHouseWithTimeRangeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventHouseWithTimeRangeResponseBodyData self = new QueryEventHouseWithTimeRangeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventHouseWithTimeRangeResponseBodyData setRows(java.util.List<Row> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<Row> getRows() {
            return this.rows;
        }

        public QueryEventHouseWithTimeRangeResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
