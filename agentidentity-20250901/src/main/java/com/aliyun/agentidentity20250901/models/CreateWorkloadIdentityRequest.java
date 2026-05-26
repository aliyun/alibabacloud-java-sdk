// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityRequest extends TeaModel {
    @NameInMap("AllowedResourceOAuth2ReturnURLs")
    public java.util.List<String> allowedResourceOAuth2ReturnURLs;

    @NameInMap("CreateRAMRole")
    public Boolean createRAMRole;

    /**
     * <strong>example:</strong>
     * <p>example agent</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>identity-provider-okta</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::123456:role/agent-101-role</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SessionBindingEnabled")
    public Boolean sessionBindingEnabled;

    @NameInMap("SourceAgentArn")
    public String sourceAgentArn;

    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <strong>example:</strong>
     * <p>agent-101</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static CreateWorkloadIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkloadIdentityRequest self = new CreateWorkloadIdentityRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkloadIdentityRequest setAllowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
        this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
        return this;
    }
    public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
        return this.allowedResourceOAuth2ReturnURLs;
    }

    public CreateWorkloadIdentityRequest setCreateRAMRole(Boolean createRAMRole) {
        this.createRAMRole = createRAMRole;
        return this;
    }
    public Boolean getCreateRAMRole() {
        return this.createRAMRole;
    }

    public CreateWorkloadIdentityRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkloadIdentityRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public CreateWorkloadIdentityRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateWorkloadIdentityRequest setSessionBindingEnabled(Boolean sessionBindingEnabled) {
        this.sessionBindingEnabled = sessionBindingEnabled;
        return this;
    }
    public Boolean getSessionBindingEnabled() {
        return this.sessionBindingEnabled;
    }

    public CreateWorkloadIdentityRequest setSourceAgentArn(String sourceAgentArn) {
        this.sourceAgentArn = sourceAgentArn;
        return this;
    }
    public String getSourceAgentArn() {
        return this.sourceAgentArn;
    }

    public CreateWorkloadIdentityRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public CreateWorkloadIdentityRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
