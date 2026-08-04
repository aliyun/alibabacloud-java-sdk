// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateMemberSubscriptionRequest extends TeaModel {
    /**
     * <p>The subscription amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <p>The balance type. Valid values:</p>
     * <ul>
     * <li>permanent: permanent balance.</li>
     * <li>monthly: monthly balance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>monthly</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The effective period in UNIX timestamp (seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1753858800</p>
     */
    @NameInMap("effectiveTime")
    public Long effectiveTime;

    /**
     * <p>The idempotency key. UUID v4 format is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    public static ModelRouterCreateMemberSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateMemberSubscriptionRequest self = new ModelRouterCreateMemberSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateMemberSubscriptionRequest setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public ModelRouterCreateMemberSubscriptionRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterCreateMemberSubscriptionRequest setEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public Long getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModelRouterCreateMemberSubscriptionRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

}
