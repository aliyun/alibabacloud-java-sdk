// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByGenieDeviceRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetHotelContactByGenieDeviceRequestDeviceInfo deviceInfo;

    @NameInMap("UserInfo")
    public GetHotelContactByGenieDeviceRequestUserInfo userInfo;

    public static GetHotelContactByGenieDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByGenieDeviceRequest self = new GetHotelContactByGenieDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByGenieDeviceRequest setDeviceInfo(GetHotelContactByGenieDeviceRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetHotelContactByGenieDeviceRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetHotelContactByGenieDeviceRequest setUserInfo(GetHotelContactByGenieDeviceRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelContactByGenieDeviceRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelContactByGenieDeviceRequestDeviceInfo extends TeaModel {
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

        public static GetHotelContactByGenieDeviceRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactByGenieDeviceRequestDeviceInfo self = new GetHotelContactByGenieDeviceRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelContactByGenieDeviceRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelContactByGenieDeviceRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelContactByGenieDeviceRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelContactByGenieDeviceRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelContactByGenieDeviceRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetHotelContactByGenieDeviceRequestUserInfo extends TeaModel {
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

        public static GetHotelContactByGenieDeviceRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactByGenieDeviceRequestUserInfo self = new GetHotelContactByGenieDeviceRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelContactByGenieDeviceRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelContactByGenieDeviceRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelContactByGenieDeviceRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelContactByGenieDeviceRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelContactByGenieDeviceRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
