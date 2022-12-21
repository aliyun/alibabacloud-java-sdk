// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The audit information about the database instance that is provided by the secure access proxy feature.
    @NameInMap("ProxySQLExecAuditLogList")
    public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList proxySQLExecAuditLogList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProxySQLExecAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProxySQLExecAuditLogResponseBody self = new ListProxySQLExecAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProxySQLExecAuditLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProxySQLExecAuditLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProxySQLExecAuditLogResponseBody setProxySQLExecAuditLogList(ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList proxySQLExecAuditLogList) {
        this.proxySQLExecAuditLogList = proxySQLExecAuditLogList;
        return this;
    }
    public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList getProxySQLExecAuditLogList() {
        return this.proxySQLExecAuditLogList;
    }

    public ListProxySQLExecAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProxySQLExecAuditLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProxySQLExecAuditLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog extends TeaModel {
        // Indicates the total number of rows returned after the SQL statement was executed. If an SELECT SQL statement is executed, the return value of this parameter indicates the total number of the queried data rows.
        @NameInMap("AffectRows")
        public Long affectRows;

        // The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        // The execution status of the SQL statement. Valid values:
        // 
        // *   **FAIL**: The execution of the SQL statement fails.
        // *   **CANCEL**: The execution of the SQL statement is canceled.
        // *   **SUCCESS**: The SQL statement is executed.
        @NameInMap("ExecState")
        public String execState;

        // The ID of the database instance.
        @NameInMap("InstanceId")
        public Long instanceId;

        // The name of the database instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // The time at which the user executes the SQL statement on the database instance. The value of this parameter must be a timestamp that follows the UNIX time format.
        @NameInMap("OpTime")
        public String opTime;

        // The description.
        @NameInMap("Remark")
        public String remark;

        // The SQL statement that was executed.
        @NameInMap("SQL")
        public String SQL;

        // The type of the SQL statement. Valid values:
        // 
        // *   **SELECT**
        // *   **INSERT**
        // *   **DELETE**
        // *   **CREATE_TABLE**
        // 
        // >  You can choose Operation Audit > Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.
        @NameInMap("SQLType")
        public String SQLType;

        // The name of the database.
        @NameInMap("SchemaName")
        public String schemaName;

        // The ID of the user.
        @NameInMap("UserId")
        public Long userId;

        // The nickname of the user.
        @NameInMap("UserName")
        public String userName;

        public static ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog build(java.util.Map<String, ?> map) throws Exception {
            ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog self = new ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog();
            return TeaModel.build(map, self);
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setExecState(String execState) {
            this.execState = execState;
            return this;
        }
        public String getExecState() {
            return this.execState;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setOpTime(String opTime) {
            this.opTime = opTime;
            return this;
        }
        public String getOpTime() {
            return this.opTime;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setSQLType(String SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public String getSQLType() {
            return this.SQLType;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList extends TeaModel {
        @NameInMap("ProxySQLExecAuditLog")
        public java.util.List<ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog> proxySQLExecAuditLog;

        public static ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList build(java.util.Map<String, ?> map) throws Exception {
            ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList self = new ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList();
            return TeaModel.build(map, self);
        }

        public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList setProxySQLExecAuditLog(java.util.List<ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog> proxySQLExecAuditLog) {
            this.proxySQLExecAuditLog = proxySQLExecAuditLog;
            return this;
        }
        public java.util.List<ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogListProxySQLExecAuditLog> getProxySQLExecAuditLog() {
            return this.proxySQLExecAuditLog;
        }

    }

}
