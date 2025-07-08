// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateFlowLimitRequest extends TeaModel {
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

    public static CreateFlowLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLimitRequest self = new CreateFlowLimitRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowLimitRequest setDailyLimit(String dailyLimit) {
        this.dailyLimit = dailyLimit;
        return this;
    }
    public String getDailyLimit() {
        return this.dailyLimit;
    }

    public CreateFlowLimitRequest setHourLimit(String hourLimit) {
        this.hourLimit = hourLimit;
        return this;
    }
    public String getHourLimit() {
        return this.hourLimit;
    }

    public CreateFlowLimitRequest setMinuteLimit(String minuteLimit) {
        this.minuteLimit = minuteLimit;
        return this;
    }
    public String getMinuteLimit() {
        return this.minuteLimit;
    }

    public CreateFlowLimitRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowLimitRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateFlowLimitRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowLimitRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
