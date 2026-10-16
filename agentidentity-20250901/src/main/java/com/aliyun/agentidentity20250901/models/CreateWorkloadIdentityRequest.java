// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityRequest extends TeaModel {
    /**
     * <p>The allowlist of Consent authorization callback URLs for the workload identity, which constrains the allowed redirect addresses during the offline delegation (OfflineAccess) authorization flow.</p>
     */
    @NameInMap("AllowedConsentCallbackURLs")
    public java.util.List<String> allowedConsentCallbackURLs;

    /**
     * <p>The list of allowed OAuth2 return URLs.</p>
     */
    @NameInMap("AllowedResourceOAuth2ReturnURLs")
    public java.util.List<String> allowedResourceOAuth2ReturnURLs;

    /**
     * <p>Specifies whether to automatically create an associated RAM role. When set to true, the system automatically creates a RAM role with the same name as the workload identity.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateRAMRole")
    public Boolean createRAMRole;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>example agent</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configured identity provider.</p>
     * 
     * <strong>example:</strong>
     * <p>identity-provider-okta</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    /**
     * <p>The ARN of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456:role/agent-101-role</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>Specifies whether to enable session binding. When enabled, each session is bound to a specific workload identity instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SessionBindingEnabled")
    public Boolean sessionBindingEnabled;

    /**
     * <p>The ARN of the source agent.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentidentity:cn-beijing:123456:workloadidentity/my-identity</p>
     */
    @NameInMap("SourceAgentArn")
    public String sourceAgentArn;

    /**
     * <p>The source platform.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The unique name of the workload identity.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-101</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static CreateWorkloadIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkloadIdentityRequest self = new CreateWorkloadIdentityRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkloadIdentityRequest setAllowedConsentCallbackURLs(java.util.List<String> allowedConsentCallbackURLs) {
        this.allowedConsentCallbackURLs = allowedConsentCallbackURLs;
        return this;
    }
    public java.util.List<String> getAllowedConsentCallbackURLs() {
        return this.allowedConsentCallbackURLs;
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
