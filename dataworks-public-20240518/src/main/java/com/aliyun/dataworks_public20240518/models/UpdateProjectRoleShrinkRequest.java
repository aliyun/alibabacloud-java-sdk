// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRoleShrinkRequest extends TeaModel {
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
    public String modulePermissionsShrink;

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

    public static UpdateProjectRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRoleShrinkRequest self = new UpdateProjectRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRoleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProjectRoleShrinkRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProjectRoleShrinkRequest setModulePermissionsShrink(String modulePermissionsShrink) {
        this.modulePermissionsShrink = modulePermissionsShrink;
        return this;
    }
    public String getModulePermissionsShrink() {
        return this.modulePermissionsShrink;
    }

    public UpdateProjectRoleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
