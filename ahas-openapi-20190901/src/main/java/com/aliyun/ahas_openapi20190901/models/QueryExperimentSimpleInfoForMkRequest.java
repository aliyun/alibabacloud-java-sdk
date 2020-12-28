// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentSimpleInfoForMkRequest extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryExperimentSimpleInfoForMkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentSimpleInfoForMkRequest self = new QueryExperimentSimpleInfoForMkRequest();
        return TeaModel.build(map, self);
    }

    public QueryExperimentSimpleInfoForMkRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public QueryExperimentSimpleInfoForMkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
