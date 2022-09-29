// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelAlarmShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("MusicType")
    public String musicType;

    @NameInMap("Rooms")
    public String roomsShrink;

    @NameInMap("ScheduleInfo")
    public String scheduleInfoShrink;

    public static CreateHotelAlarmShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelAlarmShrinkRequest self = new CreateHotelAlarmShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotelAlarmShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public CreateHotelAlarmShrinkRequest setMusicType(String musicType) {
        this.musicType = musicType;
        return this;
    }
    public String getMusicType() {
        return this.musicType;
    }

    public CreateHotelAlarmShrinkRequest setRoomsShrink(String roomsShrink) {
        this.roomsShrink = roomsShrink;
        return this;
    }
    public String getRoomsShrink() {
        return this.roomsShrink;
    }

    public CreateHotelAlarmShrinkRequest setScheduleInfoShrink(String scheduleInfoShrink) {
        this.scheduleInfoShrink = scheduleInfoShrink;
        return this;
    }
    public String getScheduleInfoShrink() {
        return this.scheduleInfoShrink;
    }

}
