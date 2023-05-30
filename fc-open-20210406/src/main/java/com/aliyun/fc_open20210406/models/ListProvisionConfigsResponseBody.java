// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsResponseBody extends TeaModel {
    /**
     * <p>The qualifier of the service to which resources belong. The qualifier must be aliasName and used together with the serviceName parameter.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The time when Function Compute API is called. Specify the time in the **EEE,d MMM yyyy HH:mm:ss GMT** format.</p>
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
        @NameInMap("alwaysAllocateCPU")
        public Boolean alwaysAllocateCPU;

        /**
         * <p>The expected number of provisioned instances.</p>
         */
        @NameInMap("current")
        public Long current;

        /**
         * <p>139490</p>
         */
        @NameInMap("currentError")
        public String currentError;

        /**
         * <p>Details about the scheduled scaling policy. You can use the scheduled scaling policy to flexibly configure provisioned instances. You can specify the number of provisioned instances to the desired value at the scheduled time. This way, the number of provisioned instances can meet the concurrency requirements of your business.</p>
         */
        @NameInMap("resource")
        public String resource;

        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         */
        @NameInMap("scheduledActions")
        public java.util.List<ScheduledActions> scheduledActions;

        /**
         * <p>The configuration of metric-based auto scaling. Provisioned instances are scaled in or out every minute based on the concurrency utilization of provisioned instances. </p>
         * <br>
         * <p>- If the metric value exceeds the value of the metricTarget parameter, the system scales out provisioned instances based on a progressive policy to make the metric value closer to the value of the metricTarget parameter. </p>
         * <p>- When the metric value is smaller than the value of the metricTarget parameter, the system scales in provisioned instances based on a conservative policy to make the metric value close to the value of the metricTarget parameter. </p>
         * <br>
         * <p>After you specify the maximum and minimum numbers of provisioned instances, the system scales in or out provisioned instances within the range from the minimum number to the maximum number. If the number of provisioned instances is beyond the range, the scaling stops.</p>
         */
        @NameInMap("target")
        public Long target;

        /**
         * <p>Example 1</p>
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
