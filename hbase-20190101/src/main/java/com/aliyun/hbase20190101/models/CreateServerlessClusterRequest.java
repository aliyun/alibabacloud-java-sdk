// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateServerlessClusterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ServerlessSpec")
    public String serverlessSpec;

    @NameInMap("ServerlessCapability")
    public Integer serverlessCapability;

    @NameInMap("ServerlessStorage")
    public Integer serverlessStorage;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateServerlessClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerlessClusterRequest self = new CreateServerlessClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerlessClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServerlessClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateServerlessClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateServerlessClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateServerlessClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateServerlessClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateServerlessClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateServerlessClusterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateServerlessClusterRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateServerlessClusterRequest setServerlessSpec(String serverlessSpec) {
        this.serverlessSpec = serverlessSpec;
        return this;
    }
    public String getServerlessSpec() {
        return this.serverlessSpec;
    }

    public CreateServerlessClusterRequest setServerlessCapability(Integer serverlessCapability) {
        this.serverlessCapability = serverlessCapability;
        return this;
    }
    public Integer getServerlessCapability() {
        return this.serverlessCapability;
    }

    public CreateServerlessClusterRequest setServerlessStorage(Integer serverlessStorage) {
        this.serverlessStorage = serverlessStorage;
        return this;
    }
    public Integer getServerlessStorage() {
        return this.serverlessStorage;
    }

    public CreateServerlessClusterRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateServerlessClusterRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateServerlessClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServerlessClusterRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public CreateServerlessClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
