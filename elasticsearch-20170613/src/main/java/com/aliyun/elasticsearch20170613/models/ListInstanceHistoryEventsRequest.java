// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("eventCreateEndTime")
    public String eventCreateEndTime;

    @NameInMap("eventCreateStartTime")
    public String eventCreateStartTime;

    @NameInMap("eventCycleStatus")
    public java.util.List<String> eventCycleStatus;

    @NameInMap("eventExecuteEndTime")
    public String eventExecuteEndTime;

    @NameInMap("eventExecuteStartTime")
    public String eventExecuteStartTime;

    @NameInMap("eventFinashEndTime")
    public String eventFinashEndTime;

    @NameInMap("eventFinashStartTime")
    public String eventFinashStartTime;

    @NameInMap("eventLevel")
    public java.util.List<String> eventLevel;

    @NameInMap("eventType")
    public java.util.List<String> eventType;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("nodeIP")
    public String nodeIP;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListInstanceHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryEventsRequest self = new ListInstanceHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryEventsRequest setEventCreateEndTime(String eventCreateEndTime) {
        this.eventCreateEndTime = eventCreateEndTime;
        return this;
    }
    public String getEventCreateEndTime() {
        return this.eventCreateEndTime;
    }

    public ListInstanceHistoryEventsRequest setEventCreateStartTime(String eventCreateStartTime) {
        this.eventCreateStartTime = eventCreateStartTime;
        return this;
    }
    public String getEventCreateStartTime() {
        return this.eventCreateStartTime;
    }

    public ListInstanceHistoryEventsRequest setEventCycleStatus(java.util.List<String> eventCycleStatus) {
        this.eventCycleStatus = eventCycleStatus;
        return this;
    }
    public java.util.List<String> getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    public ListInstanceHistoryEventsRequest setEventExecuteEndTime(String eventExecuteEndTime) {
        this.eventExecuteEndTime = eventExecuteEndTime;
        return this;
    }
    public String getEventExecuteEndTime() {
        return this.eventExecuteEndTime;
    }

    public ListInstanceHistoryEventsRequest setEventExecuteStartTime(String eventExecuteStartTime) {
        this.eventExecuteStartTime = eventExecuteStartTime;
        return this;
    }
    public String getEventExecuteStartTime() {
        return this.eventExecuteStartTime;
    }

    public ListInstanceHistoryEventsRequest setEventFinashEndTime(String eventFinashEndTime) {
        this.eventFinashEndTime = eventFinashEndTime;
        return this;
    }
    public String getEventFinashEndTime() {
        return this.eventFinashEndTime;
    }

    public ListInstanceHistoryEventsRequest setEventFinashStartTime(String eventFinashStartTime) {
        this.eventFinashStartTime = eventFinashStartTime;
        return this;
    }
    public String getEventFinashStartTime() {
        return this.eventFinashStartTime;
    }

    public ListInstanceHistoryEventsRequest setEventLevel(java.util.List<String> eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public java.util.List<String> getEventLevel() {
        return this.eventLevel;
    }

    public ListInstanceHistoryEventsRequest setEventType(java.util.List<String> eventType) {
        this.eventType = eventType;
        return this;
    }
    public java.util.List<String> getEventType() {
        return this.eventType;
    }

    public ListInstanceHistoryEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceHistoryEventsRequest setNodeIP(String nodeIP) {
        this.nodeIP = nodeIP;
        return this;
    }
    public String getNodeIP() {
        return this.nodeIP;
    }

    public ListInstanceHistoryEventsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListInstanceHistoryEventsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
