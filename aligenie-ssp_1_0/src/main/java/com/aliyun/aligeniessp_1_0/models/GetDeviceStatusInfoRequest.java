// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusInfoRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetDeviceStatusInfoRequestDeviceInfo deviceInfo;

    public static GetDeviceStatusInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusInfoRequest self = new GetDeviceStatusInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusInfoRequest setDeviceInfo(GetDeviceStatusInfoRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceStatusInfoRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetDeviceStatusInfoRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. Enter the Project ID of the project to which the product belongs. You can view it in the Tmall Genie AI Platform console.</p>
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
         * <p>Device identifier. Specify the value of deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The Type of the Device ID:  </p>
         * <ul>
         * <li>OPEN_ID: The default device ID identity.  </li>
         * <li>UNION_ID: The organization-dimension device ID identity. You must request an organization in the Open Platform in advance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID of the device. This parameter is required if IdType is set to UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetDeviceStatusInfoRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusInfoRequestDeviceInfo self = new GetDeviceStatusInfoRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusInfoRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
