// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentWorkspaceMemberRoleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateDataAgentWorkspaceMemberRoleResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>DMS-DA-40114</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D2-*****-A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDataAgentWorkspaceMemberRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentWorkspaceMemberRoleResponseBody self = new UpdateDataAgentWorkspaceMemberRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentWorkspaceMemberRoleResponseBody setData(UpdateDataAgentWorkspaceMemberRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDataAgentWorkspaceMemberRoleResponseBodyData getData() {
        return this.data;
    }

    public UpdateDataAgentWorkspaceMemberRoleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateDataAgentWorkspaceMemberRoleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateDataAgentWorkspaceMemberRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataAgentWorkspaceMemberRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDataAgentWorkspaceMemberRoleResponseBodyData extends TeaModel {
        /**
         * <p>The time when the user joined the workspace. This is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765961516</p>
         */
        @NameInMap("JoinTime")
        public Long joinTime;

        /**
         * <p>The UID of the member whose role was changed.</p>
         * 
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The new role of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The number of running tasks for the user in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RunningTaskNumber")
        public Long runningTaskNumber;

        /**
         * <p>The total number of tasks for the user in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalTaskNumber")
        public Long totalTaskNumber;

        /**
         * <p>The RAM username.</p>
         * 
         * <strong>example:</strong>
         * <p>yunqitest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static UpdateDataAgentWorkspaceMemberRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataAgentWorkspaceMemberRoleResponseBodyData self = new UpdateDataAgentWorkspaceMemberRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBodyData setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBodyData setRunningTaskNumber(Long runningTaskNumber) {
            this.runningTaskNumber = runningTaskNumber;
            return this;
        }
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBodyData setTotalTaskNumber(Long totalTaskNumber) {
            this.totalTaskNumber = totalTaskNumber;
            return this;
        }
        public Long getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
