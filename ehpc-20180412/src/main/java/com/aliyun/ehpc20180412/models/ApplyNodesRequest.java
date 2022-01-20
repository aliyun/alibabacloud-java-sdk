// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesRequest extends TeaModel {
    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComputeSpotPriceLimit")
    public Float computeSpotPriceLimit;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceTypeModel")
    public java.util.List<ApplyNodesRequestInstanceTypeModel> instanceTypeModel;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandWidthIn")
    public Integer internetMaxBandWidthIn;

    @NameInMap("InternetMaxBandWidthOut")
    public Integer internetMaxBandWidthOut;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    @NameInMap("ResourceAmountType")
    public String resourceAmountType;

    @NameInMap("Round")
    public Integer round;

    @NameInMap("StrictResourceProvision")
    public Boolean strictResourceProvision;

    @NameInMap("StrictSatisfiedTargetCapacity")
    public Boolean strictSatisfiedTargetCapacity;

    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("Tag")
    public java.util.List<ApplyNodesRequestTag> tag;

    @NameInMap("TargetCapacity")
    public Integer targetCapacity;

    @NameInMap("ZoneInfos")
    public java.util.List<ApplyNodesRequestZoneInfos> zoneInfos;

    public static ApplyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNodesRequest self = new ApplyNodesRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNodesRequest setAllocatePublicAddress(Boolean allocatePublicAddress) {
        this.allocatePublicAddress = allocatePublicAddress;
        return this;
    }
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    public ApplyNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ApplyNodesRequest setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public Float getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public ApplyNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public ApplyNodesRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public ApplyNodesRequest setHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    public ApplyNodesRequest setHostNameSuffix(String hostNameSuffix) {
        this.hostNameSuffix = hostNameSuffix;
        return this;
    }
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    public ApplyNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ApplyNodesRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public ApplyNodesRequest setInstanceTypeModel(java.util.List<ApplyNodesRequestInstanceTypeModel> instanceTypeModel) {
        this.instanceTypeModel = instanceTypeModel;
        return this;
    }
    public java.util.List<ApplyNodesRequestInstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
    }

    public ApplyNodesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ApplyNodesRequest setInternetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
        this.internetMaxBandWidthIn = internetMaxBandWidthIn;
        return this;
    }
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    public ApplyNodesRequest setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
        this.internetMaxBandWidthOut = internetMaxBandWidthOut;
        return this;
    }
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    public ApplyNodesRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public ApplyNodesRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public ApplyNodesRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ApplyNodesRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public ApplyNodesRequest setResourceAmountType(String resourceAmountType) {
        this.resourceAmountType = resourceAmountType;
        return this;
    }
    public String getResourceAmountType() {
        return this.resourceAmountType;
    }

    public ApplyNodesRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public ApplyNodesRequest setStrictResourceProvision(Boolean strictResourceProvision) {
        this.strictResourceProvision = strictResourceProvision;
        return this;
    }
    public Boolean getStrictResourceProvision() {
        return this.strictResourceProvision;
    }

    public ApplyNodesRequest setStrictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
        this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
        return this;
    }
    public Boolean getStrictSatisfiedTargetCapacity() {
        return this.strictSatisfiedTargetCapacity;
    }

    public ApplyNodesRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public ApplyNodesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public ApplyNodesRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public ApplyNodesRequest setTag(java.util.List<ApplyNodesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ApplyNodesRequestTag> getTag() {
        return this.tag;
    }

    public ApplyNodesRequest setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    public ApplyNodesRequest setZoneInfos(java.util.List<ApplyNodesRequestZoneInfos> zoneInfos) {
        this.zoneInfos = zoneInfos;
        return this;
    }
    public java.util.List<ApplyNodesRequestZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public static class ApplyNodesRequestInstanceTypeModel extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("TargetImageId")
        public String targetImageId;

        public static ApplyNodesRequestInstanceTypeModel build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestInstanceTypeModel self = new ApplyNodesRequestInstanceTypeModel();
            return TeaModel.build(map, self);
        }

        public ApplyNodesRequestInstanceTypeModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ApplyNodesRequestInstanceTypeModel setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ApplyNodesRequestInstanceTypeModel setTargetImageId(String targetImageId) {
            this.targetImageId = targetImageId;
            return this;
        }
        public String getTargetImageId() {
            return this.targetImageId;
        }

    }

    public static class ApplyNodesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ApplyNodesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestTag self = new ApplyNodesRequestTag();
            return TeaModel.build(map, self);
        }

        public ApplyNodesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ApplyNodesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ApplyNodesRequestZoneInfos extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ApplyNodesRequestZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestZoneInfos self = new ApplyNodesRequestZoneInfos();
            return TeaModel.build(map, self);
        }

        public ApplyNodesRequestZoneInfos setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ApplyNodesRequestZoneInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
