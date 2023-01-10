// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutProvisionConfigResponseBody extends TeaModel {
    // Specifies whether to always allocate CPU to a function instance.
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    // The actual number of provisioned instances.
    @NameInMap("current")
    public Long current;

    // The description of the resource.
    @NameInMap("resource")
    public String resource;

    // The configurations of scheduled auto scaling.
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledActions> scheduledActions;

    // The expected number of provisioned instances.
    @NameInMap("target")
    public Long target;

    // The configurations of metric-based auto scaling.
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
