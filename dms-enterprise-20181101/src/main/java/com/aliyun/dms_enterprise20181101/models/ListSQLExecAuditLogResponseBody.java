// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingStartTime</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>StartTime is mandatory for this action.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39BC9C86-95AE-58F2-9862-A7C3D896****</p>
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
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>2157****</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The amount of time consumed by the execution of the SQL statement. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>FAIL</strong>: The SQL statement fails to be executed.</li>
         * <li><strong>NOEXE</strong>: The SQL statement has not been executed.</li>
         * <li><strong>RUNNING</strong>: The SQL statement is being executed.</li>
         * <li><strong>CANCEL</strong>: The execution of the SQL statement is canceled.</li>
         * <li><strong>SUCCESS</strong>: The SQL statement is executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("ExecState")
        public String execState;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>185***</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the database.</p>
         * <blockquote>
         * <p> If the SQL statement takes effect on an instance, the name of the instance is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar123@pc-bp1h9tgq4st9g****.mysql.polardb.rds.aliyuncs.com:3306[polar_qw_test]</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is a physical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The time when the operation specified by the SQL statement was performed on the instance or database.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-08 11:04:27</p>
         */
        @NameInMap("OpTime")
        public String opTime;

        /**
         * <p>The comment on the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The SQL statement that was written.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM <code>polar123</code>.<code>p_qw</code> ORDER BY <code>id</code> DESC</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong>: the SQL statement that is used to query data.</li>
         * <li><strong>INSERT</strong>: the SQL statement that is used to insert data.</li>
         * <li><strong>DELETE</strong>: the SQL statement that is used to delete data.</li>
         * <li><strong>CREATE_TABLE</strong>: the SQL statement that is used to create tables.</li>
         * </ul>
         * <blockquote>
         * <p> To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click <strong>Operation Audit</strong>. Then, you can view all supported types of SQL statements from the <strong>SQL type</strong> drop-down list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SQLType")
        public String SQLType;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>polar123</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The ID of the user who wrote the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user who wrote the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test_UserName</p>
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
