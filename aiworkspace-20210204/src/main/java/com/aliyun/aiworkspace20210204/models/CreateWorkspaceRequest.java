// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>The description of the workspace. The description can be up to 80 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the workspace. You can set it based on the purpose of the workspace. If left empty, the name of the workspace is used.</p>
     * 
     * <strong>example:</strong>
     * <p>display name</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The environment of the workspace.</p>
     * <ul>
     * <li>Workspaces in basic mode can run only in the production environment (prod).</li>
     * <li>Workspaces in standard mode can run in both the development and production environments (dev and prod).</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the workspace. Format:</p>
     * <ul>
     * <li>The name must be 3 to 23 characters in length, and can contain letters, underscores (_), and digits.</li>
     * <li>The name must start with a letter.</li>
     * <li>It must be unique in the current region.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace_example</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateWorkspaceRequest setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public CreateWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
