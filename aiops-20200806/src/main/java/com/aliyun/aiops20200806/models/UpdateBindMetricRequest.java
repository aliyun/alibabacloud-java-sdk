// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBindMetricRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("MetricId")
    public Long metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateBindMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBindMetricRequest self = new UpdateBindMetricRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBindMetricRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBindMetricRequest setMetricId(Long metricId) {
        this.metricId = metricId;
        return this;
    }
    public Long getMetricId() {
        return this.metricId;
    }

    public UpdateBindMetricRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
