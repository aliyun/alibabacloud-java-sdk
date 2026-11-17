// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginWorkspaceRequest extends TeaModel {
    /**
     * <p>The gateway type. If you do not specify this parameter, the server uses API as the default value.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The Codeup organization ID, which is the Yunxiao DevOps organization ID. The frontend obtains this ID by parsing ListPluginRepositories or after creating an organization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>664f1e2xxxx</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>The repository name, which also serves as the English ID of the plugin. The backend does not validate the format. The frontend restricts the format to the regular expression /^(?![-.])[a-z0-9.-]{1,20}(?&lt;![-.])$/, which allows 1 to 20 lowercase letters, digits, periods, or hyphens, and cannot start or end with a period or a hyphen.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-custom-plugin</p>
     */
    @NameInMap("repoName")
    public String repoName;

    /**
     * <p>The workspace name, which is the Chinese name of the plugin. Note: This parameter is actually required. If it is omitted, the API returns a 400 InvalidParameter.IsEmpty error.</p>
     * 
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
