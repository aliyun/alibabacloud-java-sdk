// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class LineageRelationRegisterVO extends TeaModel {
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("DestEntity")
    public LineageEntityVO destEntity;

    @NameInMap("Relationship")
    public RelationshipVO relationship;

    @NameInMap("SrcEntity")
    public LineageEntityVO srcEntity;

    public static LineageRelationRegisterVO build(java.util.Map<String, ?> map) throws Exception {
        LineageRelationRegisterVO self = new LineageRelationRegisterVO();
        return TeaModel.build(map, self);
    }

    public LineageRelationRegisterVO setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public LineageRelationRegisterVO setDestEntity(LineageEntityVO destEntity) {
        this.destEntity = destEntity;
        return this;
    }
    public LineageEntityVO getDestEntity() {
        return this.destEntity;
    }

    public LineageRelationRegisterVO setRelationship(RelationshipVO relationship) {
        this.relationship = relationship;
        return this;
    }
    public RelationshipVO getRelationship() {
        return this.relationship;
    }

    public LineageRelationRegisterVO setSrcEntity(LineageEntityVO srcEntity) {
        this.srcEntity = srcEntity;
        return this;
    }
    public LineageEntityVO getSrcEntity() {
        return this.srcEntity;
    }

}
