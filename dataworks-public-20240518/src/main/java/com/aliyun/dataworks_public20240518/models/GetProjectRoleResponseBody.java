// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRoleResponseBody extends TeaModel {
    /**
     * <p>The details of the workspace role.</p>
     */
    @NameInMap("ProjectRole")
    public GetProjectRoleResponseBodyProjectRole projectRole;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82F28E60-CF48-5EDF-AB25-D806847B97D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRoleResponseBody self = new GetProjectRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectRoleResponseBody setProjectRole(GetProjectRoleResponseBodyProjectRole projectRole) {
        this.projectRole = projectRole;
        return this;
    }
    public GetProjectRoleResponseBodyProjectRole getProjectRole() {
        return this.projectRole;
    }

    public GetProjectRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectRoleResponseBodyProjectRoleModulePermissions extends TeaModel {
        /**
         * <p>The module ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ModuleId")
        public Long moduleId;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <p>HoloStudio</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The permission type.</p>
         * 
         * <strong>example:</strong>
         * <p>Read</p>
         */
        @NameInMap("PermissionType")
        public String permissionType;

        public static GetProjectRoleResponseBodyProjectRoleModulePermissions build(java.util.Map<String, ?> map) throws Exception {
            GetProjectRoleResponseBodyProjectRoleModulePermissions self = new GetProjectRoleResponseBodyProjectRoleModulePermissions();
            return TeaModel.build(map, self);
        }

        public GetProjectRoleResponseBodyProjectRoleModulePermissions setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetProjectRoleResponseBodyProjectRoleModulePermissions setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetProjectRoleResponseBodyProjectRoleModulePermissions setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

    }

    public static class GetProjectRoleResponseBodyProjectRole extends TeaModel {
        /**
         * <p>The code of the workspace role.</p>
         * 
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The permissions for the modules in the workspace.</p>
         */
        @NameInMap("ModulePermissions")
        public java.util.List<GetProjectRoleResponseBodyProjectRoleModulePermissions> modulePermissions;

        /**
         * <p>The name of the workspace role.</p>
         * 
         * <strong>example:</strong>
         * <p>Visitors</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * <p>Note: A fixed value of -1 is returned for a system role.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the workspace role. Valid values:</p>
         * <ul>
         * <li><p>UserCustom: a custom role</p>
         * </li>
         * <li><p>System: a system role</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProjectRoleResponseBodyProjectRole build(java.util.Map<String, ?> map) throws Exception {
            GetProjectRoleResponseBodyProjectRole self = new GetProjectRoleResponseBodyProjectRole();
            return TeaModel.build(map, self);
        }

        public GetProjectRoleResponseBodyProjectRole setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetProjectRoleResponseBodyProjectRole setModulePermissions(java.util.List<GetProjectRoleResponseBodyProjectRoleModulePermissions> modulePermissions) {
            this.modulePermissions = modulePermissions;
            return this;
        }
        public java.util.List<GetProjectRoleResponseBodyProjectRoleModulePermissions> getModulePermissions() {
            return this.modulePermissions;
        }

        public GetProjectRoleResponseBodyProjectRole setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectRoleResponseBodyProjectRole setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetProjectRoleResponseBodyProjectRole setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
