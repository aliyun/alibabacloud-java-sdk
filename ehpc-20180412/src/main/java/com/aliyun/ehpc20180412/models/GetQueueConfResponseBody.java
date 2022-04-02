// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetQueueConfResponseBody extends TeaModel {
    @NameInMap("QueuesConf")
    public java.util.List<GetQueueConfResponseBodyQueuesConf> queuesConf;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetQueueConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueConfResponseBody self = new GetQueueConfResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueConfResponseBody setQueuesConf(java.util.List<GetQueueConfResponseBodyQueuesConf> queuesConf) {
        this.queuesConf = queuesConf;
        return this;
    }
    public java.util.List<GetQueueConfResponseBodyQueuesConf> getQueuesConf() {
        return this.queuesConf;
    }

    public GetQueueConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueConfResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueueConfResponseBodyQueuesConfDataDisks extends TeaModel {
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskDeleteWithInstance")
        public Boolean dataDiskDeleteWithInstance;

        @NameInMap("DataDiskEncrypted")
        public Boolean dataDiskEncrypted;

        @NameInMap("DataDiskKMSKeyId")
        public String dataDiskKMSKeyId;

        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        @NameInMap("DataDiskSize")
        public Long dataDiskSize;

        public static GetQueueConfResponseBodyQueuesConfDataDisks build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConfResponseBodyQueuesConfDataDisks self = new GetQueueConfResponseBodyQueuesConfDataDisks();
            return TeaModel.build(map, self);
        }

        public GetQueueConfResponseBodyQueuesConfDataDisks setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public GetQueueConfResponseBodyQueuesConfDataDisks setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
            this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
            return this;
        }
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        public GetQueueConfResponseBodyQueuesConfDataDisks setDataDiskEncrypted(Boolean dataDiskEncrypted) {
            this.dataDiskEncrypted = dataDiskEncrypted;
            return this;
        }
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        public GetQueueConfResponseBodyQueuesConfDataDisks setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
            this.dataDiskKMSKeyId = dataDiskKMSKeyId;
            return this;
        }
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        public GetQueueConfResponseBodyQueuesConfDataDisks setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public GetQueueConfResponseBodyQueuesConfDataDisks setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

    public static class GetQueueConfResponseBodyQueuesConfInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static GetQueueConfResponseBodyQueuesConfInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConfResponseBodyQueuesConfInstanceTypes self = new GetQueueConfResponseBodyQueuesConfInstanceTypes();
            return TeaModel.build(map, self);
        }

        public GetQueueConfResponseBodyQueuesConfInstanceTypes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetQueueConfResponseBodyQueuesConfInstanceTypes setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public GetQueueConfResponseBodyQueuesConfInstanceTypes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class GetQueueConfResponseBodyQueuesConfZones extends TeaModel {
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetQueueConfResponseBodyQueuesConfZones build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConfResponseBodyQueuesConfZones self = new GetQueueConfResponseBodyQueuesConfZones();
            return TeaModel.build(map, self);
        }

        public GetQueueConfResponseBodyQueuesConfZones setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetQueueConfResponseBodyQueuesConfZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetQueueConfResponseBodyQueuesConf extends TeaModel {
        @NameInMap("DataDisks")
        public java.util.List<GetQueueConfResponseBodyQueuesConfDataDisks> dataDisks;

        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        @NameInMap("GrowIntervallnMinutes")
        public Long growIntervallnMinutes;

        @NameInMap("GrowTimeoutInMinutes")
        public Long growTimeoutInMinutes;

        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("InstanceTypes")
        public java.util.List<GetQueueConfResponseBodyQueuesConfInstanceTypes> instanceTypes;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("InternetMaxBandwidthOut")
        public Long internetMaxBandwidthOut;

        @NameInMap("MaxNodes")
        public Long maxNodes;

        @NameInMap("MinNodes")
        public Long minNodes;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("ShrinkIntervallnMinutes")
        public Long shrinkIntervallnMinutes;

        @NameInMap("ShrinkidleTimes")
        public Long shrinkidleTimes;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        @NameInMap("Zones")
        public java.util.List<GetQueueConfResponseBodyQueuesConfZones> zones;

        public static GetQueueConfResponseBodyQueuesConf build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConfResponseBodyQueuesConf self = new GetQueueConfResponseBodyQueuesConf();
            return TeaModel.build(map, self);
        }

        public GetQueueConfResponseBodyQueuesConf setDataDisks(java.util.List<GetQueueConfResponseBodyQueuesConfDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<GetQueueConfResponseBodyQueuesConfDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public GetQueueConfResponseBodyQueuesConf setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public GetQueueConfResponseBodyQueuesConf setEnableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }
        public Boolean getEnableAutoShrink() {
            return this.enableAutoShrink;
        }

        public GetQueueConfResponseBodyQueuesConf setGrowIntervallnMinutes(Long growIntervallnMinutes) {
            this.growIntervallnMinutes = growIntervallnMinutes;
            return this;
        }
        public Long getGrowIntervallnMinutes() {
            return this.growIntervallnMinutes;
        }

        public GetQueueConfResponseBodyQueuesConf setGrowTimeoutInMinutes(Long growTimeoutInMinutes) {
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }
        public Long getGrowTimeoutInMinutes() {
            return this.growTimeoutInMinutes;
        }

        public GetQueueConfResponseBodyQueuesConf setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public GetQueueConfResponseBodyQueuesConf setHostNameSuffix(String hostNameSuffix) {
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }
        public String getHostNameSuffix() {
            return this.hostNameSuffix;
        }

        public GetQueueConfResponseBodyQueuesConf setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetQueueConfResponseBodyQueuesConf setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetQueueConfResponseBodyQueuesConf setInstanceTypes(java.util.List<GetQueueConfResponseBodyQueuesConfInstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<GetQueueConfResponseBodyQueuesConfInstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        public GetQueueConfResponseBodyQueuesConf setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public GetQueueConfResponseBodyQueuesConf setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public GetQueueConfResponseBodyQueuesConf setMaxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }
        public Long getMaxNodes() {
            return this.maxNodes;
        }

        public GetQueueConfResponseBodyQueuesConf setMinNodes(Long minNodes) {
            this.minNodes = minNodes;
            return this;
        }
        public Long getMinNodes() {
            return this.minNodes;
        }

        public GetQueueConfResponseBodyQueuesConf setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public GetQueueConfResponseBodyQueuesConf setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetQueueConfResponseBodyQueuesConf setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQueueConfResponseBodyQueuesConf setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetQueueConfResponseBodyQueuesConf setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetQueueConfResponseBodyQueuesConf setShrinkIntervallnMinutes(Long shrinkIntervallnMinutes) {
            this.shrinkIntervallnMinutes = shrinkIntervallnMinutes;
            return this;
        }
        public Long getShrinkIntervallnMinutes() {
            return this.shrinkIntervallnMinutes;
        }

        public GetQueueConfResponseBodyQueuesConf setShrinkidleTimes(Long shrinkidleTimes) {
            this.shrinkidleTimes = shrinkidleTimes;
            return this;
        }
        public Long getShrinkidleTimes() {
            return this.shrinkidleTimes;
        }

        public GetQueueConfResponseBodyQueuesConf setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public GetQueueConfResponseBodyQueuesConf setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public GetQueueConfResponseBodyQueuesConf setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public GetQueueConfResponseBodyQueuesConf setZones(java.util.List<GetQueueConfResponseBodyQueuesConfZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<GetQueueConfResponseBodyQueuesConfZones> getZones() {
            return this.zones;
        }

    }

}
