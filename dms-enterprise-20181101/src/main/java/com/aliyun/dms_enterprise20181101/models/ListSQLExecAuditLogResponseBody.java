// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The entries returned.
    @NameInMap("SQLExecAuditLogList")
    public ListSQLExecAuditLogResponseBodySQLExecAuditLogList SQLExecAuditLogList;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSQLExecAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSQLExecAuditLogResponseBody self = new ListSQLExecAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSQLExecAuditLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSQLExecAuditLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSQLExecAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSQLExecAuditLogResponseBody setSQLExecAuditLogList(ListSQLExecAuditLogResponseBodySQLExecAuditLogList SQLExecAuditLogList) {
        this.SQLExecAuditLogList = SQLExecAuditLogList;
        return this;
    }
    public ListSQLExecAuditLogResponseBodySQLExecAuditLogList getSQLExecAuditLogList() {
        return this.SQLExecAuditLogList;
    }

    public ListSQLExecAuditLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSQLExecAuditLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog extends TeaModel {
        // The number of rows affected by the SQL statement. For example, if you execute an SQL statement to query data, the number of retrieved rows is returned.
        @NameInMap("AffectRows")
        public Long affectRows;

        // The ID of the database.
        @NameInMap("DbId")
        public Long dbId;

        // The amount of time consumed by the execution of the SQL statement. Unit: milliseconds.
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        // The execution status of the SQL statement. Valid values:
        // 
        // *   **FAIL**: The SQL statement fails to be executed.
        // *   **NOEXE**: The SQL statement has not been executed.
        // *   **RUNNING**: The SQL statement is being executed.
        // *   **CANCEL**: The execution of the SQL statement is canceled.
        // *   **SUCCESS**: The SQL statement is executed.
        @NameInMap("ExecState")
        public String execState;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public Long instanceId;

        // The name of the database.
        // 
        // >  If the SQL statement takes effect on an instance, the name of the instance is returned.
        @NameInMap("InstanceName")
        public String instanceName;

        // Indicates whether the database is a logical database. Valid values:
        // 
        // *   **true**: The database is a logical database.
        // *   **false**: The database is a physical database.
        @NameInMap("Logic")
        public Boolean logic;

        // The time when the operation specified by the SQL statement was performed on the instance or database.
        @NameInMap("OpTime")
        public String opTime;

        // The comment on the SQL statement.
        @NameInMap("Remark")
        public String remark;

        // The SQL statement that was written.
        @NameInMap("SQL")
        public String SQL;

        // The type of the SQL statement. Valid values:
        // 
        // *   **SELECT**: the SQL statement that is used to query data.
        // *   **INSERT**: the SQL statement that is used to insert data.
        // *   **DELETE**: the SQL statement that is used to delete data.
        // *   **CREATE_TABLE**: the SQL statement that is used to create tables.
        // 
        // >  To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click **Operation Audit**. Then, you can view all supported types of SQL statements from the **SQL type** drop-down list.
        @NameInMap("SQLType")
        public String SQLType;

        // The name of the database.
        @NameInMap("SchemaName")
        public String schemaName;

        // The ID of the user who wrote the SQL statement.
        @NameInMap("UserId")
        public Long userId;

        // The nickname of the user who wrote the SQL statement.
        @NameInMap("UserName")
        public String userName;

        public static ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog build(java.util.Map<String, ?> map) throws Exception {
            ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog self = new ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog();
            return TeaModel.build(map, self);
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setExecState(String execState) {
            this.execState = execState;
            return this;
        }
        public String getExecState() {
            return this.execState;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setOpTime(String opTime) {
            this.opTime = opTime;
            return this;
        }
        public String getOpTime() {
            return this.opTime;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setSQLType(String SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public String getSQLType() {
            return this.SQLType;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListSQLExecAuditLogResponseBodySQLExecAuditLogList extends TeaModel {
        @NameInMap("SQLExecAuditLog")
        public java.util.List<ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog> SQLExecAuditLog;

        public static ListSQLExecAuditLogResponseBodySQLExecAuditLogList build(java.util.Map<String, ?> map) throws Exception {
            ListSQLExecAuditLogResponseBodySQLExecAuditLogList self = new ListSQLExecAuditLogResponseBodySQLExecAuditLogList();
            return TeaModel.build(map, self);
        }

        public ListSQLExecAuditLogResponseBodySQLExecAuditLogList setSQLExecAuditLog(java.util.List<ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog> SQLExecAuditLog) {
            this.SQLExecAuditLog = SQLExecAuditLog;
            return this;
        }
        public java.util.List<ListSQLExecAuditLogResponseBodySQLExecAuditLogListSQLExecAuditLog> getSQLExecAuditLog() {
            return this.SQLExecAuditLog;
        }

    }

}
