// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterStopMemberSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>monthly</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    public static ModelRouterStopMemberSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterStopMemberSubscriptionRequest self = new ModelRouterStopMemberSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterStopMemberSubscriptionRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

}
