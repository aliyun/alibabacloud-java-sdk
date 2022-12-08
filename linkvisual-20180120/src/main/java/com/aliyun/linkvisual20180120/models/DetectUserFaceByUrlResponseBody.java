// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DetectUserFaceByUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DetectUserFaceByUrlResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DetectUserFaceByUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectUserFaceByUrlResponseBody self = new DetectUserFaceByUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectUserFaceByUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectUserFaceByUrlResponseBody setData(DetectUserFaceByUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectUserFaceByUrlResponseBodyData getData() {
        return this.data;
    }

    public DetectUserFaceByUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DetectUserFaceByUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectUserFaceByUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DetectUserFaceByUrlResponseBodyDataDataFaceRects extends TeaModel {
        @NameInMap("FaceRectsData")
        public java.util.List<String> faceRectsData;

        public static DetectUserFaceByUrlResponseBodyDataDataFaceRects build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseBodyDataDataFaceRects self = new DetectUserFaceByUrlResponseBodyDataDataFaceRects();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseBodyDataDataFaceRects setFaceRectsData(java.util.List<String> faceRectsData) {
            this.faceRectsData = faceRectsData;
            return this;
        }
        public java.util.List<String> getFaceRectsData() {
            return this.faceRectsData;
        }

    }

    public static class DetectUserFaceByUrlResponseBodyDataDataLandmarks extends TeaModel {
        @NameInMap("LandmarksData")
        public java.util.List<String> landmarksData;

        public static DetectUserFaceByUrlResponseBodyDataDataLandmarks build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseBodyDataDataLandmarks self = new DetectUserFaceByUrlResponseBodyDataDataLandmarks();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseBodyDataDataLandmarks setLandmarksData(java.util.List<String> landmarksData) {
            this.landmarksData = landmarksData;
            return this;
        }
        public java.util.List<String> getLandmarksData() {
            return this.landmarksData;
        }

    }

    public static class DetectUserFaceByUrlResponseBodyDataData extends TeaModel {
        @NameInMap("Age")
        public Integer age;

        @NameInMap("BlurScore")
        public Float blurScore;

        @NameInMap("FaceProbability")
        public Float faceProbability;

        @NameInMap("FaceRects")
        public DetectUserFaceByUrlResponseBodyDataDataFaceRects faceRects;

        @NameInMap("Gender")
        public Integer gender;

        @NameInMap("GoodForLibrary")
        public Boolean goodForLibrary;

        @NameInMap("GoodForRecognition")
        public Boolean goodForRecognition;

        @NameInMap("Landmarks")
        public DetectUserFaceByUrlResponseBodyDataDataLandmarks landmarks;

        @NameInMap("OcclusionScore")
        public Float occlusionScore;

        @NameInMap("PoseScore")
        public Float poseScore;

        public static DetectUserFaceByUrlResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseBodyDataData self = new DetectUserFaceByUrlResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseBodyDataData setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public DetectUserFaceByUrlResponseBodyDataData setBlurScore(Float blurScore) {
            this.blurScore = blurScore;
            return this;
        }
        public Float getBlurScore() {
            return this.blurScore;
        }

        public DetectUserFaceByUrlResponseBodyDataData setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

        public DetectUserFaceByUrlResponseBodyDataData setFaceRects(DetectUserFaceByUrlResponseBodyDataDataFaceRects faceRects) {
            this.faceRects = faceRects;
            return this;
        }
        public DetectUserFaceByUrlResponseBodyDataDataFaceRects getFaceRects() {
            return this.faceRects;
        }

        public DetectUserFaceByUrlResponseBodyDataData setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public DetectUserFaceByUrlResponseBodyDataData setGoodForLibrary(Boolean goodForLibrary) {
            this.goodForLibrary = goodForLibrary;
            return this;
        }
        public Boolean getGoodForLibrary() {
            return this.goodForLibrary;
        }

        public DetectUserFaceByUrlResponseBodyDataData setGoodForRecognition(Boolean goodForRecognition) {
            this.goodForRecognition = goodForRecognition;
            return this;
        }
        public Boolean getGoodForRecognition() {
            return this.goodForRecognition;
        }

        public DetectUserFaceByUrlResponseBodyDataData setLandmarks(DetectUserFaceByUrlResponseBodyDataDataLandmarks landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public DetectUserFaceByUrlResponseBodyDataDataLandmarks getLandmarks() {
            return this.landmarks;
        }

        public DetectUserFaceByUrlResponseBodyDataData setOcclusionScore(Float occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Float getOcclusionScore() {
            return this.occlusionScore;
        }

        public DetectUserFaceByUrlResponseBodyDataData setPoseScore(Float poseScore) {
            this.poseScore = poseScore;
            return this;
        }
        public Float getPoseScore() {
            return this.poseScore;
        }

    }

    public static class DetectUserFaceByUrlResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<DetectUserFaceByUrlResponseBodyDataData> data;

        public static DetectUserFaceByUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectUserFaceByUrlResponseBodyData self = new DetectUserFaceByUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectUserFaceByUrlResponseBodyData setData(java.util.List<DetectUserFaceByUrlResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DetectUserFaceByUrlResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
