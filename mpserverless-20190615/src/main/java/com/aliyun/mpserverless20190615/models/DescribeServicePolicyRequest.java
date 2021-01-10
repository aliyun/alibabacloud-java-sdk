// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeServicePolicyRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("CollectionName")
    public String collectionName;

    public static DescribeServicePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServicePolicyRequest self = new DescribeServicePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServicePolicyRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeServicePolicyRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeServicePolicyRequest setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

}
