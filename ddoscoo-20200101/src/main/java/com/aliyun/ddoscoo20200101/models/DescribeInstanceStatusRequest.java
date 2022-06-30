// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProductType")
    public Integer productType;

    public static DescribeInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusRequest self = new DescribeInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceStatusRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

}
