// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public ListRemindersRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public ListRemindersRequestPayload payload;

    @NameInMap("UserInfo")
    public ListRemindersRequestUserInfo userInfo;

    public static ListRemindersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemindersRequest self = new ListRemindersRequest();
        return TeaModel.build(map, self);
    }

    public ListRemindersRequest setDeviceInfo(ListRemindersRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListRemindersRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListRemindersRequest setPayload(ListRemindersRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListRemindersRequestPayload getPayload() {
        return this.payload;
    }

    public ListRemindersRequest setUserInfo(ListRemindersRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListRemindersRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListRemindersRequestDeviceInfo extends TeaModel {
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

        public static ListRemindersRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestDeviceInfo self = new ListRemindersRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRemindersRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRemindersRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRemindersRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRemindersRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListRemindersRequestPayload extends TeaModel {
        @NameInMap("IsDebug")
        public Boolean isDebug;

        public static ListRemindersRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestPayload self = new ListRemindersRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

    }

    public static class ListRemindersRequestUserInfo extends TeaModel {
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

        public static ListRemindersRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersRequestUserInfo self = new ListRemindersRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListRemindersRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRemindersRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRemindersRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRemindersRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRemindersRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
