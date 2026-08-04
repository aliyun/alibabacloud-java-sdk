// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ResultValue extends TeaModel {
    /**
     * <p>The openId corresponding to the device.</p>
     * 
     * <strong>example:</strong>
     * <p>A963*0158</p>
     */
    @NameInMap("DeviceOpenId")
    public String deviceOpenId;

    /**
     * <p>The organization ID and UnionId information corresponding to the device.</p>
     */
    @NameInMap("DeviceUnionIds")
    public java.util.List<ResultValueDeviceUnionIds> deviceUnionIds;

    /**
     * <p>The name of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>我的设备</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The firmware version of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.3</p>
     */
    @NameInMap("FirmwareVersion")
    public String firmwareVersion;

    /**
     * <p>The MAC address of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>b4:xx:xx:xx:65:2b</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The SN information of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>1200xx048</p>
     */
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
        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The UnionId of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>1553*B0C3</p>
         */
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
