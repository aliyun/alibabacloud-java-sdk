// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectInfraredLivingFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectInfraredLivingFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectInfraredLivingFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectInfraredLivingFaceResponseBody self = new DetectInfraredLivingFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectInfraredLivingFaceResponseBody setData(DetectInfraredLivingFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectInfraredLivingFaceResponseBodyData getData() {
        return this.data;
    }

    public DetectInfraredLivingFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectInfraredLivingFaceResponseBodyDataElementsResultsRect extends TeaModel {
        @NameInMap("Height")
        public Long height;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Width")
        public Long width;

        public static DetectInfraredLivingFaceResponseBodyDataElementsResultsRect build(java.util.Map<String, ?> map) throws Exception {
            DetectInfraredLivingFaceResponseBodyDataElementsResultsRect self = new DetectInfraredLivingFaceResponseBodyDataElementsResultsRect();
            return TeaModel.build(map, self);
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResultsRect setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResultsRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResultsRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResultsRect setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class DetectInfraredLivingFaceResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("MessageTips")
        public String messageTips;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Rect")
        public DetectInfraredLivingFaceResponseBodyDataElementsResultsRect rect;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DetectInfraredLivingFaceResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            DetectInfraredLivingFaceResponseBodyDataElementsResults self = new DetectInfraredLivingFaceResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResults setMessageTips(String messageTips) {
            this.messageTips = messageTips;
            return this;
        }
        public String getMessageTips() {
            return this.messageTips;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResults setRect(DetectInfraredLivingFaceResponseBodyDataElementsResultsRect rect) {
            this.rect = rect;
            return this;
        }
        public DetectInfraredLivingFaceResponseBodyDataElementsResultsRect getRect() {
            return this.rect;
        }

        public DetectInfraredLivingFaceResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DetectInfraredLivingFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("FaceNumber")
        public Long faceNumber;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Results")
        public java.util.List<DetectInfraredLivingFaceResponseBodyDataElementsResults> results;

        public static DetectInfraredLivingFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectInfraredLivingFaceResponseBodyDataElements self = new DetectInfraredLivingFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectInfraredLivingFaceResponseBodyDataElements setFaceNumber(Long faceNumber) {
            this.faceNumber = faceNumber;
            return this;
        }
        public Long getFaceNumber() {
            return this.faceNumber;
        }

        public DetectInfraredLivingFaceResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public DetectInfraredLivingFaceResponseBodyDataElements setResults(java.util.List<DetectInfraredLivingFaceResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DetectInfraredLivingFaceResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class DetectInfraredLivingFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectInfraredLivingFaceResponseBodyDataElements> elements;

        public static DetectInfraredLivingFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectInfraredLivingFaceResponseBodyData self = new DetectInfraredLivingFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectInfraredLivingFaceResponseBodyData setElements(java.util.List<DetectInfraredLivingFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectInfraredLivingFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
