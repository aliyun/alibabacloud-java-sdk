// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsInRangeRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("EventContext")
    public String eventContext;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The urgency level of the events. If you specify this parameter, the MinLevel parameter does not take effect. Valid values:</p>
     * <br>
     * <p>*   **Notice**: events for which the system sends notifications.</p>
     * <p>*   **Optimization**: events that need to be optimized.</p>
     * <p>*   **Warn**: events for which the system sends warnings.</p>
     * <p>*   **Critical**: critical events.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The minimum urgency level of the events. Valid values:</p>
     * <br>
     * <p>*   **Notice**: events for which the system sends notifications.</p>
     * <p>*   **Optimization**: events that need to be optimized.</p>
     * <p>*   **Warn**: events for which the system sends warnings.</p>
     * <p>*   **Critical**: critical events.</p>
     */
    @NameInMap("MinLevel")
    public String minLevel;

    /**
     * <p>The ID of the node in a PolarDB for MySQL cluster. You can call the [DescribeDBClusters](~~98094~~) operation to query the node ID returned by the DBNodeId response parameter.</p>
     * <br>
     * <p>>  You must specify the node ID if your database instance is a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number. The value must be a positive integer. Default value: 1.</p>
     */
    @NameInMap("PageOffset")
    public String pageOffset;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The reserved parameter.</p>
     */
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
