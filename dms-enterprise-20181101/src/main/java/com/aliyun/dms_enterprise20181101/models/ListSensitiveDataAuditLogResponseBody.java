// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveDataAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitiveDataAuditLogList")
    public java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList> sensitiveDataAuditLogList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSensitiveDataAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveDataAuditLogResponseBody self = new ListSensitiveDataAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitiveDataAuditLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSensitiveDataAuditLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSensitiveDataAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitiveDataAuditLogResponseBody setSensitiveDataAuditLogList(java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList> sensitiveDataAuditLogList) {
        this.sensitiveDataAuditLogList = sensitiveDataAuditLogList;
        return this;
    }
    public java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList> getSensitiveDataAuditLogList() {
        return this.sensitiveDataAuditLogList;
    }

    public ListSensitiveDataAuditLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSensitiveDataAuditLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnPermissionType")
        public String columnPermissionType;

        @NameInMap("DesensitizationRule")
        public String desensitizationRule;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("TableName")
        public String tableName;

        public static ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog self = new ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog();
            return TeaModel.build(map, self);
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog setColumnPermissionType(String columnPermissionType) {
            this.columnPermissionType = columnPermissionType;
            return this;
        }
        public String getColumnPermissionType() {
            return this.columnPermissionType;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog setDesensitizationRule(String desensitizationRule) {
            this.desensitizationRule = desensitizationRule;
            return this;
        }
        public String getDesensitizationRule() {
            return this.desensitizationRule;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList extends TeaModel {
        @NameInMap("DbDisplayName")
        public String dbDisplayName;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("OpTime")
        public String opTime;

        @NameInMap("SensitiveDataLog")
        public java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog> sensitiveDataLog;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList self = new ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList();
            return TeaModel.build(map, self);
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setDbDisplayName(String dbDisplayName) {
            this.dbDisplayName = dbDisplayName;
            return this;
        }
        public String getDbDisplayName() {
            return this.dbDisplayName;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setOpTime(String opTime) {
            this.opTime = opTime;
            return this;
        }
        public String getOpTime() {
            return this.opTime;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setSensitiveDataLog(java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog> sensitiveDataLog) {
            this.sensitiveDataLog = sensitiveDataLog;
            return this;
        }
        public java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog> getSensitiveDataLog() {
            return this.sensitiveDataLog;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
