// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DetectUserFaceByUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectUserFaceByUrlResponseData data;

    public static DetectUserFaceByUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectUserFaceByUrlResponse self = new DetectUserFaceByUrlResponse();
        return TeaModel.build(map, self);
    }

    public DetectUserFaceByUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectUserFaceByUrlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetectUserFaceByUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectUserFaceByUrlResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DetectUserFaceByUrlResponse setData(DetectUserFaceByUrlResponseData data) {
        this.data = data;
        return this;
    }
    public DetectUserFaceByUrlResponseData getData() {
        return this.data;
    }

    public static class DetectUserFaceByUrlResponseDataDataFaceRects extends TeaModel {
        // FaceRectsData
        @NameInMap("FaceRectsData")
        @Validation(required = true)
        public java.util.List<String> faceRectsData;

        public static DetectUserFaceByUrlResponseDataDataFaceRects build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseDataDataFaceRects self = new DetectUserFaceByUrlResponseDataDataFaceRects();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseDataDataFaceRects setFaceRectsData(java.util.List<String> faceRectsData) {
            this.faceRectsData = faceRectsData;
            return this;
        }
        public java.util.List<String> getFaceRectsData() {
            return this.faceRectsData;
        }

    }

    public static class DetectUserFaceByUrlResponseDataDataLandmarks extends TeaModel {
        // LandmarksData
        @NameInMap("LandmarksData")
        @Validation(required = true)
        public java.util.List<String> landmarksData;

        public static DetectUserFaceByUrlResponseDataDataLandmarks build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseDataDataLandmarks self = new DetectUserFaceByUrlResponseDataDataLandmarks();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseDataDataLandmarks setLandmarksData(java.util.List<String> landmarksData) {
            this.landmarksData = landmarksData;
            return this;
        }
        public java.util.List<String> getLandmarksData() {
            return this.landmarksData;
        }

    }

    public static class DetectUserFaceByUrlResponseDataData extends TeaModel {
        @NameInMap("FaceProbability")
        @Validation(required = true)
        public Float faceProbability;

        @NameInMap("Age")
        @Validation(required = true)
        public Integer age;

        @NameInMap("Gender")
        @Validation(required = true)
        public Integer gender;

        @NameInMap("FaceRects")
        @Validation(required = true)
        public DetectUserFaceByUrlResponseDataDataFaceRects faceRects;

        @NameInMap("Landmarks")
        @Validation(required = true)
        public DetectUserFaceByUrlResponseDataDataLandmarks landmarks;

        public static DetectUserFaceByUrlResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseDataData self = new DetectUserFaceByUrlResponseDataData();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseDataData setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

        public DetectUserFaceByUrlResponseDataData setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public DetectUserFaceByUrlResponseDataData setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public DetectUserFaceByUrlResponseDataData setFaceRects(DetectUserFaceByUrlResponseDataDataFaceRects faceRects) {
            this.faceRects = faceRects;
            return this;
        }
        public DetectUserFaceByUrlResponseDataDataFaceRects getFaceRects() {
            return this.faceRects;
        }

        public DetectUserFaceByUrlResponseDataData setLandmarks(DetectUserFaceByUrlResponseDataDataLandmarks landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public DetectUserFaceByUrlResponseDataDataLandmarks getLandmarks() {
            return this.landmarks;
        }

    }

    public static class DetectUserFaceByUrlResponseData extends TeaModel {
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<DetectUserFaceByUrlResponseDataData> data;

        public static DetectUserFaceByUrlResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseData self = new DetectUserFaceByUrlResponseData();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseData setData(java.util.List<DetectUserFaceByUrlResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DetectUserFaceByUrlResponseDataData> getData() {
            return this.data;
        }

    }

}
