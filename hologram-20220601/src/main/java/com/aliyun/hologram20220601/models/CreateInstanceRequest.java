// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment. Default value: true. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> The default value is true. If the balance of your account is insufficient, you can set this parameter to false. In this case, an unpaid order is generated. You can log on to the Expenses and Costs console to pay for the order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable monthly auto-renewal. The default value is false. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is invalid for Hologres Shared Cluster instances. Hologres Shared Cluster instances have fixed specifications and are pay-as-you-go instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The infrequent access (IA) storage space of the instance. Unit: GB.</p>
     * <blockquote>
     * <p> This parameter is invalid for pay-as-you-go instances.</p>
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
     * <li>8-core 32GB (number of compute nodes: 1)</li>
     * <li>32-core 128GB (number of compute nodes: 2)</li>
     * <li>64-core 256GB (number of compute nodes: 4)</li>
     * <li>96-core 384GB (number of compute nodes: 6)</li>
     * <li>128-core 512GB (number of compute nodes: 8)</li>
     * <li>Others</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Set this parameter to the number of cores.</p>
     * </li>
     * <li><p>If you want to set this parameter to specifications with more than 1,024 GB, you must submit a ticket.</p>
     * </li>
     * <li><p>This parameter is invalid for Hologres Shared Cluster instances.</p>
     * </li>
     * <li><p>The specifications of 8-core 32GB (number of compute nodes: 1) are for trial use only and cannot be used for production.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The validity period of the instance that you want to purchase. For example, you can specify a validity period of two months.</p>
     * <blockquote>
     * <p> You do not need to configure this parameter for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>Specifies whether to enable the Serverless Computing feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableServerlessComputing")
    public Boolean enableServerlessComputing;

    /**
     * <p>The number of gateways. Valid values: 2 to 50.</p>
     * <blockquote>
     * <p> This parameter is required only for virtual warehouse instances.</p>
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
     * <p>The name of the instance. The name must be 2 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_holo</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The category of the instance. Valid values:</p>
     * <ul>
     * <li>Standard: general-purpose instance</li>
     * <li>Follower: read-only secondary instance</li>
     * <li>Warehouse: virtual warehouse instance</li>
     * <li>Shared: Hologres Shared Cluster instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The ID of the primary instance. This parameter is required for read-only secondary instances.</p>
     * <blockquote>
     * <p> The primary and secondary instances must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li><p>The primary instance is in the Running state.</p>
     * </li>
     * <li><p>The primary instance and secondary instances are deployed in the same region.</p>
     * </li>
     * <li><p>The primary instance and secondary instances are deployed in the same zone.</p>
     * </li>
     * <li><p>Less than 10 secondary instances are associated with the primary instance.</p>
     * </li>
     * <li><p>The primary instance and secondary instances belong to the same Alibaba Cloud account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hgpostcn-cn-lbj3aworq112</p>
     */
    @NameInMap("leaderInstanceId")
    public String leaderInstanceId;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Hour</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter can only be set to Month for subscription instances.</p>
     * </li>
     * <li><p>This parameter can only be set to Hour for pay-as-you-go instances.</p>
     * </li>
     * <li><p>By default, this parameter is set to Hour for Hologres Shared Cluster instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("pricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the region. You can obtain region IDs in <a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/endpoints">Endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, the default resource group of the account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The standard storage space of the instance. Unit: GB.</p>
     * <blockquote>
     * <p> This parameter is invalid for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("storageSize")
    public Long storageSize;

    /**
     * <p>The ID of the vSwitch. The zone in which the vSwitch resides must be the same as the zone in which the Hologres instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2vccsiymtxxxxxx</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). The region in which the VPC resides must be the same as the region in which the Hologres instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4netc3y5xxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone. For more information, see the &quot;Operation description&quot; section in this topic.</p>
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
