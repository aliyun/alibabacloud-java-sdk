// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRoleRequest extends TeaModel {
    /**
     * <p>A reserved parameter.</p>
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
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace on which the API operation is performed.</p>
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
         * <li><p>2: HoloStudio</p>
         * </li>
         * <li><p>3: StreamStudio</p>
         * </li>
         * <li><p>4: Deployment Center</p>
         * </li>
         * <li><p>6: Data Security Guard</p>
         * </li>
         * <li><p>7: Data Map</p>
         * </li>
         * <li><p>8: Data Service</p>
         * </li>
         * <li><p>9: Data Integration</p>
         * </li>
         * <li><p>10: Data Modeling (DataBlau DDM)</p>
         * </li>
         * <li><p>11: Data Studio</p>
         * </li>
         * <li><p>12: Data Quality</p>
         * </li>
         * <li><p>13: Data Governance</p>
         * </li>
         * <li><p>14: Operation Center</p>
         * </li>
         * <li><p>15: Resource Optimization</p>
         * </li>
         * <li><p>16: Migration Assistant</p>
         * </li>
         * <li><p>17: Data Analysis</p>
         * </li>
         * <li><p>18: Approval Center</p>
         * </li>
         * <li><p>19: Security Center</p>
         * </li>
         * <li><p>20: Intelligent Data Modeling</p>
         * </li>
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
         * <li><p>Write: Read-only</p>
         * </li>
         * <li><p>Read: Edit</p>
         * </li>
         * <li><p>NotSet: Not controlled</p>
         * </li>
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
