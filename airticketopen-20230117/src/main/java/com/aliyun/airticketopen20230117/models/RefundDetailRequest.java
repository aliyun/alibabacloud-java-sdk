// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailRequest extends TeaModel {
    /**
     * <p>refund order number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4966***617732</p>
     */
    @NameInMap("refund_order_num")
    public Long refundOrderNum;

    public static RefundDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundDetailRequest self = new RefundDetailRequest();
        return TeaModel.build(map, self);
    }

    public RefundDetailRequest setRefundOrderNum(Long refundOrderNum) {
        this.refundOrderNum = refundOrderNum;
        return this;
    }
    public Long getRefundOrderNum() {
        return this.refundOrderNum;
    }

}
