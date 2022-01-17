// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectNodesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeProjectNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectNodesRequest self = new DescribeProjectNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
