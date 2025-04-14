// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationshipRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110xxxx:custom-table.xxxxx:maxcompute-table.project.test_big_lineage_080901:custom-sqlxx.00001</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteLineageRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationshipRequest self = new DeleteLineageRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationshipRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
