// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringExpressEscalation extends TeaModel {
    /**
     * <p>The raw expression.</p>
     */
    @NameInMap("rawExpression")
    public String rawExpression;

    /**
     * <p>The severity level.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The number of consecutive times the alert is triggered.</p>
     */
    @NameInMap("times")
    public Integer times;

    public static CloudMonitoringExpressEscalation build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringExpressEscalation self = new CloudMonitoringExpressEscalation();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringExpressEscalation setRawExpression(String rawExpression) {
        this.rawExpression = rawExpression;
        return this;
    }
    public String getRawExpression() {
        return this.rawExpression;
    }

    public CloudMonitoringExpressEscalation setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CloudMonitoringExpressEscalation setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
