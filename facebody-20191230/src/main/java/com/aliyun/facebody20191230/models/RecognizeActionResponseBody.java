// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeActionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeActionResponseBody self = new RecognizeActionResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeActionResponseBody setData(RecognizeActionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeActionResponseBodyData getData() {
        return this.data;
    }

    public RecognizeActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeActionResponseBodyDataElementsBoxes extends TeaModel {
        @NameInMap("Box")
        public java.util.List<Integer> box;

        public static RecognizeActionResponseBodyDataElementsBoxes build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionResponseBodyDataElementsBoxes self = new RecognizeActionResponseBodyDataElementsBoxes();
            return TeaModel.build(map, self);
        }

        public RecognizeActionResponseBodyDataElementsBoxes setBox(java.util.List<Integer> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Integer> getBox() {
            return this.box;
        }

    }

    public static class RecognizeActionResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<RecognizeActionResponseBodyDataElementsBoxes> boxes;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Scores")
        public java.util.List<Float> scores;

        @NameInMap("Timestamp")
        public Integer timestamp;

        public static RecognizeActionResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionResponseBodyDataElements self = new RecognizeActionResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeActionResponseBodyDataElements setBoxes(java.util.List<RecognizeActionResponseBodyDataElementsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<RecognizeActionResponseBodyDataElementsBoxes> getBoxes() {
            return this.boxes;
        }

        public RecognizeActionResponseBodyDataElements setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public RecognizeActionResponseBodyDataElements setScores(java.util.List<Float> scores) {
            this.scores = scores;
            return this;
        }
        public java.util.List<Float> getScores() {
            return this.scores;
        }

        public RecognizeActionResponseBodyDataElements setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

    }

    public static class RecognizeActionResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeActionResponseBodyDataElements> elements;

        public static RecognizeActionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionResponseBodyData self = new RecognizeActionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeActionResponseBodyData setElements(java.util.List<RecognizeActionResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeActionResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
