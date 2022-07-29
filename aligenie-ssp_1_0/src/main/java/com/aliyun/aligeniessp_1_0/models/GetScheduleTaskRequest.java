// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetScheduleTaskRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetScheduleTaskRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public GetScheduleTaskRequestPayload payload;

    @NameInMap("UserInfo")
    public GetScheduleTaskRequestUserInfo userInfo;

    public static GetScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleTaskRequest self = new GetScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduleTaskRequest setDeviceInfo(GetScheduleTaskRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetScheduleTaskRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetScheduleTaskRequest setPayload(GetScheduleTaskRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetScheduleTaskRequestPayload getPayload() {
        return this.payload;
    }

    public GetScheduleTaskRequest setUserInfo(GetScheduleTaskRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetScheduleTaskRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetScheduleTaskRequestDeviceInfo extends TeaModel {
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

        public static GetScheduleTaskRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleTaskRequestDeviceInfo self = new GetScheduleTaskRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetScheduleTaskRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetScheduleTaskRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetScheduleTaskRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScheduleTaskRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetScheduleTaskRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetScheduleTaskRequestPayload extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Invoker")
        public String invoker;

        public static GetScheduleTaskRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleTaskRequestPayload self = new GetScheduleTaskRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetScheduleTaskRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetScheduleTaskRequestPayload setInvoker(String invoker) {
            this.invoker = invoker;
            return this;
        }
        public String getInvoker() {
            return this.invoker;
        }

    }

    public static class GetScheduleTaskRequestUserInfo extends TeaModel {
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

        public static GetScheduleTaskRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleTaskRequestUserInfo self = new GetScheduleTaskRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetScheduleTaskRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetScheduleTaskRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetScheduleTaskRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScheduleTaskRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetScheduleTaskRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
