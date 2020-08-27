// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public VerifyFaceMaskResponseData data;

    public static VerifyFaceMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskResponse self = new VerifyFaceMaskResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyFaceMaskResponse setData(VerifyFaceMaskResponseData data) {
        this.data = data;
        return this;
    }
    public VerifyFaceMaskResponseData getData() {
        return this.data;
    }

    public static class VerifyFaceMaskResponseData extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("Mask")
        @Validation(required = true)
        public Integer mask;

        @NameInMap("MaskRef")
        @Validation(required = true)
        public Integer maskRef;

        @NameInMap("Rectangle")
        @Validation(required = true)
        public java.util.List<Integer> rectangle;

        @NameInMap("RectangleRef")
        @Validation(required = true)
        public java.util.List<Integer> rectangleRef;

        @NameInMap("Thresholds")
        @Validation(required = true)
        public java.util.List<Float> thresholds;

        public static VerifyFaceMaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            VerifyFaceMaskResponseData self = new VerifyFaceMaskResponseData();
            return TeaModel.build(map, self);
        }

        public VerifyFaceMaskResponseData setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public VerifyFaceMaskResponseData setMask(Integer mask) {
            this.mask = mask;
            return this;
        }
        public Integer getMask() {
            return this.mask;
        }

        public VerifyFaceMaskResponseData setMaskRef(Integer maskRef) {
            this.maskRef = maskRef;
            return this;
        }
        public Integer getMaskRef() {
            return this.maskRef;
        }

        public VerifyFaceMaskResponseData setRectangle(java.util.List<Integer> rectangle) {
            this.rectangle = rectangle;
            return this;
        }
        public java.util.List<Integer> getRectangle() {
            return this.rectangle;
        }

        public VerifyFaceMaskResponseData setRectangleRef(java.util.List<Integer> rectangleRef) {
            this.rectangleRef = rectangleRef;
            return this;
        }
        public java.util.List<Integer> getRectangleRef() {
            return this.rectangleRef;
        }

        public VerifyFaceMaskResponseData setThresholds(java.util.List<Float> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public java.util.List<Float> getThresholds() {
            return this.thresholds;
        }

    }

}
