// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeServicePolicyResponseBody extends TeaModel {
    @NameInMap("CollectionName")
    public String collectionName;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeServicePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServicePolicyResponseBody self = new DescribeServicePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServicePolicyResponseBody setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

    public DescribeServicePolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeServicePolicyResponseBody setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DescribeServicePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServicePolicyResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeServicePolicyResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
