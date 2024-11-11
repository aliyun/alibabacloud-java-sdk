// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteScheduleTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public DeleteScheduleTaskRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public DeleteScheduleTaskRequestPayload payload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public DeleteScheduleTaskRequestUserInfo userInfo;

    public static DeleteScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleTaskRequest self = new DeleteScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleTaskRequest setDeviceInfo(DeleteScheduleTaskRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeleteScheduleTaskRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public DeleteScheduleTaskRequest setPayload(DeleteScheduleTaskRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeleteScheduleTaskRequestPayload getPayload() {
        return this.payload;
    }

    public DeleteScheduleTaskRequest setUserInfo(DeleteScheduleTaskRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeleteScheduleTaskRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeleteScheduleTaskRequestDeviceInfo extends TeaModel {
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

        public static DeleteScheduleTaskRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteScheduleTaskRequestDeviceInfo self = new DeleteScheduleTaskRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeleteScheduleTaskRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteScheduleTaskRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteScheduleTaskRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteScheduleTaskRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteScheduleTaskRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class DeleteScheduleTaskRequestPayload extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("Id")
        public Long id;

        public static DeleteScheduleTaskRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeleteScheduleTaskRequestPayload self = new DeleteScheduleTaskRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeleteScheduleTaskRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DeleteScheduleTaskRequestUserInfo extends TeaModel {
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

        public static DeleteScheduleTaskRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteScheduleTaskRequestUserInfo self = new DeleteScheduleTaskRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeleteScheduleTaskRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeleteScheduleTaskRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeleteScheduleTaskRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteScheduleTaskRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeleteScheduleTaskRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
