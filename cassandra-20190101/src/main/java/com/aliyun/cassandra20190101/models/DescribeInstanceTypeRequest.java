// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeRequest extends TeaModel {
    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeRequest self = new DescribeInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
