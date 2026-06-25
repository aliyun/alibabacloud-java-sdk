// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The list of administrator account names.</p>
     */
    @NameInMap("AdminNames")
    public java.util.List<String> adminNames;

    /**
     * <p>The ID of the user who created the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>1157******94123</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace description example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-example</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The environments that the workspace contains. Valid values:</p>
     * <ul>
     * <li><p>A workspace in basic mode has only the production environment (prod).</p>
     * </li>
     * <li><p>A workspace in standard mode has both the development environment (dev) and the production environment (prod).</p>
     * </li>
     * </ul>
     */
    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    /**
     * <p>Additional information. This parameter currently contains the tenant ID (TenantId).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TenantId&quot;: &quot;4286******98&quot;}</p>
     */
    @NameInMap("ExtraInfos")
    public java.util.Map<String, ?> extraInfos;

    /**
     * <p>The time when the workspace was created. The time is in UTC and follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the workspace was last modified. The time is in UTC and follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Indicates whether the workspace is the default workspace. Valid values:</p>
     * <ul>
     * <li><p>false: The workspace is not the default workspace.</p>
     * </li>
     * <li><p>true: The workspace is the default workspace.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The information about the workspace owner. This parameter is returned only when Verbose is set to true.</p>
     */
    @NameInMap("Owner")
    public GetWorkspaceResponseBodyOwner owner;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0F049F0-8D69-5BAC-8F10-B4DED1B5A34C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwp7rkyq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the workspace. Valid values:</p>
     * <ul>
     * <li><p>ENABLED: The workspace is running as normal.</p>
     * </li>
     * <li><p>INITIALIZING: The workspace is being initialized.</p>
     * </li>
     * <li><p>FAILURE: The workspace failed to be created.</p>
     * </li>
     * <li><p>DISABLED: The workspace is manually disabled.</p>
     * </li>
     * <li><p>FROZEN: The workspace is frozen due to an overdue payment.</p>
     * </li>
     * <li><p>UPDATING: The workspace is being updated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-example</p>
     */
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

    public GetWorkspaceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>mings****t</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1157******94123</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The user UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1157******94123</p>
         */
        @NameInMap("UserKp")
        public String userKp;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>mings****t</p>
         */
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
