// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusRequest extends TeaModel {
    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 物理空间
    @NameInMap("Space")
    public String space;

    // 设备形态
    @NameInMap("DeviceForm")
    public String deviceForm;

    // 告警状态
    @NameInMap("Status")
    public String status;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 数据类型
    @NameInMap("Type")
    public String type;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListAlarmStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusRequest self = new ListAlarmStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmStatusRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public ListAlarmStatusRequest setDeviceForm(String deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public String getDeviceForm() {
        return this.deviceForm;
    }

    public ListAlarmStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAlarmStatusRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListAlarmStatusRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public ListAlarmStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListAlarmStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
