// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateScreenSaverShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("HotelScreenSaver")
    public String hotelScreenSaverShrink;

    public static AddOrUpdateScreenSaverShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateScreenSaverShrinkRequest self = new AddOrUpdateScreenSaverShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateScreenSaverShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateScreenSaverShrinkRequest setHotelScreenSaverShrink(String hotelScreenSaverShrink) {
        this.hotelScreenSaverShrink = hotelScreenSaverShrink;
        return this;
    }
    public String getHotelScreenSaverShrink() {
        return this.hotelScreenSaverShrink;
    }

}
