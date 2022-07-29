// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteAlarmsRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public DeleteAlarmsRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public DeleteAlarmsRequestPayload payload;

    @NameInMap("UserInfo")
    public DeleteAlarmsRequestUserInfo userInfo;

    public static DeleteAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmsRequest self = new DeleteAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmsRequest setDeviceInfo(DeleteAlarmsRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeleteAlarmsRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public DeleteAlarmsRequest setPayload(DeleteAlarmsRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeleteAlarmsRequestPayload getPayload() {
        return this.payload;
    }

    public DeleteAlarmsRequest setUserInfo(DeleteAlarmsRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeleteAlarmsRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeleteAlarmsRequestDeviceInfo extends TeaModel {
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

        public static DeleteAlarmsRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlarmsRequestDeviceInfo self = new DeleteAlarmsRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeleteAlarmsRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteAlarmsRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteAlarmsRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteAlarmsRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteAlarmsRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class DeleteAlarmsRequestPayload extends TeaModel {
        @NameInMap("AlarmIds")
        public java.util.List<Long> alarmIds;

        public static DeleteAlarmsRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlarmsRequestPayload self = new DeleteAlarmsRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeleteAlarmsRequestPayload setAlarmIds(java.util.List<Long> alarmIds) {
            this.alarmIds = alarmIds;
            return this;
        }
        public java.util.List<Long> getAlarmIds() {
            return this.alarmIds;
        }

    }

    public static class DeleteAlarmsRequestUserInfo extends TeaModel {
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

        public static DeleteAlarmsRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlarmsRequestUserInfo self = new DeleteAlarmsRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeleteAlarmsRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteAlarmsRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteAlarmsRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteAlarmsRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteAlarmsRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
