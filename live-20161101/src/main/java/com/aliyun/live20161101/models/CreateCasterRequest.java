// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCasterRequest extends TeaModel {
    @NameInMap("CasterName")
    public String casterName;

    @NameInMap("CasterTemplate")
    public String casterTemplate;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("NormType")
    public Integer normType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PurchaseTime")
    public String purchaseTime;

    public static CreateCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasterRequest self = new CreateCasterRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasterRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public CreateCasterRequest setCasterTemplate(String casterTemplate) {
        this.casterTemplate = casterTemplate;
        return this;
    }
    public String getCasterTemplate() {
        return this.casterTemplate;
    }

    public CreateCasterRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCasterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCasterRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateCasterRequest setNormType(Integer normType) {
        this.normType = normType;
        return this;
    }
    public Integer getNormType() {
        return this.normType;
    }

    public CreateCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCasterRequest setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
        return this;
    }
    public String getPurchaseTime() {
        return this.purchaseTime;
    }

}
