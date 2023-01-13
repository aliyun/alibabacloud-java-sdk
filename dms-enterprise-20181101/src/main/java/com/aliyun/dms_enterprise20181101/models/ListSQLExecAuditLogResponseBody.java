// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The entries returned.</p>
     */
    @NameInMap("SQLExecAuditLogList")
    public ListSQLExecAuditLogResponseBodySQLExecAuditLogList SQLExecAuditLogList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of entries returned.</p>
     */
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
        /**
         * <p>The number of rows affected by the SQL statement. For example, if you execute an SQL statement to query data, the number of retrieved rows is returned.</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The ID of the database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The amount of time consumed by the execution of the SQL statement. Unit: milliseconds.</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **FAIL**: The SQL statement fails to be executed.</p>
         * <p>*   **NOEXE**: The SQL statement has not been executed.</p>
         * <p>*   **RUNNING**: The SQL statement is being executed.</p>
         * <p>*   **CANCEL**: The execution of the SQL statement is canceled.</p>
         * <p>*   **SUCCESS**: The SQL statement is executed.</p>
         */
        @NameInMap("ExecState")
        public String execState;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the database.</p>
         * <br>
         * <p>>  If the SQL statement takes effect on an instance, the name of the instance is returned.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is a physical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The time when the operation specified by the SQL statement was performed on the instance or database.</p>
         */
        @NameInMap("OpTime")
        public String opTime;

        /**
         * <p>The comment on the SQL statement.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The SQL statement that was written.</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **SELECT**: the SQL statement that is used to query data.</p>
         * <p>*   **INSERT**: the SQL statement that is used to insert data.</p>
         * <p>*   **DELETE**: the SQL statement that is used to delete data.</p>
         * <p>*   **CREATE_TABLE**: the SQL statement that is used to create tables.</p>
         * <br>
         * <p>>  To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click **Operation Audit**. Then, you can view all supported types of SQL statements from the **SQL type** drop-down list.</p>
         */
        @NameInMap("SQLType")
        public String SQLType;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The ID of the user who wrote the SQL statement.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user who wrote the SQL statement.</p>
         */
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
