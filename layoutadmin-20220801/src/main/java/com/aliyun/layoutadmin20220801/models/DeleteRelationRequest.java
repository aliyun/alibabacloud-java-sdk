// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class DeleteRelationRequest extends TeaModel {
    @NameInMap("RelationId")
    public String relationId;

    public static DeleteRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRelationRequest self = new DeleteRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRelationRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

}
