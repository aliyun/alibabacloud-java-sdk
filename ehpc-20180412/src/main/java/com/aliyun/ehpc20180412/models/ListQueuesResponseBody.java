// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Queues")
    public ListQueuesResponseBodyQueues queues;

    public static ListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponseBody self = new ListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueuesResponseBody setQueues(ListQueuesResponseBodyQueues queues) {
        this.queues = queues;
        return this;
    }
    public ListQueuesResponseBodyQueues getQueues() {
        return this.queues;
    }

    public static class ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypesInstance extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

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

    public static class ListQueuesResponseBodyQueuesQueueInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("SpotInstanceTypes")
        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes spotInstanceTypes;

        @NameInMap("ComputeInstanceType")
        public ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType computeInstanceType;

        public static ListQueuesResponseBodyQueuesQueueInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueuesQueueInfo self = new ListQueuesResponseBodyQueuesQueueInfo();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueuesQueueInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setHostNameSuffix(String hostNameSuffix) {
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }
        public String getHostNameSuffix() {
            return this.hostNameSuffix;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setSpotInstanceTypes(ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes spotInstanceTypes) {
            this.spotInstanceTypes = spotInstanceTypes;
            return this;
        }
        public ListQueuesResponseBodyQueuesQueueInfoSpotInstanceTypes getSpotInstanceTypes() {
            return this.spotInstanceTypes;
        }

        public ListQueuesResponseBodyQueuesQueueInfo setComputeInstanceType(ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType computeInstanceType) {
            this.computeInstanceType = computeInstanceType;
            return this;
        }
        public ListQueuesResponseBodyQueuesQueueInfoComputeInstanceType getComputeInstanceType() {
            return this.computeInstanceType;
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
