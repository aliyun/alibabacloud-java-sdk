// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LineageRelation extends TeaModel {
    @NameInMap("DestEntityQualifiedName")
    public String destEntityQualifiedName;

    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    @NameInMap("SrcEntityQualifiedName")
    public String srcEntityQualifiedName;

    public static LineageRelation build(java.util.Map<String, ?> map) throws Exception {
        LineageRelation self = new LineageRelation();
        return TeaModel.build(map, self);
    }

    public LineageRelation setDestEntityQualifiedName(String destEntityQualifiedName) {
        this.destEntityQualifiedName = destEntityQualifiedName;
        return this;
    }
    public String getDestEntityQualifiedName() {
        return this.destEntityQualifiedName;
    }

    public LineageRelation setRelationshipGuid(String relationshipGuid) {
        this.relationshipGuid = relationshipGuid;
        return this;
    }
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    public LineageRelation setSrcEntityQualifiedName(String srcEntityQualifiedName) {
        this.srcEntityQualifiedName = srcEntityQualifiedName;
        return this;
    }
    public String getSrcEntityQualifiedName() {
        return this.srcEntityQualifiedName;
    }

}
