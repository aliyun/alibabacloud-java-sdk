// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CollectFlightLowestPriceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("lowestPriceFlightList")
    public String lowestPriceFlightListShrink;

    public static CollectFlightLowestPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CollectFlightLowestPriceShrinkRequest self = new CollectFlightLowestPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CollectFlightLowestPriceShrinkRequest setLowestPriceFlightListShrink(String lowestPriceFlightListShrink) {
        this.lowestPriceFlightListShrink = lowestPriceFlightListShrink;
        return this;
    }
    public String getLowestPriceFlightListShrink() {
        return this.lowestPriceFlightListShrink;
    }

}
