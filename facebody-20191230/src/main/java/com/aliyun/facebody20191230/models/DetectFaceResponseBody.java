// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectFaceResponseBodyData data;

    public static DetectFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceResponseBody self = new DetectFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectFaceResponseBody setData(DetectFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectFaceResponseBodyData getData() {
        return this.data;
    }

    public static class DetectFaceResponseBodyDataQualities extends TeaModel {
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

        public static DetectFaceResponseBodyDataQualities build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceResponseBodyDataQualities self = new DetectFaceResponseBodyDataQualities();
            return TeaModel.build(map, self);
        }

        public DetectFaceResponseBodyDataQualities setScoreList(java.util.List<Float> scoreList) {
            this.scoreList = scoreList;
            return this;
        }
        public java.util.List<Float> getScoreList() {
            return this.scoreList;
        }

        public DetectFaceResponseBodyDataQualities setBlurList(java.util.List<Float> blurList) {
            this.blurList = blurList;
            return this;
        }
        public java.util.List<Float> getBlurList() {
            return this.blurList;
        }

        public DetectFaceResponseBodyDataQualities setFnfList(java.util.List<Float> fnfList) {
            this.fnfList = fnfList;
            return this;
        }
        public java.util.List<Float> getFnfList() {
            return this.fnfList;
        }

        public DetectFaceResponseBodyDataQualities setGlassList(java.util.List<Float> glassList) {
            this.glassList = glassList;
            return this;
        }
        public java.util.List<Float> getGlassList() {
            return this.glassList;
        }

        public DetectFaceResponseBodyDataQualities setIlluList(java.util.List<Float> illuList) {
            this.illuList = illuList;
            return this;
        }
        public java.util.List<Float> getIlluList() {
            return this.illuList;
        }

        public DetectFaceResponseBodyDataQualities setMaskList(java.util.List<Float> maskList) {
            this.maskList = maskList;
            return this;
        }
        public java.util.List<Float> getMaskList() {
            return this.maskList;
        }

        public DetectFaceResponseBodyDataQualities setNoiseList(java.util.List<Float> noiseList) {
            this.noiseList = noiseList;
            return this;
        }
        public java.util.List<Float> getNoiseList() {
            return this.noiseList;
        }

        public DetectFaceResponseBodyDataQualities setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

    }

    public static class DetectFaceResponseBodyData extends TeaModel {
        @NameInMap("FaceProbabilityList")
        public java.util.List<Float> faceProbabilityList;

        @NameInMap("Pupils")
        public java.util.List<Float> pupils;

        @NameInMap("FaceRectangles")
        public java.util.List<Integer> faceRectangles;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("PoseList")
        public java.util.List<Float> poseList;

        @NameInMap("Landmarks")
        public java.util.List<Float> landmarks;

        @NameInMap("LandmarkCount")
        public Integer landmarkCount;

        @NameInMap("Qualities")
        public DetectFaceResponseBodyDataQualities qualities;

        public static DetectFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceResponseBodyData self = new DetectFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectFaceResponseBodyData setFaceProbabilityList(java.util.List<Float> faceProbabilityList) {
            this.faceProbabilityList = faceProbabilityList;
            return this;
        }
        public java.util.List<Float> getFaceProbabilityList() {
            return this.faceProbabilityList;
        }

        public DetectFaceResponseBodyData setPupils(java.util.List<Float> pupils) {
            this.pupils = pupils;
            return this;
        }
        public java.util.List<Float> getPupils() {
            return this.pupils;
        }

        public DetectFaceResponseBodyData setFaceRectangles(java.util.List<Integer> faceRectangles) {
            this.faceRectangles = faceRectangles;
            return this;
        }
        public java.util.List<Integer> getFaceRectangles() {
            return this.faceRectangles;
        }

        public DetectFaceResponseBodyData setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public DetectFaceResponseBodyData setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public DetectFaceResponseBodyData setLandmarks(java.util.List<Float> landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public java.util.List<Float> getLandmarks() {
            return this.landmarks;
        }

        public DetectFaceResponseBodyData setLandmarkCount(Integer landmarkCount) {
            this.landmarkCount = landmarkCount;
            return this;
        }
        public Integer getLandmarkCount() {
            return this.landmarkCount;
        }

        public DetectFaceResponseBodyData setQualities(DetectFaceResponseBodyDataQualities qualities) {
            this.qualities = qualities;
            return this;
        }
        public DetectFaceResponseBodyDataQualities getQualities() {
            return this.qualities;
        }

    }

}
