// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SetDeviceSettingRequest extends TeaModel {
    /**
     * <p>List of user identifier information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public SetDeviceSettingRequestDeviceInfo deviceInfo;

    /**
     * <p>The collection of keys specified for device settings:<br>Do Not Disturb mode: nightMode</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nightMode</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Attribute Value</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:true}</p>
     */
    @NameInMap("Value")
    public Object value;

    public static SetDeviceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceSettingRequest self = new SetDeviceSettingRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceSettingRequest setDeviceInfo(SetDeviceSettingRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public SetDeviceSettingRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public SetDeviceSettingRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetDeviceSettingRequest setValue(Object value) {
        this.value = value;
        return this;
    }
    public Object getValue() {
        return this.value;
    }

    public static class SetDeviceSettingRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. Enter the Project ID of the project where the product resides. You can view it in the Tmall Genie AI platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Enter PROJECT_ID here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID. Enter the value of deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID:<br>OPEN_ID: The default device identity.<br>UNION_ID: The organization-dimension device identity. You must request an organization in advance on the Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static SetDeviceSettingRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            SetDeviceSettingRequestDeviceInfo self = new SetDeviceSettingRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public SetDeviceSettingRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SetDeviceSettingRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SetDeviceSettingRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SetDeviceSettingRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SetDeviceSettingRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
