// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpBlockRecordResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 工单类型对象
    @NameInMap("IpBlockRecord")
    public GetIpBlockRecordResponseBodyIpBlockRecord ipBlockRecord;

    public static GetIpBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpBlockRecordResponseBody self = new GetIpBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpBlockRecordResponseBody setIpBlockRecord(GetIpBlockRecordResponseBodyIpBlockRecord ipBlockRecord) {
        this.ipBlockRecord = ipBlockRecord;
        return this;
    }
    public GetIpBlockRecordResponseBodyIpBlockRecord getIpBlockRecord() {
        return this.ipBlockRecord;
    }

    public static class GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer self = new GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer();
            return TeaModel.build(map, self);
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetIpBlockRecordResponseBodyIpBlockRecordDetail extends TeaModel {
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
        public java.util.List<GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer> zoneLayer;

        // 地址段
        @NameInMap("IpBlockCode")
        public String ipBlockCode;

        public static GetIpBlockRecordResponseBodyIpBlockRecordDetail build(java.util.Map<String, ?> map) throws Exception {
            GetIpBlockRecordResponseBodyIpBlockRecordDetail self = new GetIpBlockRecordResponseBodyIpBlockRecordDetail();
            return TeaModel.build(map, self);
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetail setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetail setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetail setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetail setParentIpBlocks(java.util.List<String> parentIpBlocks) {
            this.parentIpBlocks = parentIpBlocks;
            return this;
        }
        public java.util.List<String> getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetail setZoneLayer(java.util.List<GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<GetIpBlockRecordResponseBodyIpBlockRecordDetailZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecordDetail setIpBlockCode(String ipBlockCode) {
            this.ipBlockCode = ipBlockCode;
            return this;
        }
        public String getIpBlockCode() {
            return this.ipBlockCode;
        }

    }

    public static class GetIpBlockRecordResponseBodyIpBlockRecord extends TeaModel {
        // 工单uuid
        @NameInMap("IpBlockRecordId")
        public String ipBlockRecordId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 2020-12-22 10:39:17
        @NameInMap("UpdateTime")
        public String updateTime;

        // 工单名称
        @NameInMap("Title")
        public String title;

        // 创建人
        @NameInMap("Creator")
        public Long creator;

        // 工号
        @NameInMap("WorkNo")
        public String workNo;

        // 公网私网标志 PUBLIC PRIVATE
        @NameInMap("NetType")
        public String netType;

        // 工单状态 running complete fail cancel lock approving
        @NameInMap("Status")
        public String status;

        // 园区名称
        @NameInMap("ZoneName")
        public String zoneName;

        // 工单备注
        @NameInMap("Description")
        public String description;

        // 工单详情
        @NameInMap("Detail")
        public java.util.List<GetIpBlockRecordResponseBodyIpBlockRecordDetail> detail;

        // 工单类型 Apply 申请工单 Recycle 释放工单
        @NameInMap("RecordType")
        public String recordType;

        // 要释放的IP段
        @NameInMap("IpBlockCode")
        public java.util.List<String> ipBlockCode;

        public static GetIpBlockRecordResponseBodyIpBlockRecord build(java.util.Map<String, ?> map) throws Exception {
            GetIpBlockRecordResponseBodyIpBlockRecord self = new GetIpBlockRecordResponseBodyIpBlockRecord();
            return TeaModel.build(map, self);
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setIpBlockRecordId(String ipBlockRecordId) {
            this.ipBlockRecordId = ipBlockRecordId;
            return this;
        }
        public String getIpBlockRecordId() {
            return this.ipBlockRecordId;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setDetail(java.util.List<GetIpBlockRecordResponseBodyIpBlockRecordDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetIpBlockRecordResponseBodyIpBlockRecordDetail> getDetail() {
            return this.detail;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public GetIpBlockRecordResponseBodyIpBlockRecord setIpBlockCode(java.util.List<String> ipBlockCode) {
            this.ipBlockCode = ipBlockCode;
            return this;
        }
        public java.util.List<String> getIpBlockCode() {
            return this.ipBlockCode;
        }

    }

}
