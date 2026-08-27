// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>664f1e2xxxx</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-custom-plugin</p>
     */
    @NameInMap("repoName")
    public String repoName;

    /**
     * <strong>example:</strong>
     * <p>my-plugin</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    public static CreatePluginWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginWorkspaceRequest self = new CreatePluginWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePluginWorkspaceRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreatePluginWorkspaceRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreatePluginWorkspaceRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreatePluginWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
