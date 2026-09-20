// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateServerlessClusterRequest extends TeaModel {
    /**
     * <p>The auto-renewal period of the instance. Unit: months.</p>
     * <blockquote>
     * <ul><li>The default value of the auto-renewal period is 0, which indicates that the instance is not automatically renewed after the instance expires.</li>
     * </blockquote>
     * <li>For example, if the auto-renewal period is set to 2, the instance is automatically renewed for two months after the instance expires.</li></ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The parameter that identifies the source of the creation request. For public cloud, leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>serverless-name</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The disk type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: ultra cloud disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>local_hdd_pro</strong>: local HDD.</li>
     * <li><strong>local_ssd_pro</strong>: local SSD.</li>
     * <li><strong>cloud_essd_pl1</strong>: ESSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The engine type of the HBase Serverless instance. Set the value to <strong>serverlesshbase</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>serverlesshbase</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The DPI engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration of the subscription instance. Valid values:</p>
     * <ul>
     * <li>If PeriodUnit is set to year, valid values are <strong>1</strong> to <strong>3</strong>.</li>
     * <li>If PeriodUnit is set to month, valid values are <strong>1</strong> to <strong>9</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when the billing method of the instance is <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration for the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>year</strong>: year.</li>
     * <li><strong>month</strong>: month.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when the billing method of the instance is <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-j4d53glb3****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The processing capability per unit. Unit: CU.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ServerlessCapability")
    public Integer serverlessCapability;

    /**
     * <p>The specification type. Valid values: leave empty or <strong>serverless.small</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>serverless.small</p>
     */
    @NameInMap("ServerlessSpec")
    public String serverlessSpec;

    /**
     * <p>The storage size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ServerlessStorage")
    public Integer serverlessStorage;

    /**
     * <p>The vSwitch ID within the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp191ipotqj1ssyl*****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <blockquote>
     * <p>If both this parameter and the VswitchId parameter are left empty, the network type of the instance is classic network.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp120k6ixs4eog****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateServerlessClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerlessClusterRequest self = new CreateServerlessClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerlessClusterRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
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

    public CreateServerlessClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateServerlessClusterRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
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

    public CreateServerlessClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateServerlessClusterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateServerlessClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateServerlessClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServerlessClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerlessClusterRequest setServerlessCapability(Integer serverlessCapability) {
        this.serverlessCapability = serverlessCapability;
        return this;
    }
    public Integer getServerlessCapability() {
        return this.serverlessCapability;
    }

    public CreateServerlessClusterRequest setServerlessSpec(String serverlessSpec) {
        this.serverlessSpec = serverlessSpec;
        return this;
    }
    public String getServerlessSpec() {
        return this.serverlessSpec;
    }

    public CreateServerlessClusterRequest setServerlessStorage(Integer serverlessStorage) {
        this.serverlessStorage = serverlessStorage;
        return this;
    }
    public Integer getServerlessStorage() {
        return this.serverlessStorage;
    }

    public CreateServerlessClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateServerlessClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateServerlessClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
