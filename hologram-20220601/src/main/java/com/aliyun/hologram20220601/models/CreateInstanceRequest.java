// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment. Default value: true. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>> The default value is true. If the balance of your account is insufficient, you can set this parameter to false. In this case, an unpaid order is generated. You can log on to the User Center to pay for the order.</p>
     */
    @NameInMap("autoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable monthly auto-renewal. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <br>
     * <p>> This parameter is invalid for shared instances. Shared instances have fixed specifications and are pay-as-you-go instances.</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The infrequent access (IA) storage space of the instance. Unit: GB.</p>
     * <br>
     * <p>> This parameter is invalid for pay-as-you-go instances.</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The instance specifications. Valid values:</p>
     * <br>
     * <p>*   8-core 32 GB (number of compute nodes: 1)</p>
     * <p>*   16-core 64 GB (number of compute nodes: 1)</p>
     * <p>*   32-core 128 GB (number of compute nodes: 2)</p>
     * <p>*   64-core 256 GB (number of compute nodes: 4)</p>
     * <p>*   96-core 384 GB (number of compute nodes: 6)</p>
     * <p>*   128-core 512 GB (number of compute nodes: 8)</p>
     * <p>*   Others</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Set this parameter to the number of cores.</p>
     * <br>
     * <p>*   If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.</p>
     * <br>
     * <p>*   If you want to purchase a shared instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>*   The specifications of 8-core 32 GB (number of compute nodes: 1) are for trial use only and cannot be used for production.</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The validity period of the instance that you want to purchase. For example, you can specify a validity period of two months.</p>
     * <br>
     * <p>> You do not need to configure this parameter for pay-as-you-go instances.</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>The number of gateways. Valid values: 2 to 50.</p>
     * <br>
     * <p>> This parameter is required only for virtual warehouse instances.</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    @NameInMap("initialDatabases")
    public String initialDatabases;

    /**
     * <p>The name of the Hologres instance that you want to purchase. The name must be 2 to 64 characters in length.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The type of the instance. Valid values:</p>
     * <br>
     * <p>*   Standard: general-purpose instance</p>
     * <p>*   Follower: read-only secondary instance</p>
     * <p>*   Warehouse: virtual warehouse instance</p>
     * <p>*   Shared: shared instance</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The ID of the primary instance. This parameter is required for read-only secondary instances.</p>
     * <br>
     * <p>> The primary instance and secondary instances must meet the following requirements:</p>
     * <br>
     * <p>*   The primary instance is in the Running state.</p>
     * <br>
     * <p>*   The primary instance and secondary instances are deployed in the same region.</p>
     * <br>
     * <p>*   The primary instance and secondary instances are deployed in the same zone.</p>
     * <br>
     * <p>*   Less than 10 secondary instances are associated with the primary instance.</p>
     * <br>
     * <p>*   The primary and secondary instances belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("leaderInstanceId")
    public String leaderInstanceId;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Hour</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter can only be set to Month for subscription instances.</p>
     * <br>
     * <p>*   This parameter can only be set to Hour for pay-as-you-go instances.</p>
     * <br>
     * <p>*   By default, this parameter is set to Hour for shared instances.</p>
     */
    @NameInMap("pricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the region. You can go to the [OpenAPI Explorer](https://api.aliyun.com/product/Hologram) or the Usage notes section to view the ID of the region.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource group. If you do not specify this parameter, the default resource group of the account is used.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The standard storage space of the instance. Unit: GB.</p>
     * <br>
     * <p>> This parameter is invalid for pay-as-you-go instances.</p>
     */
    @NameInMap("storageSize")
    public Long storageSize;

    /**
     * <p>The ID of the vSwitch. The zone in which the vSwitch resides must be the same as the zone in which the instance resides.</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). The region in which the VPC resides must be the same as the region in which the Hologres instance resides.</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone. For more information about how to obtain the ID of the zone, see the Usage notes section.</p>
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
