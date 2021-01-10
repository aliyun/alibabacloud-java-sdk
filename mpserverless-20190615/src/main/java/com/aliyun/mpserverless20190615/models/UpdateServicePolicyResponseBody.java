// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateServicePolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("CollectionName")
    public String collectionName;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("SpaceId")
    public String spaceId;

    public static UpdateServicePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServicePolicyResponseBody self = new UpdateServicePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServicePolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UpdateServicePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServicePolicyResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateServicePolicyResponseBody setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

    public UpdateServicePolicyResponseBody setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdateServicePolicyResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
