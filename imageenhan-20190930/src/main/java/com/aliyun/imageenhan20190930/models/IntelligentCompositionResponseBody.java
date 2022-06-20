// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionResponseBody extends TeaModel {
    @NameInMap("Data")
    public IntelligentCompositionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static IntelligentCompositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionResponseBody self = new IntelligentCompositionResponseBody();
        return TeaModel.build(map, self);
    }

    public IntelligentCompositionResponseBody setData(IntelligentCompositionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IntelligentCompositionResponseBodyData getData() {
        return this.data;
    }

    public IntelligentCompositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class IntelligentCompositionResponseBodyDataElements extends TeaModel {
        @NameInMap("MaxX")
        public Integer maxX;

        @NameInMap("MaxY")
        public Integer maxY;

        @NameInMap("MinX")
        public Integer minX;

        @NameInMap("MinY")
        public Integer minY;

        @NameInMap("Score")
        public Float score;

        public static IntelligentCompositionResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            IntelligentCompositionResponseBodyDataElements self = new IntelligentCompositionResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public IntelligentCompositionResponseBodyDataElements setMaxX(Integer maxX) {
            this.maxX = maxX;
            return this;
        }
        public Integer getMaxX() {
            return this.maxX;
        }

        public IntelligentCompositionResponseBodyDataElements setMaxY(Integer maxY) {
            this.maxY = maxY;
            return this;
        }
        public Integer getMaxY() {
            return this.maxY;
        }

        public IntelligentCompositionResponseBodyDataElements setMinX(Integer minX) {
            this.minX = minX;
            return this;
        }
        public Integer getMinX() {
            return this.minX;
        }

        public IntelligentCompositionResponseBodyDataElements setMinY(Integer minY) {
            this.minY = minY;
            return this;
        }
        public Integer getMinY() {
            return this.minY;
        }

        public IntelligentCompositionResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class IntelligentCompositionResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<IntelligentCompositionResponseBodyDataElements> elements;

        public static IntelligentCompositionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IntelligentCompositionResponseBodyData self = new IntelligentCompositionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IntelligentCompositionResponseBodyData setElements(java.util.List<IntelligentCompositionResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<IntelligentCompositionResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
