// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentTaskIdByExpIdRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ExpId")
    public String expId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static QueryExperimentTaskIdByExpIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentTaskIdByExpIdRequest self = new QueryExperimentTaskIdByExpIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryExperimentTaskIdByExpIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryExperimentTaskIdByExpIdRequest setExpId(String expId) {
        this.expId = expId;
        return this;
    }
    public String getExpId() {
        return this.expId;
    }

    public QueryExperimentTaskIdByExpIdRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
