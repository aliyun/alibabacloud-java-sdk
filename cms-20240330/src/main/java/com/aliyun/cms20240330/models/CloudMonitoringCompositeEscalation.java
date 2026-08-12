// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringCompositeEscalation extends TeaModel {
    /**
     * <p>The list of multi-condition configurations.</p>
     */
    @NameInMap("escalations")
    public java.util.List<CloudMonitoringCompositeEscalationEntry> escalations;

    /**
     * <p>The logical relationship between conditions (AND/OR).</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The severity level.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The number of consecutive times the conditions are met before the alert is triggered.</p>
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
