// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeExpressionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeExpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExpressionResponseBody self = new RecognizeExpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeExpressionResponseBody setData(RecognizeExpressionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeExpressionResponseBodyData getData() {
        return this.data;
    }

    public RecognizeExpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeExpressionResponseBodyDataElementsFaceRectangle extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeExpressionResponseBodyDataElementsFaceRectangle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseBodyDataElementsFaceRectangle self = new RecognizeExpressionResponseBodyDataElementsFaceRectangle();
            return TeaModel.build(map, self);
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

    }

    public static class RecognizeExpressionResponseBodyDataElements extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("FaceProbability")
        public Float faceProbability;

        @NameInMap("FaceRectangle")
        public RecognizeExpressionResponseBodyDataElementsFaceRectangle faceRectangle;

        public static RecognizeExpressionResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseBodyDataElements self = new RecognizeExpressionResponseBodyDataElements();
            return TeaModel.build(map, self);
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

        public RecognizeExpressionResponseBodyDataElements setFaceRectangle(RecognizeExpressionResponseBodyDataElementsFaceRectangle faceRectangle) {
            this.faceRectangle = faceRectangle;
            return this;
        }
        public RecognizeExpressionResponseBodyDataElementsFaceRectangle getFaceRectangle() {
            return this.faceRectangle;
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
