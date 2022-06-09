// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class VideoAppReportRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public VideoAppReportRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public VideoAppReportRequestPayload payload;

    // 用户标识信息
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
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型  - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
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
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户标识（userOpenId或userUnionId）
        @NameInMap("Id")
        public String id;

        // 用户Id的类型  - OPEN_ID：默认的用户ID标识 - UNION_ID: 组织维度的用户ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
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
