// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeepfakeFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeepfakeFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeepfakeFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeFaceResponseBody self = new DeepfakeFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeepfakeFaceResponseBody setData(DeepfakeFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeepfakeFaceResponseBodyData getData() {
        return this.data;
    }

    public DeepfakeFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeepfakeFaceResponseBodyDataElementsResultsRect extends TeaModel {
        @NameInMap("Height")
        public Long height;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Width")
        public Long width;

        public static DeepfakeFaceResponseBodyDataElementsResultsRect build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeFaceResponseBodyDataElementsResultsRect self = new DeepfakeFaceResponseBodyDataElementsResultsRect();
            return TeaModel.build(map, self);
        }

        public DeepfakeFaceResponseBodyDataElementsResultsRect setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DeepfakeFaceResponseBodyDataElementsResultsRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DeepfakeFaceResponseBodyDataElementsResultsRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DeepfakeFaceResponseBodyDataElementsResultsRect setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class DeepfakeFaceResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Label")
        public String label;

        @NameInMap("MessageTips")
        public String messageTips;

        @NameInMap("Rect")
        public DeepfakeFaceResponseBodyDataElementsResultsRect rect;

        public static DeepfakeFaceResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeFaceResponseBodyDataElementsResults self = new DeepfakeFaceResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public DeepfakeFaceResponseBodyDataElementsResults setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DeepfakeFaceResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DeepfakeFaceResponseBodyDataElementsResults setMessageTips(String messageTips) {
            this.messageTips = messageTips;
            return this;
        }
        public String getMessageTips() {
            return this.messageTips;
        }

        public DeepfakeFaceResponseBodyDataElementsResults setRect(DeepfakeFaceResponseBodyDataElementsResultsRect rect) {
            this.rect = rect;
            return this;
        }
        public DeepfakeFaceResponseBodyDataElementsResultsRect getRect() {
            return this.rect;
        }

    }

    public static class DeepfakeFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("FaceNumber")
        public Long faceNumber;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Results")
        public java.util.List<DeepfakeFaceResponseBodyDataElementsResults> results;

        @NameInMap("TaskId")
        public String taskId;

        public static DeepfakeFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeFaceResponseBodyDataElements self = new DeepfakeFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DeepfakeFaceResponseBodyDataElements setFaceNumber(Long faceNumber) {
            this.faceNumber = faceNumber;
            return this;
        }
        public Long getFaceNumber() {
            return this.faceNumber;
        }

        public DeepfakeFaceResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public DeepfakeFaceResponseBodyDataElements setResults(java.util.List<DeepfakeFaceResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DeepfakeFaceResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

        public DeepfakeFaceResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DeepfakeFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DeepfakeFaceResponseBodyDataElements> elements;

        public static DeepfakeFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeFaceResponseBodyData self = new DeepfakeFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeepfakeFaceResponseBodyData setElements(java.util.List<DeepfakeFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DeepfakeFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
