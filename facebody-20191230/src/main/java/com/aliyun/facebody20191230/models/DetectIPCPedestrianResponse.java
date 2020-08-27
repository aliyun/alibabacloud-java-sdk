// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectIPCPedestrianResponseData data;

    public static DetectIPCPedestrianResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianResponse self = new DetectIPCPedestrianResponse();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectIPCPedestrianResponse setData(DetectIPCPedestrianResponseData data) {
        this.data = data;
        return this;
    }
    public DetectIPCPedestrianResponseData getData() {
        return this.data;
    }

    public static class DetectIPCPedestrianResponseDataImageInfoListElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static DetectIPCPedestrianResponseDataImageInfoListElements build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianResponseDataImageInfoListElements self = new DetectIPCPedestrianResponseDataImageInfoListElements();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianResponseDataImageInfoListElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectIPCPedestrianResponseDataImageInfoListElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

    }

    public static class DetectIPCPedestrianResponseDataImageInfoList extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("DataId")
        @Validation(required = true)
        public String dataId;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectIPCPedestrianResponseDataImageInfoListElements> elements;

        public static DetectIPCPedestrianResponseDataImageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianResponseDataImageInfoList self = new DetectIPCPedestrianResponseDataImageInfoList();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianResponseDataImageInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DetectIPCPedestrianResponseDataImageInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DetectIPCPedestrianResponseDataImageInfoList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DetectIPCPedestrianResponseDataImageInfoList setElements(java.util.List<DetectIPCPedestrianResponseDataImageInfoListElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectIPCPedestrianResponseDataImageInfoListElements> getElements() {
            return this.elements;
        }

    }

    public static class DetectIPCPedestrianResponseData extends TeaModel {
        @NameInMap("ImageInfoList")
        @Validation(required = true)
        public java.util.List<DetectIPCPedestrianResponseDataImageInfoList> imageInfoList;

        public static DetectIPCPedestrianResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianResponseData self = new DetectIPCPedestrianResponseData();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianResponseData setImageInfoList(java.util.List<DetectIPCPedestrianResponseDataImageInfoList> imageInfoList) {
            this.imageInfoList = imageInfoList;
            return this;
        }
        public java.util.List<DetectIPCPedestrianResponseDataImageInfoList> getImageInfoList() {
            return this.imageInfoList;
        }

    }

}
