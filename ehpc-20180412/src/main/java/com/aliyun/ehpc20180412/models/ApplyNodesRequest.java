// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("ComputeSpotPriceLimit")
    public Float computeSpotPriceLimit;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandWidthIn")
    public Integer internetMaxBandWidthIn;

    @NameInMap("InternetMaxBandWidthOut")
    public Integer internetMaxBandWidthOut;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("TargetCapacity")
    public Integer targetCapacity;

    @NameInMap("ResourceAmountType")
    public String resourceAmountType;

    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    @NameInMap("StrictSatisfiedTargetCapacity")
    public Boolean strictSatisfiedTargetCapacity;

    @NameInMap("ZoneInfos")
    public java.util.List<ApplyNodesRequestZoneInfos> zoneInfos;

    @NameInMap("InstanceTypeModel")
    public java.util.List<ApplyNodesRequestInstanceTypeModel> instanceTypeModel;

    public static ApplyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNodesRequest self = new ApplyNodesRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ApplyNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ApplyNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public ApplyNodesRequest setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public Float getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public ApplyNodesRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public ApplyNodesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
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

    public ApplyNodesRequest setAllocatePublicAddress(Boolean allocatePublicAddress) {
        this.allocatePublicAddress = allocatePublicAddress;
        return this;
    }
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
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

    public ApplyNodesRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public ApplyNodesRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ApplyNodesRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public ApplyNodesRequest setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    public ApplyNodesRequest setResourceAmountType(String resourceAmountType) {
        this.resourceAmountType = resourceAmountType;
        return this;
    }
    public String getResourceAmountType() {
        return this.resourceAmountType;
    }

    public ApplyNodesRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public ApplyNodesRequest setStrictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
        this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
        return this;
    }
    public Boolean getStrictSatisfiedTargetCapacity() {
        return this.strictSatisfiedTargetCapacity;
    }

    public ApplyNodesRequest setZoneInfos(java.util.List<ApplyNodesRequestZoneInfos> zoneInfos) {
        this.zoneInfos = zoneInfos;
        return this;
    }
    public java.util.List<ApplyNodesRequestZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public ApplyNodesRequest setInstanceTypeModel(java.util.List<ApplyNodesRequestInstanceTypeModel> instanceTypeModel) {
        this.instanceTypeModel = instanceTypeModel;
        return this;
    }
    public java.util.List<ApplyNodesRequestInstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
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

    public static class ApplyNodesRequestInstanceTypeModel extends TeaModel {
        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("TargetImageId")
        public String targetImageId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static ApplyNodesRequestInstanceTypeModel build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestInstanceTypeModel self = new ApplyNodesRequestInstanceTypeModel();
            return TeaModel.build(map, self);
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

        public ApplyNodesRequestInstanceTypeModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
