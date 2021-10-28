// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public GetReminderRequestDeviceInfo deviceInfo;

    // 服务请求入参
    @NameInMap("Payload")
    public GetReminderRequestPayload payload;

    // 用户标识信息
    @NameInMap("UserInfo")
    public GetReminderRequestUserInfo userInfo;

    public static GetReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReminderRequest self = new GetReminderRequest();
        return TeaModel.build(map, self);
    }

    public GetReminderRequest setDeviceInfo(GetReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetReminderRequest setPayload(GetReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetReminderRequestPayload getPayload() {
        return this.payload;
    }

    public GetReminderRequest setUserInfo(GetReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetReminderRequestDeviceInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型 - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestDeviceInfo self = new GetReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetReminderRequestPayload extends TeaModel {
        // 设备id
        @NameInMap("DeviceId")
        public String deviceId;

        // 提醒的唯一id
        @NameInMap("Id")
        public Long id;

        // 调试标识
        @NameInMap("IsDebug")
        public Boolean isDebug;

        // 应用id
        @NameInMap("SubjectId")
        public String subjectId;

        // 精灵id
        @NameInMap("UserId")
        public String userId;

        public static GetReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestPayload self = new GetReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestPayload setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public GetReminderRequestPayload setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }
        public String getSubjectId() {
            return this.subjectId;
        }

        public GetReminderRequestPayload setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetReminderRequestUserInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户标识（userOpenId或userUnionId）
        @NameInMap("Id")
        public String id;

        // 用户Id的类型 - OPEN_ID：默认的用户ID标识 - UNION_ID: 组织维度的用户ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestUserInfo self = new GetReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
