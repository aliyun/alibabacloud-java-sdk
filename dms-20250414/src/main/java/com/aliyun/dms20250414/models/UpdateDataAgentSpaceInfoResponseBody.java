// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentSpaceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateDataAgentSpaceInfoResponseBodyData data;

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
    public String success;

    public static UpdateDataAgentSpaceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentSpaceInfoResponseBody self = new UpdateDataAgentSpaceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentSpaceInfoResponseBody setData(UpdateDataAgentSpaceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDataAgentSpaceInfoResponseBodyData getData() {
        return this.data;
    }

    public UpdateDataAgentSpaceInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateDataAgentSpaceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateDataAgentSpaceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataAgentSpaceInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateDataAgentSpaceInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1765960516</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>space for test new</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1765962516</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalMember")
        public String totalMember;

        /**
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>yunqitest_v2</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        /**
         * <strong>example:</strong>
         * <p>space for test new</p>
         */
        @NameInMap("WorkspaceStatus")
        public String workspaceStatus;

        public static UpdateDataAgentSpaceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataAgentSpaceInfoResponseBodyData self = new UpdateDataAgentSpaceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setTotalMember(String totalMember) {
            this.totalMember = totalMember;
            return this;
        }
        public String getTotalMember() {
            return this.totalMember;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public UpdateDataAgentSpaceInfoResponseBodyData setWorkspaceStatus(String workspaceStatus) {
            this.workspaceStatus = workspaceStatus;
            return this;
        }
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

    }

}
