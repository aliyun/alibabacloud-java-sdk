// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetExtendRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetExtendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExtendRequest self = new GetExtendRequest();
        return TeaModel.build(map, self);
    }

    public GetExtendRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetExtendRequest setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public GetExtendRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
