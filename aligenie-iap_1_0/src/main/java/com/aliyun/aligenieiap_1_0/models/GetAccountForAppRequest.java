// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetAccountForAppRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public GetAccountForAppRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public GetAccountForAppRequestPayload payload;

    // 用户标识信息
    @NameInMap("UserInfo")
    public GetAccountForAppRequestUserInfo userInfo;

    public static GetAccountForAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountForAppRequest self = new GetAccountForAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountForAppRequest setDeviceInfo(GetAccountForAppRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetAccountForAppRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetAccountForAppRequest setPayload(GetAccountForAppRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetAccountForAppRequestPayload getPayload() {
        return this.payload;
    }

    public GetAccountForAppRequest setUserInfo(GetAccountForAppRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetAccountForAppRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetAccountForAppRequestDeviceInfo extends TeaModel {
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

        public static GetAccountForAppRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountForAppRequestDeviceInfo self = new GetAccountForAppRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountForAppRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetAccountForAppRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetAccountForAppRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAccountForAppRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetAccountForAppRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetAccountForAppRequestPayload extends TeaModel {
        @NameInMap("Phone")
        public String phone;

        public static GetAccountForAppRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetAccountForAppRequestPayload self = new GetAccountForAppRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetAccountForAppRequestPayload setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class GetAccountForAppRequestUserInfo extends TeaModel {
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

        public static GetAccountForAppRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountForAppRequestUserInfo self = new GetAccountForAppRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountForAppRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetAccountForAppRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetAccountForAppRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAccountForAppRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetAccountForAppRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
