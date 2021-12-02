// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizePublicFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizePublicFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizePublicFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizePublicFaceResponseBody self = new RecognizePublicFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizePublicFaceResponseBody setData(RecognizePublicFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizePublicFaceResponseBodyData getData() {
        return this.data;
    }

    public RecognizePublicFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rate")
        public Float rate;

        public static RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces self = new RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
        @NameInMap("Faces")
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResultsFaces> faces;

        @NameInMap("H")
        public Float h;

        @NameInMap("W")
        public Float w;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizePublicFaceResponseBodyDataElementsResultsSubResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElementsResultsSubResults self = new RecognizePublicFaceResponseBodyDataElementsResultsSubResults();
            return TeaModel.build(map, self);
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

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizePublicFaceResponseBodyDataElementsResultsSubResults setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizePublicFaceResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("SubResults")
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResults> subResults;

        @NameInMap("Suggestion")
        public String suggestion;

        public static RecognizePublicFaceResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseBodyDataElementsResults self = new RecognizePublicFaceResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setSubResults(java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResults> subResults) {
            this.subResults = subResults;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResultsSubResults> getSubResults() {
            return this.subResults;
        }

        public RecognizePublicFaceResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class RecognizePublicFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Results")
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResults> results;

        @NameInMap("TaskId")
        public String taskId;

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

        public RecognizePublicFaceResponseBodyDataElements setResults(java.util.List<RecognizePublicFaceResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

        public RecognizePublicFaceResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
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
