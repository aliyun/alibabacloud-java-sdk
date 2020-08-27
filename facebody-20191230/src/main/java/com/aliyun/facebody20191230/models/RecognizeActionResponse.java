// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeActionResponseData data;

    public static RecognizeActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeActionResponse self = new RecognizeActionResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeActionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeActionResponse setData(RecognizeActionResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeActionResponseData getData() {
        return this.data;
    }

    public static class RecognizeActionResponseDataElementsBoxes extends TeaModel {
        @NameInMap("Box")
        @Validation(required = true)
        public java.util.List<Integer> box;

        public static RecognizeActionResponseDataElementsBoxes build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionResponseDataElementsBoxes self = new RecognizeActionResponseDataElementsBoxes();
            return TeaModel.build(map, self);
        }

        public RecognizeActionResponseDataElementsBoxes setBox(java.util.List<Integer> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Integer> getBox() {
            return this.box;
        }

    }

    public static class RecognizeActionResponseDataElements extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Integer timestamp;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<RecognizeActionResponseDataElementsBoxes> boxes;

        @NameInMap("Scores")
        @Validation(required = true)
        public java.util.List<Float> scores;

        @NameInMap("Labels")
        @Validation(required = true)
        public java.util.List<String> labels;

        public static RecognizeActionResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionResponseDataElements self = new RecognizeActionResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeActionResponseDataElements setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

        public RecognizeActionResponseDataElements setBoxes(java.util.List<RecognizeActionResponseDataElementsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<RecognizeActionResponseDataElementsBoxes> getBoxes() {
            return this.boxes;
        }

        public RecognizeActionResponseDataElements setScores(java.util.List<Float> scores) {
            this.scores = scores;
            return this;
        }
        public java.util.List<Float> getScores() {
            return this.scores;
        }

        public RecognizeActionResponseDataElements setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

    }

    public static class RecognizeActionResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeActionResponseDataElements> elements;

        public static RecognizeActionResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionResponseData self = new RecognizeActionResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeActionResponseData setElements(java.util.List<RecognizeActionResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeActionResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
