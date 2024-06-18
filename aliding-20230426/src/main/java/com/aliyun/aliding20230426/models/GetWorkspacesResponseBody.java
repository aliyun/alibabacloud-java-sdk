// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspacesResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
        /**
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example/file-manage-files/zh-CN/202***13/ldet/avatar3.jpg">https://example/file-manage-files/zh-CN/202***13/ldet/avatar3.jpg</a></p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>ding16b241fd05********288</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example/file-manage-files/zh-CN/202***13/ldet/XXXX.jpg">https://example/file-manage-files/zh-CN/202***13/ldet/XXXX.jpg</a></p>
         */
        @NameInMap("Cover")
        public String cover;

        /**
         * <strong>example:</strong>
         * <p>2023-05-15T11:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>01472825524039877041</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>workspace_description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public GetWorkspacesResponseBodyWorkspaceIcon icon;

        /**
         * <strong>example:</strong>
         * <p>2023-05-15T11:29Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>01472825524039877041</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>workspace_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>READER</p>
         */
        @NameInMap("PermissionRole")
        public String permissionRole;

        /**
         * <strong>example:</strong>
         * <p>ZgpG2NdyVXXjrKKzIBqMp5zkVMwvDqPk</p>
         */
        @NameInMap("RootNodeId")
        public String rootNodeId;

        /**
         * <strong>example:</strong>
         * <p>lHiicjNFM2iSFYSdz2iPuI8ZwiEiE</p>
         */
        @NameInMap("TeamId")
        public String teamId;

        /**
         * <strong>example:</strong>
         * <p>TEAM</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>workspace_url</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>By8jQS1ZYjGn5b0M</p>
         */
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
