// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigRequest extends TeaModel {
    // 静默时间，扩容出的节点，在静默时间过后，方可进入缩容判断
    @NameInMap("cool_down_duration")
    public String coolDownDuration;

    // 缩容触发时延，节点缩容时需要连续满足触发时延所设定的时间，方可进行缩容
    @NameInMap("unneeded_duration")
    public String unneededDuration;

    // 缩容阈值，节点上 Request 的资源与总资源量的比值
    @NameInMap("utilization_threshold")
    public String utilizationThreshold;

    // GPU缩容阈值，节点上 Request 的资源与总资源量的比值
    @NameInMap("gpu_utilization_threshold")
    public String gpuUtilizationThreshold;

    // 弹性灵敏度，判断伸缩的间隔时间
    @NameInMap("scan_interval")
    public String scanInterval;

    public static CreateAutoscalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoscalingConfigRequest self = new CreateAutoscalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoscalingConfigRequest setCoolDownDuration(String coolDownDuration) {
        this.coolDownDuration = coolDownDuration;
        return this;
    }
    public String getCoolDownDuration() {
        return this.coolDownDuration;
    }

    public CreateAutoscalingConfigRequest setUnneededDuration(String unneededDuration) {
        this.unneededDuration = unneededDuration;
        return this;
    }
    public String getUnneededDuration() {
        return this.unneededDuration;
    }

    public CreateAutoscalingConfigRequest setUtilizationThreshold(String utilizationThreshold) {
        this.utilizationThreshold = utilizationThreshold;
        return this;
    }
    public String getUtilizationThreshold() {
        return this.utilizationThreshold;
    }

    public CreateAutoscalingConfigRequest setGpuUtilizationThreshold(String gpuUtilizationThreshold) {
        this.gpuUtilizationThreshold = gpuUtilizationThreshold;
        return this;
    }
    public String getGpuUtilizationThreshold() {
        return this.gpuUtilizationThreshold;
    }

    public CreateAutoscalingConfigRequest setScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }
    public String getScanInterval() {
        return this.scanInterval;
    }

}
