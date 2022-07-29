// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingItemRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetCurrentPlayingItemRequestDeviceInfo deviceInfo;

    @NameInMap("UserInfo")
    public GetCurrentPlayingItemRequestUserInfo userInfo;

    public static GetCurrentPlayingItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingItemRequest self = new GetCurrentPlayingItemRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingItemRequest setDeviceInfo(GetCurrentPlayingItemRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetCurrentPlayingItemRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetCurrentPlayingItemRequest setUserInfo(GetCurrentPlayingItemRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetCurrentPlayingItemRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetCurrentPlayingItemRequestDeviceInfo extends TeaModel {
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

        public static GetCurrentPlayingItemRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingItemRequestDeviceInfo self = new GetCurrentPlayingItemRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingItemRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCurrentPlayingItemRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCurrentPlayingItemRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCurrentPlayingItemRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCurrentPlayingItemRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetCurrentPlayingItemRequestUserInfo extends TeaModel {
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

        public static GetCurrentPlayingItemRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingItemRequestUserInfo self = new GetCurrentPlayingItemRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingItemRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCurrentPlayingItemRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCurrentPlayingItemRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCurrentPlayingItemRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCurrentPlayingItemRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
