// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpRecordResponseBody extends TeaModel {
    // 工单类型对象
    @NameInMap("IpRecord")
    public GetIpRecordResponseBodyIpRecord ipRecord;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetIpRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpRecordResponseBody self = new GetIpRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpRecordResponseBody setIpRecord(GetIpRecordResponseBodyIpRecord ipRecord) {
        this.ipRecord = ipRecord;
        return this;
    }
    public GetIpRecordResponseBodyIpRecord getIpRecord() {
        return this.ipRecord;
    }

    public GetIpRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIpRecordResponseBodyIpRecordDetailZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static GetIpRecordResponseBodyIpRecordDetailZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            GetIpRecordResponseBodyIpRecordDetailZoneLayer self = new GetIpRecordResponseBodyIpRecordDetailZoneLayer();
            return TeaModel.build(map, self);
        }

        public GetIpRecordResponseBodyIpRecordDetailZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIpRecordResponseBodyIpRecordDetailZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetIpRecordResponseBodyIpRecordDetail extends TeaModel {
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
        public java.util.List<GetIpRecordResponseBodyIpRecordDetailZoneLayer> zoneLayer;

        public static GetIpRecordResponseBodyIpRecordDetail build(java.util.Map<String, ?> map) throws Exception {
            GetIpRecordResponseBodyIpRecordDetail self = new GetIpRecordResponseBodyIpRecordDetail();
            return TeaModel.build(map, self);
        }

        public GetIpRecordResponseBodyIpRecordDetail setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetIpRecordResponseBodyIpRecordDetail setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetIpRecordResponseBodyIpRecordDetail setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetIpRecordResponseBodyIpRecordDetail setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public GetIpRecordResponseBodyIpRecordDetail setRemoteDeviceName(String remoteDeviceName) {
            this.remoteDeviceName = remoteDeviceName;
            return this;
        }
        public String getRemoteDeviceName() {
            return this.remoteDeviceName;
        }

        public GetIpRecordResponseBodyIpRecordDetail setRemotePort(String remotePort) {
            this.remotePort = remotePort;
            return this;
        }
        public String getRemotePort() {
            return this.remotePort;
        }

        public GetIpRecordResponseBodyIpRecordDetail setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public GetIpRecordResponseBodyIpRecordDetail setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public GetIpRecordResponseBodyIpRecordDetail setParentIpBlocks(java.util.List<String> parentIpBlocks) {
            this.parentIpBlocks = parentIpBlocks;
            return this;
        }
        public java.util.List<String> getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        public GetIpRecordResponseBodyIpRecordDetail setZoneLayer(java.util.List<GetIpRecordResponseBodyIpRecordDetailZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<GetIpRecordResponseBodyIpRecordDetailZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

    }

    public static class GetIpRecordResponseBodyIpRecord extends TeaModel {
        // 工单状态 running complete fail
        @NameInMap("Status")
        public String status;

        // 备注
        @NameInMap("Description")
        public String description;

        // IP地址列表
        @NameInMap("IpCode")
        public java.util.List<String> ipCode;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 创建人
        @NameInMap("Creator")
        public String creator;

        // 资源一级ID
        @NameInMap("IpRecordId")
        public String ipRecordId;

        // 资源名称
        @NameInMap("IpRecordName")
        public String ipRecordName;

        // 园区名
        @NameInMap("ZoneName")
        public String zoneName;

        // 业务类型名称
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        // 工单类型 Apply 申请工单 Recycle 释放工单
        @NameInMap("RecodeType")
        public String recodeType;

        // 地址段
        @NameInMap("IpBlock")
        public String ipBlock;

        // 工单详情
        @NameInMap("Detail")
        public java.util.List<GetIpRecordResponseBodyIpRecordDetail> detail;

        public static GetIpRecordResponseBodyIpRecord build(java.util.Map<String, ?> map) throws Exception {
            GetIpRecordResponseBodyIpRecord self = new GetIpRecordResponseBodyIpRecord();
            return TeaModel.build(map, self);
        }

        public GetIpRecordResponseBodyIpRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIpRecordResponseBodyIpRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIpRecordResponseBodyIpRecord setIpCode(java.util.List<String> ipCode) {
            this.ipCode = ipCode;
            return this;
        }
        public java.util.List<String> getIpCode() {
            return this.ipCode;
        }

        public GetIpRecordResponseBodyIpRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIpRecordResponseBodyIpRecord setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetIpRecordResponseBodyIpRecord setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetIpRecordResponseBodyIpRecord setIpRecordId(String ipRecordId) {
            this.ipRecordId = ipRecordId;
            return this;
        }
        public String getIpRecordId() {
            return this.ipRecordId;
        }

        public GetIpRecordResponseBodyIpRecord setIpRecordName(String ipRecordName) {
            this.ipRecordName = ipRecordName;
            return this;
        }
        public String getIpRecordName() {
            return this.ipRecordName;
        }

        public GetIpRecordResponseBodyIpRecord setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

        public GetIpRecordResponseBodyIpRecord setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public GetIpRecordResponseBodyIpRecord setRecodeType(String recodeType) {
            this.recodeType = recodeType;
            return this;
        }
        public String getRecodeType() {
            return this.recodeType;
        }

        public GetIpRecordResponseBodyIpRecord setIpBlock(String ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }
        public String getIpBlock() {
            return this.ipBlock;
        }

        public GetIpRecordResponseBodyIpRecord setDetail(java.util.List<GetIpRecordResponseBodyIpRecordDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetIpRecordResponseBodyIpRecordDetail> getDetail() {
            return this.detail;
        }

    }

}
