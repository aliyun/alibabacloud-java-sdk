// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class VideoAppReportRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public VideoAppReportRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public VideoAppReportRequestPayload payload;

    @NameInMap("UserInfo")
    public VideoAppReportRequestUserInfo userInfo;

    public static VideoAppReportRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoAppReportRequest self = new VideoAppReportRequest();
        return TeaModel.build(map, self);
    }

    public VideoAppReportRequest setDeviceInfo(VideoAppReportRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public VideoAppReportRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public VideoAppReportRequest setPayload(VideoAppReportRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public VideoAppReportRequestPayload getPayload() {
        return this.payload;
    }

    public VideoAppReportRequest setUserInfo(VideoAppReportRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public VideoAppReportRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class VideoAppReportRequestDeviceInfo extends TeaModel {
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

        public static VideoAppReportRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            VideoAppReportRequestDeviceInfo self = new VideoAppReportRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public VideoAppReportRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public VideoAppReportRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public VideoAppReportRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VideoAppReportRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public VideoAppReportRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class VideoAppReportRequestPayload extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("isLogin")
        public Boolean isLogin;

        @NameInMap("isVip")
        public Boolean isVip;

        @NameInMap("loginNick")
        public String loginNick;

        @NameInMap("originUuid")
        public String originUuid;

        @NameInMap("phone")
        public String phone;

        @NameInMap("pkgName")
        public String pkgName;

        @NameInMap("startTime")
        public Long startTime;

        public static VideoAppReportRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            VideoAppReportRequestPayload self = new VideoAppReportRequestPayload();
            return TeaModel.build(map, self);
        }

        public VideoAppReportRequestPayload setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public VideoAppReportRequestPayload setIsLogin(Boolean isLogin) {
            this.isLogin = isLogin;
            return this;
        }
        public Boolean getIsLogin() {
            return this.isLogin;
        }

        public VideoAppReportRequestPayload setIsVip(Boolean isVip) {
            this.isVip = isVip;
            return this;
        }
        public Boolean getIsVip() {
            return this.isVip;
        }

        public VideoAppReportRequestPayload setLoginNick(String loginNick) {
            this.loginNick = loginNick;
            return this;
        }
        public String getLoginNick() {
            return this.loginNick;
        }

        public VideoAppReportRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

        public VideoAppReportRequestPayload setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public VideoAppReportRequestPayload setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public VideoAppReportRequestPayload setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class VideoAppReportRequestUserInfo extends TeaModel {
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

        public static VideoAppReportRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            VideoAppReportRequestUserInfo self = new VideoAppReportRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public VideoAppReportRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public VideoAppReportRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public VideoAppReportRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VideoAppReportRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public VideoAppReportRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
