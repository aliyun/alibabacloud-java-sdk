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

    @NameInMap("Description")
    public String description;

    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SessionBindingEnabled")
    public String sessionBindingEnabled;

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

    public UpdateWorkloadIdentityShrinkRequest setSessionBindingEnabled(String sessionBindingEnabled) {
        this.sessionBindingEnabled = sessionBindingEnabled;
        return this;
    }
    public String getSessionBindingEnabled() {
        return this.sessionBindingEnabled;
    }

    public UpdateWorkloadIdentityShrinkRequest setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

}
