// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceLoginAuditLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("InstanceLoginAuditLogList")
    public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList instanceLoginAuditLogList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceLoginAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceLoginAuditLogResponseBody self = new ListInstanceLoginAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceLoginAuditLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstanceLoginAuditLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInstanceLoginAuditLogResponseBody setInstanceLoginAuditLogList(ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList instanceLoginAuditLogList) {
        this.instanceLoginAuditLogList = instanceLoginAuditLogList;
        return this;
    }
    public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList getInstanceLoginAuditLogList() {
        return this.instanceLoginAuditLogList;
    }

    public ListInstanceLoginAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceLoginAuditLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstanceLoginAuditLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog extends TeaModel {
        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OpTime")
        public String opTime;

        @NameInMap("RequestIp")
        public String requestIp;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog self = new ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog();
            return TeaModel.build(map, self);
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setOpTime(String opTime) {
            this.opTime = opTime;
            return this;
        }
        public String getOpTime() {
            return this.opTime;
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setRequestIp(String requestIp) {
            this.requestIp = requestIp;
            return this;
        }
        public String getRequestIp() {
            return this.requestIp;
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList extends TeaModel {
        @NameInMap("InstanceLoginAuditLog")
        public java.util.List<ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog> instanceLoginAuditLog;

        public static ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList self = new ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList();
            return TeaModel.build(map, self);
        }

        public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList setInstanceLoginAuditLog(java.util.List<ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog> instanceLoginAuditLog) {
            this.instanceLoginAuditLog = instanceLoginAuditLog;
            return this;
        }
        public java.util.List<ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogListInstanceLoginAuditLog> getInstanceLoginAuditLog() {
            return this.instanceLoginAuditLog;
        }

    }

}
