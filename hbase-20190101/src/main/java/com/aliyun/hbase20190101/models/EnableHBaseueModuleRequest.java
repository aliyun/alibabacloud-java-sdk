// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueModuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <strong>example:</strong>
     * <p>bds-bp174pm3tsk3****</p>
     */
    @NameInMap("BdsId")
    public String bdsId;

    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("HbaseueClusterId")
    public String hbaseueClusterId;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    /**
     * <strong>example:</strong>
     * <p>cluster-name</p>
     */
    @NameInMap("ModuleClusterName")
    public String moduleClusterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>solr</p>
     */
    @NameInMap("ModuleTypeName")
    public String moduleTypeName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>6</p>
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
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp120k6ixs4eog*****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp191ipotqj1ssyl*****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static EnableHBaseueModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueModuleRequest self = new EnableHBaseueModuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueModuleRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public EnableHBaseueModuleRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public EnableHBaseueModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableHBaseueModuleRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public EnableHBaseueModuleRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public EnableHBaseueModuleRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public EnableHBaseueModuleRequest setHbaseueClusterId(String hbaseueClusterId) {
        this.hbaseueClusterId = hbaseueClusterId;
        return this;
    }
    public String getHbaseueClusterId() {
        return this.hbaseueClusterId;
    }

    public EnableHBaseueModuleRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public EnableHBaseueModuleRequest setModuleClusterName(String moduleClusterName) {
        this.moduleClusterName = moduleClusterName;
        return this;
    }
    public String getModuleClusterName() {
        return this.moduleClusterName;
    }

    public EnableHBaseueModuleRequest setModuleTypeName(String moduleTypeName) {
        this.moduleTypeName = moduleTypeName;
        return this;
    }
    public String getModuleTypeName() {
        return this.moduleTypeName;
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

    public EnableHBaseueModuleRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public EnableHBaseueModuleRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public EnableHBaseueModuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public EnableHBaseueModuleRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
