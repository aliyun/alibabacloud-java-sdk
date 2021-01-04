// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ExecuteScriptResponseBodyResults> results;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScriptResponseBody self = new ExecuteScriptResponseBody();
        return TeaModel.build(map, self);
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

    public ExecuteScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteScriptResponseBodyResults extends TeaModel {
        @NameInMap("ColumnNames")
        public java.util.List<String> columnNames;

        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Message")
        public String message;

        @NameInMap("RowCount")
        public Long rowCount;

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

    }

}
