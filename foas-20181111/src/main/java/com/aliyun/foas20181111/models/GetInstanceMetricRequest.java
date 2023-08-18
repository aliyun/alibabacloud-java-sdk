// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceMetricRequest extends TeaModel {
    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("metricJson")
    public String metricJson;

    public static GetInstanceMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricRequest self = new GetInstanceMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceMetricRequest setMetricJson(String metricJson) {
        this.metricJson = metricJson;
        return this;
    }
    public String getMetricJson() {
        return this.metricJson;
    }

}
