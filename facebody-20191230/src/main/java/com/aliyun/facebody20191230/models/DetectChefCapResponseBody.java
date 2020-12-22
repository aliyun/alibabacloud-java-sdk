// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectChefCapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectChefCapResponseBodyData data;

    public static DetectChefCapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectChefCapResponseBody self = new DetectChefCapResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectChefCapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectChefCapResponseBody setData(DetectChefCapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectChefCapResponseBodyData getData() {
        return this.data;
    }

    public static class DetectChefCapResponseBodyDataElements extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Category")
        public String category;

        @NameInMap("Box")
        public java.util.List<Float> box;

        public static DetectChefCapResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectChefCapResponseBodyDataElements self = new DetectChefCapResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectChefCapResponseBodyDataElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DetectChefCapResponseBodyDataElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DetectChefCapResponseBodyDataElements setBox(java.util.List<Float> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Float> getBox() {
            return this.box;
        }

    }

    public static class DetectChefCapResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectChefCapResponseBodyDataElements> elements;

        public static DetectChefCapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectChefCapResponseBodyData self = new DetectChefCapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectChefCapResponseBodyData setElements(java.util.List<DetectChefCapResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectChefCapResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
