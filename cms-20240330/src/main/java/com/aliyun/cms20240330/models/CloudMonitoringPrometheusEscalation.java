// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringPrometheusEscalation extends TeaModel {
    /**
     * <p>The PromQL expression that defines the alert condition. This parameter is required.</p>
     */
    @NameInMap("promQl")
    public String promQl;

    /**
     * <p>The severity of the alert that triggers the escalation. This parameter is required.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The number of consecutive times the condition must be met to trigger an escalation. This parameter is required.</p>
     */
    @NameInMap("times")
    public Integer times;

    public static CloudMonitoringPrometheusEscalation build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringPrometheusEscalation self = new CloudMonitoringPrometheusEscalation();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringPrometheusEscalation setPromQl(String promQl) {
        this.promQl = promQl;
        return this;
    }
    public String getPromQl() {
        return this.promQl;
    }

    public CloudMonitoringPrometheusEscalation setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CloudMonitoringPrometheusEscalation setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
