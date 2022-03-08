// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListMonitorDataRequest extends TeaModel {
    // 聚合数据ID
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 数据项
    @NameInMap("DataItem")
    public String dataItem;

    // 数据类型
    @NameInMap("DataType")
    public String dataType;

    // 专线ID
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 结束时间
    @NameInMap("End")
    public Long end;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // key
    @NameInMap("Key")
    public String key;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 端口集ID
    @NameInMap("PortCollectionId")
    public String portCollectionId;

    // 开始时间
    @NameInMap("Start")
    public Long start;

    public static ListMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorDataRequest self = new ListMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public ListMonitorDataRequest setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    public ListMonitorDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMonitorDataRequest setDataItem(String dataItem) {
        this.dataItem = dataItem;
        return this;
    }
    public String getDataItem() {
        return this.dataItem;
    }

    public ListMonitorDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ListMonitorDataRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public ListMonitorDataRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListMonitorDataRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListMonitorDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMonitorDataRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListMonitorDataRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public ListMonitorDataRequest setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public ListMonitorDataRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
