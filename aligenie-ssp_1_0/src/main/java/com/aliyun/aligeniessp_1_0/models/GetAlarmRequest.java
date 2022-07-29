// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlarmRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetAlarmRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public GetAlarmRequestPayload payload;

    @NameInMap("UserInfo")
    public GetAlarmRequestUserInfo userInfo;

    public static GetAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmRequest self = new GetAlarmRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmRequest setDeviceInfo(GetAlarmRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetAlarmRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetAlarmRequest setPayload(GetAlarmRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetAlarmRequestPayload getPayload() {
        return this.payload;
    }

    public GetAlarmRequest setUserInfo(GetAlarmRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetAlarmRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetAlarmRequestDeviceInfo extends TeaModel {
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

        public static GetAlarmRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmRequestDeviceInfo self = new GetAlarmRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetAlarmRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetAlarmRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetAlarmRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAlarmRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetAlarmRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetAlarmRequestPayload extends TeaModel {
        @NameInMap("AlarmId")
        public Long alarmId;

        public static GetAlarmRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmRequestPayload self = new GetAlarmRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetAlarmRequestPayload setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

    }

    public static class GetAlarmRequestUserInfo extends TeaModel {
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

        public static GetAlarmRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmRequestUserInfo self = new GetAlarmRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetAlarmRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetAlarmRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetAlarmRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAlarmRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetAlarmRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
