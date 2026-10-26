// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringCompositeEscalation extends TeaModel {
    /**
     * <p>The multi-condition configuration list for cloud service monitoring composite triggers, which includes multiple sub-trigger conditions combined by logical operators (AND/OR) to determine whether to trigger an alert.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;metricName&quot;:&quot;cpuUsage&quot;,&quot;comparisonOperator&quot;:&quot;GT&quot;,&quot;threshold&quot;:&quot;80&quot;,&quot;period&quot;:60}]</p>
     */
    @NameInMap("escalations")
    public java.util.List<CloudMonitoringCompositeEscalationEntry> escalations;

    /**
     * <p>The logical relationship between conditions (AND/OR).</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The severity level.</p>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The consecutive trigger count.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
