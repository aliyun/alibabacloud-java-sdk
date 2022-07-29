// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceSettingRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetDeviceSettingRequestDeviceInfo deviceInfo;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
