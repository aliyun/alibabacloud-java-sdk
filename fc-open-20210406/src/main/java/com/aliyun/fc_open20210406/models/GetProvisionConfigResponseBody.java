// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetProvisionConfigResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to always allocate CPU to a function instance.</p>
     */
    @NameInMap("alwaysAllocateCPU")
    public Boolean alwaysAllocateCPU;

    /**
     * <p>The actual number of provisioned instances.</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>The error message returned if a provisioned instance fails to be created.</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <p>The description of the resource.</p>
     */
    @NameInMap("resource")
    public String resource;

    /**
     * <p>The configurations of scheduled auto scaling.</p>
     */
    @NameInMap("scheduledActions")
    public java.util.List<ScheduledActions> scheduledActions;

    /**
     * <p>The expected number of provisioned instances.</p>
     */
    @NameInMap("target")
    public Long target;

    /**
     * <p>The configurations of metric-based auto scaling.</p>
     */
    @NameInMap("targetTrackingPolicies")
    public java.util.List<TargetTrackingPolicies> targetTrackingPolicies;

    public static GetProvisionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigResponseBody self = new GetProvisionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigResponseBody setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
        this.alwaysAllocateCPU = alwaysAllocateCPU;
        return this;
    }
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    public GetProvisionConfigResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetProvisionConfigResponseBody setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
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
