// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetScheduleTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetScheduleTaskRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public GetScheduleTaskRequestPayload payload;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("Id")
        public Long id;

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

    }

    public static class GetScheduleTaskRequestUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
