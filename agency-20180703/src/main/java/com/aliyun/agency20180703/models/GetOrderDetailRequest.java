// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetOrderDetailRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("OrderNo")
    public Long orderNo;

    public static GetOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailRequest self = new GetOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetOrderDetailRequest setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public Long getOrderNo() {
        return this.orderNo;
    }

}
