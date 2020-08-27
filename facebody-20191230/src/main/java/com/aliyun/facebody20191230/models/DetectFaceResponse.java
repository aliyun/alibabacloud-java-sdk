// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectFaceResponseData data;

    public static DetectFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceResponse self = new DetectFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectFaceResponse setData(DetectFaceResponseData data) {
        this.data = data;
        return this;
    }
    public DetectFaceResponseData getData() {
        return this.data;
    }

    public static class DetectFaceResponseData extends TeaModel {
        @NameInMap("FaceCount")
        @Validation(required = true)
        public Integer faceCount;

        @NameInMap("LandmarkCount")
        @Validation(required = true)
        public Integer landmarkCount;

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

        public static DetectFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceResponseData self = new DetectFaceResponseData();
            return TeaModel.build(map, self);
        }

        public DetectFaceResponseData setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public DetectFaceResponseData setLandmarkCount(Integer landmarkCount) {
            this.landmarkCount = landmarkCount;
            return this;
        }
        public Integer getLandmarkCount() {
            return this.landmarkCount;
        }

        public DetectFaceResponseData setFaceRectangles(java.util.List<Integer> faceRectangles) {
            this.faceRectangles = faceRectangles;
            return this;
        }
        public java.util.List<Integer> getFaceRectangles() {
            return this.faceRectangles;
        }

        public DetectFaceResponseData setFaceProbabilityList(java.util.List<Float> faceProbabilityList) {
            this.faceProbabilityList = faceProbabilityList;
            return this;
        }
        public java.util.List<Float> getFaceProbabilityList() {
            return this.faceProbabilityList;
        }

        public DetectFaceResponseData setPoseList(java.util.List<Float> poseList) {
            this.poseList = poseList;
            return this;
        }
        public java.util.List<Float> getPoseList() {
            return this.poseList;
        }

        public DetectFaceResponseData setLandmarks(java.util.List<Float> landmarks) {
            this.landmarks = landmarks;
            return this;
        }
        public java.util.List<Float> getLandmarks() {
            return this.landmarks;
        }

        public DetectFaceResponseData setPupils(java.util.List<Float> pupils) {
            this.pupils = pupils;
            return this;
        }
        public java.util.List<Float> getPupils() {
            return this.pupils;
        }

    }

}
