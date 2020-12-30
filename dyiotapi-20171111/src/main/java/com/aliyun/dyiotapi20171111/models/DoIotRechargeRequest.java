// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotRechargeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OfferIds")
    public String offerIds;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("Amount")
    public Long amount;

    @NameInMap("EffCode")
    public String effCode;

    @NameInMap("OrderNum")
    public Integer orderNum;

    public static DoIotRechargeRequest build(java.util.Map<String, ?> map) throws Exception {
        DoIotRechargeRequest self = new DoIotRechargeRequest();
        return TeaModel.build(map, self);
    }

    public DoIotRechargeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DoIotRechargeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DoIotRechargeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DoIotRechargeRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public DoIotRechargeRequest setOfferIds(String offerIds) {
        this.offerIds = offerIds;
        return this;
    }
    public String getOfferIds() {
        return this.offerIds;
    }

    public DoIotRechargeRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public DoIotRechargeRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public DoIotRechargeRequest setEffCode(String effCode) {
        this.effCode = effCode;
        return this;
    }
    public String getEffCode() {
        return this.effCode;
    }

    public DoIotRechargeRequest setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Integer getOrderNum() {
        return this.orderNum;
    }

}
