// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushVoiceBoxCommandsShrinkRequest extends TeaModel {
    @NameInMap("Commands")
    public String commandsShrink;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    public static PushVoiceBoxCommandsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushVoiceBoxCommandsShrinkRequest self = new PushVoiceBoxCommandsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushVoiceBoxCommandsShrinkRequest setCommandsShrink(String commandsShrink) {
        this.commandsShrink = commandsShrink;
        return this;
    }
    public String getCommandsShrink() {
        return this.commandsShrink;
    }

    public PushVoiceBoxCommandsShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public PushVoiceBoxCommandsShrinkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
