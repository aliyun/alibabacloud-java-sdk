// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectFruitsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectFruitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsResponseBody self = new DetectFruitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectFruitsResponseBody setData(DetectFruitsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectFruitsResponseBodyData getData() {
        return this.data;
    }

    public DetectFruitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectFruitsResponseBodyDataElements extends TeaModel {
        @NameInMap("Box")
        public java.util.List<Float> box;

        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static DetectFruitsResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseBodyDataElements self = new DetectFruitsResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectFruitsResponseBodyDataElements setBox(java.util.List<Float> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Float> getBox() {
            return this.box;
        }

        public DetectFruitsResponseBodyDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DetectFruitsResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectFruitsResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectFruitsResponseBodyDataElements> elements;

        public static DetectFruitsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseBodyData self = new DetectFruitsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectFruitsResponseBodyData setElements(java.util.List<DetectFruitsResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectFruitsResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
