// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class DeleteReminderRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public DeleteReminderRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public DeleteReminderRequestPayload payload;

    @NameInMap("UserInfo")
    public DeleteReminderRequestUserInfo userInfo;

    public static DeleteReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReminderRequest self = new DeleteReminderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReminderRequest setDeviceInfo(DeleteReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeleteReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public DeleteReminderRequest setPayload(DeleteReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeleteReminderRequestPayload getPayload() {
        return this.payload;
    }

    public DeleteReminderRequest setUserInfo(DeleteReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeleteReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeleteReminderRequestDeviceInfo extends TeaModel {
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

        public static DeleteReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestDeviceInfo self = new DeleteReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class DeleteReminderRequestPayload extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDebug")
        public Boolean isDebug;

        public static DeleteReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestPayload self = new DeleteReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

    }

    public static class DeleteReminderRequestUserInfo extends TeaModel {
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

        public static DeleteReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteReminderRequestUserInfo self = new DeleteReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeleteReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
