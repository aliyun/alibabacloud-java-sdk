// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateServicePolicyRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("CollectionName")
    public String collectionName;

    @NameInMap("PolicyName")
    public String policyName;

    public static UpdateServicePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServicePolicyRequest self = new UpdateServicePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServicePolicyRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public UpdateServicePolicyRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateServicePolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UpdateServicePolicyRequest setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

    public UpdateServicePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
