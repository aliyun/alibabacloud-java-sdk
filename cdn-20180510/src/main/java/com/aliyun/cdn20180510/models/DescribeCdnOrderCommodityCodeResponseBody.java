// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnOrderCommodityCodeResponseBody extends TeaModel {
    @NameInMap("OrderCommodityCode")
    public String orderCommodityCode;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnOrderCommodityCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnOrderCommodityCodeResponseBody self = new DescribeCdnOrderCommodityCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnOrderCommodityCodeResponseBody setOrderCommodityCode(String orderCommodityCode) {
        this.orderCommodityCode = orderCommodityCode;
        return this;
    }
    public String getOrderCommodityCode() {
        return this.orderCommodityCode;
    }

    public DescribeCdnOrderCommodityCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
