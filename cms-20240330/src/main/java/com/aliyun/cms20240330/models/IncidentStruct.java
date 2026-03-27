// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentStruct extends TeaModel {
    /**
     * <p>Content.</p>
     * 
     * <strong>example:</strong>
     * <p>Detected that the connection count of RDS instance rds-bp1234567890abcdef has reached 1000, triggering an alert.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>List of escalation policies.</p>
     */
    @NameInMap("escalations")
    public java.util.List<IncidentEscalationStruct> escalations;

    /**
     * <p>Incident ID.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>Associated incident contingency plan.</p>
     */
    @NameInMap("incidentPlan")
    public IncidentPlanStruct incidentPlan;

    /**
     * <p>Associated resource details.</p>
     */
    @NameInMap("resource")
    public IncidentResourceDetail resource;

    /**
     * <p>Incident severity level.</p>
     * 
     * <strong>example:</strong>
     * <p>P1</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>Status.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Time.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>Title.</p>
     * 
     * <strong>example:</strong>
     * <p>Excessively high database connection count.</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>User ID.</p>
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
