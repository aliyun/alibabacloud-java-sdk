// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRoleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>base_role_xx</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModulePermissions")
    public java.util.List<UpdateProjectRoleRequestModulePermissions> modulePermissions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateProjectRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRoleRequest self = new UpdateProjectRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProjectRoleRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProjectRoleRequest setModulePermissions(java.util.List<UpdateProjectRoleRequestModulePermissions> modulePermissions) {
        this.modulePermissions = modulePermissions;
        return this;
    }
    public java.util.List<UpdateProjectRoleRequestModulePermissions> getModulePermissions() {
        return this.modulePermissions;
    }

    public UpdateProjectRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public static class UpdateProjectRoleRequestModulePermissions extends TeaModel {
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

        public static UpdateProjectRoleRequestModulePermissions build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectRoleRequestModulePermissions self = new UpdateProjectRoleRequestModulePermissions();
            return TeaModel.build(map, self);
        }

        public UpdateProjectRoleRequestModulePermissions setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public UpdateProjectRoleRequestModulePermissions setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

    }

}
