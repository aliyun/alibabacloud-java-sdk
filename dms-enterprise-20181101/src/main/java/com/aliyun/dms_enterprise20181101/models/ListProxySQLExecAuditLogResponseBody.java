// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProxySQLExecAuditLogList")
    public ListProxySQLExecAuditLogResponseBodyProxySQLExecAuditLogList proxySQLExecAuditLogList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        @NameInMap("ExecState")
        public String execState;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OpTime")
        public String opTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SQL")
        public String SQL;

        @NameInMap("SQLType")
        public String SQLType;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("UserId")
        public Long userId;

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
