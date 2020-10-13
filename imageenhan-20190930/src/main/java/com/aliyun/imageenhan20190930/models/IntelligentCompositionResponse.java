// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public IntelligentCompositionResponseData data;

    public static IntelligentCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionResponse self = new IntelligentCompositionResponse();
        return TeaModel.build(map, self);
    }

    public IntelligentCompositionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntelligentCompositionResponse setData(IntelligentCompositionResponseData data) {
        this.data = data;
        return this;
    }
    public IntelligentCompositionResponseData getData() {
        return this.data;
    }

    public static class IntelligentCompositionResponseDataElements extends TeaModel {
        @NameInMap("MinX")
        @Validation(required = true)
        public Integer minX;

        @NameInMap("MinY")
        @Validation(required = true)
        public Integer minY;

        @NameInMap("MaxX")
        @Validation(required = true)
        public Integer maxX;

        @NameInMap("MaxY")
        @Validation(required = true)
        public Integer maxY;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static IntelligentCompositionResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            IntelligentCompositionResponseDataElements self = new IntelligentCompositionResponseDataElements();
            return TeaModel.build(map, self);
        }

        public IntelligentCompositionResponseDataElements setMinX(Integer minX) {
            this.minX = minX;
            return this;
        }
        public Integer getMinX() {
            return this.minX;
        }

        public IntelligentCompositionResponseDataElements setMinY(Integer minY) {
            this.minY = minY;
            return this;
        }
        public Integer getMinY() {
            return this.minY;
        }

        public IntelligentCompositionResponseDataElements setMaxX(Integer maxX) {
            this.maxX = maxX;
            return this;
        }
        public Integer getMaxX() {
            return this.maxX;
        }

        public IntelligentCompositionResponseDataElements setMaxY(Integer maxY) {
            this.maxY = maxY;
            return this;
        }
        public Integer getMaxY() {
            return this.maxY;
        }

        public IntelligentCompositionResponseDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class IntelligentCompositionResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<IntelligentCompositionResponseDataElements> elements;

        public static IntelligentCompositionResponseData build(java.util.Map<String, ?> map) throws Exception {
            IntelligentCompositionResponseData self = new IntelligentCompositionResponseData();
            return TeaModel.build(map, self);
        }

        public IntelligentCompositionResponseData setElements(java.util.List<IntelligentCompositionResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<IntelligentCompositionResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
