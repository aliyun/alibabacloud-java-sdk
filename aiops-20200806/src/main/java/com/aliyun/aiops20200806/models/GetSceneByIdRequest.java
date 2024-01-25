// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneByIdRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("MetricId")
    public Integer metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetSceneByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneByIdRequest self = new GetSceneByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneByIdRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetSceneByIdRequest setMetricId(Integer metricId) {
        this.metricId = metricId;
        return this;
    }
    public Integer getMetricId() {
        return this.metricId;
    }

    public GetSceneByIdRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
