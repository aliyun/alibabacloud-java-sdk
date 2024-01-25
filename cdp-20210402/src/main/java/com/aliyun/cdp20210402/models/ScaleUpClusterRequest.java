// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ScaleUpClusterRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("CoreNumber")
    public Long coreNumber;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static ScaleUpClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleUpClusterRequest self = new ScaleUpClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleUpClusterRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
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

    public ScaleUpClusterRequest setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public ScaleUpClusterRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
