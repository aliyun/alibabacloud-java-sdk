// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterStopSubscriptionRequest extends TeaModel {
    /**
     * <p>The type of subscription balance to stop (permanent/monthly).</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    public static ModelRouterStopSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterStopSubscriptionRequest self = new ModelRouterStopSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterStopSubscriptionRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

}
