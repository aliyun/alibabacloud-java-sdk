// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceAdvanceRequest extends TeaModel {
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
    public java.io.InputStream imageUrlObject;

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

    public static AddFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceAdvanceRequest self = new AddFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceAdvanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public AddFaceAdvanceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public AddFaceAdvanceRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public AddFaceAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public AddFaceAdvanceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public AddFaceAdvanceRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
    }

    public AddFaceAdvanceRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

}
