// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingConfigRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeAutoScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingConfigRequest self = new DescribeAutoScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
