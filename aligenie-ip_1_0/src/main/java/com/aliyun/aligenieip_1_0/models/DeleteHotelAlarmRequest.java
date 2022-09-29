// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelAlarmRequest extends TeaModel {
    @NameInMap("Alarms")
    public java.util.List<DeleteHotelAlarmRequestAlarms> alarms;

    @NameInMap("HotelId")
    public String hotelId;

    public static DeleteHotelAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelAlarmRequest self = new DeleteHotelAlarmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHotelAlarmRequest setAlarms(java.util.List<DeleteHotelAlarmRequestAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }
    public java.util.List<DeleteHotelAlarmRequestAlarms> getAlarms() {
        return this.alarms;
    }

    public DeleteHotelAlarmRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public static class DeleteHotelAlarmRequestAlarms extends TeaModel {
        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        @NameInMap("RoomNo")
        public String roomNo;

        @NameInMap("UserOpenId")
        public String userOpenId;

        public static DeleteHotelAlarmRequestAlarms build(java.util.Map<String, ?> map) throws Exception {
            DeleteHotelAlarmRequestAlarms self = new DeleteHotelAlarmRequestAlarms();
            return TeaModel.build(map, self);
        }

        public DeleteHotelAlarmRequestAlarms setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public DeleteHotelAlarmRequestAlarms setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public DeleteHotelAlarmRequestAlarms setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public DeleteHotelAlarmRequestAlarms setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

    }

}
