// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public GetPhoneNumberRequestDeviceInfo deviceInfo;

    // 用户标识信息
    @NameInMap("UserInfo")
    public GetPhoneNumberRequestUserInfo userInfo;

    public static GetPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberRequest self = new GetPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberRequest setDeviceInfo(GetPhoneNumberRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetPhoneNumberRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetPhoneNumberRequest setUserInfo(GetPhoneNumberRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetPhoneNumberRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetPhoneNumberRequestDeviceInfo extends TeaModel {
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

        public static GetPhoneNumberRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberRequestDeviceInfo self = new GetPhoneNumberRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetPhoneNumberRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetPhoneNumberRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhoneNumberRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetPhoneNumberRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetPhoneNumberRequestUserInfo extends TeaModel {
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

        public static GetPhoneNumberRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberRequestUserInfo self = new GetPhoneNumberRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetPhoneNumberRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetPhoneNumberRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhoneNumberRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetPhoneNumberRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
