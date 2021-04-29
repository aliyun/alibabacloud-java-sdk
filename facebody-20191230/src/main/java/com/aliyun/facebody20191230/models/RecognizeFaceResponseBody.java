// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeFaceResponseBodyData data;

    public static RecognizeFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceResponseBody self = new RecognizeFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeFaceResponseBody setData(RecognizeFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFaceResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeFaceResponseBodyDataQualities extends TeaModel {
        @NameInMap("ScoreList")
        public java.util.List<Float> scoreList;

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

        public static RecognizeFaceResponseBodyDataQualities build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceResponseBodyDataQualities self = new RecognizeFaceResponseBodyDataQualities();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceResponseBodyDataQualities setScoreList(java.util.List<Float> scoreList) {
            this.scoreList = scoreList;
            return this;
        }
        public java.util.List<Float> getScoreList() {
            return this.scoreList;
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

    }

    public static class RecognizeFaceResponseBodyData extends TeaModel {
        @NameInMap("Pupils")
        public java.util.List<Float> pupils;

        @NameInMap("GenderList")
        public java.util.List<Integer> genderList;

        @NameInMap("Expressions")
        public java.util.List<Integer> expressions;

        @NameInMap("DenseFeatures")
        public java.util.List<String> denseFeatures;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("Landmarks")
        public java.util.List<Float> landmarks;

        @NameInMap("LandmarkCount")
        public Integer landmarkCount;

        @NameInMap("Qualities")
        public RecognizeFaceResponseBodyDataQualities qualities;

        @NameInMap("BeautyList")
        public java.util.List<Float> beautyList;

        @NameInMap("HatList")
        public java.util.List<Integer> hatList;

        @NameInMap("FaceProbabilityList")
        public java.util.List<Float> faceProbabilityList;

        @NameInMap("Glasses")
        public java.util.List<Integer> glasses;

        @NameInMap("FaceRectangles")
        public java.util.List<Integer> faceRectangles;

        @NameInMap("PoseList")
        public java.util.List<Float> poseList;

        @NameInMap("AgeList")
        public java.util.List<Integer> ageList;

        @NameInMap("DenseFeatureLength")
        public Integer denseFeatureLength;

        @NameInMap("Masks")
        public java.util.List<Long> masks;

        public static RecognizeFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceResponseBodyData self = new RecognizeFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceResponseBodyData setPupils(java.util.List<Float> pupils) {
            this.pupils = pupils;
            return this;
        }
        public java.util.List<Float> getPupils() {
            return this.pupils;
        }

        public RecognizeFaceResponseBodyData setGenderList(java.util.List<Integer> genderList) {
            this.genderList = genderList;
            return this;
        }
        public java.util.List<Integer> getGenderList() {
            return this.genderList;
        }

        public RecognizeFaceResponseBodyData setExpressions(java.util.List<Integer> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<Integer> getExpressions() {
            return this.expressions;
        }

        public RecognizeFaceResponseBodyData setDenseFeatures(java.util.List<String> denseFeatures) {
            this.denseFeatures = denseFeatures;
            return this;
        }
        public java.util.List<String> getDenseFeatures() {
            return this.denseFeatures;
        }

        public RecognizeFaceResponseBodyData setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public RecognizeFaceResponseBodyData setLandmarks(java.util.List<Float> landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public java.util.List<Float> getLandmarks() {
            return this.landmarks;
        }

        public RecognizeFaceResponseBodyData setLandmarkCount(Integer landmarkCount) {
            this.landmarkCount = landmarkCount;
            return this;
        }
        public Integer getLandmarkCount() {
            return this.landmarkCount;
        }

        public RecognizeFaceResponseBodyData setQualities(RecognizeFaceResponseBodyDataQualities qualities) {
            this.qualities = qualities;
            return this;
        }
        public RecognizeFaceResponseBodyDataQualities getQualities() {
            return this.qualities;
        }

        public RecognizeFaceResponseBodyData setBeautyList(java.util.List<Float> beautyList) {
            this.beautyList = beautyList;
            return this;
        }
        public java.util.List<Float> getBeautyList() {
            return this.beautyList;
        }

        public RecognizeFaceResponseBodyData setHatList(java.util.List<Integer> hatList) {
            this.hatList = hatList;
            return this;
        }
        public java.util.List<Integer> getHatList() {
            return this.hatList;
        }

        public RecognizeFaceResponseBodyData setFaceProbabilityList(java.util.List<Float> faceProbabilityList) {
            this.faceProbabilityList = faceProbabilityList;
            return this;
        }
        public java.util.List<Float> getFaceProbabilityList() {
            return this.faceProbabilityList;
        }

        public RecognizeFaceResponseBodyData setGlasses(java.util.List<Integer> glasses) {
            this.glasses = glasses;
            return this;
        }
        public java.util.List<Integer> getGlasses() {
            return this.glasses;
        }

        public RecognizeFaceResponseBodyData setFaceRectangles(java.util.List<Integer> faceRectangles) {
            this.faceRectangles = faceRectangles;
            return this;
        }
        public java.util.List<Integer> getFaceRectangles() {
            return this.faceRectangles;
        }

        public RecognizeFaceResponseBodyData setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public RecognizeFaceResponseBodyData setAgeList(java.util.List<Integer> ageList) {
            this.ageList = ageList;
            return this;
        }
        public java.util.List<Integer> getAgeList() {
            return this.ageList;
        }

        public RecognizeFaceResponseBodyData setDenseFeatureLength(Integer denseFeatureLength) {
            this.denseFeatureLength = denseFeatureLength;
            return this;
        }
        public Integer getDenseFeatureLength() {
            return this.denseFeatureLength;
        }

        public RecognizeFaceResponseBodyData setMasks(java.util.List<Long> masks) {
            this.masks = masks;
            return this;
        }
        public java.util.List<Long> getMasks() {
            return this.masks;
        }

    }

}
