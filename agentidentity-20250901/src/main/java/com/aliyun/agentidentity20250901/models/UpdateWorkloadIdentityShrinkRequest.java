// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateWorkloadIdentityShrinkRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowedResourceOAuth2ReturnURLs")
    public String allowedResourceOAuth2ReturnURLsShrink;

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

    public static UpdateWorkloadIdentityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkloadIdentityShrinkRequest self = new UpdateWorkloadIdentityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkloadIdentityShrinkRequest setAllowedResourceOAuth2ReturnURLsShrink(String allowedResourceOAuth2ReturnURLsShrink) {
        this.allowedResourceOAuth2ReturnURLsShrink = allowedResourceOAuth2ReturnURLsShrink;
        return this;
    }
    public String getAllowedResourceOAuth2ReturnURLsShrink() {
        return this.allowedResourceOAuth2ReturnURLsShrink;
    }

    public UpdateWorkloadIdentityShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkloadIdentityShrinkRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public UpdateWorkloadIdentityShrinkRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateWorkloadIdentityShrinkRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
