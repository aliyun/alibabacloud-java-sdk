// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetLineageRelationshipRequest extends TeaModel {
    /**
     * <p>The lineage relationship ID. You can get this ID from the response to the ListLineageRelationships operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4as3dasf654a</p>
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
