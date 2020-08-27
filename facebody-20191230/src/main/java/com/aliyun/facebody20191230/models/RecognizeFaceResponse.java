// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeFaceResponseData data;

    public static RecognizeFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceResponse self = new RecognizeFaceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeFaceResponse setData(RecognizeFaceResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeFaceResponseData getData() {
        return this.data;
    }

    public static class RecognizeFaceResponseData extends TeaModel {
        @NameInMap("FaceCount")
        @Validation(required = true)
        public Integer faceCount;

        @NameInMap("LandmarkCount")
        @Validation(required = true)
        public Integer landmarkCount;

        @NameInMap("DenseFeatureLength")
        @Validation(required = true)
        public Integer denseFeatureLength;

        @NameInMap("FaceRectangles")
        @Validation(required = true)
        public java.util.List<Integer> faceRectangles;

        @NameInMap("FaceProbabilityList")
        @Validation(required = true)
        public java.util.List<Float> faceProbabilityList;

        @NameInMap("PoseList")
        @Validation(required = true)
        public java.util.List<Float> poseList;

        @NameInMap("Landmarks")
        @Validation(required = true)
        public java.util.List<Float> landmarks;

        @NameInMap("Pupils")
        @Validation(required = true)
        public java.util.List<Float> pupils;

        @NameInMap("GenderList")
        @Validation(required = true)
        public java.util.List<Integer> genderList;

        @NameInMap("AgeList")
        @Validation(required = true)
        public java.util.List<Integer> ageList;

        @NameInMap("Expressions")
        @Validation(required = true)
        public java.util.List<Integer> expressions;

        @NameInMap("Glasses")
        @Validation(required = true)
        public java.util.List<Integer> glasses;

        @NameInMap("DenseFeatures")
        @Validation(required = true)
        public java.util.List<String> denseFeatures;

        public static RecognizeFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceResponseData self = new RecognizeFaceResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceResponseData setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public RecognizeFaceResponseData setLandmarkCount(Integer landmarkCount) {
            this.landmarkCount = landmarkCount;
            return this;
        }
        public Integer getLandmarkCount() {
            return this.landmarkCount;
        }

        public RecognizeFaceResponseData setDenseFeatureLength(Integer denseFeatureLength) {
            this.denseFeatureLength = denseFeatureLength;
            return this;
        }
        public Integer getDenseFeatureLength() {
            return this.denseFeatureLength;
        }

        public RecognizeFaceResponseData setFaceRectangles(java.util.List<Integer> faceRectangles) {
            this.faceRectangles = faceRectangles;
            return this;
        }
        public java.util.List<Integer> getFaceRectangles() {
            return this.faceRectangles;
        }

        public RecognizeFaceResponseData setFaceProbabilityList(java.util.List<Float> faceProbabilityList) {
            this.faceProbabilityList = faceProbabilityList;
            return this;
        }
        public java.util.List<Float> getFaceProbabilityList() {
            return this.faceProbabilityList;
        }

        public RecognizeFaceResponseData setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public RecognizeFaceResponseData setLandmarks(java.util.List<Float> landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public java.util.List<Float> getLandmarks() {
            return this.landmarks;
        }

        public RecognizeFaceResponseData setPupils(java.util.List<Float> pupils) {
            this.pupils = pupils;
            return this;
        }
        public java.util.List<Float> getPupils() {
            return this.pupils;
        }

        public RecognizeFaceResponseData setGenderList(java.util.List<Integer> genderList) {
            this.genderList = genderList;
            return this;
        }
        public java.util.List<Integer> getGenderList() {
            return this.genderList;
        }

        public RecognizeFaceResponseData setAgeList(java.util.List<Integer> ageList) {
            this.ageList = ageList;
            return this;
        }
        public java.util.List<Integer> getAgeList() {
            return this.ageList;
        }

        public RecognizeFaceResponseData setExpressions(java.util.List<Integer> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<Integer> getExpressions() {
            return this.expressions;
        }

        public RecognizeFaceResponseData setGlasses(java.util.List<Integer> glasses) {
            this.glasses = glasses;
            return this;
        }
        public java.util.List<Integer> getGlasses() {
            return this.glasses;
        }

        public RecognizeFaceResponseData setDenseFeatures(java.util.List<String> denseFeatures) {
            this.denseFeatures = denseFeatures;
            return this;
        }
        public java.util.List<String> getDenseFeatures() {
            return this.denseFeatures;
        }

    }

}
