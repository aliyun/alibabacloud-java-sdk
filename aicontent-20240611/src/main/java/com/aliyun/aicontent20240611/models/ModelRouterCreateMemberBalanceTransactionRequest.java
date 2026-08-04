// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateMemberBalanceTransactionRequest extends TeaModel {
    /**
     * <p>The transaction amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <p>The balance type. Valid values:</p>
     * <ul>
     * <li>permanent</li>
     * <li>monthly</li>
     * </ul>
     * <p>Default value: permanent.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The idempotency key. UUID v4 format is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    /**
     * <p>The remark for the transaction.</p>
     * 
     * <strong>example:</strong>
     * <p>Recharge</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The transaction type. Valid values: recharge, deduct, and transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelRouterCreateMemberBalanceTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateMemberBalanceTransactionRequest self = new ModelRouterCreateMemberBalanceTransactionRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateMemberBalanceTransactionRequest setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public ModelRouterCreateMemberBalanceTransactionRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterCreateMemberBalanceTransactionRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public ModelRouterCreateMemberBalanceTransactionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModelRouterCreateMemberBalanceTransactionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
