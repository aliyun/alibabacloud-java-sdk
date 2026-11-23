// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LineageRelation extends TeaModel {
    /**
     * <p>The unique qualified name of the destination lineage entity.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.demo_project.training_output</p>
     */
    @NameInMap("DestEntityQualifiedName")
    public String destEntityQualifiedName;

    /**
     * <p>The globally unique identifier of the lineage relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>0f94c587-e926-48c8-9efe-bf9f8d9aa5c2</p>
     */
    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    /**
     * <p>The unique qualified name of the source lineage entity.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.demo_project.training_data</p>
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
