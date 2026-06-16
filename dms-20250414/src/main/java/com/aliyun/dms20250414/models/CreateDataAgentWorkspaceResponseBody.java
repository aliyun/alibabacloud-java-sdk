// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public CreateDataAgentWorkspaceResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DMS-DA-40114</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
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

    public static CreateDataAgentWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentWorkspaceResponseBody self = new CreateDataAgentWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentWorkspaceResponseBody setData(CreateDataAgentWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentWorkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAgentWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentWorkspaceResponseBodyData extends TeaModel {
        /**
         * <p>The time when the workspace was created. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765960516</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The UID of the workspace creator.</p>
         * 
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("IsSessionShareEnabled")
        public Boolean isSessionShareEnabled;

        /**
         * <p>The time when the workspace was last modified. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765961516</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The role name of the user in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The number of members in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalMember")
        public Long totalMember;

        @NameInMap("Type")
        public String type;

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>space for test</p>
         */
        @NameInMap("WorkspaceDesc")
        public String workspaceDesc;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspaceTest</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        /**
         * <p>The status of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("WorkspaceStatus")
        public String workspaceStatus;

        public static CreateDataAgentWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentWorkspaceResponseBodyData self = new CreateDataAgentWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentWorkspaceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateDataAgentWorkspaceResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateDataAgentWorkspaceResponseBodyData setIsSessionShareEnabled(Boolean isSessionShareEnabled) {
            this.isSessionShareEnabled = isSessionShareEnabled;
            return this;
        }
        public Boolean getIsSessionShareEnabled() {
            return this.isSessionShareEnabled;
        }

        public CreateDataAgentWorkspaceResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateDataAgentWorkspaceResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateDataAgentWorkspaceResponseBodyData setTotalMember(Long totalMember) {
            this.totalMember = totalMember;
            return this;
        }
        public Long getTotalMember() {
            return this.totalMember;
        }

        public CreateDataAgentWorkspaceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataAgentWorkspaceResponseBodyData setWorkspaceDesc(String workspaceDesc) {
            this.workspaceDesc = workspaceDesc;
            return this;
        }
        public String getWorkspaceDesc() {
            return this.workspaceDesc;
        }

        public CreateDataAgentWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateDataAgentWorkspaceResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public CreateDataAgentWorkspaceResponseBodyData setWorkspaceStatus(String workspaceStatus) {
            this.workspaceStatus = workspaceStatus;
            return this;
        }
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

    }

}
