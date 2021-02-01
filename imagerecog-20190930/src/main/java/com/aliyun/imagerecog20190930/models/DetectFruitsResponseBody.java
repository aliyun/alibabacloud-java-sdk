// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectFruitsResponseBodyData data;

    public static DetectFruitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsResponseBody self = new DetectFruitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectFruitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectFruitsResponseBody setData(DetectFruitsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectFruitsResponseBodyData getData() {
        return this.data;
    }

    public static class DetectFruitsResponseBodyDataElements extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Box")
        public java.util.List<Float> box;

        @NameInMap("Name")
        public String name;

        public static DetectFruitsResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseBodyDataElements self = new DetectFruitsResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectFruitsResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
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
