// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushWelcomeTextAndMusicShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("TemplateVariable")
    public String templateVariableShrink;

    public static PushWelcomeTextAndMusicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushWelcomeTextAndMusicShrinkRequest self = new PushWelcomeTextAndMusicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushWelcomeTextAndMusicShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public PushWelcomeTextAndMusicShrinkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public PushWelcomeTextAndMusicShrinkRequest setTemplateVariableShrink(String templateVariableShrink) {
        this.templateVariableShrink = templateVariableShrink;
        return this;
    }
    public String getTemplateVariableShrink() {
        return this.templateVariableShrink;
    }

}
