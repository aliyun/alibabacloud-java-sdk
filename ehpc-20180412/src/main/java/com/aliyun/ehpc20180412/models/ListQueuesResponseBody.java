// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    /**
     * <p>The details of the queue.</p>
     */
    @NameInMap("Queues")
    public ListQueuesResponseBodyQueues queues;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponseBody self = new ListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponseBody setQueues(ListQueuesResponseBodyQueues queues) {
        this.queues = queues;
        return this;
    }
    public ListQueuesResponseBodyQueues getQueues() {
        return this.queues;
    }

    public ListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<String> instanceType;

        public static ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType self = new ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType setInstanceType(java.util.List<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<String> getInstanceType() {
            return this.instanceType;
        }

    }

    public static class ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance extends TeaModel {
        /**
         * <p>The instance type of the preemptible instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price of the preemptible instance. The value can be accurate to three decimal places. The parameter only takes effect when SpotStrategy is set to SpotWithPriceLimit.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        public static ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance self = new ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

    }

    public static class ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance> instance;

        public static ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes self = new ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes setInstance(java.util.List<ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class ListQueuesResponseBodyQueuesQueueInfo extends TeaModel {
        /**
         * <p>The instance type of compute node.</p>
         */
        @NameInMap("ComputeInstanceType")
        public ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType computeInstanceType;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>Indicates whether the queue enabled the auto scale-out. Valid values:</p>
         * <br>
         * <p>*   true: The queue enabled auto scale-out.</p>
         * <p>*   false: The queue disabled auto scale-out.</p>
         */
        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        /**
         * <p>The prefix of the hostname.</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The suffix of the host name.</p>
         */
        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        /**
         * <p>The ID of the custom image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The name of the queue.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the resource group to which the queue belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the preemptible instance.</p>
         */
        @NameInMap("SpotInstanceTypes")
        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes spotInstanceTypes;

        /**
         * <p>The preemption policy of the compute nodes. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The instances of the compute node are pay-as-you-go instances.</p>
         * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The type of queue. Valid values:</p>
         * <br>
         * <p>*   Execution: Queues in which jobs can be executed.</p>
         * <p>*   Router: Queues in which jobs cannot be executed but are forwarded to the bounded Execution queue for processing.</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("UseESS")
        public Boolean useESS;

        public static ListQueuesResponseBodyQueuesQueueInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueuesQueueInfo self = new ListQueuesResponseBodyQueuesQueueInfo();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueuesQueueInfo setComputeInstanceType(ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType computeInstanceType) {
            this.computeInstanceType = computeInstanceType;
            return this;
        }
        public ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType getComputeInstanceType() {
            return this.computeInstanceType;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setHostNameSuffix(String hostNameSuffix) {
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }
        public String getHostNameSuffix() {
            return this.hostNameSuffix;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setSpotInstanceTypes(ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes spotInstanceTypes) {
            this.spotInstanceTypes = spotInstanceTypes;
            return this;
        }
        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes getSpotInstanceTypes() {
            return this.spotInstanceTypes;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setUseESS(Boolean useESS) {
            this.useESS = useESS;
            return this;
        }
        public Boolean getUseESS() {
            return this.useESS;
        }

    }

    public static class ListQueuesResponseBodyQueues extends TeaModel {
        @NameInMap("QueueInfo")
        public java.util.List<ListQueuesResponseBodyQueuesQueueInfo> queueInfo;

        public static ListQueuesResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueues self = new ListQueuesResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueues setQueueInfo(java.util.List<ListQueuesResponseBodyQueuesQueueInfo> queueInfo) {
            this.queueInfo = queueInfo;
            return this;
        }
        public java.util.List<ListQueuesResponseBodyQueuesQueueInfo> getQueueInfo() {
            return this.queueInfo;
        }

    }

}
