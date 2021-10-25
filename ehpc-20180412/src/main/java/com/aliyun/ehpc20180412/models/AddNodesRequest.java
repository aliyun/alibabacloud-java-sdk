// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("CreateMode")
    public String createMode;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandWidthIn")
    public Integer internetMaxBandWidthIn;

    @NameInMap("InternetMaxBandWidthOut")
    public Integer internetMaxBandWidthOut;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    @NameInMap("MinCount")
    public Integer minCount;

    @NameInMap("Sync")
    public Boolean sync;

    public static AddNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNodesRequest self = new AddNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddNodesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public AddNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AddNodesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AddNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public AddNodesRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public AddNodesRequest setEcsChargeType(String ecsChargeType) {
        this.ecsChargeType = ecsChargeType;
        return this;
    }
    public String getEcsChargeType() {
        return this.ecsChargeType;
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

    public AddNodesRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public AddNodesRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public AddNodesRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public AddNodesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public AddNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public AddNodesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
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

    public AddNodesRequest setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    public AddNodesRequest setAllocatePublicAddress(Boolean allocatePublicAddress) {
        this.allocatePublicAddress = allocatePublicAddress;
        return this;
    }
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
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

    public AddNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddNodesRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public AddNodesRequest setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public AddNodesRequest setSync(Boolean sync) {
        this.sync = sync;
        return this;
    }
    public Boolean getSync() {
        return this.sync;
    }

}
