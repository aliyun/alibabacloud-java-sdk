// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class IpBlockRecord extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Creator")
    public Long creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("Detail")
    public java.util.List<IpBlockRecordDetail> detail;

    @NameInMap("IpBlockCode")
    public java.util.List<String> ipBlockCode;

    @NameInMap("IpBlockRecordId")
    public String ipBlockRecordId;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("RecordType")
    public String recordType;

    @NameInMap("Status")
    public String status;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("WorkNo")
    public String workNo;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("ParentIpBlocks")
        public java.util.List<String> parentIpBlocks;

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
