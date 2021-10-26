// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutProvisionConfigRequest extends TeaModel {
    // 定时策略配置
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledActions> scheduledActions;

    // 预留的目标资源个数
    @NameInMap("target")
    public Long target;

    // 指标追踪伸缩策略配置
    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicies> targetTrackingPolicies;

    // 别名名称
    @NameInMap("qualifier")
    public String qualifier;

    public static PutProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigRequest self = new PutProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigRequest setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }
    public java.util.List<ScheduledActions> getScheduledActions() {
        return this.scheduledActions;
    }

    public PutProvisionConfigRequest setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public PutProvisionConfigRequest setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
        this.targetTrackingPolicies = targetTrackingPolicies;
        return this;
    }
    public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    public PutProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
