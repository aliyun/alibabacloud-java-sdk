// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PullCashierRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public PullCashierRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public PullCashierRequestPayload payload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public PullCashierRequestUserInfo userInfo;

    public static PullCashierRequest build(java.util.Map<String, ?> map) throws Exception {
        PullCashierRequest self = new PullCashierRequest();
        return TeaModel.build(map, self);
    }

    public PullCashierRequest setDeviceInfo(PullCashierRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public PullCashierRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public PullCashierRequest setPayload(PullCashierRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public PullCashierRequestPayload getPayload() {
        return this.payload;
    }

    public PullCashierRequest setUserInfo(PullCashierRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public PullCashierRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class PullCashierRequestDeviceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
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

        public static PullCashierRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestDeviceInfo self = new PullCashierRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public PullCashierRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PullCashierRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PullCashierRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PullCashierRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PullCashierRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class PullCashierRequestPayload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>731D5F********DC3B</p>
         */
        @NameInMap("originUuid")
        public String originUuid;

        public static PullCashierRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestPayload self = new PullCashierRequestPayload();
            return TeaModel.build(map, self);
        }

        public PullCashierRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

    }

    public static class PullCashierRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
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

        public static PullCashierRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestUserInfo self = new PullCashierRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public PullCashierRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PullCashierRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PullCashierRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PullCashierRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PullCashierRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
