// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetPhoneNumberRequestDeviceInfo deviceInfo;

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
