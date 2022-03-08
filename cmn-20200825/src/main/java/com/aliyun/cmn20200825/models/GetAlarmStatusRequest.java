// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetAlarmStatusRequest extends TeaModel {
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

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 端口集ID
    @NameInMap("PortCollectionId")
    public String portCollectionId;

    // 数据类型
    @NameInMap("Type")
    public String type;

    public static GetAlarmStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmStatusRequest self = new GetAlarmStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmStatusRequest setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    public GetAlarmStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAlarmStatusRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public GetAlarmStatusRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetAlarmStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAlarmStatusRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public GetAlarmStatusRequest setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public GetAlarmStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
