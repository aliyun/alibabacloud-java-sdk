// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ResetWelcomeTextAndMusicRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    public static ResetWelcomeTextAndMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetWelcomeTextAndMusicRequest self = new ResetWelcomeTextAndMusicRequest();
        return TeaModel.build(map, self);
    }

    public ResetWelcomeTextAndMusicRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
