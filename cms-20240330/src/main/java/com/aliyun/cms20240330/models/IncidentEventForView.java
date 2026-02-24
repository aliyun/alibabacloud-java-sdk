// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEventForView extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1743876600000</p>
     */
    @NameInMap("autoRecoverTime")
    public Long autoRecoverTime;

    @NameInMap("content")
    public CmsEventForView content;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;env&quot;: &quot;prod&quot;, &quot;module&quot;: &quot;payment&quot; }</p>
     */
    @NameInMap("dimension")
    public java.util.Map<String, ?> dimension;

    @NameInMap("eventResource")
    public EventResourceForIncidentView eventResource;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;resourceId&quot;: &quot;i-bp123456&quot;, &quot;severity&quot;: &quot;Critical&quot; }</p>
     */
    @NameInMap("groupBy")
    public java.util.Map<String, ?> groupBy;

    /**
     * <strong>example:</strong>
     * <p>&quot;x1y2z3a4-b5c6-d7e8-f9g0-h1i2j3k4l5m6&quot;</p>
     */
    @NameInMap("incidentEventUuid")
    public String incidentEventUuid;

    /**
     * <strong>example:</strong>
     * <p>&quot;a1b2c3d4-e5f6-7890-1234-567890abcdef&quot;</p>
     */
    @NameInMap("incidentUuid")
    public String incidentUuid;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;project&quot;: &quot;payment-gateway&quot;, &quot;owner&quot;: &quot;ops-team&quot; }</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    /**
     * <strong>example:</strong>
     * <p>1743876000000</p>
     */
    @NameInMap("lastTime")
    public Long lastTime;

    /**
     * <strong>example:</strong>
     * <p>1743876600000</p>
     */
    @NameInMap("recoverTime")
    public Long recoverTime;

    @NameInMap("searchIndex")
    public java.util.List<String> searchIndex;

    /**
     * <strong>example:</strong>
     * <p>&quot;Critical&quot;</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;Critical&quot;: 2, &quot;High&quot;: 1 }</p>
     */
    @NameInMap("severityCountMap")
    public java.util.Map<String, ?> severityCountMap;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("state")
    public Integer state;

    @NameInMap("textIndex")
    public String textIndex;

    /**
     * <strong>example:</strong>
     * <p>1743876000000</p>
     */
    @NameInMap("time")
    public Long time;

    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>&quot;user-abc123&quot;</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>&quot;ws-xyz789&quot;</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static IncidentEventForView build(java.util.Map<String, ?> map) throws Exception {
        IncidentEventForView self = new IncidentEventForView();
        return TeaModel.build(map, self);
    }

    public IncidentEventForView setAutoRecoverTime(Long autoRecoverTime) {
        this.autoRecoverTime = autoRecoverTime;
        return this;
    }
    public Long getAutoRecoverTime() {
        return this.autoRecoverTime;
    }

    public IncidentEventForView setContent(CmsEventForView content) {
        this.content = content;
        return this;
    }
    public CmsEventForView getContent() {
        return this.content;
    }

    public IncidentEventForView setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public IncidentEventForView setDimension(java.util.Map<String, ?> dimension) {
        this.dimension = dimension;
        return this;
    }
    public java.util.Map<String, ?> getDimension() {
        return this.dimension;
    }

    public IncidentEventForView setEventResource(EventResourceForIncidentView eventResource) {
        this.eventResource = eventResource;
        return this;
    }
    public EventResourceForIncidentView getEventResource() {
        return this.eventResource;
    }

    public IncidentEventForView setGroupBy(java.util.Map<String, ?> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.Map<String, ?> getGroupBy() {
        return this.groupBy;
    }

    public IncidentEventForView setIncidentEventUuid(String incidentEventUuid) {
        this.incidentEventUuid = incidentEventUuid;
        return this;
    }
    public String getIncidentEventUuid() {
        return this.incidentEventUuid;
    }

    public IncidentEventForView setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public IncidentEventForView setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public IncidentEventForView setLastTime(Long lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public Long getLastTime() {
        return this.lastTime;
    }

    public IncidentEventForView setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    public IncidentEventForView setSearchIndex(java.util.List<String> searchIndex) {
        this.searchIndex = searchIndex;
        return this;
    }
    public java.util.List<String> getSearchIndex() {
        return this.searchIndex;
    }

    public IncidentEventForView setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public IncidentEventForView setSeverityCountMap(java.util.Map<String, ?> severityCountMap) {
        this.severityCountMap = severityCountMap;
        return this;
    }
    public java.util.Map<String, ?> getSeverityCountMap() {
        return this.severityCountMap;
    }

    public IncidentEventForView setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public IncidentEventForView setTextIndex(String textIndex) {
        this.textIndex = textIndex;
        return this;
    }
    public String getTextIndex() {
        return this.textIndex;
    }

    public IncidentEventForView setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentEventForView setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IncidentEventForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IncidentEventForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
