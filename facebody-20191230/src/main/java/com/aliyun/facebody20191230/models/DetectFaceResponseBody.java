// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceResponseBody self = new DetectFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectFaceResponseBody setData(DetectFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectFaceResponseBodyData getData() {
        return this.data;
    }

    public DetectFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectFaceResponseBodyDataQualities extends TeaModel {
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

        public static DetectFaceResponseBodyDataQualities build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceResponseBodyDataQualities self = new DetectFaceResponseBodyDataQualities();
            return TeaModel.build(map, self);
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

        public DetectFaceResponseBodyDataQualities setScoreList(java.util.List<Float> scoreList) {
            this.scoreList = scoreList;
            return this;
        }
        public java.util.List<Float> getScoreList() {
            return this.scoreList;
        }

    }

    public static class DetectFaceResponseBodyData extends TeaModel {
        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("FaceProbabilityList")
        public java.util.List<Float> faceProbabilityList;

        @NameInMap("FaceRectangles")
        public java.util.List<Integer> faceRectangles;

        @NameInMap("LandmarkCount")
        public Integer landmarkCount;

        @NameInMap("Landmarks")
        public java.util.List<Float> landmarks;

        @NameInMap("PoseList")
        public java.util.List<Float> poseList;

        @NameInMap("Pupils")
        public java.util.List<Float> pupils;

        @NameInMap("Qualities")
        public DetectFaceResponseBodyDataQualities qualities;

        public static DetectFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceResponseBodyData self = new DetectFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectFaceResponseBodyData setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public DetectFaceResponseBodyData setFaceProbabilityList(java.util.List<Float> faceProbabilityList) {
            this.faceProbabilityList = faceProbabilityList;
            return this;
        }
        public java.util.List<Float> getFaceProbabilityList() {
            return this.faceProbabilityList;
        }

        public DetectFaceResponseBodyData setFaceRectangles(java.util.List<Integer> faceRectangles) {
            this.faceRectangles = faceRectangles;
            return this;
        }
        public java.util.List<Integer> getFaceRectangles() {
            return this.faceRectangles;
        }

        public DetectFaceResponseBodyData setLandmarkCount(Integer landmarkCount) {
            this.landmarkCount = landmarkCount;
            return this;
        }
        public Integer getLandmarkCount() {
            return this.landmarkCount;
        }

        public DetectFaceResponseBodyData setLandmarks(java.util.List<Float> landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public java.util.List<Float> getLandmarks() {
            return this.landmarks;
        }

        public DetectFaceResponseBodyData setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public DetectFaceResponseBodyData setPupils(java.util.List<Float> pupils) {
            this.pupils = pupils;
            return this;
        }
        public java.util.List<Float> getPupils() {
            return this.pupils;
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
