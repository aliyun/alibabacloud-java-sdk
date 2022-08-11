// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsResponseBody extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

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
        @NameInMap("alwaysAllocateCPU")
        public Boolean alwaysAllocateCPU;

        @NameInMap("current")
        public Long current;

        @NameInMap("currentError")
        public String currentError;

        @NameInMap("resource")
        public String resource;

        @NameInMap("scheduledActions")
        public java.util.List<ScheduledActions> scheduledActions;

        @NameInMap("target")
        public Long target;

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
