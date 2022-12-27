// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecRequest extends TeaModel {
    // Specifies whether to assign a public IP address.
    // 
    // Default value: false.
    @NameInMap("AllocatePublicIp")
    public Boolean allocatePublicIp;

    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. After bandwidth configurations are upgraded, the payment is automatically made. Make sure that you have sufficient balance in your account when you set AutoPay to true. If your account balance is insufficient, your order cannot be paid in the ECS console and becomes invalid. You must cancel the order.
    // *   false: does not enable automatic payment. After bandwidth configurations are upgraded, an order is generated but is not paid. If your account balance is insufficient, you can set AutoPay to false. In this case, when you call the ModifyInstanceNetworkSpec operation, an unpaid order is generated. You can then log on to the [ECS console](https://ecs.console.aliyun.com) to pay for the order.
    // 
    // Default value: true.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but make sure that it is unique among different requests. The **ClientToken** value can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The end time of the temporary bandwidth upgrade. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThhZ format. The time must be in UTC and accurate to **hours** (hh).
    // 
    // >  The interval between the end time and the start time of the temporary bandwidth upgrade must be greater than or equal to 3 hours.
    @NameInMap("EndTime")
    public String endTime;

    // >  This parameter is currently in invitational preview and unavailable for general users.
    @NameInMap("ISP")
    public String ISP;

    // The ID of the instance for which you want to modify bandwidth configurations.
    @NameInMap("InstanceId")
    public String instanceId;

    // The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
    // 
    // *   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to 10, and the default value is 10.
    // *   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to the `InternetMaxBandwidthOut` value, and the default value is the `InternetMaxBandwidthOut` value.
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    // The billing method for network usage. Valid values:
    // 
    // *   PayByBandwidth: pay-by-bandwidth
    // *   PayByTraffic: pay-by-traffic
    // 
    // >  When the **pay-by-traffic** billing method is used, the maximum inbound and outbound bandwidths are both the upper limits of bandwidths instead of guaranteed performance. When demands exceed resource supplies, these maximum bandwidths may be limited. If you want guaranteed bandwidths for your instances, use the **pay-by-bandwidth** billing method.
    @NameInMap("NetworkChargeType")
    public String networkChargeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The start time of the temporary bandwidth upgrade. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThh:mmZ format. The time must be in UTC and accurate to the **minute** (mm).
    @NameInMap("StartTime")
    public String startTime;

    public static ModifyInstanceNetworkSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecRequest self = new ModifyInstanceNetworkSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkSpecRequest setAllocatePublicIp(Boolean allocatePublicIp) {
        this.allocatePublicIp = allocatePublicIp;
        return this;
    }
    public Boolean getAllocatePublicIp() {
        return this.allocatePublicIp;
    }

    public ModifyInstanceNetworkSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceNetworkSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceNetworkSpecRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyInstanceNetworkSpecRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public ModifyInstanceNetworkSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNetworkSpecRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public ModifyInstanceNetworkSpecRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyInstanceNetworkSpecRequest setNetworkChargeType(String networkChargeType) {
        this.networkChargeType = networkChargeType;
        return this;
    }
    public String getNetworkChargeType() {
        return this.networkChargeType;
    }

    public ModifyInstanceNetworkSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceNetworkSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceNetworkSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceNetworkSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceNetworkSpecRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
