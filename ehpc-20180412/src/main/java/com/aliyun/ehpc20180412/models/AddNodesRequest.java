// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddNodesRequest extends TeaModel {
    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("CreateMode")
    public String createMode;

    @NameInMap("DataDisks")
    public java.util.List<AddNodesRequestDataDisks> dataDisks;

    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandWidthIn")
    public Integer internetMaxBandWidthIn;

    @NameInMap("InternetMaxBandWidthOut")
    public Integer internetMaxBandWidthOut;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("MinCount")
    public Integer minCount;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Sync")
    public Boolean sync;

    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static AddNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNodesRequest self = new AddNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddNodesRequest setAllocatePublicAddress(Boolean allocatePublicAddress) {
        this.allocatePublicAddress = allocatePublicAddress;
        return this;
    }
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    public AddNodesRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public AddNodesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public AddNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddNodesRequest setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    public AddNodesRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public AddNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public AddNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AddNodesRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public AddNodesRequest setDataDisks(java.util.List<AddNodesRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<AddNodesRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public AddNodesRequest setEcsChargeType(String ecsChargeType) {
        this.ecsChargeType = ecsChargeType;
        return this;
    }
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    public AddNodesRequest setHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    public AddNodesRequest setHostNameSuffix(String hostNameSuffix) {
        this.hostNameSuffix = hostNameSuffix;
        return this;
    }
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    public AddNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddNodesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public AddNodesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AddNodesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AddNodesRequest setInternetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
        this.internetMaxBandWidthIn = internetMaxBandWidthIn;
        return this;
    }
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    public AddNodesRequest setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
        this.internetMaxBandWidthOut = internetMaxBandWidthOut;
        return this;
    }
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    public AddNodesRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public AddNodesRequest setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public AddNodesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AddNodesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AddNodesRequest setSync(Boolean sync) {
        this.sync = sync;
        return this;
    }
    public Boolean getSync() {
        return this.sync;
    }

    public AddNodesRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public AddNodesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public AddNodesRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public AddNodesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AddNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class AddNodesRequestDataDisks extends TeaModel {
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
        public Integer dataDiskSize;

        public static AddNodesRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            AddNodesRequestDataDisks self = new AddNodesRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public AddNodesRequestDataDisks setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public AddNodesRequestDataDisks setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
            this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
            return this;
        }
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        public AddNodesRequestDataDisks setDataDiskEncrypted(Boolean dataDiskEncrypted) {
            this.dataDiskEncrypted = dataDiskEncrypted;
            return this;
        }
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        public AddNodesRequestDataDisks setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
            this.dataDiskKMSKeyId = dataDiskKMSKeyId;
            return this;
        }
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        public AddNodesRequestDataDisks setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public AddNodesRequestDataDisks setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

}
