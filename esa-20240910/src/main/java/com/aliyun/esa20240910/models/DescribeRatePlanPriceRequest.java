// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanPriceRequest extends TeaModel {
    /**
     * <p>The number of plans.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The purchase duration, in months.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("PlanName")
    public String planName;

    public static DescribeRatePlanPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanPriceRequest self = new DescribeRatePlanPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanPriceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribeRatePlanPriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeRatePlanPriceRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

}
