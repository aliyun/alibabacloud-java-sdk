// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRoleShrinkRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>保留字段</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of DataWorks module permissions.</p>
     */
    @NameInMap("ModulePermissions")
    public String modulePermissionsShrink;

    /**
     * <p>The role name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>category_role</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace on which the API operation is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateProjectRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRoleShrinkRequest self = new CreateProjectRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRoleShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProjectRoleShrinkRequest setModulePermissionsShrink(String modulePermissionsShrink) {
        this.modulePermissionsShrink = modulePermissionsShrink;
        return this;
    }
    public String getModulePermissionsShrink() {
        return this.modulePermissionsShrink;
    }

    public CreateProjectRoleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRoleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
