// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class GetDbfsServerMetricResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.Map<String, ?> metrics;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDbfsServerMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsServerMetricResponseBody self = new GetDbfsServerMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDbfsServerMetricResponseBody setMetrics(java.util.Map<String, ?> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    public GetDbfsServerMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
