// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterConfigureClientBalanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>amount</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableBalance")
    public Boolean enableBalance;

    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("initialBalance")
    public Double initialBalance;

    public static ModelRouterConfigureClientBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterConfigureClientBalanceRequest self = new ModelRouterConfigureClientBalanceRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterConfigureClientBalanceRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterConfigureClientBalanceRequest setEnableBalance(Boolean enableBalance) {
        this.enableBalance = enableBalance;
        return this;
    }
    public Boolean getEnableBalance() {
        return this.enableBalance;
    }

    public ModelRouterConfigureClientBalanceRequest setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
        return this;
    }
    public Double getInitialBalance() {
        return this.initialBalance;
    }

}
