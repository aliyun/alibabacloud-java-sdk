// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CompareFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CompareFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceResponseBody self = new CompareFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareFaceResponseBody setData(CompareFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompareFaceResponseBodyData getData() {
        return this.data;
    }

    public CompareFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompareFaceResponseBodyData extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        // 信息提示信息，纯文字描述，目前支持质量分的提示信息
        @NameInMap("MessageTips")
        public String messageTips;

        // 输入图像A的质量分
        @NameInMap("QualityScoreA")
        public Float qualityScoreA;

        // 输入图像A的质量分
        @NameInMap("QualityScoreB")
        public Float qualityScoreB;

        @NameInMap("RectAList")
        public java.util.List<Integer> rectAList;

        @NameInMap("RectBList")
        public java.util.List<Integer> rectBList;

        @NameInMap("Thresholds")
        public java.util.List<Float> thresholds;

        public static CompareFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceResponseBodyData self = new CompareFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompareFaceResponseBodyData setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public CompareFaceResponseBodyData setMessageTips(String messageTips) {
            this.messageTips = messageTips;
            return this;
        }
        public String getMessageTips() {
            return this.messageTips;
        }

        public CompareFaceResponseBodyData setQualityScoreA(Float qualityScoreA) {
            this.qualityScoreA = qualityScoreA;
            return this;
        }
        public Float getQualityScoreA() {
            return this.qualityScoreA;
        }

        public CompareFaceResponseBodyData setQualityScoreB(Float qualityScoreB) {
            this.qualityScoreB = qualityScoreB;
            return this;
        }
        public Float getQualityScoreB() {
            return this.qualityScoreB;
        }

        public CompareFaceResponseBodyData setRectAList(java.util.List<Integer> rectAList) {
            this.rectAList = rectAList;
            return this;
        }
        public java.util.List<Integer> getRectAList() {
            return this.rectAList;
        }

        public CompareFaceResponseBodyData setRectBList(java.util.List<Integer> rectBList) {
            this.rectBList = rectBList;
            return this;
        }
        public java.util.List<Integer> getRectBList() {
            return this.rectBList;
        }

        public CompareFaceResponseBodyData setThresholds(java.util.List<Float> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public java.util.List<Float> getThresholds() {
            return this.thresholds;
        }

    }

}
