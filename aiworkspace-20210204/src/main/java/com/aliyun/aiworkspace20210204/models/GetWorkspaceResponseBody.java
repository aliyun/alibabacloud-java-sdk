// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    @NameInMap("AdminNames")
    public java.util.List<String> adminNames;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    @NameInMap("ExtraInfos")
    public java.util.Map<String, ?> extraInfos;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("Owner")
    public GetWorkspaceResponseBodyOwner owner;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setAdminNames(java.util.List<String> adminNames) {
        this.adminNames = adminNames;
        return this;
    }
    public java.util.List<String> getAdminNames() {
        return this.adminNames;
    }

    public GetWorkspaceResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetWorkspaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetWorkspaceResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetWorkspaceResponseBody setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public GetWorkspaceResponseBody setExtraInfos(java.util.Map<String, ?> extraInfos) {
        this.extraInfos = extraInfos;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfos() {
        return this.extraInfos;
    }

    public GetWorkspaceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetWorkspaceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetWorkspaceResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public GetWorkspaceResponseBody setOwner(GetWorkspaceResponseBodyOwner owner) {
        this.owner = owner;
        return this;
    }
    public GetWorkspaceResponseBodyOwner getOwner() {
        return this.owner;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class GetWorkspaceResponseBodyOwner extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserKp")
        public String userKp;

        @NameInMap("UserName")
        public String userName;

        public static GetWorkspaceResponseBodyOwner build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyOwner self = new GetWorkspaceResponseBodyOwner();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyOwner setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetWorkspaceResponseBodyOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetWorkspaceResponseBodyOwner setUserKp(String userKp) {
            this.userKp = userKp;
            return this;
        }
        public String getUserKp() {
            return this.userKp;
        }

        public GetWorkspaceResponseBodyOwner setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
