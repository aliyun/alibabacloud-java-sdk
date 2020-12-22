// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizePublicFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizePublicFaceResponseBodyData data;

    public static RecognizePublicFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizePublicFaceResponseBody self = new RecognizePublicFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizePublicFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizePublicFaceResponseBody setData(RecognizePublicFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizePublicFaceResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Rate")
        public Float rate;

        public static RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces self = new RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

    public static class RecognizePublicFaceResponseBodyDataElementsResultsSubResults extends TeaModel {
        @NameInMap("W")
        public Float w;

        @NameInMap("Faces")
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces> faces;

        @NameInMap("H")
        public Float h;

        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static RecognizePublicFaceResponseBodyDataElementsResultsSubResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElementsResultsSubResults self = new RecognizePublicFaceResponseBodyDataElementsResultsSubResults();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setFaces(java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces> getFaces() {
            return this.faces;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class RecognizePublicFaceResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("SubResults")
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResults> subResults;

        @NameInMap("Rate")
        public Float rate;

        public static RecognizePublicFaceResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElementsResults self = new RecognizePublicFaceResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setSubResults(java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResults> subResults) {
            this.subResults = subResults;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResults> getSubResults() {
            return this.subResults;
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

    public static class RecognizePublicFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Results")
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResults> results;

        public static RecognizePublicFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElements self = new RecognizePublicFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public RecognizePublicFaceResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizePublicFaceResponseBodyDataElements setResults(java.util.List<RecognizePublicFaceResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class RecognizePublicFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizePublicFaceResponseBodyDataElements> elements;

        public static RecognizePublicFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyData self = new RecognizePublicFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyData setElements(java.util.List<RecognizePublicFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
