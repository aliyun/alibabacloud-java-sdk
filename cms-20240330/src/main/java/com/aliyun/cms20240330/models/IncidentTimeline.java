// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentTimeline extends TeaModel {
    /**
     * <p>Subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("childType")
    public String childType;

    /**
     * <p>Content.</p>
     * 
     * <strong>example:</strong>
     * <p>The operations team has been notified to investigate.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Incident ID.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>Timeline node unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>timeline-001</p>
     */
    @NameInMap("incidentTimelineId")
    public String incidentTimelineId;

    /**
     * <p>Time.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>Parent timeline ID.</p>
     * 
     * <strong>example:</strong>
     * <p>timeline-main-001</p>
     */
    @NameInMap("timelineId")
    public String timelineId;

    /**
     * <p>Title.</p>
     * 
     * <strong>example:</strong>
     * <p>The operations team has been contacted.</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>Type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
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
