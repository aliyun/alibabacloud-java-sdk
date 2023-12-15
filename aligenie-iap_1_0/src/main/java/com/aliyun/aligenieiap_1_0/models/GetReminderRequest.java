// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetReminderRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public GetReminderRequestPayload payload;

    @NameInMap("UserInfo")
    public GetReminderRequestUserInfo userInfo;

    public static GetReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReminderRequest self = new GetReminderRequest();
        return TeaModel.build(map, self);
    }

    public GetReminderRequest setDeviceInfo(GetReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetReminderRequest setPayload(GetReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetReminderRequestPayload getPayload() {
        return this.payload;
    }

    public GetReminderRequest setUserInfo(GetReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetReminderRequestDeviceInfo extends TeaModel {
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

        public static GetReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestDeviceInfo self = new GetReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetReminderRequestPayload extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDebug")
        public Boolean isDebug;

        public static GetReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestPayload self = new GetReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

    }

    public static class GetReminderRequestUserInfo extends TeaModel {
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

        public static GetReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetReminderRequestUserInfo self = new GetReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
