// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteScriptResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The error message about the gateway.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the database.</p>
     * <br>
     * <p>>  This parameter is equivalent to the DatabaseId parameter in the SearchDatabase, ListDatabases, and GetDatabase operations. You can call one of these operations to obtain the required database ID. For more information, see [SearchDatabase](~~141876~~), [ListDatabases](~~141873~~), and [GetDatabase](~~141869~~).</p>
     */
    @NameInMap("Results")
    public java.util.List<ExecuteScriptResponseBodyResults> results;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScriptResponseBody self = new ExecuteScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteScriptResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExecuteScriptResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecuteScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteScriptResponseBody setResults(java.util.List<ExecuteScriptResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ExecuteScriptResponseBodyResults> getResults() {
        return this.results;
    }

    public ExecuteScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteScriptResponseBodyResults extends TeaModel {
        /**
         * <p>The fields that are queried after the SQL statement is executed.</p>
         */
        @NameInMap("ColumnNames")
        public java.util.List<String> columnNames;

        /**
         * <p>The ID of the tenant.</p>
         * <br>
         * <p>>  To obtain the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Tenant information](~~181330~~).</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>The total number of entries that are returned.</p>
         */
        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        /**
         * <p>The rows that are queried after the SQL statement is executed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ExecuteScriptResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ExecuteScriptResponseBodyResults self = new ExecuteScriptResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ExecuteScriptResponseBodyResults setColumnNames(java.util.List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public java.util.List<String> getColumnNames() {
            return this.columnNames;
        }

        public ExecuteScriptResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecuteScriptResponseBodyResults setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public ExecuteScriptResponseBodyResults setRows(java.util.List<java.util.Map<String, ?>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        public ExecuteScriptResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
