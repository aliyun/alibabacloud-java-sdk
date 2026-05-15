// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRoleShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ModulePermissions")
    public String modulePermissionsShrink;

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
