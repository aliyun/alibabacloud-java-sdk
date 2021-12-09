// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ResultValue extends TeaModel {
    // 设备信息对应的openId
    @NameInMap("DeviceOpenId")
    public String deviceOpenId;

    // 组织id及归一id列表
    @NameInMap("DeviceUnionIds")
    public java.util.List<ResultValueDeviceUnionIds> deviceUnionIds;

    // 设备名称
    @NameInMap("Name")
    public String name;

    // 固件版本
    @NameInMap("FirmwareVersion")
    public String firmwareVersion;

    // 设备MAC地址
    @NameInMap("Mac")
    public String mac;

    // 设备SN
    @NameInMap("Sn")
    public String sn;

    public static ResultValue build(java.util.Map<String, ?> map) throws Exception {
        ResultValue self = new ResultValue();
        return TeaModel.build(map, self);
    }

    public ResultValue setDeviceOpenId(String deviceOpenId) {
        this.deviceOpenId = deviceOpenId;
        return this;
    }
    public String getDeviceOpenId() {
        return this.deviceOpenId;
    }

    public ResultValue setDeviceUnionIds(java.util.List<ResultValueDeviceUnionIds> deviceUnionIds) {
        this.deviceUnionIds = deviceUnionIds;
        return this;
    }
    public java.util.List<ResultValueDeviceUnionIds> getDeviceUnionIds() {
        return this.deviceUnionIds;
    }

    public ResultValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResultValue setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public ResultValue setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public ResultValue setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public static class ResultValueDeviceUnionIds extends TeaModel {
        // 组织id，
        @NameInMap("OrganizationId")
        public String organizationId;

        // 组织id对应的归一id
        @NameInMap("DeviceUnionId")
        public String deviceUnionId;

        public static ResultValueDeviceUnionIds build(java.util.Map<String, ?> map) throws Exception {
            ResultValueDeviceUnionIds self = new ResultValueDeviceUnionIds();
            return TeaModel.build(map, self);
        }

        public ResultValueDeviceUnionIds setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ResultValueDeviceUnionIds setDeviceUnionId(String deviceUnionId) {
            this.deviceUnionId = deviceUnionId;
            return this;
        }
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

    }

}
