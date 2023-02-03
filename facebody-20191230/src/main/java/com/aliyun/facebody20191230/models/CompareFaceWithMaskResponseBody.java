// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceWithMaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CompareFaceWithMaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CompareFaceWithMaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceWithMaskResponseBody self = new CompareFaceWithMaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareFaceWithMaskResponseBody setData(CompareFaceWithMaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompareFaceWithMaskResponseBodyData getData() {
        return this.data;
    }

    public CompareFaceWithMaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompareFaceWithMaskResponseBodyData extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("IsMaskA")
        public Long isMaskA;

        @NameInMap("IsMaskB")
        public Long isMaskB;

        @NameInMap("LandmarksAList")
        public java.util.List<Long> landmarksAList;

        @NameInMap("LandmarksBList")
        public java.util.List<Long> landmarksBList;

        @NameInMap("MessageTips")
        public String messageTips;

        @NameInMap("QualityScoreA")
        public Float qualityScoreA;

        @NameInMap("QualityScoreB")
        public Float qualityScoreB;

        @NameInMap("RectAList")
        public java.util.List<Long> rectAList;

        @NameInMap("RectBList")
        public java.util.List<Long> rectBList;

        @NameInMap("Thresholds")
        public java.util.List<Long> thresholds;

        public static CompareFaceWithMaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceWithMaskResponseBodyData self = new CompareFaceWithMaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompareFaceWithMaskResponseBodyData setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public CompareFaceWithMaskResponseBodyData setIsMaskA(Long isMaskA) {
            this.isMaskA = isMaskA;
            return this;
        }
        public Long getIsMaskA() {
            return this.isMaskA;
        }

        public CompareFaceWithMaskResponseBodyData setIsMaskB(Long isMaskB) {
            this.isMaskB = isMaskB;
            return this;
        }
        public Long getIsMaskB() {
            return this.isMaskB;
        }

        public CompareFaceWithMaskResponseBodyData setLandmarksAList(java.util.List<Long> landmarksAList) {
            this.landmarksAList = landmarksAList;
            return this;
        }
        public java.util.List<Long> getLandmarksAList() {
            return this.landmarksAList;
        }

        public CompareFaceWithMaskResponseBodyData setLandmarksBList(java.util.List<Long> landmarksBList) {
            this.landmarksBList = landmarksBList;
            return this;
        }
        public java.util.List<Long> getLandmarksBList() {
            return this.landmarksBList;
        }

        public CompareFaceWithMaskResponseBodyData setMessageTips(String messageTips) {
            this.messageTips = messageTips;
            return this;
        }
        public String getMessageTips() {
            return this.messageTips;
        }

        public CompareFaceWithMaskResponseBodyData setQualityScoreA(Float qualityScoreA) {
            this.qualityScoreA = qualityScoreA;
            return this;
        }
        public Float getQualityScoreA() {
            return this.qualityScoreA;
        }

        public CompareFaceWithMaskResponseBodyData setQualityScoreB(Float qualityScoreB) {
            this.qualityScoreB = qualityScoreB;
            return this;
        }
        public Float getQualityScoreB() {
            return this.qualityScoreB;
        }

        public CompareFaceWithMaskResponseBodyData setRectAList(java.util.List<Long> rectAList) {
            this.rectAList = rectAList;
            return this;
        }
        public java.util.List<Long> getRectAList() {
            return this.rectAList;
        }

        public CompareFaceWithMaskResponseBodyData setRectBList(java.util.List<Long> rectBList) {
            this.rectBList = rectBList;
            return this;
        }
        public java.util.List<Long> getRectBList() {
            return this.rectBList;
        }

        public CompareFaceWithMaskResponseBodyData setThresholds(java.util.List<Long> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public java.util.List<Long> getThresholds() {
            return this.thresholds;
        }

    }

}
