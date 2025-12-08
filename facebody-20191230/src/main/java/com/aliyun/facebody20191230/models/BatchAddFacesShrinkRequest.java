// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BatchAddFacesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>U1</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Faces")
    public String facesShrink;

    /**
     * <strong>example:</strong>
     * <p>50.0</p>
     */
    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    /**
     * <strong>example:</strong>
     * <p>50.0</p>
     */
    @NameInMap("SimilarityScoreThresholdBetweenEntity")
    public Float similarityScoreThresholdBetweenEntity;

    /**
     * <strong>example:</strong>
     * <p>50.0</p>
     */
    @NameInMap("SimilarityScoreThresholdInEntity")
    public Float similarityScoreThresholdInEntity;

    public static BatchAddFacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFacesShrinkRequest self = new BatchAddFacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddFacesShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchAddFacesShrinkRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public BatchAddFacesShrinkRequest setFacesShrink(String facesShrink) {
        this.facesShrink = facesShrink;
        return this;
    }
    public String getFacesShrink() {
        return this.facesShrink;
    }

    public BatchAddFacesShrinkRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public BatchAddFacesShrinkRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
    }

    public BatchAddFacesShrinkRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

}
