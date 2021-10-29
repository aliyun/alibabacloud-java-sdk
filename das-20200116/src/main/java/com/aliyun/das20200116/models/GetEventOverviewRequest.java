// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventOverviewRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MinLevel")
    public String minLevel;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TicketId")
    public String ticketId;

    public static GetEventOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventOverviewRequest self = new GetEventOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetEventOverviewRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetEventOverviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEventOverviewRequest setMinLevel(String minLevel) {
        this.minLevel = minLevel;
        return this;
    }
    public String getMinLevel() {
        return this.minLevel;
    }

    public GetEventOverviewRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetEventOverviewRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public GetEventOverviewRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
