// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentTimelineForView extends TeaModel {
    /**
     * <p>The type of status change.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Open -&gt; In Progress&quot;</p>
     */
    @NameInMap("changeType")
    public String changeType;

    /**
     * <p>The content of the timeline event.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;action&quot;:&quot;restart&quot;,&quot;resourceId&quot;:&quot;i-bp123456&quot;}&quot;</p>
     */
    @NameInMap("content")
    public Object content;

    /**
     * <p>The unique identifier of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;a1b2c3d4-e5f6-7890-1234-567890abcdef&quot;</p>
     */
    @NameInMap("incidentUuid")
    public String incidentUuid;

    /**
     * <p>Information about the operator.</p>
     */
    @NameInMap("operator")
    public ContactForIncidentView operator;

    /**
     * <p>The UNIX timestamp when the timeline event occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>1743876000000</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>The unique identifier of the timeline record.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;x1y2z3a4-b5c6-d7e8-f9g0-h1i2j3k4l5m6&quot;</p>
     */
    @NameInMap("timelineUuid")
    public String timelineUuid;

    /**
     * <p>The title of the timeline event.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;故障已升级至值班主管&quot;</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The type of the timeline event.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Comment&quot;</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;user-abc123&quot;</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ws-xyz789&quot;</p>
     */
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
