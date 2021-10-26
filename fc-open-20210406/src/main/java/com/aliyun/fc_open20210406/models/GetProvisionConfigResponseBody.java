// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetProvisionConfigResponseBody extends TeaModel {
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

    public static GetProvisionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigResponseBody self = new GetProvisionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetProvisionConfigResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public GetProvisionConfigResponseBody setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledActions> getScheduledActions() {
        return this.scheduledActions;
    }

    public GetProvisionConfigResponseBody setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public GetProvisionConfigResponseBody setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

}
