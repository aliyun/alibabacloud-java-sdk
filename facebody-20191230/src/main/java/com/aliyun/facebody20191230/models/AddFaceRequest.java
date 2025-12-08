// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceRequest extends TeaModel {
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

    @NameInMap("ExtraData")
    public String extraData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/imgsearch/demo/1.png">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/imgsearch/demo/1.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

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

    public AddFaceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public AddFaceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public AddFaceRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
    }

    public AddFaceRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

}
