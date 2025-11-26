// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentTimelineForView extends TeaModel {
    @NameInMap("changeType")
    public String changeType;

    @NameInMap("content")
    public Object content;

    @NameInMap("incidentUuid")
    public String incidentUuid;

    @NameInMap("operator")
    public ContactForIncidentView operator;

    @NameInMap("time")
    public Long time;

    @NameInMap("timelineUuid")
    public String timelineUuid;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    @NameInMap("userId")
    public String userId;

    @NameInMap("workspace")
    public String workspace;

    public static IncidentTimelineForView build(java.util.Map<String, ?> map) throws Exception {
        IncidentTimelineForView self = new IncidentTimelineForView();
        return TeaModel.build(map, self);
    }

    public IncidentTimelineForView setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public IncidentTimelineForView setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public IncidentTimelineForView setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public IncidentTimelineForView setOperator(ContactForIncidentView operator) {
        this.operator = operator;
        return this;
    }
    public ContactForIncidentView getOperator() {
        return this.operator;
    }

    public IncidentTimelineForView setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentTimelineForView setTimelineUuid(String timelineUuid) {
        this.timelineUuid = timelineUuid;
        return this;
    }
    public String getTimelineUuid() {
        return this.timelineUuid;
    }

    public IncidentTimelineForView setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IncidentTimelineForView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IncidentTimelineForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IncidentTimelineForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
