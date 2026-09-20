// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EvaluateMultiZoneResourceRequest extends TeaModel {
    /**
     * <p>The vSwitch ID of the arbitration zone. The vSwitch must be in the zone specified by <strong>ArbiterZoneId</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxb****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The zone ID of the arbitration zone.</p>
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
     * <p>The auto-renewal period of the instance. Unit: months.</p>
     * <blockquote>
     * <ul><li>The default value is 0, which indicates that the instance is not automatically renewed after the instance expires.</li>
     * </blockquote>
     * <li>For example, if the auto-renewal period is set to 2, the instance is automatically renewed for two months after the instance expires.</li></ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The value cannot exceed 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>f4g8t5rd2gr94****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster name. The following rules apply:</p>
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
     * <p>The version of the engine type. Set the value to <strong>2.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The disk size of the log node. Valid values: 400 to 64000. Unit: GB. The value must be a multiple of 40.</p>
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
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskType")
    public String logDiskType;

    /**
     * <p>The node specifications of the log node. You can invoke the <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> operation to query the node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.medium</p>
     */
    @NameInMap("LogInstanceType")
    public String logInstanceType;

    /**
     * <p>The number of log nodes. Valid values: 4 to 400. The value must be a multiple of 4.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;The zone combination. The following combinations are supported. You can go to the buy page or call the <a href="https://help.aliyun.com/document_detail/203039.html">DescribeMultiZoneAvailableRegions</a> operation to view the supported zone combinations.
     * &lt;props=&quot;intl&quot;&gt;The zone combination. The following combinations are supported. You can go to the buy page to view the supported zone combinations..</p>
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
     * <p>The subscription duration of the subscription instance. Valid values:</p>
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
     * <p>The unit of the subscription duration for the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>year</strong></li>
     * <li><strong>month</strong></li>
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
     * <p>The vSwitch ID of the primary zone instance. The vSwitch must be in the zone specified by <strong>PrimaryZoneId</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxe*****</p>
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
     * <p>The IP addresses in the whitelist of the instance. Separate multiple IP addresses with commas (,).</p>
     * <blockquote>
     * <p>If the IP address is set to 127.0.0.1, all addresses are denied access to the instance. For example, 192.168.0.0/24 indicates that all IP addresses in the 192.168.0.XX range are allowed to access the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The vSwitch ID of the secondary zone instance. The vSwitch must be in the zone specified by <strong>StandbyZoneId</strong>.</p>
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
     * <p>The ID of the virtual private cloud (VPC). The VPC must be in the region specified by <strong>RegionId</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp120k6ixs4eog*****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static EvaluateMultiZoneResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateMultiZoneResourceRequest self = new EvaluateMultiZoneResourceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateMultiZoneResourceRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public EvaluateMultiZoneResourceRequest setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public EvaluateMultiZoneResourceRequest setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
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

    public EvaluateMultiZoneResourceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public EvaluateMultiZoneResourceRequest setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public EvaluateMultiZoneResourceRequest setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public EvaluateMultiZoneResourceRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public EvaluateMultiZoneResourceRequest setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
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

    public EvaluateMultiZoneResourceRequest setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public EvaluateMultiZoneResourceRequest setLogDiskType(String logDiskType) {
        this.logDiskType = logDiskType;
        return this;
    }
    public String getLogDiskType() {
        return this.logDiskType;
    }

    public EvaluateMultiZoneResourceRequest setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public EvaluateMultiZoneResourceRequest setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public EvaluateMultiZoneResourceRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public EvaluateMultiZoneResourceRequest setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public EvaluateMultiZoneResourceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public EvaluateMultiZoneResourceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public EvaluateMultiZoneResourceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public EvaluateMultiZoneResourceRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public EvaluateMultiZoneResourceRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public EvaluateMultiZoneResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EvaluateMultiZoneResourceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public EvaluateMultiZoneResourceRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public EvaluateMultiZoneResourceRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public EvaluateMultiZoneResourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
