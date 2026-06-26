// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class RunUserPoolSyncJobRequest extends TeaModel {
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    @NameInMap("MaxSyncUsers")
    public String maxSyncUsers;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static RunUserPoolSyncJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RunUserPoolSyncJobRequest self = new RunUserPoolSyncJobRequest();
        return TeaModel.build(map, self);
    }

    public RunUserPoolSyncJobRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public RunUserPoolSyncJobRequest setMaxSyncUsers(String maxSyncUsers) {
        this.maxSyncUsers = maxSyncUsers;
        return this;
    }
    public String getMaxSyncUsers() {
        return this.maxSyncUsers;
    }

    public RunUserPoolSyncJobRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
