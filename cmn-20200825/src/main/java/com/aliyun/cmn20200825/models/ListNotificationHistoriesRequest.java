// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesRequest extends TeaModel {
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    @NameInMap("AlarmStatus")
    public String alarmStatus;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("End")
    public Long end;

    @NameInMap("EventItemId")
    public String eventItemId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("MonitorItemId")
    public String monitorItemId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NotificationGroupId")
    public String notificationGroupId;

    @NameInMap("NotificationMode")
    public String notificationMode;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    @NameInMap("PortCollectionId")
    public String portCollectionId;

    @NameInMap("Start")
    public Long start;

    @NameInMap("Status")
    public String status;

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

    public ListNotificationHistoriesRequest setEventItemId(String eventItemId) {
        this.eventItemId = eventItemId;
        return this;
    }
    public String getEventItemId() {
        return this.eventItemId;
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
