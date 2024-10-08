// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationRequest extends TeaModel {
    /**
     * <p>The unique identifier of the destination entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-report.report123</p>
     */
    @NameInMap("DestEntityQualifiedName")
    public String destEntityQualifiedName;

    /**
     * <p>The unique identifier of the lineage.</p>
     * 
     * <strong>example:</strong>
     * <p>dfazcdfdfccdedd</p>
     */
    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    @NameInMap("RelationshipType")
    public String relationshipType;

    /**
     * <p>The unique identifier of the source entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.project.table</p>
     */
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

    public DeleteLineageRelationRequest setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }
    public String getRelationshipType() {
        return this.relationshipType;
    }

    public DeleteLineageRelationRequest setSrcEntityQualifiedName(String srcEntityQualifiedName) {
        this.srcEntityQualifiedName = srcEntityQualifiedName;
        return this;
    }
    public String getSrcEntityQualifiedName() {
        return this.srcEntityQualifiedName;
    }

}
