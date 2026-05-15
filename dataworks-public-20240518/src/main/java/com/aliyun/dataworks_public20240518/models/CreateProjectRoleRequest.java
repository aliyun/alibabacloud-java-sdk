// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRoleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ModulePermissions")
    public java.util.List<CreateProjectRoleRequestModulePermissions> modulePermissions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>category_role</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateProjectRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRoleRequest self = new CreateProjectRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProjectRoleRequest setModulePermissions(java.util.List<CreateProjectRoleRequestModulePermissions> modulePermissions) {
        this.modulePermissions = modulePermissions;
        return this;
    }
    public java.util.List<CreateProjectRoleRequestModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    public CreateProjectRoleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public static class CreateProjectRoleRequestModulePermissions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ModuleId")
        public Long moduleId;

        /**
         * <strong>example:</strong>
         * <p>Write</p>
         */
        @NameInMap("PermissionType")
        public String permissionType;

        public static CreateProjectRoleRequestModulePermissions build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRoleRequestModulePermissions self = new CreateProjectRoleRequestModulePermissions();
            return TeaModel.build(map, self);
        }

        public CreateProjectRoleRequestModulePermissions setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public CreateProjectRoleRequestModulePermissions setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

    }

}
