// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Ip extends TeaModel {
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    @NameInMap("BusinessTypeName")
    public String businessTypeName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DeviceMac")
    public String deviceMac;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("IpId")
    public String ipId;

    @NameInMap("IpName")
    public String ipName;

    @NameInMap("ParentIpBlock")
    public String parentIpBlock;

    @NameInMap("Port")
    public String port;

    @NameInMap("Status")
    public String status;

    @NameInMap("ZoneLayer")
    public java.util.List<IpZoneLayer> zoneLayer;

    public static Ip build(java.util.Map<String, ?> map) throws Exception {
        Ip self = new Ip();
        return TeaModel.build(map, self);
    }

    public Ip setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public Ip setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
        return this;
    }
    public String getBusinessTypeName() {
        return this.businessTypeName;
    }

    public Ip setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Ip setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
        return this;
    }
    public String getDeviceMac() {
        return this.deviceMac;
    }

    public Ip setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public Ip setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public Ip setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public Ip setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public Ip setParentIpBlock(String parentIpBlock) {
        this.parentIpBlock = parentIpBlock;
        return this;
    }
    public String getParentIpBlock() {
        return this.parentIpBlock;
    }

    public Ip setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public Ip setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Ip setZoneLayer(java.util.List<IpZoneLayer> zoneLayer) {
        this.zoneLayer = zoneLayer;
        return this;
    }
    public java.util.List<IpZoneLayer> getZoneLayer() {
        return this.zoneLayer;
    }

    public static class IpZoneLayer extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static IpZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            IpZoneLayer self = new IpZoneLayer();
            return TeaModel.build(map, self);
        }

        public IpZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IpZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
