// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultObject")
    public DetectFaceAttributesResponseBodyResultObject resultObject;

    public static DetectFaceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesResponseBody self = new DetectFaceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectFaceAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectFaceAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectFaceAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetectFaceAttributesResponseBody setResultObject(DetectFaceAttributesResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DetectFaceAttributesResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect self = new DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling extends TeaModel {
        @NameInMap("Value")
        public Float value;

        @NameInMap("Threshold")
        public Float threshold;

        public static DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling self = new DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose extends TeaModel {
        @NameInMap("PitchAngle")
        public Float pitchAngle;

        @NameInMap("RollAngle")
        public Float rollAngle;

        @NameInMap("YawAngle")
        public Float yawAngle;

        public static DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose self = new DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setPitchAngle(Float pitchAngle) {
            this.pitchAngle = pitchAngle;
            return this;
        }
        public Float getPitchAngle() {
            return this.pitchAngle;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setRollAngle(Float rollAngle) {
            this.rollAngle = rollAngle;
            return this;
        }
        public Float getRollAngle() {
            return this.rollAngle;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setYawAngle(Float yawAngle) {
            this.yawAngle = yawAngle;
            return this;
        }
        public Float getYawAngle() {
            return this.yawAngle;
        }

    }

    public static class DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes extends TeaModel {
        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("Facequal")
        public Float facequal;

        @NameInMap("Integrity")
        public Integer integrity;

        @NameInMap("Facetype")
        public String facetype;

        @NameInMap("Respirator")
        public String respirator;

        @NameInMap("AppearanceScore")
        public Float appearanceScore;

        @NameInMap("Blur")
        public Float blur;

        @NameInMap("Smiling")
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling;

        @NameInMap("Headpose")
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose;

        public static DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes self = new DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setFacequal(Float facequal) {
            this.facequal = facequal;
            return this;
        }
        public Float getFacequal() {
            return this.facequal;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setIntegrity(Integer integrity) {
            this.integrity = integrity;
            return this;
        }
        public Integer getIntegrity() {
            return this.integrity;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setFacetype(String facetype) {
            this.facetype = facetype;
            return this;
        }
        public String getFacetype() {
            return this.facetype;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setRespirator(String respirator) {
            this.respirator = respirator;
            return this;
        }
        public String getRespirator() {
            return this.respirator;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setAppearanceScore(Float appearanceScore) {
            this.appearanceScore = appearanceScore;
            return this;
        }
        public Float getAppearanceScore() {
            return this.appearanceScore;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setSmiling(DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling) {
            this.smiling = smiling;
            return this;
        }
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling getSmiling() {
            return this.smiling;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes setHeadpose(DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose) {
            this.headpose = headpose;
            return this;
        }
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose getHeadpose() {
            return this.headpose;
        }

    }

    public static class DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo extends TeaModel {
        @NameInMap("FaceRect")
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect faceRect;

        @NameInMap("FaceAttributes")
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes;

        public static DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo self = new DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo setFaceRect(DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceRect getFaceRect() {
            return this.faceRect;
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo setFaceAttributes(DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfoFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

    public static class DetectFaceAttributesResponseBodyResultObjectFaceInfos extends TeaModel {
        @NameInMap("FaceAttributesDetectInfo")
        public java.util.List<DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo;

        public static DetectFaceAttributesResponseBodyResultObjectFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObjectFaceInfos self = new DetectFaceAttributesResponseBodyResultObjectFaceInfos();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObjectFaceInfos setFaceAttributesDetectInfo(java.util.List<DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo) {
            this.faceAttributesDetectInfo = faceAttributesDetectInfo;
            return this;
        }
        public java.util.List<DetectFaceAttributesResponseBodyResultObjectFaceInfosFaceAttributesDetectInfo> getFaceAttributesDetectInfo() {
            return this.faceAttributesDetectInfo;
        }

    }

    public static class DetectFaceAttributesResponseBodyResultObject extends TeaModel {
        @NameInMap("ImgHeight")
        public Integer imgHeight;

        @NameInMap("ImgWidth")
        public Integer imgWidth;

        @NameInMap("FaceInfos")
        public DetectFaceAttributesResponseBodyResultObjectFaceInfos faceInfos;

        public static DetectFaceAttributesResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyResultObject self = new DetectFaceAttributesResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyResultObject setImgHeight(Integer imgHeight) {
            this.imgHeight = imgHeight;
            return this;
        }
        public Integer getImgHeight() {
            return this.imgHeight;
        }

        public DetectFaceAttributesResponseBodyResultObject setImgWidth(Integer imgWidth) {
            this.imgWidth = imgWidth;
            return this;
        }
        public Integer getImgWidth() {
            return this.imgWidth;
        }

        public DetectFaceAttributesResponseBodyResultObject setFaceInfos(DetectFaceAttributesResponseBodyResultObjectFaceInfos faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public DetectFaceAttributesResponseBodyResultObjectFaceInfos getFaceInfos() {
            return this.faceInfos;
        }

    }

}
