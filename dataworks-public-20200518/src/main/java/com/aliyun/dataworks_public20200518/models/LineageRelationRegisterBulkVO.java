// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class LineageRelationRegisterBulkVO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1684327487964</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("DestEntities")
    public java.util.List<LineageEntityVO> destEntities;

    @NameInMap("Relationship")
    public RelationshipVO relationship;

    @NameInMap("SrcEntities")
    public java.util.List<LineageEntityVO> srcEntities;

    public static LineageRelationRegisterBulkVO build(java.util.Map<String, ?> map) throws Exception {
        LineageRelationRegisterBulkVO self = new LineageRelationRegisterBulkVO();
        return TeaModel.build(map, self);
    }

    public LineageRelationRegisterBulkVO setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public LineageRelationRegisterBulkVO setDestEntities(java.util.List<LineageEntityVO> destEntities) {
        this.destEntities = destEntities;
        return this;
    }
    public java.util.List<LineageEntityVO> getDestEntities() {
        return this.destEntities;
    }

    public LineageRelationRegisterBulkVO setRelationship(RelationshipVO relationship) {
        this.relationship = relationship;
        return this;
    }
    public RelationshipVO getRelationship() {
        return this.relationship;
    }

    public LineageRelationRegisterBulkVO setSrcEntities(java.util.List<LineageEntityVO> srcEntities) {
        this.srcEntities = srcEntities;
        return this;
    }
    public java.util.List<LineageEntityVO> getSrcEntities() {
        return this.srcEntities;
    }

}
