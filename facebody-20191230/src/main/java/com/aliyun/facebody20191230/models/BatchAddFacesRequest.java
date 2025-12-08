// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BatchAddFacesRequest extends TeaModel {
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
    public java.util.List<BatchAddFacesRequestFaces> faces;

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

    public static BatchAddFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFacesRequest self = new BatchAddFacesRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddFacesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchAddFacesRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public BatchAddFacesRequest setFaces(java.util.List<BatchAddFacesRequestFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<BatchAddFacesRequestFaces> getFaces() {
        return this.faces;
    }

    public BatchAddFacesRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public BatchAddFacesRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
    }

    public BatchAddFacesRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

    public static class BatchAddFacesRequestFaces extends TeaModel {
        @NameInMap("ExtraData")
        public String extraData;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/imgsearch/demo/1.png">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/imgsearch/demo/1.png</a></p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static BatchAddFacesRequestFaces build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFacesRequestFaces self = new BatchAddFacesRequestFaces();
            return TeaModel.build(map, self);
        }

        public BatchAddFacesRequestFaces setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public BatchAddFacesRequestFaces setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
