// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindDeviceRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public UnbindDeviceRequestDeviceInfo deviceInfo;

    // 用户标识信息
    @NameInMap("UserInfo")
    public UnbindDeviceRequestUserInfo userInfo;

    public static UnbindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceRequest self = new UnbindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceRequest setDeviceInfo(UnbindDeviceRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public UnbindDeviceRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public UnbindDeviceRequest setUserInfo(UnbindDeviceRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public UnbindDeviceRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class UnbindDeviceRequestDeviceInfo extends TeaModel {
        // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，此处填写“PROJECT_ID”
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型  - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static UnbindDeviceRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            UnbindDeviceRequestDeviceInfo self = new UnbindDeviceRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public UnbindDeviceRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UnbindDeviceRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UnbindDeviceRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UnbindDeviceRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UnbindDeviceRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class UnbindDeviceRequestUserInfo extends TeaModel {
        // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，此处填写“PROJECT_ID”
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户标识（userOpenId或userUnionId）
        @NameInMap("Id")
        public String id;

        // 用户Id的类型  - OPEN_ID：默认的用户ID标识 - UNION_ID: 组织维度的用户ID标识，在开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static UnbindDeviceRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            UnbindDeviceRequestUserInfo self = new UnbindDeviceRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public UnbindDeviceRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UnbindDeviceRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UnbindDeviceRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UnbindDeviceRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UnbindDeviceRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
