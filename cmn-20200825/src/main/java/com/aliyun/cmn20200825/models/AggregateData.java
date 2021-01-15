// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AggregateData extends TeaModel {
    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 数据项
    @NameInMap("DataItem")
    public String dataItem;

    // 聚合设备ID列表
    @NameInMap("DeviceIdList")
    public java.util.List<String> deviceIdList;

    // 聚合方式列表
    @NameInMap("AggregateModeList")
    public java.util.List<String> aggregateModeList;

    // 聚合数据名称
    @NameInMap("AggregateDataName")
    public String aggregateDataName;

    // 描述
    @NameInMap("AggregateDataDescription")
    public String aggregateDataDescription;

    // 是否聚合全部设备
    @NameInMap("IsAllDevice")
    public Integer isAllDevice;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 聚合数据ID
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    public static AggregateData build(java.util.Map<String, ?> map) throws Exception {
        AggregateData self = new AggregateData();
        return TeaModel.build(map, self);
    }

    public AggregateData setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AggregateData setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AggregateData setDataItem(String dataItem) {
        this.dataItem = dataItem;
        return this;
    }
    public String getDataItem() {
        return this.dataItem;
    }

    public AggregateData setDeviceIdList(java.util.List<String> deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public java.util.List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    public AggregateData setAggregateModeList(java.util.List<String> aggregateModeList) {
        this.aggregateModeList = aggregateModeList;
        return this;
    }
    public java.util.List<String> getAggregateModeList() {
        return this.aggregateModeList;
    }

    public AggregateData setAggregateDataName(String aggregateDataName) {
        this.aggregateDataName = aggregateDataName;
        return this;
    }
    public String getAggregateDataName() {
        return this.aggregateDataName;
    }

    public AggregateData setAggregateDataDescription(String aggregateDataDescription) {
        this.aggregateDataDescription = aggregateDataDescription;
        return this;
    }
    public String getAggregateDataDescription() {
        return this.aggregateDataDescription;
    }

    public AggregateData setIsAllDevice(Integer isAllDevice) {
        this.isAllDevice = isAllDevice;
        return this;
    }
    public Integer getIsAllDevice() {
        return this.isAllDevice;
    }

    public AggregateData setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public AggregateData setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

}
