// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnOrderCommodityCodeResponseBody extends TeaModel {
    /**
     * <p>The commodity code that includes the organization unit.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OrderCommodityCode")
    public String orderCommodityCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BFFCDFAD-DACC-484E-9BE6-0AF3B3A0DD23</p>
     */
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
