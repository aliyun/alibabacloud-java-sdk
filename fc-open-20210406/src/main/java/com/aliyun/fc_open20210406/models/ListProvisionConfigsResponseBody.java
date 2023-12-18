// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsResponseBody extends TeaModel {
    /**
     * <p>The token used to obtain more results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The information about provisioned instances.</p>
     */
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
