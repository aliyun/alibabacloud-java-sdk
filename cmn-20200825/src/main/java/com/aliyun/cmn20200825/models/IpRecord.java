// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class IpRecord extends TeaModel {
    @NameInMap("BusinessTypeName")
    public String businessTypeName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("Detail")
    public java.util.List<IpRecordDetail> detail;

    @NameInMap("IpBlock")
    public String ipBlock;

    @NameInMap("IpCode")
    public java.util.List<String> ipCode;

    @NameInMap("IpRecordId")
    public String ipRecordId;

    @NameInMap("RecodeType")
    public String recodeType;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("ZoneName")
    public String zoneName;

    public static IpRecord build(java.util.Map<String, ?> map) throws Exception {
        IpRecord self = new IpRecord();
        return TeaModel.build(map, self);
    }

    public IpRecord setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
        return this;
    }
    public String getBusinessTypeName() {
        return this.businessTypeName;
    }

    public IpRecord setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IpRecord setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public IpRecord setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpRecord setDetail(java.util.List<IpRecordDetail> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.List<IpRecordDetail> getDetail() {
        return this.detail;
    }

    public IpRecord setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }
    public String getIpBlock() {
        return this.ipBlock;
    }

    public IpRecord setIpCode(java.util.List<String> ipCode) {
        this.ipCode = ipCode;
        return this;
    }
    public java.util.List<String> getIpCode() {
        return this.ipCode;
    }

    public IpRecord setIpRecordId(String ipRecordId) {
        this.ipRecordId = ipRecordId;
        return this;
    }
    public String getIpRecordId() {
        return this.ipRecordId;
    }

    public IpRecord setRecodeType(String recodeType) {
        this.recodeType = recodeType;
        return this;
    }
    public String getRecodeType() {
        return this.recodeType;
    }

    public IpRecord setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IpRecord setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public IpRecord setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class IpRecordDetailZoneLayer extends TeaModel {
        @NameInMap("Name")
        public String name;

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
        @NameInMap("DeviceMac")
        public String deviceMac;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ParentIpBlocks")
        public java.util.List<String> parentIpBlocks;

        @NameInMap("Port")
        public String port;

        @NameInMap("RemoteDeviceName")
        public String remoteDeviceName;

        @NameInMap("RemoteIp")
        public String remoteIp;

        @NameInMap("RemotePort")
        public String remotePort;

        @NameInMap("ZoneLayer")
        public java.util.List<IpRecordDetailZoneLayer> zoneLayer;

        public static IpRecordDetail build(java.util.Map<String, ?> map) throws Exception {
            IpRecordDetail self = new IpRecordDetail();
            return TeaModel.build(map, self);
        }

        public IpRecordDetail setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public IpRecordDetail setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public IpRecordDetail setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public IpRecordDetail setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public IpRecordDetail setParentIpBlocks(java.util.List<String> parentIpBlocks) {
            this.parentIpBlocks = parentIpBlocks;
            return this;
        }
        public java.util.List<String> getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        public IpRecordDetail setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public IpRecordDetail setRemoteDeviceName(String remoteDeviceName) {
            this.remoteDeviceName = remoteDeviceName;
            return this;
        }
        public String getRemoteDeviceName() {
            return this.remoteDeviceName;
        }

        public IpRecordDetail setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public IpRecordDetail setRemotePort(String remotePort) {
            this.remotePort = remotePort;
            return this;
        }
        public String getRemotePort() {
            return this.remotePort;
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
