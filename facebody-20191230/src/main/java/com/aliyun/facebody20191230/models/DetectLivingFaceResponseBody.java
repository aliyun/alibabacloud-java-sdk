// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectLivingFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectLivingFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectLivingFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectLivingFaceResponseBody self = new DetectLivingFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectLivingFaceResponseBody setData(DetectLivingFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectLivingFaceResponseBodyData getData() {
        return this.data;
    }

    public DetectLivingFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectLivingFaceResponseBodyDataElementsResultsFrames extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Url")
        public String url;

        public static DetectLivingFaceResponseBodyDataElementsResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseBodyDataElementsResultsFrames self = new DetectLivingFaceResponseBodyDataElementsResultsFrames();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseBodyDataElementsResultsFrames setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DetectLivingFaceResponseBodyDataElementsResultsFrames setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DetectLivingFaceResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Frames")
        public java.util.List<DetectLivingFaceResponseBodyDataElementsResultsFrames> frames;

        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DetectLivingFaceResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseBodyDataElementsResults self = new DetectLivingFaceResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseBodyDataElementsResults setFrames(java.util.List<DetectLivingFaceResponseBodyDataElementsResultsFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<DetectLivingFaceResponseBodyDataElementsResultsFrames> getFrames() {
            return this.frames;
        }

        public DetectLivingFaceResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DetectLivingFaceResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DetectLivingFaceResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DetectLivingFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Results")
        public java.util.List<DetectLivingFaceResponseBodyDataElementsResults> results;

        @NameInMap("TaskId")
        public String taskId;

        public static DetectLivingFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseBodyDataElements self = new DetectLivingFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public DetectLivingFaceResponseBodyDataElements setResults(java.util.List<DetectLivingFaceResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DetectLivingFaceResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

        public DetectLivingFaceResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DetectLivingFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectLivingFaceResponseBodyDataElements> elements;

        public static DetectLivingFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseBodyData self = new DetectLivingFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseBodyData setElements(java.util.List<DetectLivingFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectLivingFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
