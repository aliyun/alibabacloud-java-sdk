// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateWorkloadIdentityRequest extends TeaModel {
    /**
     * <p>The whitelist of consent authorization callback URLs for the workload identity, which restricts the allowed callback URLs in the offline access delegation authorization flow.</p>
     */
    @NameInMap("AllowedConsentCallbackURLs")
    public java.util.List<String> allowedConsentCallbackURLs;

    /**
     * <p>The list of allowed OAuth2 return URLs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowedResourceOAuth2ReturnURLs")
    public java.util.List<String> allowedResourceOAuth2ReturnURLs;

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
     * <p>Specifies whether session binding is enabled. If enabled, each session is bound to a specific workload identity instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SessionBindingEnabled")
    public String sessionBindingEnabled;

    /**
     * <p>The unique name of the workload identity.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-101</p>
     */
    @NameInMap("WorkloadIdentityName")
    public String workloadIdentityName;

    public static UpdateWorkloadIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkloadIdentityRequest self = new UpdateWorkloadIdentityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkloadIdentityRequest setAllowedConsentCallbackURLs(java.util.List<String> allowedConsentCallbackURLs) {
        this.allowedConsentCallbackURLs = allowedConsentCallbackURLs;
        return this;
    }
    public java.util.List<String> getAllowedConsentCallbackURLs() {
        return this.allowedConsentCallbackURLs;
    }

    public UpdateWorkloadIdentityRequest setAllowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
        this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
        return this;
    }
    public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
        return this.allowedResourceOAuth2ReturnURLs;
    }

    public UpdateWorkloadIdentityRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkloadIdentityRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public UpdateWorkloadIdentityRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateWorkloadIdentityRequest setSessionBindingEnabled(String sessionBindingEnabled) {
        this.sessionBindingEnabled = sessionBindingEnabled;
        return this;
    }
    public String getSessionBindingEnabled() {
        return this.sessionBindingEnabled;
    }

    public UpdateWorkloadIdentityRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
