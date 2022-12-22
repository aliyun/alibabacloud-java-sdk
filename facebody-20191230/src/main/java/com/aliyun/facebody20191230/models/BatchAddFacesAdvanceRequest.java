// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BatchAddFacesAdvanceRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("Faces")
    public java.util.List<BatchAddFacesAdvanceRequestFaces> faces;

    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    @NameInMap("SimilarityScoreThresholdBetweenEntity")
    public Float similarityScoreThresholdBetweenEntity;

    @NameInMap("SimilarityScoreThresholdInEntity")
    public Float similarityScoreThresholdInEntity;

    public static BatchAddFacesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFacesAdvanceRequest self = new BatchAddFacesAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddFacesAdvanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchAddFacesAdvanceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public BatchAddFacesAdvanceRequest setFaces(java.util.List<BatchAddFacesAdvanceRequestFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<BatchAddFacesAdvanceRequestFaces> getFaces() {
        return this.faces;
    }

    public BatchAddFacesAdvanceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public BatchAddFacesAdvanceRequest setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
        this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdBetweenEntity() {
        return this.similarityScoreThresholdBetweenEntity;
    }

    public BatchAddFacesAdvanceRequest setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
        this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
        return this;
    }
    public Float getSimilarityScoreThresholdInEntity() {
        return this.similarityScoreThresholdInEntity;
    }

    public static class BatchAddFacesAdvanceRequestFaces extends TeaModel {
        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static BatchAddFacesAdvanceRequestFaces build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFacesAdvanceRequestFaces self = new BatchAddFacesAdvanceRequestFaces();
            return TeaModel.build(map, self);
        }

        public BatchAddFacesAdvanceRequestFaces setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public BatchAddFacesAdvanceRequestFaces setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
