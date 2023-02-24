// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverStyleRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    public static GetHotelScreenSaverStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverStyleRequest self = new GetHotelScreenSaverStyleRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverStyleRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
