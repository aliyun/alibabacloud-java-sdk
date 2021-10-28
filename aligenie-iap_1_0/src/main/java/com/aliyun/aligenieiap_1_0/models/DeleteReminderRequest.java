// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class DeleteReminderRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public DeleteReminderRequestDeviceInfo deviceInfo;

    // 服务请求入参
    @NameInMap("Payload")
    public DeleteReminderRequestPayload payload;

    // 用户标识信息
    @NameInMap("UserInfo")
    public DeleteReminderRequestUserInfo userInfo;

    public static DeleteReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReminderRequest self = new DeleteReminderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReminderRequest setDeviceInfo(DeleteReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeleteReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public DeleteReminderRequest setPayload(DeleteReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeleteReminderRequestPayload getPayload() {
        return this.payload;
    }

    public DeleteReminderRequest setUserInfo(DeleteReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeleteReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeleteReminderRequestDeviceInfo extends TeaModel {
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

        public static DeleteReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestDeviceInfo self = new DeleteReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class DeleteReminderRequestPayload extends TeaModel {
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

        public static DeleteReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestPayload self = new DeleteReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestPayload setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DeleteReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public DeleteReminderRequestPayload setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }
        public String getSubjectId() {
            return this.subjectId;
        }

        public DeleteReminderRequestPayload setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DeleteReminderRequestUserInfo extends TeaModel {
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

        public static DeleteReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestUserInfo self = new DeleteReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
