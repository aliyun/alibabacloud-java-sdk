// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetBusAppConfigRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetBusAppConfigRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public GetBusAppConfigRequestPayload payload;

    @NameInMap("UserInfo")
    public GetBusAppConfigRequestUserInfo userInfo;

    public static GetBusAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusAppConfigRequest self = new GetBusAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetBusAppConfigRequest setDeviceInfo(GetBusAppConfigRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetBusAppConfigRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetBusAppConfigRequest setPayload(GetBusAppConfigRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetBusAppConfigRequestPayload getPayload() {
        return this.payload;
    }

    public GetBusAppConfigRequest setUserInfo(GetBusAppConfigRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetBusAppConfigRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetBusAppConfigRequestDeviceInfo extends TeaModel {
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

        public static GetBusAppConfigRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigRequestDeviceInfo self = new GetBusAppConfigRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetBusAppConfigRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetBusAppConfigRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBusAppConfigRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetBusAppConfigRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetBusAppConfigRequestPayload extends TeaModel {
        @NameInMap("originUuid")
        public String originUuid;

        @NameInMap("phone")
        public String phone;

        public static GetBusAppConfigRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigRequestPayload self = new GetBusAppConfigRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

        public GetBusAppConfigRequestPayload setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class GetBusAppConfigRequestUserInfo extends TeaModel {
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

        public static GetBusAppConfigRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBusAppConfigRequestUserInfo self = new GetBusAppConfigRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetBusAppConfigRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetBusAppConfigRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetBusAppConfigRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBusAppConfigRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetBusAppConfigRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
