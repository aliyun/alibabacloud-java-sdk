// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRoleRequest extends TeaModel {
    /**
     * <p>The permission settings for the role.</p>
     */
    @NameInMap("ModulePermissions")
    public java.util.List<UpdateWorkspaceRoleRequestModulePermissions> modulePermissions;

    /**
     * <p>The name of the custom role. The name must be unique within the workspace. It can be up to 64 characters long and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>dev-test</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static UpdateWorkspaceRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRoleRequest self = new UpdateWorkspaceRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRoleRequest setModulePermissions(java.util.List<UpdateWorkspaceRoleRequestModulePermissions> modulePermissions) {
        this.modulePermissions = modulePermissions;
        return this;
    }
    public java.util.List<UpdateWorkspaceRoleRequestModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    public UpdateWorkspaceRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public static class UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules extends TeaModel {
        /**
         * <p>The access type. Valid values are:</p>
         * <ul>
         * <li><p>PUBLIC: All members in the current workspace can perform this action.</p>
         * </li>
         * <li><p>PRIVATE: Only the creator can perform this action.</p>
         * </li>
         * <li><p>ANY: Both the creator and non-creators can perform this action.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>The entity access type. This parameter is ignored if <code>Accessibility</code> is set to <code>PUBLIC</code>. If <code>Accessibility</code> is set to <code>PRIVATE</code>, the value of this parameter determines the permissions. Valid values are:</p>
         * <ul>
         * <li><p>CREATOR: Only the creator can perform this action.</p>
         * </li>
         * <li><p>ANY: Both the creator and non-creators can perform this action.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATOR</p>
         */
        @NameInMap("EntityAccessType")
        public String entityAccessType;

        public static UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules self = new UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules setEntityAccessType(String entityAccessType) {
            this.entityAccessType = entityAccessType;
            return this;
        }
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

    }

    public static class UpdateWorkspaceRoleRequestModulePermissionsPermissions extends TeaModel {
        /**
         * <p>A list of permissions.</p>
         */
        @NameInMap("PermissionCodes")
        public java.util.List<String> permissionCodes;

        /**
         * <p>A list of permission rules.</p>
         */
        @NameInMap("PermissionRules")
        public java.util.List<UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules> permissionRules;

        public static UpdateWorkspaceRoleRequestModulePermissionsPermissions build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRoleRequestModulePermissionsPermissions self = new UpdateWorkspaceRoleRequestModulePermissionsPermissions();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRoleRequestModulePermissionsPermissions setPermissionCodes(java.util.List<String> permissionCodes) {
            this.permissionCodes = permissionCodes;
            return this;
        }
        public java.util.List<String> getPermissionCodes() {
            return this.permissionCodes;
        }

        public UpdateWorkspaceRoleRequestModulePermissionsPermissions setPermissionRules(java.util.List<UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules> permissionRules) {
            this.permissionRules = permissionRules;
            return this;
        }
        public java.util.List<UpdateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

    }

    public static class UpdateWorkspaceRoleRequestModulePermissions extends TeaModel {
        /**
         * <p>The module name. Valid values are:</p>
         * <ul>
         * <li><p>PaiDesigner: PAI-Designer</p>
         * </li>
         * <li><p>Paiflow: workflow</p>
         * </li>
         * <li><p>DSW: PAI-DSW</p>
         * </li>
         * <li><p>DLC: PAI-DLC</p>
         * </li>
         * <li><p>Dataset: dataset</p>
         * </li>
         * <li><p>Model: model</p>
         * </li>
         * <li><p>Image: image</p>
         * </li>
         * <li><p>CodeSource: code source</p>
         * </li>
         * <li><p>PaiWorkspace@@Workspace: Basic workspace information</p>
         * </li>
         * <li><p>PaiWorkspace@@MemberRole: workspace member management</p>
         * </li>
         * <li><p>PaiWorkspace@@Resource: workspace computing resource management</p>
         * </li>
         * <li><p>PaiWorkspace@@Config: workspace configuration center</p>
         * </li>
         * <li><p>ArtLab: ArtLab</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PaiDesigner</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The permission type. Valid values are:</p>
         * <ul>
         * <li><p>ReadOnly: read-only access.</p>
         * </li>
         * <li><p>ReadWrite: Allows users to edit and run.</p>
         * </li>
         * <li><p>FullAccess: full control.</p>
         * </li>
         * <li><p>NoPrivilege: no permissions.</p>
         * </li>
         * <li><p>CustomPermissions: custom permissions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("PermissionType")
        public String permissionType;

        /**
         * <p>The permissions. This parameter is required and applies only when <code>PermissionType</code> is set to <code>CustomPermissions</code>.</p>
         */
        @NameInMap("Permissions")
        public java.util.List<UpdateWorkspaceRoleRequestModulePermissionsPermissions> permissions;

        public static UpdateWorkspaceRoleRequestModulePermissions build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRoleRequestModulePermissions self = new UpdateWorkspaceRoleRequestModulePermissions();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRoleRequestModulePermissions setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public UpdateWorkspaceRoleRequestModulePermissions setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

        public UpdateWorkspaceRoleRequestModulePermissions setPermissions(java.util.List<UpdateWorkspaceRoleRequestModulePermissionsPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<UpdateWorkspaceRoleRequestModulePermissionsPermissions> getPermissions() {
            return this.permissions;
        }

    }

}
