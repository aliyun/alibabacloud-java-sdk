// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateMultiZoneClusterRequest extends TeaModel {
    /**
     * <p>The vSwitch ID of the arbiter zone. The vSwitch must be in the zone specified by ArbiterZoneId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxb*****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The zone ID of the arbiter zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The version of the deployment architecture. Currently, only the hbaseue engine type is supported. Set the value to <strong>2.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The Unified Auto Renewal Cycle. Unit: months.</p>
     * <blockquote>
     * <ul><li>Default value: 0, which indicates that auto-renewal is disabled.</li>
     * </blockquote>
     * <li>If AutoRenewPeriod is set to 2, the instance is automatically renewed for two epochs upon expiration.</li></ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>dfh3sf5gslfksfk****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the instance. The following rules apply:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name must start with an uppercase letter, a lowercase letter, or a Chinese character.</li>
     * <li>The name can contain digits or special characters, including periods (.), hyphens (-), and underscores (_).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hbaseue_test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The disk size of the node. Valid values: 400 to 64000. Unit: GB. The value must be a multiple of 40.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    /**
     * <p>The disk type of the core node. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: ultra cloud disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>local_hdd_pro</strong>: throughput-intensive local disk.</li>
     * <li><strong>local_ssd_pro</strong>: I/O-intensive local disk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("CoreDiskType")
    public String coreDiskType;

    /**
     * <p>The node specifications of the core node. You can invoke the <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> operation to query the node specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <p>The number of core nodes. Valid values: 2 to 20. The value must be an even number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    /**
     * <p>The service type. Currently, only ApsaraDB for HBase Performance-enhanced Edition is supported. Set the value to <strong>hbaseue</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version number of the engine type. Set the value to <strong>2.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The disk size of the log node. Valid values: 400 to 64000. Unit: GB. The value must be a multiple of 40.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    /**
     * <p>The disk type of the log node. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: ultra cloud disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>local_hdd_pro</strong>: throughput-intensive local disk.</li>
     * <li><strong>local_ssd_pro</strong>: I/O-intensive local disk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskType")
    public String logDiskType;

    /**
     * <p>The node specifications of the log node. You can invoke the <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> operation to query the node specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("LogInstanceType")
    public String logInstanceType;

    /**
     * <p>The number of log nodes. Valid values: 4 to 400. The value must be a multiple of 4.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    /**
     * <p>The node specifications of the master node. You can invoke the <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> operation to query the node specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The zone combination. You can go to the buy page or call the <a href="https://help.aliyun.com/document_detail/203039.html">DescribeMultiZoneAvailableRegions</a> operation to view the supported zone combinations.
     * &lt;props=&quot;intl&quot;&gt;The zone combination. You can go to the buy page to view the supported zone combinations..</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-bef-aliyun-com</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription period of the subscription instance. Valid values:</p>
     * <ul>
     * <li>If PeriodUnit is set to year, valid values are 1 to 3.</li>
     * <li>If PeriodUnit is set to month, valid values are 1 to 9.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period for the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>year</strong>: year.</li>
     * <li><strong>month</strong>: month.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The vSwitch ID of the primary zone instance. The vSwitch must be in the zone specified by PrimaryZoneId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxe****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The zone ID of the primary zone instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can query the resource group ID in the resource group console. If you do not specify this parameter, the instance is added to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-gg3f4f5d5g5w****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP addresses in the whitelist of the instance. Separate multiple IP addresses with commas (,).</p>
     * <blockquote>
     * <p>If the IP address is set to 127.0.0.1, no IP addresses are allowed to access the instance. For example, 192.168.0.0/24 indicates that all IP addresses in the 192.168.0.XX range are allowed to access the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The vSwitch ID of the secondary zone instance. The vSwitch must be in the zone specified by StandbyZoneId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxf****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The zone ID of the secondary zone instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The ID of the virtual private cloud (VPC). The VPC must be in the region specified by RegionId.</p>
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
