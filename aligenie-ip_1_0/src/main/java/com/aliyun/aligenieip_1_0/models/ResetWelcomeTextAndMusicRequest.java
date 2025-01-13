// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ResetWelcomeTextAndMusicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
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
