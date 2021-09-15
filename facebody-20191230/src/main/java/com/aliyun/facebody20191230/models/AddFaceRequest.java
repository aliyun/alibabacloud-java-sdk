// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    @NameInMap("SimilarityScoreThresholdInEntity")
    public Float similarityScoreThresholdInEntity;

    @NameInMap("SimilarityScoreThresholdBetweenEntity")
    public Float similarityScoreThresholdBetweenEntity;

    public static AddFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceRequest self = new AddFaceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public AddFaceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public AddFaceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public AddFaceRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public AddFaceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public AddFaceRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

    public AddFaceRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
    }

}
