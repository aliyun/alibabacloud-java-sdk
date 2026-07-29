// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p>true (default): Automatic payment is enabled.</p>
     * </li>
     * <li><p>false: An order is generated, but no payment is made.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If your account balance is insufficient, set the <code>autoPay</code> parameter to <code>false</code>. When an unpaid order is generated, log on to the Expenses and Costs console to pay for the order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p>true: Auto-renewal is enabled.</p>
     * </li>
     * <li><p>false (default): Auto-renewal is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p>PrePaid: Subscription.</p>
     * </li>
     * <li><p>PostPaid: Pay-as-you-go.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is ignored for shared instances. Shared instances use defined specifications and the default billing method is pay-as-you-go..</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The cold storage capacity of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is ignored for pay-as-you-go (PostPaid) instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p>32 vCPUs and 128 GB of memory (2 compute nodes)</p>
     * </li>
     * <li><p>64 vCPUs and 256 GB of memory (4 compute nodes)</p>
     * </li>
     * <li><p>96 vCPUs and 384 GB of memory (6 compute nodes)</p>
     * </li>
     * <li><p>128 vCPUs and 512 GB of memory (8 compute nodes)</p>
     * </li>
     * <li><p>and so on.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Specify the number of vCPUs.</p>
     * </li>
     * <li><p>To purchase an instance with more than 1,024 vCPUs, submit a ticket.</p>
     * </li>
     * <li><p>You do not need to specify the instance type for a shared instance.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The subscription duration, such as two months.</p>
     * <blockquote>
     * <p>Specify this parameter only for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>Specifies whether to enable Serverless Computing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableServerlessComputing")
    public Boolean enableServerlessComputing;

    /**
     * <p>The number of gateways. Valid values: [2, 50].</p>
     * <blockquote>
     * <p>You must specify this parameter only for virtual warehouse instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    /**
     * <p>The initial database.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot</p>
     */
    @NameInMap("initialDatabases")
    public String initialDatabases;

    /**
     * <p>The instance name. The name must be 2 to 64 characters in length. A letter is counted as one character.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_holo</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p>Standard: General-purpose instance.</p>
     * </li>
     * <li><p>Follower: Read-only secondary instance.</p>
     * </li>
     * <li><p>Warehouse: Virtual warehouse instance.</p>
     * </li>
     * <li><p>Shared: Shared instance.</p>
     * </li>
     * <li><p>Serverless: Serverless instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The ID of the primary instance. This parameter is required for secondary instances.</p>
     * <blockquote>
     * <p>The primary and secondary instances must meet the following conditions:</p>
     * <ul>
     * <li><p>The primary instance is in the Running state.</p>
     * </li>
     * <li><p>The primary and secondary instances are in the same region and zone.</p>
     * </li>
     * <li><p>They are in the same zone.</p>
     * </li>
     * <li><p>The primary instance has less than 10 secondary instances.</p>
     * </li>
     * <li><p>The primary and secondary instances belong to the same Alibaba Cloud account.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hgpostcn-cn-lbj3aworq112</p>
     */
    @NameInMap("leaderInstanceId")
    public String leaderInstanceId;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li><p>Month: The instance is billed on a monthly basis.</p>
     * </li>
     * <li><p>Hour: The instance is billed on an hourly basis.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Subscription instances support only <code>Month</code>.</p>
     * </li>
     * <li><p>Pay-as-you-go instances support only <code>Hour</code>.</p>
     * </li>
     * <li><p>For shared instances, the value is automatically set to <code>Hour</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("pricingCycle")
    public String pricingCycle;

    /**
     * <p>The region ID. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/hologres/developer-reference/api-hologram-2022-06-01-endpoint">Endpoints</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/hologres/developer-reference/api-hologram-2022-06-01-endpoint">Endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource group. If you leave this parameter empty, the default resource group for your account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The standard storage capacity of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is ignored for pay-as-you-go (PostPaid) instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("storageSize")
    public Long storageSize;

    /**
     * <p>The storage class.</p>
     * 
     * <strong>example:</strong>
     * <p>redundant</p>
     */
    @NameInMap("storageType")
    public String storageType;

    /**
     * <p>The ID of the vSwitch. The vSwitch must be in the same zone as the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2vccsiymtxxxxxx</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). The VPC must be in the same region as the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4netc3y5xxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceRequest setColdStorageSize(Long coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Long getColdStorageSize() {
        return this.coldStorageSize;
    }

    public CreateInstanceRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public CreateInstanceRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CreateInstanceRequest setEnableServerlessComputing(Boolean enableServerlessComputing) {
        this.enableServerlessComputing = enableServerlessComputing;
        return this;
    }
    public Boolean getEnableServerlessComputing() {
        return this.enableServerlessComputing;
    }

    public CreateInstanceRequest setGatewayCount(Long gatewayCount) {
        this.gatewayCount = gatewayCount;
        return this;
    }
    public Long getGatewayCount() {
        return this.gatewayCount;
    }

    public CreateInstanceRequest setInitialDatabases(String initialDatabases) {
        this.initialDatabases = initialDatabases;
        return this;
    }
    public String getInitialDatabases() {
        return this.initialDatabases;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setLeaderInstanceId(String leaderInstanceId) {
        this.leaderInstanceId = leaderInstanceId;
        return this;
    }
    public String getLeaderInstanceId() {
        return this.leaderInstanceId;
    }

    public CreateInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public CreateInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
