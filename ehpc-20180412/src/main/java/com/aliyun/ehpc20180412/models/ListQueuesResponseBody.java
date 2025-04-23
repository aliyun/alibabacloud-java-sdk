// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    /**
     * <p>The queried cluster queues.</p>
     */
    @NameInMap("Queues")
    public ListQueuesResponseBodyQueues queues;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C6E5005C-00B0-4F27-98BB-95AB88016C22</p>
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
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price of the instance. The price can be accurate to three decimal places. This parameter is valid only when the SpotStrategy parameter is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.062</p>
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
         * <p>The instance type of the compute nodes.</p>
         */
        @NameInMap("ComputeInstanceType")
        public ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType computeInstanceType;

        /**
         * <p>The ID of the deployment set to which to deploy the instance. You can call the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation to query the deployment set ID. Only the deployment sets that use low latency policies are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4pzq****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>Indicates whether auto scale-out is enabled for the queue. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        /**
         * <p>The prefix of the hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The suffix of the hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_20****.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The communication mode of the elastic network interface (ENI). Valid values:</p>
         * <ul>
         * <li>Standard: The TCP communication mode is used.</li>
         * <li>HighPerformance: The Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the resource group to which the queue belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxp7uc24****</p>
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
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance for which you specify the maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The type of queue. Valid values:</p>
         * <ul>
         * <li>Execution: Queues in which jobs can be executed.</li>
         * <li>Router: Queues in which jobs cannot be executed. The received jobs in the queues must be forwarded to the bound Execution queues for execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Execution</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Specifies whether to use scaling groups of Auto Scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
