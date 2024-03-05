// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetEnterpriseSupportPlanDetailRequest extends TeaModel {
    @NameInMap("freeOrderApplyCodes")
    public java.util.List<String> freeOrderApplyCodes;

    @NameInMap("orderIds")
    public java.util.List<Long> orderIds;

    public static GetEnterpriseSupportPlanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseSupportPlanDetailRequest self = new GetEnterpriseSupportPlanDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseSupportPlanDetailRequest setFreeOrderApplyCodes(java.util.List<String> freeOrderApplyCodes) {
        this.freeOrderApplyCodes = freeOrderApplyCodes;
        return this;
    }
    public java.util.List<String> getFreeOrderApplyCodes() {
        return this.freeOrderApplyCodes;
    }

    public GetEnterpriseSupportPlanDetailRequest setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

}
