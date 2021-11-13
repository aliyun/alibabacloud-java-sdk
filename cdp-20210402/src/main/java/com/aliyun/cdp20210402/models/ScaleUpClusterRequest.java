// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ScaleUpClusterRequest extends TeaModel {
    @NameInMap("CoreNumber")
    public Long coreNumber;

    @NameInMap("Duration")
    public Long duration;

    // A short description of struct
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static ScaleUpClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleUpClusterRequest self = new ScaleUpClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleUpClusterRequest setCoreNumber(Long coreNumber) {
        this.coreNumber = coreNumber;
        return this;
    }
    public Long getCoreNumber() {
        return this.coreNumber;
    }

    public ScaleUpClusterRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public ScaleUpClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ScaleUpClusterRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ScaleUpClusterRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ScaleUpClusterRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
