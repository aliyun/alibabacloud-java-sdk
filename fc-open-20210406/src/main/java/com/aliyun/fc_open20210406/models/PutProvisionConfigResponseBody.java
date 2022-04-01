// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutProvisionConfigResponseBody extends TeaModel {
    // 是否始终分配CPU给函数实例。
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    // 实际资源个数
    @NameInMap("current")
    public Long current;

    // 资源描述
    @NameInMap("resource")
    public String resource;

    // 定时策略配置
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledActions> scheduledActions;

    // 目标资源个数
    @NameInMap("target")
    public Long target;

    // 指标追踪伸缩策略配置
    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicies> targetTrackingPolicies;

    public static PutProvisionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigResponseBody self = new PutProvisionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigResponseBody setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public PutProvisionConfigResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PutProvisionConfigResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public PutProvisionConfigResponseBody setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledActions> getScheduledActions() {
        return this.scheduledActions;
    }

    public PutProvisionConfigResponseBody setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public PutProvisionConfigResponseBody setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

}
