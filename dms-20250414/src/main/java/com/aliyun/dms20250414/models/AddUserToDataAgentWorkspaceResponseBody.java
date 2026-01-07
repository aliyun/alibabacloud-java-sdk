// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddUserToDataAgentWorkspaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddUserToDataAgentWorkspaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DMS-DA-40114</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-***-695C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddUserToDataAgentWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDataAgentWorkspaceResponseBody self = new AddUserToDataAgentWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserToDataAgentWorkspaceResponseBody setData(AddUserToDataAgentWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddUserToDataAgentWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public AddUserToDataAgentWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddUserToDataAgentWorkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddUserToDataAgentWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUserToDataAgentWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddUserToDataAgentWorkspaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1765960516</p>
         */
        @NameInMap("JoinTime")
        public Long joinTime;

        /**
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RunningTaskNumber")
        public Long runningTaskNumber;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalTaskNumber")
        public Long totalTaskNumber;

        /**
         * <strong>example:</strong>
         * <p>agentTest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static AddUserToDataAgentWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddUserToDataAgentWorkspaceResponseBodyData self = new AddUserToDataAgentWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddUserToDataAgentWorkspaceResponseBodyData setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public AddUserToDataAgentWorkspaceResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public AddUserToDataAgentWorkspaceResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public AddUserToDataAgentWorkspaceResponseBodyData setRunningTaskNumber(Long runningTaskNumber) {
            this.runningTaskNumber = runningTaskNumber;
            return this;
        }
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        public AddUserToDataAgentWorkspaceResponseBodyData setTotalTaskNumber(Long totalTaskNumber) {
            this.totalTaskNumber = totalTaskNumber;
            return this;
        }
        public Long getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        public AddUserToDataAgentWorkspaceResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
