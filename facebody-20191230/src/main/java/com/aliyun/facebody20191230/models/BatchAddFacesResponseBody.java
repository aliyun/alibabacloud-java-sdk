// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BatchAddFacesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchAddFacesResponseBodyData data;

    public static BatchAddFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFacesResponseBody self = new BatchAddFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAddFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchAddFacesResponseBody setData(BatchAddFacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchAddFacesResponseBodyData getData() {
        return this.data;
    }

    public static class BatchAddFacesResponseBodyDataInsertedFaces extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("QualitieScore")
        public Float qualitieScore;

        public static BatchAddFacesResponseBodyDataInsertedFaces build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFacesResponseBodyDataInsertedFaces self = new BatchAddFacesResponseBodyDataInsertedFaces();
            return TeaModel.build(map, self);
        }

        public BatchAddFacesResponseBodyDataInsertedFaces setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public BatchAddFacesResponseBodyDataInsertedFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public BatchAddFacesResponseBodyDataInsertedFaces setQualitieScore(Float qualitieScore) {
            this.qualitieScore = qualitieScore;
            return this;
        }
        public Float getQualitieScore() {
            return this.qualitieScore;
        }

    }

    public static class BatchAddFacesResponseBodyDataFailedFaces extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static BatchAddFacesResponseBodyDataFailedFaces build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFacesResponseBodyDataFailedFaces self = new BatchAddFacesResponseBodyDataFailedFaces();
            return TeaModel.build(map, self);
        }

        public BatchAddFacesResponseBodyDataFailedFaces setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public BatchAddFacesResponseBodyDataFailedFaces setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchAddFacesResponseBodyDataFailedFaces setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class BatchAddFacesResponseBodyData extends TeaModel {
        @NameInMap("InsertedFaces")
        public java.util.List<BatchAddFacesResponseBodyDataInsertedFaces> insertedFaces;

        @NameInMap("FailedFaces")
        public java.util.List<BatchAddFacesResponseBodyDataFailedFaces> failedFaces;

        public static BatchAddFacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFacesResponseBodyData self = new BatchAddFacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchAddFacesResponseBodyData setInsertedFaces(java.util.List<BatchAddFacesResponseBodyDataInsertedFaces> insertedFaces) {
            this.insertedFaces = insertedFaces;
            return this;
        }
        public java.util.List<BatchAddFacesResponseBodyDataInsertedFaces> getInsertedFaces() {
            return this.insertedFaces;
        }

        public BatchAddFacesResponseBodyData setFailedFaces(java.util.List<BatchAddFacesResponseBodyDataFailedFaces> failedFaces) {
            this.failedFaces = failedFaces;
            return this;
        }
        public java.util.List<BatchAddFacesResponseBodyDataFailedFaces> getFailedFaces() {
            return this.failedFaces;
        }

    }

}
