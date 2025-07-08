// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateFlowLimitNewRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DailyLimit")
    public String dailyLimit;

    @NameInMap("HourLimit")
    public String hourLimit;

    @NameInMap("MinuteLimit")
    public String minuteLimit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFlowLimitNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLimitNewRequest self = new CreateFlowLimitNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowLimitNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateFlowLimitNewRequest setDailyLimit(String dailyLimit) {
        this.dailyLimit = dailyLimit;
        return this;
    }
    public String getDailyLimit() {
        return this.dailyLimit;
    }

    public CreateFlowLimitNewRequest setHourLimit(String hourLimit) {
        this.hourLimit = hourLimit;
        return this;
    }
    public String getHourLimit() {
        return this.hourLimit;
    }

    public CreateFlowLimitNewRequest setMinuteLimit(String minuteLimit) {
        this.minuteLimit = minuteLimit;
        return this;
    }
    public String getMinuteLimit() {
        return this.minuteLimit;
    }

    public CreateFlowLimitNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowLimitNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateFlowLimitNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowLimitNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
