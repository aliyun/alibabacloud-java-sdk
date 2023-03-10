// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailRequest extends TeaModel {
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
