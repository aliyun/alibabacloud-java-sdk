// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushWelcomeTextAndMusicRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("TemplateVariable")
    public java.util.Map<String, String> templateVariable;

    public static PushWelcomeTextAndMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        PushWelcomeTextAndMusicRequest self = new PushWelcomeTextAndMusicRequest();
        return TeaModel.build(map, self);
    }

    public PushWelcomeTextAndMusicRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public PushWelcomeTextAndMusicRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public PushWelcomeTextAndMusicRequest setTemplateVariable(java.util.Map<String, String> templateVariable) {
        this.templateVariable = templateVariable;
        return this;
    }
    public java.util.Map<String, String> getTemplateVariable() {
        return this.templateVariable;
    }

}
