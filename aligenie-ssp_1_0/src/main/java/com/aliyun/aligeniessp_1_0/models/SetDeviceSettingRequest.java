// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SetDeviceSettingRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public SetDeviceSettingRequestDeviceInfo deviceInfo;

    @NameInMap("Key")
    public String key;

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
