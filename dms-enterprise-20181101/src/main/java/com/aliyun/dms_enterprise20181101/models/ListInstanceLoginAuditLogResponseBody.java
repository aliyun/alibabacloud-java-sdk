// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceLoginAuditLogResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidPageSize</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter PageSize is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The logon records of the instance.</p>
     */
    @NameInMap("InstanceLoginAuditLogList")
    public ListInstanceLoginAuditLogResponseBodyInstanceLoginAuditLogList instanceLoginAuditLogList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>074CE7C9-4F9C-5B62-89BC-7B4914A3****</p>
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
        /**
         * <p>The database account that is used to log on to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test_User</p>
         */
        @NameInMap("DbUser")
        public String dbUser;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>177****</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp144d5ky4l4rli0417****.mysql.rds.aliyuncs.com:3306[rm-bp144d5ky4l4r****]</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The time when the user performed an operation on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-18 11:13:26</p>
         */
        @NameInMap("OpTime")
        public String opTime;

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>117.36.XX.XX,100.104.XX.XX</p>
         */
        @NameInMap("RequestIp")
        public String requestIp;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The alias of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test_UserName</p>
         */
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
