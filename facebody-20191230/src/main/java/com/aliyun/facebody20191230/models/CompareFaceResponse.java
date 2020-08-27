// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CompareFaceResponseData data;

    public static CompareFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceResponse self = new CompareFaceResponse();
        return TeaModel.build(map, self);
    }

    public CompareFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFaceResponse setData(CompareFaceResponseData data) {
        this.data = data;
        return this;
    }
    public CompareFaceResponseData getData() {
        return this.data;
    }

    public static class CompareFaceResponseData extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("Thresholds")
        @Validation(required = true)
        public java.util.List<Float> thresholds;

        @NameInMap("RectAList")
        @Validation(required = true)
        public java.util.List<Integer> rectAList;

        @NameInMap("RectBList")
        @Validation(required = true)
        public java.util.List<Integer> rectBList;

        public static CompareFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceResponseData self = new CompareFaceResponseData();
            return TeaModel.build(map, self);
        }

        public CompareFaceResponseData setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public CompareFaceResponseData setThresholds(java.util.List<Float> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public java.util.List<Float> getThresholds() {
            return this.thresholds;
        }

        public CompareFaceResponseData setRectAList(java.util.List<Integer> rectAList) {
            this.rectAList = rectAList;
            return this;
        }
        public java.util.List<Integer> getRectAList() {
            return this.rectAList;
        }

        public CompareFaceResponseData setRectBList(java.util.List<Integer> rectBList) {
            this.rectBList = rectBList;
            return this;
        }
        public java.util.List<Integer> getRectBList() {
            return this.rectBList;
        }

    }

}
