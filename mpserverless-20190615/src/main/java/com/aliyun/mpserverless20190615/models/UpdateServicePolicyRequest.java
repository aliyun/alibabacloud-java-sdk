// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateServicePolicyRequest extends TeaModel {
    @NameInMap("CollectionName")
    public String collectionName;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpaceId")
    public String spaceId;

    public static UpdateServicePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServicePolicyRequest self = new UpdateServicePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServicePolicyRequest setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

    public UpdateServicePolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UpdateServicePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdateServicePolicyRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateServicePolicyRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
