// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesResponse extends TeaModel {
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
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectFaceAttributesResponseData data;

    public static DetectFaceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesResponse self = new DetectFaceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectFaceAttributesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectFaceAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectFaceAttributesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetectFaceAttributesResponse setData(DetectFaceAttributesResponseData data) {
        this.data = data;
        return this;
    }
    public DetectFaceAttributesResponseData getData() {
        return this.data;
    }

    public static class DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose extends TeaModel {
        @NameInMap("PitchAngle")
        @Validation(required = true)
        public Float pitchAngle;

        @NameInMap("RollAngle")
        @Validation(required = true)
        public Float rollAngle;

        @NameInMap("YawAngle")
        @Validation(required = true)
        public Float yawAngle;

        public static DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose self = new DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setPitchAngle(Float pitchAngle) {
            this.pitchAngle = pitchAngle;
            return this;
        }
        public Float getPitchAngle() {
            return this.pitchAngle;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setRollAngle(Float rollAngle) {
            this.rollAngle = rollAngle;
            return this;
        }
        public Float getRollAngle() {
            return this.rollAngle;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setYawAngle(Float yawAngle) {
            this.yawAngle = yawAngle;
            return this;
        }
        public Float getYawAngle() {
            return this.yawAngle;
        }

    }

    public static class DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling extends TeaModel {
        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        public static DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling self = new DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes extends TeaModel {
        @NameInMap("Blur")
        @Validation(required = true)
        public Float blur;

        @NameInMap("Facequal")
        @Validation(required = true)
        public Float facequal;

        @NameInMap("Facetype")
        @Validation(required = true)
        public String facetype;

        @NameInMap("Glasses")
        @Validation(required = true)
        public String glasses;

        @NameInMap("Integrity")
        @Validation(required = true)
        public Integer integrity;

        @NameInMap("Respirator")
        @Validation(required = true)
        public String respirator;

        @NameInMap("Headpose")
        @Validation(required = true)
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose;

        @NameInMap("Smiling")
        @Validation(required = true)
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling;

        public static DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes self = new DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setFacequal(Float facequal) {
            this.facequal = facequal;
            return this;
        }
        public Float getFacequal() {
            return this.facequal;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setFacetype(String facetype) {
            this.facetype = facetype;
            return this;
        }
        public String getFacetype() {
            return this.facetype;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setIntegrity(Integer integrity) {
            this.integrity = integrity;
            return this;
        }
        public Integer getIntegrity() {
            return this.integrity;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setRespirator(String respirator) {
            this.respirator = respirator;
            return this;
        }
        public String getRespirator() {
            return this.respirator;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setHeadpose(DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose) {
            this.headpose = headpose;
            return this;
        }
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose getHeadpose() {
            return this.headpose;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes setSmiling(DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling) {
            this.smiling = smiling;
            return this;
        }
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling getSmiling() {
            return this.smiling;
        }

    }

    public static class DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect extends TeaModel {
        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect self = new DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo extends TeaModel {
        @NameInMap("FaceAttributes")
        @Validation(required = true)
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes;

        @NameInMap("FaceRect")
        @Validation(required = true)
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect faceRect;

        public static DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo self = new DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo setFaceAttributes(DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo setFaceRect(DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfoFaceRect getFaceRect() {
            return this.faceRect;
        }

    }

    public static class DetectFaceAttributesResponseDataFaceInfos extends TeaModel {
        @NameInMap("FaceAttributesDetectInfo")
        @Validation(required = true)
        public java.util.List<DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo;

        public static DetectFaceAttributesResponseDataFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseDataFaceInfos self = new DetectFaceAttributesResponseDataFaceInfos();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseDataFaceInfos setFaceAttributesDetectInfo(java.util.List<DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo) {
            this.faceAttributesDetectInfo = faceAttributesDetectInfo;
            return this;
        }
        public java.util.List<DetectFaceAttributesResponseDataFaceInfosFaceAttributesDetectInfo> getFaceAttributesDetectInfo() {
            return this.faceAttributesDetectInfo;
        }

    }

    public static class DetectFaceAttributesResponseData extends TeaModel {
        @NameInMap("ImgHeight")
        @Validation(required = true)
        public Integer imgHeight;

        @NameInMap("ImgWidth")
        @Validation(required = true)
        public Integer imgWidth;

        @NameInMap("FaceInfos")
        @Validation(required = true)
        public DetectFaceAttributesResponseDataFaceInfos faceInfos;

        public static DetectFaceAttributesResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseData self = new DetectFaceAttributesResponseData();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseData setImgHeight(Integer imgHeight) {
            this.imgHeight = imgHeight;
            return this;
        }
        public Integer getImgHeight() {
            return this.imgHeight;
        }

        public DetectFaceAttributesResponseData setImgWidth(Integer imgWidth) {
            this.imgWidth = imgWidth;
            return this;
        }
        public Integer getImgWidth() {
            return this.imgWidth;
        }

        public DetectFaceAttributesResponseData setFaceInfos(DetectFaceAttributesResponseDataFaceInfos faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public DetectFaceAttributesResponseDataFaceInfos getFaceInfos() {
            return this.faceInfos;
        }

    }

}
