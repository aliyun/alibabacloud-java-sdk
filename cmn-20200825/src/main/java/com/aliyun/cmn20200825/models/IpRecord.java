// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class IpRecord extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 资源一级ID
    @NameInMap("IpRecordId")
    public String ipRecordId;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 业务类型名称
    @NameInMap("BusinessTypeName")
    public String businessTypeName;

    // 创建人
    @NameInMap("Creator")
    public String creator;

    // 工单状态 running complete fail
    @NameInMap("Status")
    public String status;

    // 园区名
    @NameInMap("ZoneName")
    public String zoneName;

    // 备注
    @NameInMap("Description")
    public String description;

    // 地址段
    @NameInMap("IpBlock")
    public String ipBlock;

    // 工单详情
    @NameInMap("Detail")
    public java.util.List<IpRecordDetail> detail;

    // 工单类型 Apply 申请工单 Recycle 释放工单
    @NameInMap("RecodeType")
    public String recodeType;

    // IP地址列表
    @NameInMap("IpCode")
    public java.util.List<String> ipCode;

    public static IpRecord build(java.util.Map<String, ?> map) throws Exception {
        IpRecord self = new IpRecord();
        return TeaModel.build(map, self);
    }

    public IpRecord setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IpRecord setIpRecordId(String ipRecordId) {
        this.ipRecordId = ipRecordId;
        return this;
    }
    public String getIpRecordId() {
        return this.ipRecordId;
    }

    public IpRecord setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public IpRecord setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
        return this;
    }
    public String getBusinessTypeName() {
        return this.businessTypeName;
    }

    public IpRecord setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public IpRecord setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IpRecord setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public IpRecord setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpRecord setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }
    public String getIpBlock() {
        return this.ipBlock;
    }

    public IpRecord setDetail(java.util.List<IpRecordDetail> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.List<IpRecordDetail> getDetail() {
        return this.detail;
    }

    public IpRecord setRecodeType(String recodeType) {
        this.recodeType = recodeType;
        return this;
    }
    public String getRecodeType() {
        return this.recodeType;
    }

    public IpRecord setIpCode(java.util.List<String> ipCode) {
        this.ipCode = ipCode;
        return this;
    }
    public java.util.List<String> getIpCode() {
        return this.ipCode;
    }

    public static class IpRecordDetailZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static IpRecordDetailZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            IpRecordDetailZoneLayer self = new IpRecordDetailZoneLayer();
            return TeaModel.build(map, self);
        }

        public IpRecordDetailZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IpRecordDetailZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class IpRecordDetail extends TeaModel {
        // 申请到的Ip
        @NameInMap("Ip")
        public String ip;

        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 设备端口
        @NameInMap("Port")
        public String port;

        // 对端IP
        @NameInMap("RemoteIp")
        public String remoteIp;

        // 对端设备名称
        @NameInMap("RemoteDeviceName")
        public String remoteDeviceName;

        // 对端设备端口
        @NameInMap("RemotePort")
        public String remotePort;

        // 设备MAC
        @NameInMap("DeviceMac")
        public String deviceMac;

        // 网关
        @NameInMap("Gateway")
        public String gateway;

        // 父地址段列表
        @NameInMap("ParentIpBlocks")
        public java.util.List<String> parentIpBlocks;

        // 园区层级
        @NameInMap("ZoneLayer")
        public java.util.List<IpRecordDetailZoneLayer> zoneLayer;

        public static IpRecordDetail build(java.util.Map<String, ?> map) throws Exception {
            IpRecordDetail self = new IpRecordDetail();
            return TeaModel.build(map, self);
        }

        public IpRecordDetail setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public IpRecordDetail setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public IpRecordDetail setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public IpRecordDetail setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public IpRecordDetail setRemoteDeviceName(String remoteDeviceName) {
            this.remoteDeviceName = remoteDeviceName;
            return this;
        }
        public String getRemoteDeviceName() {
            return this.remoteDeviceName;
        }

        public IpRecordDetail setRemotePort(String remotePort) {
            this.remotePort = remotePort;
            return this;
        }
        public String getRemotePort() {
            return this.remotePort;
        }

        public IpRecordDetail setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public IpRecordDetail setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public IpRecordDetail setParentIpBlocks(java.util.List<String> parentIpBlocks) {
            this.parentIpBlocks = parentIpBlocks;
            return this;
        }
        public java.util.List<String> getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        public IpRecordDetail setZoneLayer(java.util.List<IpRecordDetailZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<IpRecordDetailZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

    }

}
