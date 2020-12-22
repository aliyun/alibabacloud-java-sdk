// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CompareFaceResponseBodyData data;

    public static CompareFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceResponseBody self = new CompareFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFaceResponseBody setData(CompareFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompareFaceResponseBodyData getData() {
        return this.data;
    }

    public static class CompareFaceResponseBodyData extends TeaModel {
        @NameInMap("Thresholds")
        public java.util.List<Float> thresholds;

        @NameInMap("RectBList")
        public java.util.List<Integer> rectBList;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("RectAList")
        public java.util.List<Integer> rectAList;

        public static CompareFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceResponseBodyData self = new CompareFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompareFaceResponseBodyData setThresholds(java.util.List<Float> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public java.util.List<Float> getThresholds() {
            return this.thresholds;
        }

        public CompareFaceResponseBodyData setRectBList(java.util.List<Integer> rectBList) {
            this.rectBList = rectBList;
            return this;
        }
        public java.util.List<Integer> getRectBList() {
            return this.rectBList;
        }

        public CompareFaceResponseBodyData setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public CompareFaceResponseBodyData setRectAList(java.util.List<Integer> rectAList) {
            this.rectAList = rectAList;
            return this;
        }
        public java.util.List<Integer> getRectAList() {
            return this.rectAList;
        }

    }

}
