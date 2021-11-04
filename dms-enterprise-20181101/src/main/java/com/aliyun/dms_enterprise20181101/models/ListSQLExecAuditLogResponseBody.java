// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLExecAuditLogList")
    public ListSQLExecAuditLogResponseBodySQLExecAuditLogList SQLExecAuditLogList;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        @NameInMap("ExecState")
        public String execState;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Logic")
        public Boolean logic;

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
