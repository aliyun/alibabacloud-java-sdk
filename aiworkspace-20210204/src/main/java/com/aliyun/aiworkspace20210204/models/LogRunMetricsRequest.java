// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LogRunMetricsRequest extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<RunMetric> metrics;

    public static LogRunMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        LogRunMetricsRequest self = new LogRunMetricsRequest();
        return TeaModel.build(map, self);
    }

    public LogRunMetricsRequest setMetrics(java.util.List<RunMetric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<RunMetric> getMetrics() {
        return this.metrics;
    }

}
