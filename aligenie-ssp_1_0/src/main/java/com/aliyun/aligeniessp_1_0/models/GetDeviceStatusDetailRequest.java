// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetDeviceStatusDetailRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keys")
    public java.util.List<String> keys;

    public static GetDeviceStatusDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusDetailRequest self = new GetDeviceStatusDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusDetailRequest setDeviceInfo(GetDeviceStatusDetailRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceStatusDetailRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetDeviceStatusDetailRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public static class GetDeviceStatusDetailRequestDeviceInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
         * <p>1</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetDeviceStatusDetailRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusDetailRequestDeviceInfo self = new GetDeviceStatusDetailRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusDetailRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceStatusDetailRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceStatusDetailRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceStatusDetailRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceStatusDetailRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
