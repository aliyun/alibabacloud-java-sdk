// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ReinstateAuthenticationTokenByConsumerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_jwt_subject</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("credentialProviderIdentifier")
    public String credentialProviderIdentifier;

    public static ReinstateAuthenticationTokenByConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinstateAuthenticationTokenByConsumerRequest self = new ReinstateAuthenticationTokenByConsumerRequest();
        return TeaModel.build(map, self);
    }

    public ReinstateAuthenticationTokenByConsumerRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public ReinstateAuthenticationTokenByConsumerRequest setCredentialProviderIdentifier(String credentialProviderIdentifier) {
        this.credentialProviderIdentifier = credentialProviderIdentifier;
        return this;
    }
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

}
