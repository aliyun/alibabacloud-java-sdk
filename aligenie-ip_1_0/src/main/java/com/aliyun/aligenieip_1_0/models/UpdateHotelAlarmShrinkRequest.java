// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelAlarmShrinkRequest extends TeaModel {
    @NameInMap("Alarms")
    public String alarmsShrink;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ScheduleInfo")
    public String scheduleInfoShrink;

    public static UpdateHotelAlarmShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelAlarmShrinkRequest self = new UpdateHotelAlarmShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelAlarmShrinkRequest setAlarmsShrink(String alarmsShrink) {
        this.alarmsShrink = alarmsShrink;
        return this;
    }
    public String getAlarmsShrink() {
        return this.alarmsShrink;
    }

    public UpdateHotelAlarmShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelAlarmShrinkRequest setScheduleInfoShrink(String scheduleInfoShrink) {
        this.scheduleInfoShrink = scheduleInfoShrink;
        return this;
    }
    public String getScheduleInfoShrink() {
        return this.scheduleInfoShrink;
    }

}
