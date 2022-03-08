// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class IpBlockRecord extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 创建人
    @NameInMap("Creator")
    public Long creator;

    // 工单备注
    @NameInMap("Description")
    public String description;

    // 工单详情
    @NameInMap("Detail")
    public java.util.List<IpBlockRecordDetail> detail;

    // 要释放的IP段
    @NameInMap("IpBlockCode")
    public java.util.List<String> ipBlockCode;

    // 工单uuid
    @NameInMap("IpBlockRecordId")
    public String ipBlockRecordId;

    // 公网私网标志 PUBLIC PRIVATE
    @NameInMap("NetType")
    public String netType;

    // 工单类型 Apply 申请工单 Recycle 释放工单
    @NameInMap("RecordType")
    public String recordType;

    // 工单状态 running complete fail cancel lock approving
    @NameInMap("Status")
    public String status;

    // 工单名称
    @NameInMap("Title")
    public String title;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 工号
    @NameInMap("WorkNo")
    public String workNo;

    // 园区名称
    @NameInMap("ZoneName")
    public String zoneName;

    public static IpBlockRecord build(java.util.Map<String, ?> map) throws Exception {
        IpBlockRecord self = new IpBlockRecord();
        return TeaModel.build(map, self);
    }

    public IpBlockRecord setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IpBlockRecord setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public IpBlockRecord setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpBlockRecord setDetail(java.util.List<IpBlockRecordDetail> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.List<IpBlockRecordDetail> getDetail() {
        return this.detail;
    }

    public IpBlockRecord setIpBlockCode(java.util.List<String> ipBlockCode) {
        this.ipBlockCode = ipBlockCode;
        return this;
    }
    public java.util.List<String> getIpBlockCode() {
        return this.ipBlockCode;
    }

    public IpBlockRecord setIpBlockRecordId(String ipBlockRecordId) {
        this.ipBlockRecordId = ipBlockRecordId;
        return this;
    }
    public String getIpBlockRecordId() {
        return this.ipBlockRecordId;
    }

    public IpBlockRecord setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public IpBlockRecord setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public IpBlockRecord setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IpBlockRecord setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IpBlockRecord setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public IpBlockRecord setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public IpBlockRecord setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class IpBlockRecordDetailZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static IpBlockRecordDetailZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            IpBlockRecordDetailZoneLayer self = new IpBlockRecordDetailZoneLayer();
            return TeaModel.build(map, self);
        }

        public IpBlockRecordDetailZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IpBlockRecordDetailZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class IpBlockRecordDetail extends TeaModel {
        // 业务类型
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 网关
        @NameInMap("Gateway")
        public String gateway;

        // 父地址段列表
        @NameInMap("ParentIpBlocks")
        public java.util.List<String> parentIpBlocks;

        // 园区层级
        @NameInMap("ZoneLayer")
        public java.util.List<IpBlockRecordDetailZoneLayer> zoneLayer;

        public static IpBlockRecordDetail build(java.util.Map<String, ?> map) throws Exception {
            IpBlockRecordDetail self = new IpBlockRecordDetail();
            return TeaModel.build(map, self);
        }

        public IpBlockRecordDetail setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public IpBlockRecordDetail setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public IpBlockRecordDetail setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public IpBlockRecordDetail setParentIpBlocks(java.util.List<String> parentIpBlocks) {
            this.parentIpBlocks = parentIpBlocks;
            return this;
        }
        public java.util.List<String> getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        public IpBlockRecordDetail setZoneLayer(java.util.List<IpBlockRecordDetailZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<IpBlockRecordDetailZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

    }

}
