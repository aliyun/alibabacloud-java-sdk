// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelStaticInfoShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("hotel_ids")
    public String hotelIdsShrink;

    public static HotelStaticInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelStaticInfoShrinkRequest self = new HotelStaticInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelStaticInfoShrinkRequest setHotelIdsShrink(String hotelIdsShrink) {
        this.hotelIdsShrink = hotelIdsShrink;
        return this;
    }
    public String getHotelIdsShrink() {
        return this.hotelIdsShrink;
    }

}
