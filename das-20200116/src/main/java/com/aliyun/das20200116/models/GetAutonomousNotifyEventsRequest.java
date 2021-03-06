// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsRequest extends TeaModel {
    @NameInMap("__context")
    public String context;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("EventContext")
    public String eventContext;

    @NameInMap("Level")
    public String level;

    @NameInMap("MinLevel")
    public String minLevel;

    @NameInMap("PageOffset")
    public String pageOffset;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetAutonomousNotifyEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventsRequest self = new GetAutonomousNotifyEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventsRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public GetAutonomousNotifyEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutonomousNotifyEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetAutonomousNotifyEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAutonomousNotifyEventsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAutonomousNotifyEventsRequest setEventContext(String eventContext) {
        this.eventContext = eventContext;
        return this;
    }
    public String getEventContext() {
        return this.eventContext;
    }

    public GetAutonomousNotifyEventsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetAutonomousNotifyEventsRequest setMinLevel(String minLevel) {
        this.minLevel = minLevel;
        return this;
    }
    public String getMinLevel() {
        return this.minLevel;
    }

    public GetAutonomousNotifyEventsRequest setPageOffset(String pageOffset) {
        this.pageOffset = pageOffset;
        return this;
    }
    public String getPageOffset() {
        return this.pageOffset;
    }

    public GetAutonomousNotifyEventsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
