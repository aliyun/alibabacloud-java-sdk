// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRoleRequest extends TeaModel {
    /**
     * <p>A reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique identifier of the custom role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>base_role_xx</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of DataWorks module permissions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModulePermissions")
    public java.util.List<UpdateProjectRoleRequestModulePermissions> modulePermissions;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the Storage Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API invocation.</p>
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
         * <p>The DataWorks module ID. Valid values:</p>
         * <ul>
         * <li>2: HoloStudio</li>
         * <li>3: StreamStudio</li>
         * <li>4: Deploy Management</li>
         * <li>6: Data Protection Umbrella</li>
         * <li>7: Data Map</li>
         * <li>8: DataService Studio</li>
         * <li>9: Data Integration</li>
         * <li>10: Data Modeling (DataBlau DDM)</li>
         * <li>11: DataStudio</li>
         * <li>12: Data Quality</li>
         * <li>13: Data Governance Center</li>
         * <li>14: Operation Center</li>
         * <li>15: Resource Optimization</li>
         * <li>16: Migration Assistant</li>
         * <li>17: Data Analytics</li>
         * <li>18: Approval Center</li>
         * <li>19: Security Center</li>
         * <li>20: Intelligent Data Modeling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ModuleId")
        public Long moduleId;

        /**
         * <p>The permission type. Valid values:</p>
         * <ul>
         * <li>Write: Edit.</li>
         * <li>Read: Read-only.</li>
         * <li>NotSet: Not controlled.</li>
         * </ul>
         * 
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
