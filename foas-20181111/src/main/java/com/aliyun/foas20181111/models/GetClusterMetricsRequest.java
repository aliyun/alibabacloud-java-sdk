// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterMetricsRequest extends TeaModel {
    @NameInMap("metricJson")
    public String metricJson;

    public static GetClusterMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterMetricsRequest self = new GetClusterMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterMetricsRequest setMetricJson(String metricJson) {
        this.metricJson = metricJson;
        return this;
    }
    public String getMetricJson() {
        return this.metricJson;
    }

}
