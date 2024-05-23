// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to allocate a public IP address.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AllocatePublicIp")
    public Boolean allocatePublicIp;

    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>*   true: After you modify the bandwidth configurations, the payment is automatically complete. Make sure that you have a sufficient balance in your account before you set AutoPay to true. If your account balance is insufficient, your order cannot be paid in the ECS console and becomes invalid. You must cancel the order.</p>
     * <p>*   false: After you modify the bandwidth configurations, an order is generated but the payment is not complete. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can log on to the [ECS console](https://ecs.console.aliyun.com) to pay for the order.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end time of the temporary bandwidth upgrade. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThhZ format. The time must be in UTC and accurate to **hours** (hh).</p>
     * <br>
     * <p>> The interval between the end time and the start time of the temporary bandwidth upgrade must be greater than or equal to 3 hours.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>> This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The ID of the instance for which you want to modify bandwidth configurations.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter range from 1 to 10, and the default value is 10.</p>
     * <p>*   If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter range from 1 to the value of `InternetMaxBandwidthOut`, and the default value is the value of `InternetMaxBandwidthOut`.</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth</p>
     * <p>*   PayByTraffic</p>
     * <br>
     * <p>> When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidths instead of guaranteed values. In scenarios where demand outstrips resource supplies, these maximum bandwidths may be limited. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.</p>
     */
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

    /**
     * <p>The start time of the temporary bandwidth upgrade. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddThh:mmZ format. The time must be in UTC and accurate to **minutes** (mm).</p>
     */
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
