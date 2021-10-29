// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsInRangeRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventContext")
    public String eventContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Level")
    public String level;

    @NameInMap("MinLevel")
    public String minLevel;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("PageOffset")
    public String pageOffset;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("__context")
    public String context;

    public static GetAutonomousNotifyEventsInRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventsInRangeRequest self = new GetAutonomousNotifyEventsInRangeRequest();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventsInRangeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAutonomousNotifyEventsInRangeRequest setEventContext(String eventContext) {
        this.eventContext = eventContext;
        return this;
    }
    public String getEventContext() {
        return this.eventContext;
    }

    public GetAutonomousNotifyEventsInRangeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutonomousNotifyEventsInRangeRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetAutonomousNotifyEventsInRangeRequest setMinLevel(String minLevel) {
        this.minLevel = minLevel;
        return this;
    }
    public String getMinLevel() {
        return this.minLevel;
    }

    public GetAutonomousNotifyEventsInRangeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAutonomousNotifyEventsInRangeRequest setPageOffset(String pageOffset) {
        this.pageOffset = pageOffset;
        return this;
    }
    public String getPageOffset() {
        return this.pageOffset;
    }

    public GetAutonomousNotifyEventsInRangeRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetAutonomousNotifyEventsInRangeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetAutonomousNotifyEventsInRangeRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
