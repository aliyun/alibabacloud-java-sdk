// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeInstanceDasProRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceDasProRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDasProRequest self = new DescribeInstanceDasProRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDasProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
