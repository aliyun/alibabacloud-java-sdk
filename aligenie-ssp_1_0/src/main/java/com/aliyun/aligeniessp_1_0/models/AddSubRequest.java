// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddSubRequest extends TeaModel {
    @NameInMap("AddSubscriptionInfoRequest")
    public AddSubRequestAddSubscriptionInfoRequest addSubscriptionInfoRequest;

    @NameInMap("DeviceInfo")
    public AddSubRequestDeviceInfo deviceInfo;

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
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

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
        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("DailyStudyCnt")
        public Integer dailyStudyCnt;

        @NameInMap("PlayMode")
        public String playMode;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

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
