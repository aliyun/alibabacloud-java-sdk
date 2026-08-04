// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddSubRequest extends TeaModel {
    /**
     * <p>Subscribe to album request</p>
     */
    @NameInMap("AddSubscriptionInfoRequest")
    public AddSubRequestAddSubscriptionInfoRequest addSubscriptionInfoRequest;

    /**
     * <p>Device Information</p>
     */
    @NameInMap("DeviceInfo")
    public AddSubRequestDeviceInfo deviceInfo;

    /**
     * <p>User Information</p>
     */
    @NameInMap("UserInfo")
    public AddSubRequestUserInfo userInfo;

    public static AddSubRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSubRequest self = new AddSubRequest();
        return TeaModel.build(map, self);
    }

    public AddSubRequest setAddSubscriptionInfoRequest(AddSubRequestAddSubscriptionInfoRequest addSubscriptionInfoRequest) {
        this.addSubscriptionInfoRequest = addSubscriptionInfoRequest;
        return this;
    }
    public AddSubRequestAddSubscriptionInfoRequest getAddSubscriptionInfoRequest() {
        return this.addSubscriptionInfoRequest;
    }

    public AddSubRequest setDeviceInfo(AddSubRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public AddSubRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public AddSubRequest setUserInfo(AddSubRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public AddSubRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class AddSubRequestAddSubscriptionInfoRequestScheduleInfo extends TeaModel {
        /**
         * <p>The specific days of the week for weekly reminders. Valid values are 1 to 7.</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>The hour of the clock when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>The minute of the hour when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static AddSubRequestAddSubscriptionInfoRequestScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            AddSubRequestAddSubscriptionInfoRequestScheduleInfo self = new AddSubRequestAddSubscriptionInfoRequestScheduleInfo();
            return TeaModel.build(map, self);
        }

        public AddSubRequestAddSubscriptionInfoRequestScheduleInfo setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public AddSubRequestAddSubscriptionInfoRequestScheduleInfo setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public AddSubRequestAddSubscriptionInfoRequestScheduleInfo setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class AddSubRequestAddSubscriptionInfoRequest extends TeaModel {
        /**
         * <p>Album ID</p>
         * 
         * <strong>example:</strong>
         * <p>51999575</p>
         */
        @NameInMap("AlbumId")
        public String albumId;

        /**
         * <p>Daily study quantity</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DailyStudyCnt")
        public Integer dailyStudyCnt;

        /**
         * <p>Playback pattern (currently only supports sequence)</p>
         * 
         * <strong>example:</strong>
         * <p>sequence</p>
         */
        @NameInMap("PlayMode")
        public String playMode;

        /**
         * <p>Schedule information</p>
         */
        @NameInMap("ScheduleInfo")
        public AddSubRequestAddSubscriptionInfoRequestScheduleInfo scheduleInfo;

        public static AddSubRequestAddSubscriptionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
            AddSubRequestAddSubscriptionInfoRequest self = new AddSubRequestAddSubscriptionInfoRequest();
            return TeaModel.build(map, self);
        }

        public AddSubRequestAddSubscriptionInfoRequest setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public AddSubRequestAddSubscriptionInfoRequest setDailyStudyCnt(Integer dailyStudyCnt) {
            this.dailyStudyCnt = dailyStudyCnt;
            return this;
        }
        public Integer getDailyStudyCnt() {
            return this.dailyStudyCnt;
        }

        public AddSubRequestAddSubscriptionInfoRequest setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public AddSubRequestAddSubscriptionInfoRequest setScheduleInfo(AddSubRequestAddSubscriptionInfoRequestScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public AddSubRequestAddSubscriptionInfoRequestScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

    }

    public static class AddSubRequestDeviceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static AddSubRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            AddSubRequestDeviceInfo self = new AddSubRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public AddSubRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public AddSubRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public AddSubRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddSubRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public AddSubRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class AddSubRequestUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static AddSubRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            AddSubRequestUserInfo self = new AddSubRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public AddSubRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public AddSubRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public AddSubRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddSubRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public AddSubRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
