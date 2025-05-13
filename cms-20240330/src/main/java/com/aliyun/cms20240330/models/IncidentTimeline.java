// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentTimeline extends TeaModel {
    @NameInMap("childType")
    public String childType;

    @NameInMap("content")
    public String content;

    @NameInMap("incidentId")
    public String incidentId;

    @NameInMap("incidentTimelineId")
    public String incidentTimelineId;

    @NameInMap("time")
    public Long time;

    @NameInMap("timelineId")
    public String timelineId;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    @NameInMap("userId")
    public String userId;

    public static IncidentTimeline build(java.util.Map<String, ?> map) throws Exception {
        IncidentTimeline self = new IncidentTimeline();
        return TeaModel.build(map, self);
    }

    public IncidentTimeline setChildType(String childType) {
        this.childType = childType;
        return this;
    }
    public String getChildType() {
        return this.childType;
    }

    public IncidentTimeline setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public IncidentTimeline setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentTimeline setIncidentTimelineId(String incidentTimelineId) {
        this.incidentTimelineId = incidentTimelineId;
        return this;
    }
    public String getIncidentTimelineId() {
        return this.incidentTimelineId;
    }

    public IncidentTimeline setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentTimeline setTimelineId(String timelineId) {
        this.timelineId = timelineId;
        return this;
    }
    public String getTimelineId() {
        return this.timelineId;
    }

    public IncidentTimeline setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IncidentTimeline setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IncidentTimeline setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
