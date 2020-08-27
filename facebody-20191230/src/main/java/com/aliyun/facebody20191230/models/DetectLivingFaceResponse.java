// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectLivingFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectLivingFaceResponseData data;

    public static DetectLivingFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectLivingFaceResponse self = new DetectLivingFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectLivingFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectLivingFaceResponse setData(DetectLivingFaceResponseData data) {
        this.data = data;
        return this;
    }
    public DetectLivingFaceResponseData getData() {
        return this.data;
    }

    public static class DetectLivingFaceResponseDataElementsResultsFrames extends TeaModel {
        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static DetectLivingFaceResponseDataElementsResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseDataElementsResultsFrames self = new DetectLivingFaceResponseDataElementsResultsFrames();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseDataElementsResultsFrames setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DetectLivingFaceResponseDataElementsResultsFrames setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DetectLivingFaceResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("Frames")
        @Validation(required = true)
        public java.util.List<DetectLivingFaceResponseDataElementsResultsFrames> frames;

        public static DetectLivingFaceResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseDataElementsResults self = new DetectLivingFaceResponseDataElementsResults();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DetectLivingFaceResponseDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DetectLivingFaceResponseDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DetectLivingFaceResponseDataElementsResults setFrames(java.util.List<DetectLivingFaceResponseDataElementsResultsFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<DetectLivingFaceResponseDataElementsResultsFrames> getFrames() {
            return this.frames;
        }

    }

    public static class DetectLivingFaceResponseDataElements extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<DetectLivingFaceResponseDataElementsResults> results;

        public static DetectLivingFaceResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseDataElements self = new DetectLivingFaceResponseDataElements();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DetectLivingFaceResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public DetectLivingFaceResponseDataElements setResults(java.util.List<DetectLivingFaceResponseDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DetectLivingFaceResponseDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class DetectLivingFaceResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectLivingFaceResponseDataElements> elements;

        public static DetectLivingFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseData self = new DetectLivingFaceResponseData();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseData setElements(java.util.List<DetectLivingFaceResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectLivingFaceResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
