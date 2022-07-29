// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PreviousAndNextControlRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public PreviousAndNextControlRequestDeviceInfo deviceInfo;

    @NameInMap("OpenControlPlayingListRequest")
    public PreviousAndNextControlRequestOpenControlPlayingListRequest openControlPlayingListRequest;

    @NameInMap("UserInfo")
    public PreviousAndNextControlRequestUserInfo userInfo;

    public static PreviousAndNextControlRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviousAndNextControlRequest self = new PreviousAndNextControlRequest();
        return TeaModel.build(map, self);
    }

    public PreviousAndNextControlRequest setDeviceInfo(PreviousAndNextControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public PreviousAndNextControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public PreviousAndNextControlRequest setOpenControlPlayingListRequest(PreviousAndNextControlRequestOpenControlPlayingListRequest openControlPlayingListRequest) {
        this.openControlPlayingListRequest = openControlPlayingListRequest;
        return this;
    }
    public PreviousAndNextControlRequestOpenControlPlayingListRequest getOpenControlPlayingListRequest() {
        return this.openControlPlayingListRequest;
    }

    public PreviousAndNextControlRequest setUserInfo(PreviousAndNextControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public PreviousAndNextControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class PreviousAndNextControlRequestDeviceInfo extends TeaModel {
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

        public static PreviousAndNextControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlRequestDeviceInfo self = new PreviousAndNextControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PreviousAndNextControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PreviousAndNextControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PreviousAndNextControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PreviousAndNextControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class PreviousAndNextControlRequestOpenControlPlayingListRequest extends TeaModel {
        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        @NameInMap("IsFromDevice")
        public Boolean isFromDevice;

        public static PreviousAndNextControlRequestOpenControlPlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlRequestOpenControlPlayingListRequest self = new PreviousAndNextControlRequestOpenControlPlayingListRequest();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlRequestOpenControlPlayingListRequest setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public PreviousAndNextControlRequestOpenControlPlayingListRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public PreviousAndNextControlRequestOpenControlPlayingListRequest setIsFromDevice(Boolean isFromDevice) {
            this.isFromDevice = isFromDevice;
            return this;
        }
        public Boolean getIsFromDevice() {
            return this.isFromDevice;
        }

    }

    public static class PreviousAndNextControlRequestUserInfo extends TeaModel {
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

        public static PreviousAndNextControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlRequestUserInfo self = new PreviousAndNextControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PreviousAndNextControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PreviousAndNextControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PreviousAndNextControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PreviousAndNextControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
