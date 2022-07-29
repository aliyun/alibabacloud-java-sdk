// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeviceControlRequest extends TeaModel {
    @NameInMap("ControlRequest")
    public DeviceControlRequestControlRequest controlRequest;

    @NameInMap("DeviceInfo")
    public DeviceControlRequestDeviceInfo deviceInfo;

    public static DeviceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlRequest self = new DeviceControlRequest();
        return TeaModel.build(map, self);
    }

    public DeviceControlRequest setControlRequest(DeviceControlRequestControlRequest controlRequest) {
        this.controlRequest = controlRequest;
        return this;
    }
    public DeviceControlRequestControlRequest getControlRequest() {
        return this.controlRequest;
    }

    public DeviceControlRequest setDeviceInfo(DeviceControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DeviceControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class DeviceControlRequestControlRequest extends TeaModel {
        @NameInMap("Muted")
        public Boolean muted;

        @NameInMap("Volume")
        public Integer volume;

        public static DeviceControlRequestControlRequest build(java.util.Map<String, ?> map) throws Exception {
            DeviceControlRequestControlRequest self = new DeviceControlRequestControlRequest();
            return TeaModel.build(map, self);
        }

        public DeviceControlRequestControlRequest setMuted(Boolean muted) {
            this.muted = muted;
            return this;
        }
        public Boolean getMuted() {
            return this.muted;
        }

        public DeviceControlRequestControlRequest setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class DeviceControlRequestDeviceInfo extends TeaModel {
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

        public static DeviceControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DeviceControlRequestDeviceInfo self = new DeviceControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DeviceControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeviceControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeviceControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeviceControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeviceControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
