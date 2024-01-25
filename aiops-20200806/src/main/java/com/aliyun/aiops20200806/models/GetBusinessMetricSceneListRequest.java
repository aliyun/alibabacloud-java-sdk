// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricSceneListRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessMetricSceneListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricSceneListRequest self = new GetBusinessMetricSceneListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricSceneListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetBusinessMetricSceneListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
