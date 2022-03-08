// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesRequest extends TeaModel {
    // 聚合数据ID
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    // 监控状态
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 专线ID
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 查询结束时间戳
    @NameInMap("End")
    public Long end;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 发送内容
    @NameInMap("Message")
    public String message;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 通知组ID
    @NameInMap("NotificationGroupId")
    public String notificationGroupId;

    // 发送方式
    @NameInMap("NotificationMode")
    public String notificationMode;

    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 端口集ID
    @NameInMap("PortCollectionId")
    public String portCollectionId;

    // 查询开始时间戳
    @NameInMap("Start")
    public Long start;

    // 发送状态
    @NameInMap("Status")
    public String status;

    // 类型
    @NameInMap("Type")
    public String type;

    public static ListNotificationHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesRequest self = new ListNotificationHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesRequest setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    public ListNotificationHistoriesRequest setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    public ListNotificationHistoriesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListNotificationHistoriesRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public ListNotificationHistoriesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListNotificationHistoriesRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListNotificationHistoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNotificationHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotificationHistoriesRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNotificationHistoriesRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public ListNotificationHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotificationHistoriesRequest setNotificationGroupId(String notificationGroupId) {
        this.notificationGroupId = notificationGroupId;
        return this;
    }
    public String getNotificationGroupId() {
        return this.notificationGroupId;
    }

    public ListNotificationHistoriesRequest setNotificationMode(String notificationMode) {
        this.notificationMode = notificationMode;
        return this;
    }
    public String getNotificationMode() {
        return this.notificationMode;
    }

    public ListNotificationHistoriesRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public ListNotificationHistoriesRequest setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public ListNotificationHistoriesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListNotificationHistoriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListNotificationHistoriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
