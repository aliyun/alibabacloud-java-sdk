// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetDeviceBasicInfoRequestDeviceInfo deviceInfo;

    public static GetDeviceBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBasicInfoRequest self = new GetDeviceBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceBasicInfoRequest setDeviceInfo(GetDeviceBasicInfoRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceBasicInfoRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetDeviceBasicInfoRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. Enter the Project ID of the project to which this product belongs. You can view it in the Tmall Genie AI Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Enter <strong>PROJECT_ID</strong> here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID. Enter the value of either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID:  </p>
         * <ul>
         * <li>OPEN_ID: The default device ID.  </li>
         * <li>UNION_ID: The organization-dimension device ID. You must request an organization in the Open Platform in advance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetDeviceBasicInfoRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceBasicInfoRequestDeviceInfo self = new GetDeviceBasicInfoRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceBasicInfoRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
