// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectLivingFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectLivingFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2EEA0396-BD84-5729-B8BD-D60776FCEF2B</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>84.83</p>
         */
        @NameInMap("Rate")
        public Float rate;

        /**
         * <strong>example:</strong>
         * <p><a href="http://aligreen-shanghai.oss-cn-shanghai.aliyuncs.com/prod/hammal/26210da42/28118541_TB1urBOQFXXXXbMXFXXXXXXXXXX-1442-257.png?Expires=1582703593&OSSAccessKeyId=H4sp5QfNbuDg****&Signature=%2B8iUkb5YjomYR8ujV2c8wMAavs****&x-oss-process=image%2Fcrop%2Cx_0%2Cw_288%2Fauto-orient%2C0">http://aligreen-shanghai.oss-cn-shanghai.aliyuncs.com/prod/hammal/26210da42/28118541_TB1urBOQFXXXXbMXFXXXXXXXXXX-1442-257.png?Expires=1582703593&amp;OSSAccessKeyId=H4sp5QfNbuDg****&amp;Signature=%2B8iUkb5YjomYR8ujV2c8wMAavs****&amp;x-oss-process=image%2Fcrop%2Cx_0%2Cw_288%2Fauto-orient%2C0</a></p>
         */
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

    public static class DetectLivingFaceResponseBodyDataElementsResultsRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Left")
        public Long left;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Top")
        public Long top;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Width")
        public Long width;

        public static DetectLivingFaceResponseBodyDataElementsResultsRect build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseBodyDataElementsResultsRect self = new DetectLivingFaceResponseBodyDataElementsResultsRect();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseBodyDataElementsResultsRect setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectLivingFaceResponseBodyDataElementsResultsRect setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectLivingFaceResponseBodyDataElementsResultsRect setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectLivingFaceResponseBodyDataElementsResultsRect setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class DetectLivingFaceResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Frames")
        public java.util.List<DetectLivingFaceResponseBodyDataElementsResultsFrames> frames;

        /**
         * <strong>example:</strong>
         * <p>liveness</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>blurred, occluded or large angle face, please check.</p>
         */
        @NameInMap("MessageTips")
        public String messageTips;

        /**
         * <strong>example:</strong>
         * <p>76.22</p>
         */
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Rect")
        public DetectLivingFaceResponseBodyDataElementsResultsRect rect;

        /**
         * <strong>example:</strong>
         * <p>review</p>
         */
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

        public DetectLivingFaceResponseBodyDataElementsResults setMessageTips(String messageTips) {
            this.messageTips = messageTips;
            return this;
        }
        public String getMessageTips() {
            return this.messageTips;
        }

        public DetectLivingFaceResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DetectLivingFaceResponseBodyDataElementsResults setRect(DetectLivingFaceResponseBodyDataElementsResultsRect rect) {
            this.rect = rect;
            return this;
        }
        public DetectLivingFaceResponseBodyDataElementsResultsRect getRect() {
            return this.rect;
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FaceNumber")
        public Long faceNumber;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectLivingFace/DetectLivingFace4.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectLivingFace/DetectLivingFace4.jpg</a></p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Results")
        public java.util.List<DetectLivingFaceResponseBodyDataElementsResults> results;

        /**
         * <strong>example:</strong>
         * <p>img1owc8WGskNm78OEAPJTZal-1****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DetectLivingFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceResponseBodyDataElements self = new DetectLivingFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceResponseBodyDataElements setFaceNumber(Long faceNumber) {
            this.faceNumber = faceNumber;
            return this;
        }
        public Long getFaceNumber() {
            return this.faceNumber;
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
