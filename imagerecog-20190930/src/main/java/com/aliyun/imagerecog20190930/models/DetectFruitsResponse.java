// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectFruitsResponseData data;

    public static DetectFruitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsResponse self = new DetectFruitsResponse();
        return TeaModel.build(map, self);
    }

    public DetectFruitsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectFruitsResponse setData(DetectFruitsResponseData data) {
        this.data = data;
        return this;
    }
    public DetectFruitsResponseData getData() {
        return this.data;
    }

    public static class DetectFruitsResponseDataElements extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("Box")
        @Validation(required = true)
        public java.util.List<Float> box;

        public static DetectFruitsResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseDataElements self = new DetectFruitsResponseDataElements();
            return TeaModel.build(map, self);
        }

        public DetectFruitsResponseDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DetectFruitsResponseDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectFruitsResponseDataElements setBox(java.util.List<Float> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Float> getBox() {
            return this.box;
        }

    }

    public static class DetectFruitsResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectFruitsResponseDataElements> elements;

        public static DetectFruitsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseData self = new DetectFruitsResponseData();
            return TeaModel.build(map, self);
        }

        public DetectFruitsResponseData setElements(java.util.List<DetectFruitsResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectFruitsResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
