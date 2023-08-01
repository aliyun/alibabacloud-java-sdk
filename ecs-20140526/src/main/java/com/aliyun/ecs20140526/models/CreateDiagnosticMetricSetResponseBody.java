// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticMetricSetResponseBody extends TeaModel {
    @NameInMap("MetricSetId")
    public String metricSetId;

    /**
     * <p>The ID of the diagnostic metric set, which is the unique identifier of the set.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiagnosticMetricSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticMetricSetResponseBody self = new CreateDiagnosticMetricSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticMetricSetResponseBody setMetricSetId(String metricSetId) {
        this.metricSetId = metricSetId;
        return this;
    }
    public String getMetricSetId() {
        return this.metricSetId;
    }

    public CreateDiagnosticMetricSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
