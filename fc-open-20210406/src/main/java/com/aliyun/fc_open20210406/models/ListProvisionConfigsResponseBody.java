// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsResponseBody extends TeaModel {
    // The token used to obtain more results.
    @NameInMap("nextToken")
    public String nextToken;

    // The information about provisioned instances.
    @NameInMap("provisionConfigs")
    public java.util.List<ListProvisionConfigsResponseBodyProvisionConfigs> provisionConfigs;

    public static ListProvisionConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionConfigsResponseBody self = new ListProvisionConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProvisionConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProvisionConfigsResponseBody setProvisionConfigs(java.util.List<ListProvisionConfigsResponseBodyProvisionConfigs> provisionConfigs) {
        this.provisionConfigs = provisionConfigs;
        return this;
    }
    public java.util.List<ListProvisionConfigsResponseBodyProvisionConfigs> getProvisionConfigs() {
        return this.provisionConfigs;
    }

    public static class ListProvisionConfigsResponseBodyProvisionConfigs extends TeaModel {
        // Specifies whether to always allocate CPU to a function instance.
        @NameInMap("alwaysAllocateCPU")
        public Boolean alwaysAllocateCPU;

        // The actual number of provisioned instances.
        @NameInMap("current")
        public Long current;

        // The error message returned if a provisioned instance fails to be created.
        @NameInMap("currentError")
        public String currentError;

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

        public static ListProvisionConfigsResponseBodyProvisionConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionConfigsResponseBodyProvisionConfigs self = new ListProvisionConfigsResponseBodyProvisionConfigs();
            return TeaModel.build(map, self);
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }
        public Boolean getAlwaysAllocateCPU() {
            return this.alwaysAllocateCPU;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setCurrentError(String currentError) {
            this.currentError = currentError;
            return this;
        }
        public String getCurrentError() {
            return this.currentError;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<ScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }
        public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
            return this.targetTrackingPolicies;
        }

    }

}
