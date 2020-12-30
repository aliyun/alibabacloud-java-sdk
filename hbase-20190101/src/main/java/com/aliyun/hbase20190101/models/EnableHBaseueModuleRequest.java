// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueModuleRequest extends TeaModel {
    @NameInMap("ModuleClusterName")
    public String moduleClusterName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DiskSize")
    public Integer diskSize;

    @NameInMap("NodeCount")
    public Integer nodeCount;

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

    @NameInMap("HbaseueClusterId")
    public String hbaseueClusterId;

    @NameInMap("BdsId")
    public String bdsId;

    @NameInMap("ModuleTypeName")
    public String moduleTypeName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static EnableHBaseueModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueModuleRequest self = new EnableHBaseueModuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueModuleRequest setModuleClusterName(String moduleClusterName) {
        this.moduleClusterName = moduleClusterName;
        return this;
    }
    public String getModuleClusterName() {
        return this.moduleClusterName;
    }

    public EnableHBaseueModuleRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public EnableHBaseueModuleRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public EnableHBaseueModuleRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public EnableHBaseueModuleRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public EnableHBaseueModuleRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public EnableHBaseueModuleRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public EnableHBaseueModuleRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public EnableHBaseueModuleRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public EnableHBaseueModuleRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public EnableHBaseueModuleRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public EnableHBaseueModuleRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public EnableHBaseueModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableHBaseueModuleRequest setHbaseueClusterId(String hbaseueClusterId) {
        this.hbaseueClusterId = hbaseueClusterId;
        return this;
    }
    public String getHbaseueClusterId() {
        return this.hbaseueClusterId;
    }

    public EnableHBaseueModuleRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public EnableHBaseueModuleRequest setModuleTypeName(String moduleTypeName) {
        this.moduleTypeName = moduleTypeName;
        return this;
    }
    public String getModuleTypeName() {
        return this.moduleTypeName;
    }

    public EnableHBaseueModuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableHBaseueModuleRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
