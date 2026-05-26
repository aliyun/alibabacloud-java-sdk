// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityShrinkRequest extends TeaModel {
    @NameInMap("AllowedResourceOAuth2ReturnURLs")
    public String allowedResourceOAuth2ReturnURLsShrink;

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

    public static CreateWorkloadIdentityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkloadIdentityShrinkRequest self = new CreateWorkloadIdentityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkloadIdentityShrinkRequest setAllowedResourceOAuth2ReturnURLsShrink(String allowedResourceOAuth2ReturnURLsShrink) {
        this.allowedResourceOAuth2ReturnURLsShrink = allowedResourceOAuth2ReturnURLsShrink;
        return this;
    }
    public String getAllowedResourceOAuth2ReturnURLsShrink() {
        return this.allowedResourceOAuth2ReturnURLsShrink;
    }

    public CreateWorkloadIdentityShrinkRequest setCreateRAMRole(Boolean createRAMRole) {
        this.createRAMRole = createRAMRole;
        return this;
    }
    public Boolean getCreateRAMRole() {
        return this.createRAMRole;
    }

    public CreateWorkloadIdentityShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkloadIdentityShrinkRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public CreateWorkloadIdentityShrinkRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateWorkloadIdentityShrinkRequest setSessionBindingEnabled(Boolean sessionBindingEnabled) {
        this.sessionBindingEnabled = sessionBindingEnabled;
        return this;
    }
    public Boolean getSessionBindingEnabled() {
        return this.sessionBindingEnabled;
    }

    public CreateWorkloadIdentityShrinkRequest setSourceAgentArn(String sourceAgentArn) {
        this.sourceAgentArn = sourceAgentArn;
        return this;
    }
    public String getSourceAgentArn() {
        return this.sourceAgentArn;
    }

    public CreateWorkloadIdentityShrinkRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public CreateWorkloadIdentityShrinkRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
