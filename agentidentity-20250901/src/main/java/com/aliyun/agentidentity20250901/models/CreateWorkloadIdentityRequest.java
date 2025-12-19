// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityRequest extends TeaModel {
    @NameInMap("AllowedResourceOAuth2ReturnURLs")
    public java.util.List<String> allowedResourceOAuth2ReturnURLs;

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

    public CreateWorkloadIdentityRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
