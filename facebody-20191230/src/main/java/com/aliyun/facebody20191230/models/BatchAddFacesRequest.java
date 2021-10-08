// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BatchAddFacesRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("SimilarityScoreThresholdInEntity")
    public Float similarityScoreThresholdInEntity;

    @NameInMap("SimilarityScoreThresholdBetweenEntity")
    public Float similarityScoreThresholdBetweenEntity;

    @NameInMap("Faces")
    public java.util.List<BatchAddFacesRequestFaces> faces;

    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

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

    public BatchAddFacesRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

    public BatchAddFacesRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
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

    public static class BatchAddFacesRequestFaces extends TeaModel {
        @NameInMap("ExtraData")
        public String extraData;

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
