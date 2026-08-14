// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterConfigureMemberBalanceRequest extends TeaModel {
    /**
     * <p>The balance type. Valid values:</p>
     * <ul>
     * <li>amount: monetary amount.</li>
     * <li>tokens: token count.</li>
     * </ul>
     * <p>This parameter is required when balance throttling is enabled for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>amount</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>Specifies whether to enable balance throttling. Once enabled, it cannot be disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableBalance")
    public Boolean enableBalance;

    /**
     * <p>The initial balance. This parameter takes effect only when balance throttling is enabled for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("initialBalance")
    public Double initialBalance;

    public static ModelRouterConfigureMemberBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterConfigureMemberBalanceRequest self = new ModelRouterConfigureMemberBalanceRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterConfigureMemberBalanceRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterConfigureMemberBalanceRequest setEnableBalance(Boolean enableBalance) {
        this.enableBalance = enableBalance;
        return this;
    }
    public Boolean getEnableBalance() {
        return this.enableBalance;
    }

    public ModelRouterConfigureMemberBalanceRequest setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
        return this;
    }
    public Double getInitialBalance() {
        return this.initialBalance;
    }

}
