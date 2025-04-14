// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetLineageRelationshipRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110xxxx:custom-table.xxxxx:maxcompute-table.project.test_big_lineage_080901:custom-sqlxx.00001</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetLineageRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLineageRelationshipRequest self = new GetLineageRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public GetLineageRelationshipRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
