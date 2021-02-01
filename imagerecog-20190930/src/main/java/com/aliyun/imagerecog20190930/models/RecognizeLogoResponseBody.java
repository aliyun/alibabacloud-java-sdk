// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeLogoResponseBodyData data;

    public static RecognizeLogoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoResponseBody self = new RecognizeLogoResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeLogoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeLogoResponseBody setData(RecognizeLogoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeLogoResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeLogoResponseBodyDataElementsResultsLogosData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("W")
        public Float w;

        @NameInMap("H")
        public Float h;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Name")
        public String name;

        @NameInMap("X")
        public Float x;

        public static RecognizeLogoResponseBodyDataElementsResultsLogosData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseBodyDataElementsResultsLogosData self = new RecognizeLogoResponseBodyDataElementsResultsLogosData();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseBodyDataElementsResultsLogosData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeLogoResponseBodyDataElementsResultsLogosData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public RecognizeLogoResponseBodyDataElementsResultsLogosData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public RecognizeLogoResponseBodyDataElementsResultsLogosData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public RecognizeLogoResponseBodyDataElementsResultsLogosData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeLogoResponseBodyDataElementsResultsLogosData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class RecognizeLogoResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("LogosData")
        public java.util.List<RecognizeLogoResponseBodyDataElementsResultsLogosData> logosData;

        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Float rate;

        public static RecognizeLogoResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseBodyDataElementsResults self = new RecognizeLogoResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public RecognizeLogoResponseBodyDataElementsResults setLogosData(java.util.List<RecognizeLogoResponseBodyDataElementsResultsLogosData> logosData) {
            this.logosData = logosData;
            return this;
        }
        public java.util.List<RecognizeLogoResponseBodyDataElementsResultsLogosData> getLogosData() {
            return this.logosData;
        }

        public RecognizeLogoResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeLogoResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

    public static class RecognizeLogoResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Results")
        public java.util.List<RecognizeLogoResponseBodyDataElementsResults> results;

        public static RecognizeLogoResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseBodyDataElements self = new RecognizeLogoResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public RecognizeLogoResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizeLogoResponseBodyDataElements setResults(java.util.List<RecognizeLogoResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeLogoResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class RecognizeLogoResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeLogoResponseBodyDataElements> elements;

        public static RecognizeLogoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseBodyData self = new RecognizeLogoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoResponseBodyData setElements(java.util.List<RecognizeLogoResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeLogoResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
