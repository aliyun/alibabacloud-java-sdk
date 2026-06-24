// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetSqlConsoleOperationLogResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSqlConsoleOperationLogResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C0A813EB-4623-523A-8598-86390CB4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of logs.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetSqlConsoleOperationLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConsoleOperationLogResponseBody self = new GetSqlConsoleOperationLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlConsoleOperationLogResponseBody setData(java.util.List<GetSqlConsoleOperationLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSqlConsoleOperationLogResponseBodyData> getData() {
        return this.data;
    }

    public GetSqlConsoleOperationLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSqlConsoleOperationLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSqlConsoleOperationLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlConsoleOperationLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSqlConsoleOperationLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetSqlConsoleOperationLogResponseBodyData extends TeaModel {
        /**
         * <p>The number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The execution duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The database search name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:mysql@xxx.com">mysql@xxx.com</a></p>
         */
        @NameInMap("DatabaseSearchName")
        public String databaseSearchName;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Denied</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The database schema.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM user;</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The SQL type.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The start time of the logs.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the statement is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetSqlConsoleOperationLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlConsoleOperationLogResponseBodyData self = new GetSqlConsoleOperationLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlConsoleOperationLogResponseBodyData setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public GetSqlConsoleOperationLogResponseBodyData setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public GetSqlConsoleOperationLogResponseBodyData setDatabaseSearchName(String databaseSearchName) {
            this.databaseSearchName = databaseSearchName;
            return this;
        }
        public String getDatabaseSearchName() {
            return this.databaseSearchName;
        }

        public GetSqlConsoleOperationLogResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetSqlConsoleOperationLogResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetSqlConsoleOperationLogResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetSqlConsoleOperationLogResponseBodyData setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetSqlConsoleOperationLogResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetSqlConsoleOperationLogResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetSqlConsoleOperationLogResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
