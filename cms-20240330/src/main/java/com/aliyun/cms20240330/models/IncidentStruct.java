// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentStruct extends TeaModel {
    /**
     * <p>The content of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>检测到 RDS 实例 rds-bp1234567890abcdef 的连接数达到 1000，已触发告警。</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The list of escalation policies.</p>
     */
    @NameInMap("escalations")
    public java.util.List<IncidentEscalationStruct> escalations;

    /**
     * <p>The unique ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>The associated incident plan.</p>
     */
    @NameInMap("incidentPlan")
    public IncidentPlanStruct incidentPlan;

    /**
     * <p>The details of the associated resource.</p>
     */
    @NameInMap("resource")
    public IncidentResourceDetail resource;

    /**
     * <p>The severity level of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>P1</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The current status.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>The title of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>数据库连接数过高</p>
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

    public static IncidentStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentStruct self = new IncidentStruct();
        return TeaModel.build(map, self);
    }

    public IncidentStruct setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public IncidentStruct setEscalations(java.util.List<IncidentEscalationStruct> escalations) {
        this.escalations = escalations;
        return this;
    }
    public java.util.List<IncidentEscalationStruct> getEscalations() {
        return this.escalations;
    }

    public IncidentStruct setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentStruct setIncidentPlan(IncidentPlanStruct incidentPlan) {
        this.incidentPlan = incidentPlan;
        return this;
    }
    public IncidentPlanStruct getIncidentPlan() {
        return this.incidentPlan;
    }

    public IncidentStruct setResource(IncidentResourceDetail resource) {
        this.resource = resource;
        return this;
    }
    public IncidentResourceDetail getResource() {
        return this.resource;
    }

    public IncidentStruct setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public IncidentStruct setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IncidentStruct setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentStruct setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IncidentStruct setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
