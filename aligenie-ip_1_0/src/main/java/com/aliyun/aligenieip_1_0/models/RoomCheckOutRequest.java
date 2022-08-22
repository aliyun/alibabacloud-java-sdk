// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RoomCheckOutRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public RoomCheckOutRequestDeviceInfo deviceInfo;

    @NameInMap("UserInfo")
    public RoomCheckOutRequestUserInfo userInfo;

    public static RoomCheckOutRequest build(java.util.Map<String, ?> map) throws Exception {
        RoomCheckOutRequest self = new RoomCheckOutRequest();
        return TeaModel.build(map, self);
    }

    public RoomCheckOutRequest setDeviceInfo(RoomCheckOutRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public RoomCheckOutRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public RoomCheckOutRequest setUserInfo(RoomCheckOutRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public RoomCheckOutRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class RoomCheckOutRequestDeviceInfo extends TeaModel {
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

        public static RoomCheckOutRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            RoomCheckOutRequestDeviceInfo self = new RoomCheckOutRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public RoomCheckOutRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public RoomCheckOutRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public RoomCheckOutRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RoomCheckOutRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public RoomCheckOutRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class RoomCheckOutRequestUserInfo extends TeaModel {
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

        public static RoomCheckOutRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            RoomCheckOutRequestUserInfo self = new RoomCheckOutRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public RoomCheckOutRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public RoomCheckOutRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public RoomCheckOutRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RoomCheckOutRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public RoomCheckOutRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
