// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to assign a public IP address. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllocatePublicIp")
    public Boolean allocatePublicIp;

    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <ul>
     * <li>true: After you modify the bandwidth configurations, the payment is automatically completed. Make sure that your account balance is sufficient before you set AutoPay to true. If your account balance is insufficient, your order cannot be paid in the ECS console and becomes invalid. You must cancel the order.</li>
     * <li>false: After you modify the bandwidth configurations, an order is generated but the payment is not automatically completed. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can log on to the <a href="https://ecs.console.aliyun.com">ECS console</a> to pay for the order.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. <strong>The token can contain only ASCII characters and cannot exceed 64 characters in length.</strong> For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end time of the temporary bandwidth upgrade. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThhZ format. The time must be in UTC and accurate to <strong>hours</strong> (hh).</p>
     * <blockquote>
     * <p> The interval between the end time and start time of temporary bandwidth upgrade must be greater than or equal to 3 hours.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-12-06T22Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The ID of the instance for which you want to modify network configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum inbound bandwidth from the Internet. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the <code>InternetMaxBandwidthOut</code> value and the default value is the <code>InternetMaxBandwidthOut</code> value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li><p>Valid values when the pay-by-traffic billing method for network usage is used: 0 to 100.</p>
     * </li>
     * <li><p>Valid values when the pay-by-bandwidth billing method for network usage is used:</p>
     * <ul>
     * <li>Valid values for subscription instances: 0 to 200.</li>
     * <li>Valid values for pay-as-you-go instances: 0 to 100.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> The maximum outbound bandwidth of a single instance is also limited by the <strong>network baseline bandwidth (Gbit/s) and network burst bandwidth (Gbit/s)</strong> of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth</li>
     * <li>PayByTraffic</li>
     * </ul>
     * <blockquote>
     * <p>When the <strong>pay-by-traffic</strong> billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidths instead of guaranteed values. In scenarios where demand outstrips resource supplies, these maximum bandwidths may be limited. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
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
     * <p>The start time of the temporary bandwidth upgrade. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThh:mmZ format. The time must be in UTC and accurate to <strong>minutes (mm)</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-05T22:40Z</p>
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
