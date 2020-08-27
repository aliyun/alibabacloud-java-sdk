// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeExpressionResponseData data;

    public static RecognizeExpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExpressionResponse self = new RecognizeExpressionResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeExpressionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeExpressionResponse setData(RecognizeExpressionResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeExpressionResponseData getData() {
        return this.data;
    }

    public static class RecognizeExpressionResponseDataElementsFaceRectangle extends TeaModel {
        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeExpressionResponseDataElementsFaceRectangle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseDataElementsFaceRectangle self = new RecognizeExpressionResponseDataElementsFaceRectangle();
            return TeaModel.build(map, self);
        }

        public RecognizeExpressionResponseDataElementsFaceRectangle setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeExpressionResponseDataElementsFaceRectangle setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeExpressionResponseDataElementsFaceRectangle setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeExpressionResponseDataElementsFaceRectangle setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeExpressionResponseDataElements extends TeaModel {
        @NameInMap("Expression")
        @Validation(required = true)
        public String expression;

        @NameInMap("FaceProbability")
        @Validation(required = true)
        public Float faceProbability;

        @NameInMap("FaceRectangle")
        @Validation(required = true)
        public RecognizeExpressionResponseDataElementsFaceRectangle faceRectangle;

        public static RecognizeExpressionResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseDataElements self = new RecognizeExpressionResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeExpressionResponseDataElements setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public RecognizeExpressionResponseDataElements setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

        public RecognizeExpressionResponseDataElements setFaceRectangle(RecognizeExpressionResponseDataElementsFaceRectangle faceRectangle) {
            this.faceRectangle = faceRectangle;
            return this;
        }
        public RecognizeExpressionResponseDataElementsFaceRectangle getFaceRectangle() {
            return this.faceRectangle;
        }

    }

    public static class RecognizeExpressionResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeExpressionResponseDataElements> elements;

        public static RecognizeExpressionResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeExpressionResponseData self = new RecognizeExpressionResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeExpressionResponseData setElements(java.util.List<RecognizeExpressionResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeExpressionResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
