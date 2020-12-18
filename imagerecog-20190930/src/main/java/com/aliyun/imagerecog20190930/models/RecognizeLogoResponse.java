// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeLogoResponseData data;

    public static RecognizeLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoResponse self = new RecognizeLogoResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeLogoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeLogoResponse setData(RecognizeLogoResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeLogoResponseData getData() {
        return this.data;
    }

    public static class RecognizeLogoResponseDataElementsResultsLogosData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        @NameInMap("H")
        @Validation(required = true)
        public Float h;

        @NameInMap("W")
        @Validation(required = true)
        public Float w;

        public static RecognizeLogoResponseDataElementsResultsLogosData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseDataElementsResultsLogosData self = new RecognizeLogoResponseDataElementsResultsLogosData();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseDataElementsResultsLogosData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeLogoResponseDataElementsResultsLogosData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeLogoResponseDataElementsResultsLogosData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeLogoResponseDataElementsResultsLogosData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public RecognizeLogoResponseDataElementsResultsLogosData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizeLogoResponseDataElementsResultsLogosData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

    }

    public static class RecognizeLogoResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("LogosData")
        @Validation(required = true)
        public java.util.List<RecognizeLogoResponseDataElementsResultsLogosData> logosData;

        public static RecognizeLogoResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseDataElementsResults self = new RecognizeLogoResponseDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeLogoResponseDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public RecognizeLogoResponseDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public RecognizeLogoResponseDataElementsResults setLogosData(java.util.List<RecognizeLogoResponseDataElementsResultsLogosData> logosData) {
            this.logosData = logosData;
            return this;
        }
        public java.util.List<RecognizeLogoResponseDataElementsResultsLogosData> getLogosData() {
            return this.logosData;
        }

    }

    public static class RecognizeLogoResponseDataElements extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeLogoResponseDataElementsResults> results;

        public static RecognizeLogoResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseDataElements self = new RecognizeLogoResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizeLogoResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public RecognizeLogoResponseDataElements setResults(java.util.List<RecognizeLogoResponseDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeLogoResponseDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class RecognizeLogoResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeLogoResponseDataElements> elements;

        public static RecognizeLogoResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseData self = new RecognizeLogoResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseData setElements(java.util.List<RecognizeLogoResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeLogoResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
