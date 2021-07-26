// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Ip extends TeaModel {
    // 资源一级ID
    @NameInMap("IpId")
    public String ipId;

    // 资源名称
    @NameInMap("IpName")
    public String ipName;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // IP地址
    @NameInMap("IpAddress")
    public String ipAddress;

    // 地址段
    @NameInMap("ParentIpBlock")
    public String parentIpBlock;

    // 业务类型UID
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 业务类型名称
    @NameInMap("BusinessTypeName")
    public String businessTypeName;

    // 状态 using available lock
    @NameInMap("Status")
    public String status;

    // 设备名称
    @NameInMap("DeviceName")
    public String deviceName;

    // 设备端口名称
    @NameInMap("Port")
    public String port;

    // 设备MAC
    @NameInMap("DeviceMac")
    public String deviceMac;

    // 园区层级
    @NameInMap("ZoneLayer")
    public java.util.List<IpZoneLayer> zoneLayer;

    public static Ip build(java.util.Map<String, ?> map) throws Exception {
        Ip self = new Ip();
        return TeaModel.build(map, self);
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

    public Ip setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Ip setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public Ip setParentIpBlock(String parentIpBlock) {
        this.parentIpBlock = parentIpBlock;
        return this;
    }
    public String getParentIpBlock() {
        return this.parentIpBlock;
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

    public Ip setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Ip setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public Ip setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public Ip setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
        return this;
    }
    public String getDeviceMac() {
        return this.deviceMac;
    }

    public Ip setZoneLayer(java.util.List<IpZoneLayer> zoneLayer) {
        this.zoneLayer = zoneLayer;
        return this;
    }
    public java.util.List<IpZoneLayer> getZoneLayer() {
        return this.zoneLayer;
    }

    public static class IpZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
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
