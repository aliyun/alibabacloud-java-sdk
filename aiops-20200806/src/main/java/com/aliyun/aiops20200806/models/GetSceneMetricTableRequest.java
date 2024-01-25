// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneMetricTableRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Start")
    public Long start;

    public static GetSceneMetricTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneMetricTableRequest self = new GetSceneMetricTableRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneMetricTableRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetSceneMetricTableRequest setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public GetSceneMetricTableRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetSceneMetricTableRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
