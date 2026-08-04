// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterTransferToMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("monthlyQuota")
    public Double monthlyQuota;

    /**
     * <strong>example:</strong>
     * <p>转账</p>
     */
    @NameInMap("remark")
    public String remark;

    public static ModelRouterTransferToMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterTransferToMemberRequest self = new ModelRouterTransferToMemberRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterTransferToMemberRequest setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public ModelRouterTransferToMemberRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterTransferToMemberRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public ModelRouterTransferToMemberRequest setMonthlyQuota(Double monthlyQuota) {
        this.monthlyQuota = monthlyQuota;
        return this;
    }
    public Double getMonthlyQuota() {
        return this.monthlyQuota;
    }

    public ModelRouterTransferToMemberRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
