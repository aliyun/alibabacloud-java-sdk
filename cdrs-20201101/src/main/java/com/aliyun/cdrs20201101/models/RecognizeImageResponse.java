// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class RecognizeImageResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeImageResponseData data;

    public static RecognizeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageResponse self = new RecognizeImageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeImageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeImageResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public RecognizeImageResponse setData(RecognizeImageResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageResponseData getData() {
        return this.data;
    }

    public static class RecognizeImageResponseDataBodyList extends TeaModel {
        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        public static RecognizeImageResponseDataBodyList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseDataBodyList self = new RecognizeImageResponseDataBodyList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseDataBodyList setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public RecognizeImageResponseDataBodyList setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeImageResponseDataBodyList setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeImageResponseDataBodyList setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public RecognizeImageResponseDataBodyList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

    }

    public static class RecognizeImageResponseDataFaceList extends TeaModel {
        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("FaceQuality")
        @Validation(required = true)
        public Float faceQuality;

        @NameInMap("FaceKeyPointQuality")
        @Validation(required = true)
        public Float faceKeyPointQuality;

        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        public static RecognizeImageResponseDataFaceList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseDataFaceList self = new RecognizeImageResponseDataFaceList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseDataFaceList setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public RecognizeImageResponseDataFaceList setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeImageResponseDataFaceList setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeImageResponseDataFaceList setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public RecognizeImageResponseDataFaceList setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public RecognizeImageResponseDataFaceList setFaceKeyPointQuality(Float faceKeyPointQuality) {
            this.faceKeyPointQuality = faceKeyPointQuality;
            return this;
        }
        public Float getFaceKeyPointQuality() {
            return this.faceKeyPointQuality;
        }

        public RecognizeImageResponseDataFaceList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

    }

    public static class RecognizeImageResponseData extends TeaModel {
        @NameInMap("BodyList")
        @Validation(required = true)
        public java.util.List<RecognizeImageResponseDataBodyList> bodyList;

        @NameInMap("FaceList")
        @Validation(required = true)
        public java.util.List<RecognizeImageResponseDataFaceList> faceList;

        public static RecognizeImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseData self = new RecognizeImageResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseData setBodyList(java.util.List<RecognizeImageResponseDataBodyList> bodyList) {
            this.bodyList = bodyList;
            return this;
        }
        public java.util.List<RecognizeImageResponseDataBodyList> getBodyList() {
            return this.bodyList;
        }

        public RecognizeImageResponseData setFaceList(java.util.List<RecognizeImageResponseDataFaceList> faceList) {
            this.faceList = faceList;
            return this;
        }
        public java.util.List<RecognizeImageResponseDataFaceList> getFaceList() {
            return this.faceList;
        }

    }

}
