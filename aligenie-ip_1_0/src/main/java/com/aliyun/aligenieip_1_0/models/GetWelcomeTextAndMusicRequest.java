// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetWelcomeTextAndMusicRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    public static GetWelcomeTextAndMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWelcomeTextAndMusicRequest self = new GetWelcomeTextAndMusicRequest();
        return TeaModel.build(map, self);
    }

    public GetWelcomeTextAndMusicRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
