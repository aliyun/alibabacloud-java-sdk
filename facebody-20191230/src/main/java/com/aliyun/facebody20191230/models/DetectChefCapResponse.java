// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectChefCapResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectChefCapResponseData data;

    public static DetectChefCapResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectChefCapResponse self = new DetectChefCapResponse();
        return TeaModel.build(map, self);
    }

    public DetectChefCapResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectChefCapResponse setData(DetectChefCapResponseData data) {
        this.data = data;
        return this;
    }
    public DetectChefCapResponseData getData() {
        return this.data;
    }

    public static class DetectChefCapResponseDataElements extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("Box")
        @Validation(required = true)
        public java.util.List<Float> box;

        public static DetectChefCapResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectChefCapResponseDataElements self = new DetectChefCapResponseDataElements();
            return TeaModel.build(map, self);
        }

        public DetectChefCapResponseDataElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DetectChefCapResponseDataElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DetectChefCapResponseDataElements setBox(java.util.List<Float> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Float> getBox() {
            return this.box;
        }

    }

    public static class DetectChefCapResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectChefCapResponseDataElements> elements;

        public static DetectChefCapResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectChefCapResponseData self = new DetectChefCapResponseData();
            return TeaModel.build(map, self);
        }

        public DetectChefCapResponseData setElements(java.util.List<DetectChefCapResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectChefCapResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
