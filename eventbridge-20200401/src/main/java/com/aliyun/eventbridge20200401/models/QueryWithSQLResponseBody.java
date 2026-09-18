// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryWithSQLResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><p>Success: The request was successful.    </p>
     * </li>
     * <li><p>Other values: An error occurred. For more information, see error codes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The event trace information.</p>
     */
    @NameInMap("Data")
    public QueryWithSQLResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryWithSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWithSQLResponseBody self = new QueryWithSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWithSQLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWithSQLResponseBody setData(QueryWithSQLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryWithSQLResponseBodyData getData() {
        return this.data;
    }

    public QueryWithSQLResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWithSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWithSQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWithSQLResponseBodyData extends TeaModel {
        /**
         * <p>The query result rows.</p>
         */
        @NameInMap("Rows")
        public java.util.List<Row> rows;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryWithSQLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWithSQLResponseBodyData self = new QueryWithSQLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWithSQLResponseBodyData setRows(java.util.List<Row> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<Row> getRows() {
            return this.rows;
        }

        public QueryWithSQLResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
