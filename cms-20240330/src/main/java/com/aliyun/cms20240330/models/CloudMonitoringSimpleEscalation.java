// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringSimpleEscalation extends TeaModel {
    /**
     * <p>The configuration list for multi-level triggers in cloud service monitoring. Each item defines a trigger level (such as Warning or Critical) and includes parameters such as the threshold, duration period, and notification method.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;severity&quot;:&quot;CRITICAL&quot;,&quot;comparisonOperator&quot;:&quot;GT&quot;,&quot;threshold&quot;:&quot;80&quot;,&quot;times&quot;:3}]</p>
     */
    @NameInMap("escalations")
    public java.util.List<CloudMonitoringSimpleEscalationEntry> escalations;

    /**
     * <p>The metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuUsage</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The collection period in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("period")
    public Integer period;

    public static CloudMonitoringSimpleEscalation build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringSimpleEscalation self = new CloudMonitoringSimpleEscalation();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringSimpleEscalation setEscalations(java.util.List<CloudMonitoringSimpleEscalationEntry> escalations) {
        this.escalations = escalations;
        return this;
    }
    public java.util.List<CloudMonitoringSimpleEscalationEntry> getEscalations() {
        return this.escalations;
    }

    public CloudMonitoringSimpleEscalation setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CloudMonitoringSimpleEscalation setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

}
