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
     * <p>The target balance pool type. If not specified, the default value is permanent. Valid values: permanent: permanent balance pool (the balance never expires). monthly: monthly balance pool (the balance is automatically cleared at the beginning of each month).</p>
     * 
     * <strong>example:</strong>
     * <p>amount</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The idempotency key. UUID v4 format is recommended. The maximum length is 32 characters. Duplicate submissions with the same key are not executed more than once.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a716446655440000</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Recharge</p>
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
