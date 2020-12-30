// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EvaluateMultiZoneResourceRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("ArchVersion")
    public String archVersion;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    @NameInMap("LogInstanceType")
    public String logInstanceType;

    @NameInMap("LogDiskType")
    public String logDiskType;

    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    public static EvaluateMultiZoneResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateMultiZoneResourceRequest self = new EvaluateMultiZoneResourceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateMultiZoneResourceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public EvaluateMultiZoneResourceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public EvaluateMultiZoneResourceRequest setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public EvaluateMultiZoneResourceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public EvaluateMultiZoneResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EvaluateMultiZoneResourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public EvaluateMultiZoneResourceRequest setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public EvaluateMultiZoneResourceRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public EvaluateMultiZoneResourceRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public EvaluateMultiZoneResourceRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public EvaluateMultiZoneResourceRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public EvaluateMultiZoneResourceRequest setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public EvaluateMultiZoneResourceRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public EvaluateMultiZoneResourceRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public EvaluateMultiZoneResourceRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public EvaluateMultiZoneResourceRequest setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public EvaluateMultiZoneResourceRequest setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public EvaluateMultiZoneResourceRequest setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public EvaluateMultiZoneResourceRequest setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public EvaluateMultiZoneResourceRequest setLogDiskType(String logDiskType) {
        this.logDiskType = logDiskType;
        return this;
    }
    public String getLogDiskType() {
        return this.logDiskType;
    }

    public EvaluateMultiZoneResourceRequest setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public EvaluateMultiZoneResourceRequest setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public EvaluateMultiZoneResourceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public EvaluateMultiZoneResourceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public EvaluateMultiZoneResourceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public EvaluateMultiZoneResourceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public EvaluateMultiZoneResourceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public EvaluateMultiZoneResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
