// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingBillSummaryPointDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("totalAmount")
    public Float totalAmount;

    public static BillingBillSummaryPointDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingBillSummaryPointDTO self = new BillingBillSummaryPointDTO();
        return TeaModel.build(map, self);
    }

    public BillingBillSummaryPointDTO setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public BillingBillSummaryPointDTO setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Float getTotalAmount() {
        return this.totalAmount;
    }

}
