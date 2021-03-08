// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetAlarmStatusRequest extends TeaModel {
    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 数据类型
    @NameInMap("Type")
    public String type;

    // 聚合数据ID
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    // 专线ID
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAlarmStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmStatusRequest self = new GetAlarmStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmStatusRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetAlarmStatusRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public GetAlarmStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetAlarmStatusRequest setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    public GetAlarmStatusRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public GetAlarmStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
