// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateMultiZoneClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxb*****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <strong>example:</strong>
     * <p>dfh3sf5gslfksfk****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>hbaseue_test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("CoreDiskType")
    public String coreDiskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskType")
    public String logDiskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("LogInstanceType")
    public String logInstanceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-bef-aliyun-com</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxe****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-gg3f4f5d5g5w****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxf****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp120k6ixs4eog****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateMultiZoneClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiZoneClusterRequest self = new CreateMultiZoneClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiZoneClusterRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public CreateMultiZoneClusterRequest setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public CreateMultiZoneClusterRequest setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public CreateMultiZoneClusterRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateMultiZoneClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMultiZoneClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateMultiZoneClusterRequest setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public CreateMultiZoneClusterRequest setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public CreateMultiZoneClusterRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public CreateMultiZoneClusterRequest setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public CreateMultiZoneClusterRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateMultiZoneClusterRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateMultiZoneClusterRequest setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public CreateMultiZoneClusterRequest setLogDiskType(String logDiskType) {
        this.logDiskType = logDiskType;
        return this;
    }
    public String getLogDiskType() {
        return this.logDiskType;
    }

    public CreateMultiZoneClusterRequest setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public CreateMultiZoneClusterRequest setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public CreateMultiZoneClusterRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public CreateMultiZoneClusterRequest setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public CreateMultiZoneClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateMultiZoneClusterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateMultiZoneClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateMultiZoneClusterRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public CreateMultiZoneClusterRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public CreateMultiZoneClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMultiZoneClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateMultiZoneClusterRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateMultiZoneClusterRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public CreateMultiZoneClusterRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public CreateMultiZoneClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
