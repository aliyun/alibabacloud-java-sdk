// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEventStruct extends TeaModel {
    /**
     * <p>The time of automatic recovery.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("autoRecoverTime")
    public Long autoRecoverTime;

    /**
     * <p>The content.</p>
     * 
     * <strong>example:</strong>
     * <p>检测到 user-service 实例 i-abc123 的 CPU 使用率达到 95%，已触发告警。</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The dimension.</p>
     */
    @NameInMap("dimension")
    public java.util.Map<String, String> dimension;

    /**
     * <p>The dimension for grouping.</p>
     */
    @NameInMap("groupBy")
    public java.util.Map<String, String> groupBy;

    /**
     * <p>The incident event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>event-001</p>
     */
    @NameInMap("incidentEventId")
    public String incidentEventId;

    /**
     * <p>The incident ID.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>The time of the last occurrence.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("lastTime")
    public Long lastTime;

    /**
     * <p>The time of manual recovery.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("recoverTime")
    public Long recoverTime;

    /**
     * <p>The resource associated with the event.</p>
     */
    @NameInMap("resource")
    public java.util.Map<String, String> resource;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <p>The time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("time")
    public String time;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>用户服务 CPU 使用率过高</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
    @NameInMap("userId")
    public String userId;

    public static IncidentEventStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentEventStruct self = new IncidentEventStruct();
        return TeaModel.build(map, self);
    }

    public IncidentEventStruct setAutoRecoverTime(Long autoRecoverTime) {
        this.autoRecoverTime = autoRecoverTime;
        return this;
    }
    public Long getAutoRecoverTime() {
        return this.autoRecoverTime;
    }

    public IncidentEventStruct setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public IncidentEventStruct setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public IncidentEventStruct setDimension(java.util.Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }
    public java.util.Map<String, String> getDimension() {
        return this.dimension;
    }

    public IncidentEventStruct setGroupBy(java.util.Map<String, String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.Map<String, String> getGroupBy() {
        return this.groupBy;
    }

    public IncidentEventStruct setIncidentEventId(String incidentEventId) {
        this.incidentEventId = incidentEventId;
        return this;
    }
    public String getIncidentEventId() {
        return this.incidentEventId;
    }

    public IncidentEventStruct setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentEventStruct setLastTime(Long lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public Long getLastTime() {
        return this.lastTime;
    }

    public IncidentEventStruct setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    public IncidentEventStruct setResource(java.util.Map<String, String> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.Map<String, String> getResource() {
        return this.resource;
    }

    public IncidentEventStruct setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IncidentEventStruct setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public IncidentEventStruct setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IncidentEventStruct setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
