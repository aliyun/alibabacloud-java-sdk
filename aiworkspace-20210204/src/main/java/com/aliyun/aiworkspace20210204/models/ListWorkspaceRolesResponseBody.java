// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A519F77D-28A0-52F5-AB82-5********8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of custom roles.</p>
     */
    @NameInMap("Roles")
    public java.util.List<ListWorkspaceRolesResponseBodyRoles> roles;

    /**
     * <p>The total count of matching entries.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWorkspaceRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRolesResponseBody self = new ListWorkspaceRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceRolesResponseBody setRoles(java.util.List<ListWorkspaceRolesResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<ListWorkspaceRolesResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public ListWorkspaceRolesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules extends TeaModel {
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

        public static ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules self = new ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules setEntityAccessType(String entityAccessType) {
            this.entityAccessType = entityAccessType;
            return this;
        }
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

    }

    public static class ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions extends TeaModel {
        /**
         * <p>A list of permissions.</p>
         */
        @NameInMap("PermissionCodes")
        public java.util.List<String> permissionCodes;

        /**
         * <p>A list of permission rules.</p>
         */
        @NameInMap("PermissionRules")
        public java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules> permissionRules;

        public static ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions self = new ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions setPermissionCodes(java.util.List<String> permissionCodes) {
            this.permissionCodes = permissionCodes;
            return this;
        }
        public java.util.List<String> getPermissionCodes() {
            return this.permissionCodes;
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions setPermissionRules(java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules> permissionRules) {
            this.permissionRules = permissionRules;
            return this;
        }
        public java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissionsPermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

    }

    public static class ListWorkspaceRolesResponseBodyRolesModulePermissions extends TeaModel {
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
        public java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions> permissions;

        public static ListWorkspaceRolesResponseBodyRolesModulePermissions build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyRolesModulePermissions self = new ListWorkspaceRolesResponseBodyRolesModulePermissions();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissions setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissions setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

        public ListWorkspaceRolesResponseBodyRolesModulePermissions setPermissions(java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissionsPermissions> getPermissions() {
            return this.permissions;
        }

    }

    public static class ListWorkspaceRolesResponseBodyRoles extends TeaModel {
        /**
         * <p>The Alibaba Cloud account UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>2680******4103</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creation time, in UTC and ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-14T07:40:01.000Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The modification time, in UTC and ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-15T02:29:52Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The permission configuration of the role.</p>
         */
        @NameInMap("ModulePermissions")
        public java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissions> modulePermissions;

        /**
         * <p>The ID of the custom role.</p>
         * 
         * <strong>example:</strong>
         * <p>role-dhg*******</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-test</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static ListWorkspaceRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyRoles self = new ListWorkspaceRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyRoles setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkspaceRolesResponseBodyRoles setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListWorkspaceRolesResponseBodyRoles setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListWorkspaceRolesResponseBodyRoles setModulePermissions(java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissions> modulePermissions) {
            this.modulePermissions = modulePermissions;
            return this;
        }
        public java.util.List<ListWorkspaceRolesResponseBodyRolesModulePermissions> getModulePermissions() {
            return this.modulePermissions;
        }

        public ListWorkspaceRolesResponseBodyRoles setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListWorkspaceRolesResponseBodyRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
