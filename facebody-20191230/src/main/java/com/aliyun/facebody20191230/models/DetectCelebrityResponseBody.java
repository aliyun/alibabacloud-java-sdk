// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectCelebrityResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectCelebrityResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectCelebrityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectCelebrityResponseBody self = new DetectCelebrityResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectCelebrityResponseBody setData(DetectCelebrityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectCelebrityResponseBodyData getData() {
        return this.data;
    }

    public DetectCelebrityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectCelebrityResponseBodyDataFaceRecognizeResults extends TeaModel {
        @NameInMap("FaceBoxes")
        public java.util.List<Float> faceBoxes;

        @NameInMap("Name")
        public String name;

        public static DetectCelebrityResponseBodyDataFaceRecognizeResults build(java.util.Map<String, ?> map) throws Exception {
            DetectCelebrityResponseBodyDataFaceRecognizeResults self = new DetectCelebrityResponseBodyDataFaceRecognizeResults();
            return TeaModel.build(map, self);
        }

        public DetectCelebrityResponseBodyDataFaceRecognizeResults setFaceBoxes(java.util.List<Float> faceBoxes) {
            this.faceBoxes = faceBoxes;
            return this;
        }
        public java.util.List<Float> getFaceBoxes() {
            return this.faceBoxes;
        }

        public DetectCelebrityResponseBodyDataFaceRecognizeResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DetectCelebrityResponseBodyData extends TeaModel {
        @NameInMap("FaceRecognizeResults")
        public java.util.List<DetectCelebrityResponseBodyDataFaceRecognizeResults> faceRecognizeResults;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static DetectCelebrityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectCelebrityResponseBodyData self = new DetectCelebrityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectCelebrityResponseBodyData setFaceRecognizeResults(java.util.List<DetectCelebrityResponseBodyDataFaceRecognizeResults> faceRecognizeResults) {
            this.faceRecognizeResults = faceRecognizeResults;
            return this;
        }
        public java.util.List<DetectCelebrityResponseBodyDataFaceRecognizeResults> getFaceRecognizeResults() {
            return this.faceRecognizeResults;
        }

        public DetectCelebrityResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectCelebrityResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
