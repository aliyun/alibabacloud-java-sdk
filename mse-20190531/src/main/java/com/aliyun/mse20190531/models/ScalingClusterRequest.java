// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ScalingClusterRequest extends TeaModel {
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemoryCapacity")
    public Long memoryCapacity;

    public static ScalingClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScalingClusterRequest self = new ScalingClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScalingClusterRequest setClusterSpecification(String clusterSpecification) {
        this.clusterSpecification = clusterSpecification;
        return this;
    }
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    public ScalingClusterRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ScalingClusterRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public ScalingClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ScalingClusterRequest setMemoryCapacity(Long memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }
    public Long getMemoryCapacity() {
        return this.memoryCapacity;
    }

}
