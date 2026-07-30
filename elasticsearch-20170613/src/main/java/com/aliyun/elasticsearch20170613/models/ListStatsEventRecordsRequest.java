// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListStatsEventRecordsRequest extends TeaModel {
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>UserOperator</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>The event level.</p>
     * 
     * <strong>example:</strong>
     * <p>Info</p>
     */
    @NameInMap("level")
    public String level;

    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The event status.</p>
     * 
     * <strong>example:</strong>
     * <p>Executed</p>
     */
    @NameInMap("status")
    public String status;

    public static ListStatsEventRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatsEventRecordsRequest self = new ListStatsEventRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListStatsEventRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListStatsEventRecordsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListStatsEventRecordsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ListStatsEventRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListStatsEventRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
