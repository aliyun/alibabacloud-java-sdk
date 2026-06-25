// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRoleRequest extends TeaModel {
    /**
     * <p>The permission settings for the role.</p>
     */
    @NameInMap("ModulePermissions")
    public java.util.List<CreateWorkspaceRoleRequestModulePermissions> modulePermissions;

    /**
     * <p>The unique name for the custom role within the workspace. It can contain letters, digits, underscores (_), and hyphens (-), and be up to 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>dev-test</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The role type. This operation only creates custom roles. Valid value: custom.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static CreateWorkspaceRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRoleRequest self = new CreateWorkspaceRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRoleRequest setModulePermissions(java.util.List<CreateWorkspaceRoleRequestModulePermissions> modulePermissions) {
        this.modulePermissions = modulePermissions;
        return this;
    }
    public java.util.List<CreateWorkspaceRoleRequestModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    public CreateWorkspaceRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateWorkspaceRoleRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public static class CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules extends TeaModel {
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

        public static CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules self = new CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules setEntityAccessType(String entityAccessType) {
            this.entityAccessType = entityAccessType;
            return this;
        }
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

    }

    public static class CreateWorkspaceRoleRequestModulePermissionsPermissions extends TeaModel {
        /**
         * <p>A list of permissions.</p>
         */
        @NameInMap("PermissionCodes")
        public java.util.List<String> permissionCodes;

        /**
         * <p>A list of permission rules.</p>
         */
        @NameInMap("PermissionRules")
        public java.util.List<CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules> permissionRules;

        public static CreateWorkspaceRoleRequestModulePermissionsPermissions build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRoleRequestModulePermissionsPermissions self = new CreateWorkspaceRoleRequestModulePermissionsPermissions();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRoleRequestModulePermissionsPermissions setPermissionCodes(java.util.List<String> permissionCodes) {
            this.permissionCodes = permissionCodes;
            return this;
        }
        public java.util.List<String> getPermissionCodes() {
            return this.permissionCodes;
        }

        public CreateWorkspaceRoleRequestModulePermissionsPermissions setPermissionRules(java.util.List<CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules> permissionRules) {
            this.permissionRules = permissionRules;
            return this;
        }
        public java.util.List<CreateWorkspaceRoleRequestModulePermissionsPermissionsPermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

    }

    public static class CreateWorkspaceRoleRequestModulePermissions extends TeaModel {
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
        public java.util.List<CreateWorkspaceRoleRequestModulePermissionsPermissions> permissions;

        public static CreateWorkspaceRoleRequestModulePermissions build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRoleRequestModulePermissions self = new CreateWorkspaceRoleRequestModulePermissions();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRoleRequestModulePermissions setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public CreateWorkspaceRoleRequestModulePermissions setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

        public CreateWorkspaceRoleRequestModulePermissions setPermissions(java.util.List<CreateWorkspaceRoleRequestModulePermissionsPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<CreateWorkspaceRoleRequestModulePermissionsPermissions> getPermissions() {
            return this.permissions;
        }

    }

}
