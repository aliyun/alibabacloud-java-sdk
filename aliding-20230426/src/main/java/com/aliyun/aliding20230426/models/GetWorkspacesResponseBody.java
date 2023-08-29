// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspacesResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("workspace")
    public java.util.List<GetWorkspacesResponseBodyWorkspace> workspace;

    public static GetWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacesResponseBody self = new GetWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspacesResponseBody setWorkspace(java.util.List<GetWorkspacesResponseBodyWorkspace> workspace) {
        this.workspace = workspace;
        return this;
    }
    public java.util.List<GetWorkspacesResponseBodyWorkspace> getWorkspace() {
        return this.workspace;
    }

    public static class GetWorkspacesResponseBodyWorkspaceIcon extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetWorkspacesResponseBodyWorkspaceIcon build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacesResponseBodyWorkspaceIcon self = new GetWorkspacesResponseBodyWorkspaceIcon();
            return TeaModel.build(map, self);
        }

        public GetWorkspacesResponseBodyWorkspaceIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkspacesResponseBodyWorkspaceIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetWorkspacesResponseBodyWorkspace extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("Cover")
        public String cover;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public GetWorkspacesResponseBodyWorkspaceIcon icon;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PermissionRole")
        public String permissionRole;

        @NameInMap("RootNodeId")
        public String rootNodeId;

        @NameInMap("TeamId")
        public String teamId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetWorkspacesResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacesResponseBodyWorkspace self = new GetWorkspacesResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public GetWorkspacesResponseBodyWorkspace setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetWorkspacesResponseBodyWorkspace setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public GetWorkspacesResponseBodyWorkspace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkspacesResponseBodyWorkspace setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetWorkspacesResponseBodyWorkspace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkspacesResponseBodyWorkspace setIcon(GetWorkspacesResponseBodyWorkspaceIcon icon) {
            this.icon = icon;
            return this;
        }
        public GetWorkspacesResponseBodyWorkspaceIcon getIcon() {
            return this.icon;
        }

        public GetWorkspacesResponseBodyWorkspace setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetWorkspacesResponseBodyWorkspace setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetWorkspacesResponseBodyWorkspace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkspacesResponseBodyWorkspace setPermissionRole(String permissionRole) {
            this.permissionRole = permissionRole;
            return this;
        }
        public String getPermissionRole() {
            return this.permissionRole;
        }

        public GetWorkspacesResponseBodyWorkspace setRootNodeId(String rootNodeId) {
            this.rootNodeId = rootNodeId;
            return this;
        }
        public String getRootNodeId() {
            return this.rootNodeId;
        }

        public GetWorkspacesResponseBodyWorkspace setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public GetWorkspacesResponseBodyWorkspace setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkspacesResponseBodyWorkspace setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetWorkspacesResponseBodyWorkspace setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
