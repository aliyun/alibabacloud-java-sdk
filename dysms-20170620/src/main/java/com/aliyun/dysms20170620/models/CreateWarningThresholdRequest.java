// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateWarningThresholdRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DailyHaltLimit")
    public Integer dailyHaltLimit;

    @NameInMap("DailyWarningLimit")
    public Integer dailyWarningLimit;

    @NameInMap("MonthlyHaltLimit")
    public Integer monthlyHaltLimit;

    @NameInMap("MonthlyWarningLimit")
    public Integer monthlyWarningLimit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateWarningThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningThresholdRequest self = new CreateWarningThresholdRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarningThresholdRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateWarningThresholdRequest setDailyHaltLimit(Integer dailyHaltLimit) {
        this.dailyHaltLimit = dailyHaltLimit;
        return this;
    }
    public Integer getDailyHaltLimit() {
        return this.dailyHaltLimit;
    }

    public CreateWarningThresholdRequest setDailyWarningLimit(Integer dailyWarningLimit) {
        this.dailyWarningLimit = dailyWarningLimit;
        return this;
    }
    public Integer getDailyWarningLimit() {
        return this.dailyWarningLimit;
    }

    public CreateWarningThresholdRequest setMonthlyHaltLimit(Integer monthlyHaltLimit) {
        this.monthlyHaltLimit = monthlyHaltLimit;
        return this;
    }
    public Integer getMonthlyHaltLimit() {
        return this.monthlyHaltLimit;
    }

    public CreateWarningThresholdRequest setMonthlyWarningLimit(Integer monthlyWarningLimit) {
        this.monthlyWarningLimit = monthlyWarningLimit;
        return this;
    }
    public Integer getMonthlyWarningLimit() {
        return this.monthlyWarningLimit;
    }

    public CreateWarningThresholdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateWarningThresholdRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateWarningThresholdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateWarningThresholdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
