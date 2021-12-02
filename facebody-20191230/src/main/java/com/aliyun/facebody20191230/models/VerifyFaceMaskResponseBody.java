// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public VerifyFaceMaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyFaceMaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskResponseBody self = new VerifyFaceMaskResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskResponseBody setData(VerifyFaceMaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyFaceMaskResponseBodyData getData() {
        return this.data;
    }

    public VerifyFaceMaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyFaceMaskResponseBodyData extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Mask")
        public Integer mask;

        @NameInMap("MaskRef")
        public Integer maskRef;

        @NameInMap("Rectangle")
        public java.util.List<Integer> rectangle;

        @NameInMap("RectangleRef")
        public java.util.List<Integer> rectangleRef;

        @NameInMap("Thresholds")
        public java.util.List<Float> thresholds;

        public static VerifyFaceMaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyFaceMaskResponseBodyData self = new VerifyFaceMaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyFaceMaskResponseBodyData setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public VerifyFaceMaskResponseBodyData setMask(Integer mask) {
            this.mask = mask;
            return this;
        }
        public Integer getMask() {
            return this.mask;
        }

        public VerifyFaceMaskResponseBodyData setMaskRef(Integer maskRef) {
            this.maskRef = maskRef;
            return this;
        }
        public Integer getMaskRef() {
            return this.maskRef;
        }

        public VerifyFaceMaskResponseBodyData setRectangle(java.util.List<Integer> rectangle) {
            this.rectangle = rectangle;
            return this;
        }
        public java.util.List<Integer> getRectangle() {
            return this.rectangle;
        }

        public VerifyFaceMaskResponseBodyData setRectangleRef(java.util.List<Integer> rectangleRef) {
            this.rectangleRef = rectangleRef;
            return this;
        }
        public java.util.List<Integer> getRectangleRef() {
            return this.rectangleRef;
        }

        public VerifyFaceMaskResponseBodyData setThresholds(java.util.List<Float> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public java.util.List<Float> getThresholds() {
            return this.thresholds;
        }

    }

}
