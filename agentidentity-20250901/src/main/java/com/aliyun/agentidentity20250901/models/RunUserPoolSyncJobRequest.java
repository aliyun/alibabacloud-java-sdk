// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class RunUserPoolSyncJobRequest extends TeaModel {
    /**
     * <p>The identity provider type. Currently, only DingTalk is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>The maximum number of users to synchronize in a single task.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxSyncUsers")
    public String maxSyncUsers;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
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
