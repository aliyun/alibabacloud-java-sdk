// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public ListRemindersRequestDeviceInfo deviceInfo;

    // 服务请求入参
    @NameInMap("Payload")
    public ListRemindersRequestPayload payload;

    // 用户标识信息
    @NameInMap("UserInfo")
    public ListRemindersRequestUserInfo userInfo;

    public static ListRemindersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemindersRequest self = new ListRemindersRequest();
        return TeaModel.build(map, self);
    }

    public ListRemindersRequest setDeviceInfo(ListRemindersRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListRemindersRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListRemindersRequest setPayload(ListRemindersRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListRemindersRequestPayload getPayload() {
        return this.payload;
    }

    public ListRemindersRequest setUserInfo(ListRemindersRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListRemindersRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListRemindersRequestDeviceInfo extends TeaModel {
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

        public static ListRemindersRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestDeviceInfo self = new ListRemindersRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRemindersRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRemindersRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRemindersRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRemindersRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListRemindersRequestPayload extends TeaModel {
        // 设备id
        @NameInMap("DeviceId")
        public String deviceId;

        // 调试标识
        @NameInMap("IsDebug")
        public Boolean isDebug;

        // 应用id
        @NameInMap("SubjectId")
        public String subjectId;

        // 精灵id
        @NameInMap("UserId")
        public String userId;

        public static ListRemindersRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestPayload self = new ListRemindersRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestPayload setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListRemindersRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public ListRemindersRequestPayload setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }
        public String getSubjectId() {
            return this.subjectId;
        }

        public ListRemindersRequestPayload setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListRemindersRequestUserInfo extends TeaModel {
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

        public static ListRemindersRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestUserInfo self = new ListRemindersRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRemindersRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRemindersRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRemindersRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRemindersRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
