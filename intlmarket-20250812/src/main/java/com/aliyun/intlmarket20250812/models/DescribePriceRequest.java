// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intlmarket20250812.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;duration\&quot;: 1, \&quot;productCode\&quot;: \&quot;cmjz000325\&quot;, \&quot;quantity\&quot;: 1, \&quot;pricingCycle\&quot;: \&quot;Year\&quot;, \&quot;skuCode\&quot;: \&quot;jichuban\&quot;}</p>
     */
    @NameInMap("Commodity")
    public String commodity;

    /**
     * <strong>example:</strong>
     * <p>DOWNGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
