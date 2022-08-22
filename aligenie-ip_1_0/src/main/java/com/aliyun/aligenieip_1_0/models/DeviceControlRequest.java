// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeviceControlRequest extends TeaModel {
    @NameInMap("Payload")
    public DeviceControlRequestPayload payload;

    @NameInMap("UserInfo")
    public DeviceControlRequestUserInfo userInfo;

    public static DeviceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlRequest self = new DeviceControlRequest();
        return TeaModel.build(map, self);
    }

    public DeviceControlRequest setPayload(DeviceControlRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public DeviceControlRequestPayload getPayload() {
        return this.payload;
    }

    public DeviceControlRequest setUserInfo(DeviceControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DeviceControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DeviceControlRequestPayload extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("Current")
        public String current;

        @NameInMap("Device")
        public String device;

        @NameInMap("DeviceNumber")
        public String deviceNumber;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("Location")
        public String location;

        @NameInMap("Properties")
        public java.util.Map<String, String> properties;

        public static DeviceControlRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            DeviceControlRequestPayload self = new DeviceControlRequestPayload();
            return TeaModel.build(map, self);
        }

        public DeviceControlRequestPayload setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DeviceControlRequestPayload setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public DeviceControlRequestPayload setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public DeviceControlRequestPayload setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DeviceControlRequestPayload setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public DeviceControlRequestPayload setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public DeviceControlRequestPayload setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DeviceControlRequestPayload setProperties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

    }

    public static class DeviceControlRequestUserInfo extends TeaModel {
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

        public static DeviceControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DeviceControlRequestUserInfo self = new DeviceControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public DeviceControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public DeviceControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public DeviceControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeviceControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public DeviceControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
