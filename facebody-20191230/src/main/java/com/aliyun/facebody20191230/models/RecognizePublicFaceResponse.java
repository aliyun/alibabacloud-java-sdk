// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizePublicFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizePublicFaceResponseData data;

    public static RecognizePublicFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePublicFaceResponse self = new RecognizePublicFaceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePublicFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizePublicFaceResponse setData(RecognizePublicFaceResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizePublicFaceResponseData getData() {
        return this.data;
    }

    public static class RecognizePublicFaceResponseDataElementsResultsSubResultsFaces extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        public static RecognizePublicFaceResponseDataElementsResultsSubResultsFaces build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseDataElementsResultsSubResultsFaces self = new RecognizePublicFaceResponseDataElementsResultsSubResultsFaces();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResultsFaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResultsFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResultsFaces setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

    public static class RecognizePublicFaceResponseDataElementsResultsSubResults extends TeaModel {
        @NameInMap("H")
        @Validation(required = true)
        public Float h;

        @NameInMap("W")
        @Validation(required = true)
        public Float w;

        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        @NameInMap("Faces")
        @Validation(required = true)
        public java.util.List<RecognizePublicFaceResponseDataElementsResultsSubResultsFaces> faces;

        public static RecognizePublicFaceResponseDataElementsResultsSubResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseDataElementsResultsSubResults self = new RecognizePublicFaceResponseDataElementsResultsSubResults();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResults setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResults setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResults setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResults setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public RecognizePublicFaceResponseDataElementsResultsSubResults setFaces(java.util.List<RecognizePublicFaceResponseDataElementsResultsSubResultsFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseDataElementsResultsSubResultsFaces> getFaces() {
            return this.faces;
        }

    }

    public static class RecognizePublicFaceResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("SubResults")
        @Validation(required = true)
        public java.util.List<RecognizePublicFaceResponseDataElementsResultsSubResults> subResults;

        public static RecognizePublicFaceResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseDataElementsResults self = new RecognizePublicFaceResponseDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizePublicFaceResponseDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public RecognizePublicFaceResponseDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public RecognizePublicFaceResponseDataElementsResults setSubResults(java.util.List<RecognizePublicFaceResponseDataElementsResultsSubResults> subResults) {
            this.subResults = subResults;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseDataElementsResultsSubResults> getSubResults() {
            return this.subResults;
        }

    }

    public static class RecognizePublicFaceResponseDataElements extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizePublicFaceResponseDataElementsResults> results;

        public static RecognizePublicFaceResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseDataElements self = new RecognizePublicFaceResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizePublicFaceResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public RecognizePublicFaceResponseDataElements setResults(java.util.List<RecognizePublicFaceResponseDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class RecognizePublicFaceResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizePublicFaceResponseDataElements> elements;

        public static RecognizePublicFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceResponseData self = new RecognizePublicFaceResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceResponseData setElements(java.util.List<RecognizePublicFaceResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizePublicFaceResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
