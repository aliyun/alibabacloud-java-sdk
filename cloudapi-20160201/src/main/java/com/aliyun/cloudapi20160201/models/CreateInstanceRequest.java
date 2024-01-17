// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("AccountQuantity")
    public Long accountQuantity;

    @NameInMap("AlarmQuota")
    public Long alarmQuota;

    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("BillingType")
    public String billingType;

    @NameInMap("CloudMarketInstanceId")
    public String cloudMarketInstanceId;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    @NameInMap("InstanceAttributes")
    public String instanceAttributes;

    @NameInMap("SkuId")
    public String skuId;

    @NameInMap("Token")
    public String token;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAccountQuantity(Long accountQuantity) {
        this.accountQuantity = accountQuantity;
        return this;
    }
    public Long getAccountQuantity() {
        return this.accountQuantity;
    }

    public CreateInstanceRequest setAlarmQuota(Long alarmQuota) {
        this.alarmQuota = alarmQuota;
        return this;
    }
    public Long getAlarmQuota() {
        return this.alarmQuota;
    }

    public CreateInstanceRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateInstanceRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateInstanceRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public CreateInstanceRequest setCloudMarketInstanceId(String cloudMarketInstanceId) {
        this.cloudMarketInstanceId = cloudMarketInstanceId;
        return this;
    }
    public String getCloudMarketInstanceId() {
        return this.cloudMarketInstanceId;
    }

    public CreateInstanceRequest setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }
    public String getExpiredOn() {
        return this.expiredOn;
    }

    public CreateInstanceRequest setInstanceAttributes(String instanceAttributes) {
        this.instanceAttributes = instanceAttributes;
        return this;
    }
    public String getInstanceAttributes() {
        return this.instanceAttributes;
    }

    public CreateInstanceRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public CreateInstanceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
