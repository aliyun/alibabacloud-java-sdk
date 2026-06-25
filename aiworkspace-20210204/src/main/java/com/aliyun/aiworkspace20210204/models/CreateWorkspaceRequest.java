// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>The description of the workspace. The description cannot exceed 80 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个工作空间描述示例。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>We recommend that you name the workspace based on its business attribute to facilitate identification of its purpose. If you do not configure this parameter, the workspace name is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>demo工作空间</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The environments included in the workspace:</p>
     * <ul>
     * <li>The simple mode contains only the production environment (prod).</li>
     * <li>The standard mode contains both the development environment (dev) and the production environment (prod).</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    /**
     * <p>The resource group ID. For information about how to obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwp7rkyq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the workspace. The format is as follows:</p>
     * <ul>
     * <li>The length is 3 to 23 characters and can contain letters, underscores (_), or digits.</li>
     * <li>It must start with a letter (uppercase or lowercase).</li>
     * <li>It must be unique within the current region.</li>
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
