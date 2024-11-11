// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetUserByDeviceIdRequestDeviceInfo deviceInfo;

    public static GetUserByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByDeviceIdRequest self = new GetUserByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByDeviceIdRequest setDeviceInfo(GetUserByDeviceIdRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetUserByDeviceIdRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetUserByDeviceIdRequestDeviceInfo extends TeaModel {
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
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
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

        public static GetUserByDeviceIdRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserByDeviceIdRequestDeviceInfo self = new GetUserByDeviceIdRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetUserByDeviceIdRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetUserByDeviceIdRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetUserByDeviceIdRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserByDeviceIdRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetUserByDeviceIdRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
