// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentWorkspaceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDataAgentWorkspaceInfoResponseBodyData data;

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
     * <p>E0D2-*****-A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAgentWorkspaceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentWorkspaceInfoResponseBody self = new GetDataAgentWorkspaceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAgentWorkspaceInfoResponseBody setData(GetDataAgentWorkspaceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataAgentWorkspaceInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDataAgentWorkspaceInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataAgentWorkspaceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAgentWorkspaceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAgentWorkspaceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataAgentWorkspaceInfoResponseBodyData extends TeaModel {
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
         * <p>1765961516</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalMember")
        public String totalMember;

        /**
         * <strong>example:</strong>
         * <p>space for test</p>
         */
        @NameInMap("WorkspaceDesc")
        public String workspaceDesc;

        /**
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>workspaceTest</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("WorkspaceStatus")
        public String workspaceStatus;

        public static GetDataAgentWorkspaceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAgentWorkspaceInfoResponseBodyData self = new GetDataAgentWorkspaceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setTotalMember(String totalMember) {
            this.totalMember = totalMember;
            return this;
        }
        public String getTotalMember() {
            return this.totalMember;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setWorkspaceDesc(String workspaceDesc) {
            this.workspaceDesc = workspaceDesc;
            return this;
        }
        public String getWorkspaceDesc() {
            return this.workspaceDesc;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public GetDataAgentWorkspaceInfoResponseBodyData setWorkspaceStatus(String workspaceStatus) {
            this.workspaceStatus = workspaceStatus;
            return this;
        }
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

    }

}
