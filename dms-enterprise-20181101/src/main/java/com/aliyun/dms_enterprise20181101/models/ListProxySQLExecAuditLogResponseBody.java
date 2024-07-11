// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidStartTime</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter StartTime is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The audit information about the database instance that is provided by the secure access proxy feature.</p>
     */
    @NameInMap("ProxySQLExecAuditLogList")
    public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList proxySQLExecAuditLogList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50ECB006-2C35-5FCA-91B9-01987A0B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        /**
         * <p>Indicates the total number of rows returned after the SQL statement was executed. If an SELECT SQL statement is executed, the return value of this parameter indicates the total number of the queried data rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The amount of time that is consumed to execute the SQL statement. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1324</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>FAIL</strong>: The execution of the SQL statement fails.</li>
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
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4***</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-uf662nrg017c6****.mysql.polardb.rds.aliyuncs.com:3306【test】</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The time at which the user executes the SQL statement on the database instance. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
         * 
         * <strong>example:</strong>
         * <p>1636876446000</p>
         */
        @NameInMap("OpTime")
        public String opTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The SQL statement that was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1;</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>INSERT</strong></li>
         * <li><strong>DELETE</strong></li>
         * <li><strong>CREATE_TABLE</strong></li>
         * </ul>
         * <blockquote>
         * <p> You can choose Operation Audit &gt; Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.</p>
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
         * <p>test_db</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>4****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>testNickName</p>
         */
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
