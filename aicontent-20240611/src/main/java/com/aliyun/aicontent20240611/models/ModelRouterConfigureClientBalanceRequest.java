// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterConfigureClientBalanceRequest extends TeaModel {
    /**
     * <p>The balance type. Valid values: <code>amount</code> or <code>tokens</code>. This parameter is required when you first enable balance throttling and cannot be changed afterward.</p>
     * 
     * <strong>example:</strong>
     * <p>amount</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>Specifies whether to enable balance throttling. Once enabled, this feature cannot be disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableBalance")
    public Boolean enableBalance;

    /**
     * <p>The initial balance. This parameter is only applicable when you first enable balance throttling.</p>
     * 
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
