// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddSubResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B99D27ED-4E12-1414-9FDE-599C57C4B204</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddSubResponseBodyResult result;

    public static AddSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSubResponseBody self = new AddSubResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSubResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddSubResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSubResponseBody setResult(AddSubResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddSubResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddSubResponseBodyResultScheduleInfo extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static AddSubResponseBodyResultScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            AddSubResponseBodyResultScheduleInfo self = new AddSubResponseBodyResultScheduleInfo();
            return TeaModel.build(map, self);
        }

        public AddSubResponseBodyResultScheduleInfo setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public AddSubResponseBodyResultScheduleInfo setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public AddSubResponseBodyResultScheduleInfo setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class AddSubResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>51999575</p>
         */
        @NameInMap("AlbumId")
        public String albumId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DailyStudyCnt")
        public Integer dailyStudyCnt;

        /**
         * <strong>example:</strong>
         * <p>5874DBCCA3038FAA1A70A8060F07F26D</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>sequence</p>
         */
        @NameInMap("PlayMode")
        public String playMode;

        @NameInMap("ScheduleInfo")
        public AddSubResponseBodyResultScheduleInfo scheduleInfo;

        /**
         * <strong>example:</strong>
         * <p>1152893538998276761</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AddSubResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddSubResponseBodyResult self = new AddSubResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddSubResponseBodyResult setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public AddSubResponseBodyResult setDailyStudyCnt(Integer dailyStudyCnt) {
            this.dailyStudyCnt = dailyStudyCnt;
            return this;
        }
        public Integer getDailyStudyCnt() {
            return this.dailyStudyCnt;
        }

        public AddSubResponseBodyResult setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public AddSubResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddSubResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public AddSubResponseBodyResult setScheduleInfo(AddSubResponseBodyResultScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public AddSubResponseBodyResultScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public AddSubResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
