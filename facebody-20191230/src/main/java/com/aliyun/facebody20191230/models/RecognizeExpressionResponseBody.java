// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeExpressionResponseBodyData data;

    public static RecognizeExpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExpressionResponseBody self = new RecognizeExpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeExpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeExpressionResponseBody setData(RecognizeExpressionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeExpressionResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeExpressionResponseBodyDataElementsFaceRectangle extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeExpressionResponseBodyDataElementsFaceRectangle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseBodyDataElementsFaceRectangle self = new RecognizeExpressionResponseBodyDataElementsFaceRectangle();
            return TeaModel.build(map, self);
        }

        public RecognizeExpressionResponseBodyDataElementsFaceRectangle setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeExpressionResponseBodyDataElementsFaceRectangle setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeExpressionResponseBodyDataElementsFaceRectangle setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeExpressionResponseBodyDataElementsFaceRectangle setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeExpressionResponseBodyDataElements extends TeaModel {
        @NameInMap("FaceRectangle")
        public RecognizeExpressionResponseBodyDataElementsFaceRectangle faceRectangle;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("FaceProbability")
        public Float faceProbability;

        public static RecognizeExpressionResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseBodyDataElements self = new RecognizeExpressionResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeExpressionResponseBodyDataElements setFaceRectangle(RecognizeExpressionResponseBodyDataElementsFaceRectangle faceRectangle) {
            this.faceRectangle = faceRectangle;
            return this;
        }
        public RecognizeExpressionResponseBodyDataElementsFaceRectangle getFaceRectangle() {
            return this.faceRectangle;
        }

        public RecognizeExpressionResponseBodyDataElements setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public RecognizeExpressionResponseBodyDataElements setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

    }

    public static class RecognizeExpressionResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeExpressionResponseBodyDataElements> elements;

        public static RecognizeExpressionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseBodyData self = new RecognizeExpressionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeExpressionResponseBodyData setElements(java.util.List<RecognizeExpressionResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeExpressionResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
