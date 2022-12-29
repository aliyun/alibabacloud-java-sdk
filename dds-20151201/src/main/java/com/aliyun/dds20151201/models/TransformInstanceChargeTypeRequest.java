// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransformInstanceChargeTypeRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   **true**: enables automatic payment.
    // *   **false**: disables automatic payment. For more information, see [Renew an ApsaraDB for MongoDB subscription instance](~~85052~~).
    // 
    // >  Default value: **true**.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // Specifies whether to enable auto-renewal for the instance. Valid values:
    // 
    // *   **true**
    // *   **false**
    // 
    // >  Default value: **false**.
    @NameInMap("AutoRenew")
    public String autoRenew;

    // The business information. This is an additional parameter.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The billing method of the instance. Valid values:
    // 
    // *   **PostPaid: pay-as-you-go.**
    // *   **PrePaid**: subscription
    // 
    // >  If you specify this parameter to **PrePaid**, you must also specify the **Period** parameter.
    @NameInMap("ChargeType")
    public String chargeType;

    // The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.
    @NameInMap("CouponNo")
    public String couponNo;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The subscription period of the instance. Unit: months.
    // 
    // Valid values: **1** to **9**, **12**, **24**, **36**, and **60**.
    // 
    // >  If you set the ChargeType property to PrePaid, you must configure this property.
    @NameInMap("Period")
    public Long period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static TransformInstanceChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformInstanceChargeTypeRequest self = new TransformInstanceChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public TransformInstanceChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public TransformInstanceChargeTypeRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public TransformInstanceChargeTypeRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public TransformInstanceChargeTypeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public TransformInstanceChargeTypeRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public TransformInstanceChargeTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransformInstanceChargeTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TransformInstanceChargeTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TransformInstanceChargeTypeRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public TransformInstanceChargeTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TransformInstanceChargeTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TransformInstanceChargeTypeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
