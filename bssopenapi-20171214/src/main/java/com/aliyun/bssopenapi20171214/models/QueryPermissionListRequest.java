// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPermissionListRequest extends TeaModel {
    /**
     * <p>The relationship ID. Obtain this ID from the RelationId parameter in the response of the QueryRelationList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51463</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    public static QueryPermissionListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPermissionListRequest self = new QueryPermissionListRequest();
        return TeaModel.build(map, self);
    }

    public QueryPermissionListRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

}
