// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingBillSummaryRespDTO extends TeaModel {
    @NameInMap("points")
    public java.util.List<BillingBillSummaryPointDTO> points;

    /**
     * <strong>example:</strong>
     * <p>123.45</p>
     */
    @NameInMap("totalAmount")
    public Float totalAmount;

    public static BillingBillSummaryRespDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingBillSummaryRespDTO self = new BillingBillSummaryRespDTO();
        return TeaModel.build(map, self);
    }

    public BillingBillSummaryRespDTO setPoints(java.util.List<BillingBillSummaryPointDTO> points) {
        this.points = points;
        return this;
    }
    public java.util.List<BillingBillSummaryPointDTO> getPoints() {
        return this.points;
    }

    public BillingBillSummaryRespDTO setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Float getTotalAmount() {
        return this.totalAmount;
    }

}
