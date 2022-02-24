// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryMultiCorpsRelationshipShrinkRequest extends TeaModel {
    @NameInMap("CorpNames")
    public String corpNamesShrink;

    @NameInMap("MaxPath")
    public Integer maxPath;

    public static QueryMultiCorpsRelationshipShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiCorpsRelationshipShrinkRequest self = new QueryMultiCorpsRelationshipShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMultiCorpsRelationshipShrinkRequest setCorpNamesShrink(String corpNamesShrink) {
        this.corpNamesShrink = corpNamesShrink;
        return this;
    }
    public String getCorpNamesShrink() {
        return this.corpNamesShrink;
    }

    public QueryMultiCorpsRelationshipShrinkRequest setMaxPath(Integer maxPath) {
        this.maxPath = maxPath;
        return this;
    }
    public Integer getMaxPath() {
        return this.maxPath;
    }

}
