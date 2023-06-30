// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveDataAuditLogResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The audit logs for sensitive data.</p>
     */
    @NameInMap("SensitiveDataAuditLogList")
    public java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogList> sensitiveDataAuditLogList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The name of the column that contains sensitive data.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The permission that the user has on the column. Valid values:</p>
         * <br>
         * <p>*   **No permission**</p>
         * <p>*   **Partial redaction**</p>
         * <p>*   **Plaintext**</p>
         * <p>*   **Change**</p>
         * <p>*   **Enable data masking**</p>
         * <p>*   **Disable data masking**</p>
         */
        @NameInMap("ColumnPermissionType")
        public String columnPermissionType;

        /**
         * <p>The algorithm used for data masking.</p>
         */
        @NameInMap("DesensitizationRule")
        public String desensitizationRule;

        /**
         * <p>The sensitivity level of the data. Valid values:</p>
         * <br>
         * <p>*   **Low**</p>
         * <p>*   **Medium**</p>
         * <p>*   **High**</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>The name of the table that stores the sensitive data.</p>
         */
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
        /**
         * <p>The name of the database that stores the sensitive data.</p>
         */
        @NameInMap("DbDisplayName")
        public String dbDisplayName;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the function module whose audit logs were queried.</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The time when the operation was performed. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
         */
        @NameInMap("OpTime")
        public String opTime;

        /**
         * <p>The logs for sensitive data.</p>
         */
        @NameInMap("SensitiveDataLog")
        public java.util.List<ListSensitiveDataAuditLogResponseBodySensitiveDataAuditLogListSensitiveDataLog> sensitiveDataLog;

        /**
         * <p>The details of the object on which the operation was performed. The value of this parameter is in one of the following formats:</p>
         * <br>
         * <p>*   Object name - object ID</p>
         * <p>*   Object name (object ID)</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The user ID of the requester.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The username of the requester.</p>
         */
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
