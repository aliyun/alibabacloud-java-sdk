// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateSubscriptionRequest extends TeaModel {
    /**
     * <p>The balance pool to which the recharge is applied. Valid values:</p>
     * <ul>
     * <li>permanent: the permanent balance pool.</li>
     * <li>monthly: the monthly balance pool.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The effective period, in UNIX timestamp (seconds). Range: from 00:00 of today to 00:00 of the first day of the next month (Asia/Shanghai).</p>
     * 
     * <strong>example:</strong>
     * <p>1719792000</p>
     */
    @NameInMap("effectiveTime")
    public Long effectiveTime;

    /**
     * <p>The idempotency key. UUID v4 format without hyphens is recommended. This prevents duplicate subscription creation.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a716446655440000</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    /**
     * <p>The subscription recharge amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("subscriptionAmount")
    public Double subscriptionAmount;

    public static ModelRouterCreateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateSubscriptionRequest self = new ModelRouterCreateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateSubscriptionRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterCreateSubscriptionRequest setEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public Long getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModelRouterCreateSubscriptionRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public ModelRouterCreateSubscriptionRequest setSubscriptionAmount(Double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
        return this;
    }
    public Double getSubscriptionAmount() {
        return this.subscriptionAmount;
    }

}
