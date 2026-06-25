// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LineageRelation extends TeaModel {
    /**
     * <p>The fully qualified name of the target entity in the relationship.</p>
     */
    @NameInMap("DestEntityQualifiedName")
    public String destEntityQualifiedName;

    /**
     * <p>The system-assigned unique identifier (GUID) for the relationship.</p>
     */
    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    /**
     * <p>The fully qualified name of the source entity in the relationship.</p>
     */
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
