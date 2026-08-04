// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
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
         * <p>The value corresponding to the encoding type. Set this parameter to the Project ID of the product’s ProductKey in the Tmall Genie AI platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Set this parameter to <strong>PROJECT_ID</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device identifier, configured as either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID:  </p>
         * <ul>
         * <li>OPEN_ID: The default device ID.  </li>
         * <li>UNION_ID: The organization-dimension device ID. You must request an organization on the Open Platform in advance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is set to UNION_ID.</p>
         * 
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
