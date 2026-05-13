// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingBillTierDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;context_tier&quot;: &quot;0-32k&quot;}</p>
     */
    @NameInMap("dimValues")
    public String dimValues;

    /**
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("payableAmount")
    public Float payableAmount;

    /**
     * <strong>example:</strong>
     * <p>{&quot;input_tokens&quot;: 1000, &quot;output_tokens&quot;: 500}</p>
     */
    @NameInMap("values")
    public String values;

    public static BillingBillTierDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingBillTierDTO self = new BillingBillTierDTO();
        return TeaModel.build(map, self);
    }

    public BillingBillTierDTO setDimValues(String dimValues) {
        this.dimValues = dimValues;
        return this;
    }
    public String getDimValues() {
        return this.dimValues;
    }

    public BillingBillTierDTO setPayableAmount(Float payableAmount) {
        this.payableAmount = payableAmount;
        return this;
    }
    public Float getPayableAmount() {
        return this.payableAmount;
    }

    public BillingBillTierDTO setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
