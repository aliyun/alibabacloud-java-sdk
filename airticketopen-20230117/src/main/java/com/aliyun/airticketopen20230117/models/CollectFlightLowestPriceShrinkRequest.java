// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CollectFlightLowestPriceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("lowest_price_flight_info_list")
    public String lowestPriceFlightInfoListShrink;

    public static CollectFlightLowestPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CollectFlightLowestPriceShrinkRequest self = new CollectFlightLowestPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CollectFlightLowestPriceShrinkRequest setLowestPriceFlightInfoListShrink(String lowestPriceFlightInfoListShrink) {
        this.lowestPriceFlightInfoListShrink = lowestPriceFlightInfoListShrink;
        return this;
    }
    public String getLowestPriceFlightInfoListShrink() {
        return this.lowestPriceFlightInfoListShrink;
    }

}
