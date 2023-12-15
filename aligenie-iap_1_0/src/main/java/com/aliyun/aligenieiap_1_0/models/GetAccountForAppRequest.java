// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetAccountForAppRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetAccountForAppRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public GetAccountForAppRequestPayload payload;

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

        @NameInMap("originUuid")
        public String originUuid;

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

        public GetAccountForAppRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

    }

    public static class GetAccountForAppRequestUserInfo extends TeaModel {
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
