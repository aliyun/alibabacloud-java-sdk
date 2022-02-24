// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryMultiCorpsRelationshipRequest extends TeaModel {
    @NameInMap("CorpNames")
    public java.util.Map<String, ?> corpNames;

    @NameInMap("MaxPath")
    public Integer maxPath;

    public static QueryMultiCorpsRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiCorpsRelationshipRequest self = new QueryMultiCorpsRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public QueryMultiCorpsRelationshipRequest setCorpNames(java.util.Map<String, ?> corpNames) {
        this.corpNames = corpNames;
        return this;
    }
    public java.util.Map<String, ?> getCorpNames() {
        return this.corpNames;
    }

    public QueryMultiCorpsRelationshipRequest setMaxPath(Integer maxPath) {
        this.maxPath = maxPath;
        return this;
    }
    public Integer getMaxPath() {
        return this.maxPath;
    }

}
