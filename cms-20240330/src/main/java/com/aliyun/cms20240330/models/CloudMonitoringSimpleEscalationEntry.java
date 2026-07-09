// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringSimpleEscalationEntry extends TeaModel {
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    @NameInMap("preCondition")
    public String preCondition;

    @NameInMap("severity")
    public String severity;

    @NameInMap("statistics")
    public String statistics;

    @NameInMap("threshold")
    public String threshold;

    @NameInMap("times")
    public Integer times;

    public static CloudMonitoringSimpleEscalationEntry build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringSimpleEscalationEntry self = new CloudMonitoringSimpleEscalationEntry();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringSimpleEscalationEntry setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public CloudMonitoringSimpleEscalationEntry setPreCondition(String preCondition) {
        this.preCondition = preCondition;
        return this;
    }
    public String getPreCondition() {
        return this.preCondition;
    }

    public CloudMonitoringSimpleEscalationEntry setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CloudMonitoringSimpleEscalationEntry setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public CloudMonitoringSimpleEscalationEntry setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public CloudMonitoringSimpleEscalationEntry setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
