// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetTwoCorpsRelationshipRequest extends TeaModel {
    @NameInMap("EndCropName")
    public String endCropName;

    @NameInMap("FromCorpName")
    public String fromCorpName;

    @NameInMap("MaxPath")
    public Integer maxPath;

    public static GetTwoCorpsRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTwoCorpsRelationshipRequest self = new GetTwoCorpsRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public GetTwoCorpsRelationshipRequest setEndCropName(String endCropName) {
        this.endCropName = endCropName;
        return this;
    }
    public String getEndCropName() {
        return this.endCropName;
    }

    public GetTwoCorpsRelationshipRequest setFromCorpName(String fromCorpName) {
        this.fromCorpName = fromCorpName;
        return this;
    }
    public String getFromCorpName() {
        return this.fromCorpName;
    }

    public GetTwoCorpsRelationshipRequest setMaxPath(Integer maxPath) {
        this.maxPath = maxPath;
        return this;
    }
    public Integer getMaxPath() {
        return this.maxPath;
    }

}
