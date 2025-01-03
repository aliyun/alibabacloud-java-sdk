// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentsRequest extends TeaModel {
    /**
     * <p>Order</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Order")
    public Integer order;

    /**
     * <p>Plan ID</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("PlanId")
    public Long planId;

    public static ListExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsRequest self = new ListExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentsRequest setOrder(Integer order) {
        this.order = order;
        return this;
    }
    public Integer getOrder() {
        return this.order;
    }

    public ListExperimentsRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

}
