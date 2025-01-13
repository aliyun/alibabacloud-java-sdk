// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelAlarmResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43***86881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<CreateHotelAlarmResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static CreateHotelAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelAlarmResponseBody self = new CreateHotelAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHotelAlarmResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public CreateHotelAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHotelAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHotelAlarmResponseBody setResult(java.util.List<CreateHotelAlarmResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CreateHotelAlarmResponseBodyResult> getResult() {
        return this.result;
    }

    public CreateHotelAlarmResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class CreateHotelAlarmResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>94</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        /**
         * <strong>example:</strong>
         * <p>Pvk***TA==</p>
         */
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        @NameInMap("FailMsg")
        public String failMsg;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        /**
         * <strong>example:</strong>
         * <p>mg***Qd</p>
         */
        @NameInMap("UserOpenId")
        public String userOpenId;

        public static CreateHotelAlarmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateHotelAlarmResponseBodyResult self = new CreateHotelAlarmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateHotelAlarmResponseBodyResult setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public CreateHotelAlarmResponseBodyResult setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public CreateHotelAlarmResponseBodyResult setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public CreateHotelAlarmResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public CreateHotelAlarmResponseBodyResult setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

    }

}
