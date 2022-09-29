// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelAlarmShrinkRequest extends TeaModel {
    @NameInMap("Alarms")
    public String alarmsShrink;

    @NameInMap("HotelId")
    public String hotelId;

    public static DeleteHotelAlarmShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelAlarmShrinkRequest self = new DeleteHotelAlarmShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHotelAlarmShrinkRequest setAlarmsShrink(String alarmsShrink) {
        this.alarmsShrink = alarmsShrink;
        return this;
    }
    public String getAlarmsShrink() {
        return this.alarmsShrink;
    }

    public DeleteHotelAlarmShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
