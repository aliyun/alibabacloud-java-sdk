// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
     * <ul>
     * <li>true: Automatic payment is enabled.</li>
     * <li>false: Only an order is generated, and no payment is made.<blockquote>
     * <p>Default value: true. If your payment method has insufficient balance, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the Expenses and Costs console to complete the payment.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable monthly auto-renewal. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
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
     * <li>PrePaid: Subscription.</li>
     * <li>PostPaid: Pay-as-you-go.<blockquote>
     * <p>This parameter is ignored for Shared instances. Shared is a defined specifications type, and its billing method defaults to PostPaid.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The low-frequency storage capacity of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is ignored for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The instance specifications. Valid values:</p>
     * <ul>
     * <li>32 cores, 128 GB (Number of compute nodes: 2)</li>
     * <li>64 cores, 256 GB (Number of compute nodes: 4)</li>
     * <li>96 cores, 384 GB (Number of compute nodes: 6)</li>
     * <li>128 cores, 512 GB (Number of compute nodes: 8)</li>
     * <li>Other specifications</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Specify the number of cores.</li>
     * <li>To purchase an instance with more than 1,024 cores, submit a ticket.</li>
     * <li>You do not need to specify the specifications for a Shared instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The subscription duration. For example, set this parameter to 2 for a two-month subscription.</p>
     * <blockquote>
     * <p>This parameter is not required if the billing method is PostPaid.</p>
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
     * <p>The number of gateways. Valid values: 2 to 50.</p>
     * <blockquote>
     * <p>This parameter is required only for Warehouse instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    /**
     * <p>The initial databases.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot</p>
     */
    @NameInMap("initialDatabases")
    public String initialDatabases;

    /**
     * <p>The name of the instance. The name must be 2 to 64 characters in length. Each Chinese character or letter counts as one character.</p>
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
     * <li>Standard: General-purpose.</li>
     * <li>Follower: Read-only secondary instance.</li>
     * <li>Warehouse: Compute group.</li>
     * <li>Shared: Shared.</li>
     * <li>Severless: Serverless.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The ID of the primary instance. This parameter is required for Follower instances.</p>
     * <blockquote>
     * <p>The primary and secondary instances must meet the following conditions:</p>
     * <ul>
     * <li>The primary instance is in the Running state.</li>
     * <li>The primary and secondary instances are in the same region.</li>
     * <li>The primary and secondary instances are in the same zone.</li>
     * <li>The primary instance is associated with fewer than 10 secondary instances.</li>
     * <li>The primary and secondary instances belong to the same Alibaba Cloud account.</li>
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
     * <li>Month: Monthly billing.</li>
     * <li>Hour: Hourly billing.<blockquote>
     * <ul>
     * <li>PrePaid supports only Month.</li>
     * <li>PostPaid supports only Hour.</li>
     * <li>For Shared instances, this parameter is automatically set to Hour and does not need to be specified.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("pricingCycle")
    public String pricingCycle;

    /**
     * <p>The region ID. You can go to &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-endpoint">service registration endpoints</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/hologres/developer-reference/api-hologram-2022-06-01-endpoint">service registration endpoints</a> to view the supported regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If this parameter is left empty, the default resource group of the account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The standard storage capacity of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is ignored for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("storageSize")
    public Long storageSize;

    /**
     * <p>The storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>redundant</p>
     */
    @NameInMap("storageType")
    public String storageType;

    /**
     * <p>The ID of the vSwitch. The zone ID of the vSwitch must be the same as that of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2vccsiymtxxxxxx</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). The region ID of the VPC must be the same as that of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4netc3y5xxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The zone ID. Refer to the usage notes.</p>
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
