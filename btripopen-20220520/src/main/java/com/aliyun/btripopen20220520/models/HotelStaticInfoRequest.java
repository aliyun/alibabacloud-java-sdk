// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelStaticInfoRequest extends TeaModel {
    @NameInMap("hotel_ids")
    public java.util.List<String> hotelIds;

    public static HotelStaticInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelStaticInfoRequest self = new HotelStaticInfoRequest();
        return TeaModel.build(map, self);
    }

    public HotelStaticInfoRequest setHotelIds(java.util.List<String> hotelIds) {
        this.hotelIds = hotelIds;
        return this;
    }
    public java.util.List<String> getHotelIds() {
        return this.hotelIds;
    }

}
