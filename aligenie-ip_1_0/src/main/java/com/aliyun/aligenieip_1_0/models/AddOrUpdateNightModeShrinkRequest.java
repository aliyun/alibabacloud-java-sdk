// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateNightModeShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("NightMode")
    public String nightModeShrink;

    public static AddOrUpdateNightModeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateNightModeShrinkRequest self = new AddOrUpdateNightModeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateNightModeShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateNightModeShrinkRequest setNightModeShrink(String nightModeShrink) {
        this.nightModeShrink = nightModeShrink;
        return this;
    }
    public String getNightModeShrink() {
        return this.nightModeShrink;
    }

}
