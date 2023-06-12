// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationRequest extends TeaModel {
    @NameInMap("DestEntityQualifiedName")
    public String destEntityQualifiedName;

    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    @NameInMap("SrcEntityQualifiedName")
    public String srcEntityQualifiedName;

    public static DeleteLineageRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationRequest self = new DeleteLineageRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationRequest setDestEntityQualifiedName(String destEntityQualifiedName) {
        this.destEntityQualifiedName = destEntityQualifiedName;
        return this;
    }
    public String getDestEntityQualifiedName() {
        return this.destEntityQualifiedName;
    }

    public DeleteLineageRelationRequest setRelationshipGuid(String relationshipGuid) {
        this.relationshipGuid = relationshipGuid;
        return this;
    }
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    public DeleteLineageRelationRequest setSrcEntityQualifiedName(String srcEntityQualifiedName) {
        this.srcEntityQualifiedName = srcEntityQualifiedName;
        return this;
    }
    public String getSrcEntityQualifiedName() {
        return this.srcEntityQualifiedName;
    }

}
