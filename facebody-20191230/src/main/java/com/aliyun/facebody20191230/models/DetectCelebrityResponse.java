// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectCelebrityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectCelebrityResponseData data;

    public static DetectCelebrityResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectCelebrityResponse self = new DetectCelebrityResponse();
        return TeaModel.build(map, self);
    }

    public DetectCelebrityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectCelebrityResponse setData(DetectCelebrityResponseData data) {
        this.data = data;
        return this;
    }
    public DetectCelebrityResponseData getData() {
        return this.data;
    }

    public static class DetectCelebrityResponseDataFaceRecognizeResults extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("FaceBoxes")
        @Validation(required = true)
        public java.util.List<Float> faceBoxes;

        public static DetectCelebrityResponseDataFaceRecognizeResults build(java.util.Map<String, ?> map) throws Exception {
            DetectCelebrityResponseDataFaceRecognizeResults self = new DetectCelebrityResponseDataFaceRecognizeResults();
            return TeaModel.build(map, self);
        }

        public DetectCelebrityResponseDataFaceRecognizeResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DetectCelebrityResponseDataFaceRecognizeResults setFaceBoxes(java.util.List<Float> faceBoxes) {
            this.faceBoxes = faceBoxes;
            return this;
        }
        public java.util.List<Float> getFaceBoxes() {
            return this.faceBoxes;
        }

    }

    public static class DetectCelebrityResponseData extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("FaceRecognizeResults")
        @Validation(required = true)
        public java.util.List<DetectCelebrityResponseDataFaceRecognizeResults> faceRecognizeResults;

        public static DetectCelebrityResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectCelebrityResponseData self = new DetectCelebrityResponseData();
            return TeaModel.build(map, self);
        }

        public DetectCelebrityResponseData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectCelebrityResponseData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectCelebrityResponseData setFaceRecognizeResults(java.util.List<DetectCelebrityResponseDataFaceRecognizeResults> faceRecognizeResults) {
            this.faceRecognizeResults = faceRecognizeResults;
            return this;
        }
        public java.util.List<DetectCelebrityResponseDataFaceRecognizeResults> getFaceRecognizeResults() {
            return this.faceRecognizeResults;
        }

    }

}
