// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBalanceTransactionRequest extends TeaModel {
    /**
     * <p>The transaction amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <p>The target balance pool type. Default value: permanent. Valid values:</p>
     * <ul>
     * <li>permanent: permanent balance pool (the amount never expires).</li>
     * <li>monthly: monthly balance pool (automatically reset to zero at the beginning of each month).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>amount</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The idempotency key. UUID v4 format is recommended. Maximum length: 32 characters. Repeated submissions with the same key are not executed again.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a716446655440000</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    /**
     * <p>The remark.</p>
     * 
     * <strong>example:</strong>
     * <p>Top-up.</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The transaction type.</p>
     * 
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelRouterCreateBalanceTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateBalanceTransactionRequest self = new ModelRouterCreateBalanceTransactionRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateBalanceTransactionRequest setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public ModelRouterCreateBalanceTransactionRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterCreateBalanceTransactionRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public ModelRouterCreateBalanceTransactionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModelRouterCreateBalanceTransactionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
