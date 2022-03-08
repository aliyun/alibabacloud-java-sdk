// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusHistoriesRequest extends TeaModel {
    // 聚合数据ID
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 专线ID
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 结束时间秒级时间戳
    @NameInMap("End")
    public Long end;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 端口集ID
    @NameInMap("PortCollectionId")
    public String portCollectionId;

    // 开始时间秒级时间戳
    @NameInMap("Start")
    public Long start;

    // 类型
    @NameInMap("Type")
    public String type;

    public static ListAlarmStatusHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusHistoriesRequest self = new ListAlarmStatusHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusHistoriesRequest setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    public ListAlarmStatusHistoriesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAlarmStatusHistoriesRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public ListAlarmStatusHistoriesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListAlarmStatusHistoriesRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListAlarmStatusHistoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAlarmStatusHistoriesRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public ListAlarmStatusHistoriesRequest setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public ListAlarmStatusHistoriesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListAlarmStatusHistoriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
