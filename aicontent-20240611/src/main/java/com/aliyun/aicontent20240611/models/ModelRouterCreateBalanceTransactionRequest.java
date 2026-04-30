// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBalanceTransactionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <strong>example:</strong>
     * <p>充值</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
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
