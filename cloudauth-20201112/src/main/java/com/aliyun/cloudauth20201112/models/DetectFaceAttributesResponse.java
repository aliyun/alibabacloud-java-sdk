// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public DetectFaceAttributesResponseResultObject resultObject;

    public static DetectFaceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesResponse self = new DetectFaceAttributesResponse();
        return TeaModel.build(map, self);
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

    public DetectFaceAttributesResponse setResultObject(DetectFaceAttributesResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DetectFaceAttributesResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect extends TeaModel {
        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect self = new DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        public static DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling self = new DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose extends TeaModel {
        @NameInMap("PitchAngle")
        @Validation(required = true)
        public Float pitchAngle;

        @NameInMap("RollAngle")
        @Validation(required = true)
        public Float rollAngle;

        @NameInMap("YawAngle")
        @Validation(required = true)
        public Float yawAngle;

        public static DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose self = new DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setPitchAngle(Float pitchAngle) {
            this.pitchAngle = pitchAngle;
            return this;
        }
        public Float getPitchAngle() {
            return this.pitchAngle;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setRollAngle(Float rollAngle) {
            this.rollAngle = rollAngle;
            return this;
        }
        public Float getRollAngle() {
            return this.rollAngle;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setYawAngle(Float yawAngle) {
            this.yawAngle = yawAngle;
            return this;
        }
        public Float getYawAngle() {
            return this.yawAngle;
        }

    }

    public static class DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes extends TeaModel {
        @NameInMap("Glasses")
        @Validation(required = true)
        public String glasses;

        @NameInMap("Facetype")
        @Validation(required = true)
        public String facetype;

        @NameInMap("Blur")
        @Validation(required = true)
        public Float blur;

        @NameInMap("Facequal")
        @Validation(required = true)
        public Float facequal;

        @NameInMap("Integrity")
        @Validation(required = true)
        public Integer integrity;

        @NameInMap("Respirator")
        @Validation(required = true)
        public String respirator;

        @NameInMap("AppearanceScore")
        @Validation(required = true)
        public Float appearanceScore;

        @NameInMap("Smiling")
        @Validation(required = true)
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling;

        @NameInMap("Headpose")
        @Validation(required = true)
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose;

        public static DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes self = new DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setFacetype(String facetype) {
            this.facetype = facetype;
            return this;
        }
        public String getFacetype() {
            return this.facetype;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setFacequal(Float facequal) {
            this.facequal = facequal;
            return this;
        }
        public Float getFacequal() {
            return this.facequal;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setIntegrity(Integer integrity) {
            this.integrity = integrity;
            return this;
        }
        public Integer getIntegrity() {
            return this.integrity;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setRespirator(String respirator) {
            this.respirator = respirator;
            return this;
        }
        public String getRespirator() {
            return this.respirator;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setAppearanceScore(Float appearanceScore) {
            this.appearanceScore = appearanceScore;
            return this;
        }
        public Float getAppearanceScore() {
            return this.appearanceScore;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setSmiling(DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling) {
            this.smiling = smiling;
            return this;
        }
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling getSmiling() {
            return this.smiling;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setHeadpose(DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose) {
            this.headpose = headpose;
            return this;
        }
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose getHeadpose() {
            return this.headpose;
        }

    }

    public static class DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo extends TeaModel {
        @NameInMap("FaceRect")
        @Validation(required = true)
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect faceRect;

        @NameInMap("FaceAttributes")
        @Validation(required = true)
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes;

        public static DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo self = new DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo setFaceRect(DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceRect getFaceRect() {
            return this.faceRect;
        }

        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo setFaceAttributes(DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

    public static class DetectFaceAttributesResponseResultObjectFaceInfos extends TeaModel {
        @NameInMap("FaceAttributesDetectInfo")
        @Validation(required = true)
        public java.util.List<DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo;

        public static DetectFaceAttributesResponseResultObjectFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObjectFaceInfos self = new DetectFaceAttributesResponseResultObjectFaceInfos();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObjectFaceInfos setFaceAttributesDetectInfo(java.util.List<DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo) {
            this.faceAttributesDetectInfo = faceAttributesDetectInfo;
            return this;
        }
        public java.util.List<DetectFaceAttributesResponseResultObjectFaceInfosFaceAttributesDetectInfo> getFaceAttributesDetectInfo() {
            return this.faceAttributesDetectInfo;
        }

    }

    public static class DetectFaceAttributesResponseResultObject extends TeaModel {
        @NameInMap("ImgWidth")
        @Validation(required = true)
        public Integer imgWidth;

        @NameInMap("ImgHeight")
        @Validation(required = true)
        public Integer imgHeight;

        @NameInMap("FaceInfos")
        @Validation(required = true)
        public DetectFaceAttributesResponseResultObjectFaceInfos faceInfos;

        public static DetectFaceAttributesResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseResultObject self = new DetectFaceAttributesResponseResultObject();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseResultObject setImgWidth(Integer imgWidth) {
            this.imgWidth = imgWidth;
            return this;
        }
        public Integer getImgWidth() {
            return this.imgWidth;
        }

        public DetectFaceAttributesResponseResultObject setImgHeight(Integer imgHeight) {
            this.imgHeight = imgHeight;
            return this;
        }
        public Integer getImgHeight() {
            return this.imgHeight;
        }

        public DetectFaceAttributesResponseResultObject setFaceInfos(DetectFaceAttributesResponseResultObjectFaceInfos faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public DetectFaceAttributesResponseResultObjectFaceInfos getFaceInfos() {
            return this.faceInfos;
        }

    }

}
