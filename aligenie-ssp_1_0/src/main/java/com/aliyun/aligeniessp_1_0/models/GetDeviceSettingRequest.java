// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceSettingRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     */
    @NameInMap("DeviceInfo")
    public GetDeviceSettingRequestDeviceInfo deviceInfo;

    /**
     * <p>Set of specified keys for device Settings,<br>Do Not Disturb mode: nightMode</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keys")
    public java.util.List<String> keys;

    public static GetDeviceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceSettingRequest self = new GetDeviceSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceSettingRequest setDeviceInfo(GetDeviceSettingRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceSettingRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetDeviceSettingRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public static class GetDeviceSettingRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. Enter the Project ID of the project that contains the ProductKey of this product in the Tmall Genie AI Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Set this parameter to PROJECT_ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID. Configure this parameter as deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID.<br>OPEN_ID: The default device identity.<br>UNION_ID: The device identity at the organization dimension. You must request an organization in advance on the Open Platform.</p>
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
         * <p>122</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetDeviceSettingRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceSettingRequestDeviceInfo self = new GetDeviceSettingRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceSettingRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceSettingRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceSettingRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceSettingRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceSettingRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
