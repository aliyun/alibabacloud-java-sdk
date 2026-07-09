// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringCompositeEscalation extends TeaModel {
    /**
     * <p>A single entry in the escalation policy. See the <code>CloudMonitoringCompositeEscalationEntry</code> object for details.</p>
     */
    @NameInMap("escalations")
    public java.util.List<CloudMonitoringCompositeEscalationEntry> escalations;

    /**
     * <p>Specifies the logical relationship for evaluating the conditions of the composite alert rule. Valid values: <code>and</code> and <code>or</code>.</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>Specifies the severity level of the alert. For example: <code>Critical</code>, <code>Warning</code>, and <code>Info</code>.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>Specifies the number of times the alert conditions must be met to trigger this escalation policy.</p>
     */
    @NameInMap("times")
    public Integer times;

    public static CloudMonitoringCompositeEscalation build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringCompositeEscalation self = new CloudMonitoringCompositeEscalation();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringCompositeEscalation setEscalations(java.util.List<CloudMonitoringCompositeEscalationEntry> escalations) {
        this.escalations = escalations;
        return this;
    }
    public java.util.List<CloudMonitoringCompositeEscalationEntry> getEscalations() {
        return this.escalations;
    }

    public CloudMonitoringCompositeEscalation setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public CloudMonitoringCompositeEscalation setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CloudMonitoringCompositeEscalation setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
