// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryRenewPriceRequest extends TeaModel {
    @NameInMap("Duration")
    public String duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static QueryRenewPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceRequest self = new QueryRenewPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public QueryRenewPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRenewPriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
