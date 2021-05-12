// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetChildrenComponentVersionParametersListRequest extends TeaModel {
    @NameInMap("relation_id")
    public String relationId;

    public static GetChildrenComponentVersionParametersListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChildrenComponentVersionParametersListRequest self = new GetChildrenComponentVersionParametersListRequest();
        return TeaModel.build(map, self);
    }

    public GetChildrenComponentVersionParametersListRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

}
