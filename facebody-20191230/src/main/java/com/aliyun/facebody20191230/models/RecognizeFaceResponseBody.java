// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceResponseBody self = new RecognizeFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceResponseBody setData(RecognizeFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFaceResponseBodyData getData() {
        return this.data;
    }

    public RecognizeFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeFaceResponseBodyDataQualities extends TeaModel {
        @NameInMap("BlurList")
        public java.util.List<Float> blurList;

        @NameInMap("FnfList")
        public java.util.List<Float> fnfList;

        @NameInMap("GlassList")
        public java.util.List<Float> glassList;

        @NameInMap("IlluList")
        public java.util.List<Float> illuList;

        @NameInMap("MaskList")
        public java.util.List<Float> maskList;

        @NameInMap("NoiseList")
        public java.util.List<Float> noiseList;

        @NameInMap("PoseList")
        public java.util.List<Float> poseList;

        @NameInMap("ScoreList")
        public java.util.List<Float> scoreList;

        public static RecognizeFaceResponseBodyDataQualities build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceResponseBodyDataQualities self = new RecognizeFaceResponseBodyDataQualities();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceResponseBodyDataQualities setBlurList(java.util.List<Float> blurList) {
            this.blurList = blurList;
            return this;
        }
        public java.util.List<Float> getBlurList() {
            return this.blurList;
        }

        public RecognizeFaceResponseBodyDataQualities setFnfList(java.util.List<Float> fnfList) {
            this.fnfList = fnfList;
            return this;
        }
        public java.util.List<Float> getFnfList() {
            return this.fnfList;
        }

        public RecognizeFaceResponseBodyDataQualities setGlassList(java.util.List<Float> glassList) {
            this.glassList = glassList;
            return this;
        }
        public java.util.List<Float> getGlassList() {
            return this.glassList;
        }

        public RecognizeFaceResponseBodyDataQualities setIlluList(java.util.List<Float> illuList) {
            this.illuList = illuList;
            return this;
        }
        public java.util.List<Float> getIlluList() {
            return this.illuList;
        }

        public RecognizeFaceResponseBodyDataQualities setMaskList(java.util.List<Float> maskList) {
            this.maskList = maskList;
            return this;
        }
        public java.util.List<Float> getMaskList() {
            return this.maskList;
        }

        public RecognizeFaceResponseBodyDataQualities setNoiseList(java.util.List<Float> noiseList) {
            this.noiseList = noiseList;
            return this;
        }
        public java.util.List<Float> getNoiseList() {
            return this.noiseList;
        }

        public RecognizeFaceResponseBodyDataQualities setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public RecognizeFaceResponseBodyDataQualities setScoreList(java.util.List<Float> scoreList) {
            this.scoreList = scoreList;
            return this;
        }
        public java.util.List<Float> getScoreList() {
            return this.scoreList;
        }

    }

    public static class RecognizeFaceResponseBodyData extends TeaModel {
        @NameInMap("AgeList")
        public java.util.List<Integer> ageList;

        @NameInMap("BeautyList")
        public java.util.List<Float> beautyList;

        @NameInMap("DenseFeatureLength")
        public Integer denseFeatureLength;

        @NameInMap("DenseFeatures")
        public java.util.List<String> denseFeatures;

        @NameInMap("Expressions")
        public java.util.List<Integer> expressions;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("FaceProbabilityList")
        public java.util.List<Float> faceProbabilityList;

        @NameInMap("FaceRectangles")
        public java.util.List<Integer> faceRectangles;

        @NameInMap("GenderList")
        public java.util.List<Integer> genderList;

        @NameInMap("Glasses")
        public java.util.List<Integer> glasses;

        @NameInMap("HatList")
        public java.util.List<Integer> hatList;

        @NameInMap("LandmarkCount")
        public Integer landmarkCount;

        @NameInMap("Landmarks")
        public java.util.List<Float> landmarks;

        @NameInMap("Masks")
        public java.util.List<Long> masks;

        @NameInMap("PoseList")
        public java.util.List<Float> poseList;

        @NameInMap("Pupils")
        public java.util.List<Float> pupils;

        @NameInMap("Qualities")
        public RecognizeFaceResponseBodyDataQualities qualities;

        public static RecognizeFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceResponseBodyData self = new RecognizeFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceResponseBodyData setAgeList(java.util.List<Integer> ageList) {
            this.ageList = ageList;
            return this;
        }
        public java.util.List<Integer> getAgeList() {
            return this.ageList;
        }

        public RecognizeFaceResponseBodyData setBeautyList(java.util.List<Float> beautyList) {
            this.beautyList = beautyList;
            return this;
        }
        public java.util.List<Float> getBeautyList() {
            return this.beautyList;
        }

        public RecognizeFaceResponseBodyData setDenseFeatureLength(Integer denseFeatureLength) {
            this.denseFeatureLength = denseFeatureLength;
            return this;
        }
        public Integer getDenseFeatureLength() {
            return this.denseFeatureLength;
        }

        public RecognizeFaceResponseBodyData setDenseFeatures(java.util.List<String> denseFeatures) {
            this.denseFeatures = denseFeatures;
            return this;
        }
        public java.util.List<String> getDenseFeatures() {
            return this.denseFeatures;
        }

        public RecognizeFaceResponseBodyData setExpressions(java.util.List<Integer> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<Integer> getExpressions() {
            return this.expressions;
        }

        public RecognizeFaceResponseBodyData setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public RecognizeFaceResponseBodyData setFaceProbabilityList(java.util.List<Float> faceProbabilityList) {
            this.faceProbabilityList = faceProbabilityList;
            return this;
        }
        public java.util.List<Float> getFaceProbabilityList() {
            return this.faceProbabilityList;
        }

        public RecognizeFaceResponseBodyData setFaceRectangles(java.util.List<Integer> faceRectangles) {
            this.faceRectangles = faceRectangles;
            return this;
        }
        public java.util.List<Integer> getFaceRectangles() {
            return this.faceRectangles;
        }

        public RecognizeFaceResponseBodyData setGenderList(java.util.List<Integer> genderList) {
            this.genderList = genderList;
            return this;
        }
        public java.util.List<Integer> getGenderList() {
            return this.genderList;
        }

        public RecognizeFaceResponseBodyData setGlasses(java.util.List<Integer> glasses) {
            this.glasses = glasses;
            return this;
        }
        public java.util.List<Integer> getGlasses() {
            return this.glasses;
        }

        public RecognizeFaceResponseBodyData setHatList(java.util.List<Integer> hatList) {
            this.hatList = hatList;
            return this;
        }
        public java.util.List<Integer> getHatList() {
            return this.hatList;
        }

        public RecognizeFaceResponseBodyData setLandmarkCount(Integer landmarkCount) {
            this.landmarkCount = landmarkCount;
            return this;
        }
        public Integer getLandmarkCount() {
            return this.landmarkCount;
        }

        public RecognizeFaceResponseBodyData setLandmarks(java.util.List<Float> landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public java.util.List<Float> getLandmarks() {
            return this.landmarks;
        }

        public RecognizeFaceResponseBodyData setMasks(java.util.List<Long> masks) {
            this.masks = masks;
            return this;
        }
        public java.util.List<Long> getMasks() {
            return this.masks;
        }

        public RecognizeFaceResponseBodyData setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public RecognizeFaceResponseBodyData setPupils(java.util.List<Float> pupils) {
            this.pupils = pupils;
            return this;
        }
        public java.util.List<Float> getPupils() {
            return this.pupils;
        }

        public RecognizeFaceResponseBodyData setQualities(RecognizeFaceResponseBodyDataQualities qualities) {
            this.qualities = qualities;
            return this;
        }
        public RecognizeFaceResponseBodyDataQualities getQualities() {
            return this.qualities;
        }

    }

}
