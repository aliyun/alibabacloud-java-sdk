// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DetectFaceAttributesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Error.InternalError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DetectFaceAttributesResponseBody setData(DetectFaceAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectFaceAttributesResponseBodyData getData() {
        return this.data;
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

    public static class DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-1.5683923959732056</p>
         */
        @NameInMap("PitchAngle")
        public Float pitchAngle;

        /**
         * <strong>example:</strong>
         * <p>7.163370132446289</p>
         */
        @NameInMap("RollAngle")
        public Float rollAngle;

        /**
         * <strong>example:</strong>
         * <p>-6.925303936004639</p>
         */
        @NameInMap("YawAngle")
        public Float yawAngle;

        public static DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose self = new DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setPitchAngle(Float pitchAngle) {
            this.pitchAngle = pitchAngle;
            return this;
        }
        public Float getPitchAngle() {
            return this.pitchAngle;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setRollAngle(Float rollAngle) {
            this.rollAngle = rollAngle;
            return this;
        }
        public Float getRollAngle() {
            return this.rollAngle;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose setYawAngle(Float yawAngle) {
            this.yawAngle = yawAngle;
            return this;
        }
        public Float getYawAngle() {
            return this.yawAngle;
        }

    }

    public static class DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <strong>example:</strong>
         * <p>97</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling self = new DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.1419367790222168</p>
         */
        @NameInMap("Blur")
        public Float blur;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Facequal")
        public Float facequal;

        /**
         * <strong>example:</strong>
         * <p>Face</p>
         */
        @NameInMap("Facetype")
        public String facetype;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("Headpose")
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("Integrity")
        public Integer integrity;

        /**
         * <strong>example:</strong>
         * <p>Wear</p>
         */
        @NameInMap("Respirator")
        public String respirator;

        @NameInMap("Smiling")
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling;

        public static DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes self = new DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setFacequal(Float facequal) {
            this.facequal = facequal;
            return this;
        }
        public Float getFacequal() {
            return this.facequal;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setFacetype(String facetype) {
            this.facetype = facetype;
            return this;
        }
        public String getFacetype() {
            return this.facetype;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setHeadpose(DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose headpose) {
            this.headpose = headpose;
            return this;
        }
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesHeadpose getHeadpose() {
            return this.headpose;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setIntegrity(Integer integrity) {
            this.integrity = integrity;
            return this;
        }
        public Integer getIntegrity() {
            return this.integrity;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setRespirator(String respirator) {
            this.respirator = respirator;
            return this;
        }
        public String getRespirator() {
            return this.respirator;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes setSmiling(DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling smiling) {
            this.smiling = smiling;
            return this;
        }
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributesSmiling getSmiling() {
            return this.smiling;
        }

    }

    public static class DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>473</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>354</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <strong>example:</strong>
         * <p>453</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <strong>example:</strong>
         * <p>473</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect self = new DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo extends TeaModel {
        @NameInMap("FaceAttributes")
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes;

        @NameInMap("FaceRect")
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect faceRect;

        public static DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo self = new DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo setFaceAttributes(DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo setFaceRect(DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfoFaceRect getFaceRect() {
            return this.faceRect;
        }

    }

    public static class DetectFaceAttributesResponseBodyDataFaceInfos extends TeaModel {
        @NameInMap("FaceAttributesDetectInfo")
        public java.util.List<DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo;

        public static DetectFaceAttributesResponseBodyDataFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyDataFaceInfos self = new DetectFaceAttributesResponseBodyDataFaceInfos();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyDataFaceInfos setFaceAttributesDetectInfo(java.util.List<DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo> faceAttributesDetectInfo) {
            this.faceAttributesDetectInfo = faceAttributesDetectInfo;
            return this;
        }
        public java.util.List<DetectFaceAttributesResponseBodyDataFaceInfosFaceAttributesDetectInfo> getFaceAttributesDetectInfo() {
            return this.faceAttributesDetectInfo;
        }

    }

    public static class DetectFaceAttributesResponseBodyData extends TeaModel {
        @NameInMap("FaceInfos")
        public DetectFaceAttributesResponseBodyDataFaceInfos faceInfos;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("ImgHeight")
        public Integer imgHeight;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("ImgWidth")
        public Integer imgWidth;

        public static DetectFaceAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectFaceAttributesResponseBodyData self = new DetectFaceAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectFaceAttributesResponseBodyData setFaceInfos(DetectFaceAttributesResponseBodyDataFaceInfos faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public DetectFaceAttributesResponseBodyDataFaceInfos getFaceInfos() {
            return this.faceInfos;
        }

        public DetectFaceAttributesResponseBodyData setImgHeight(Integer imgHeight) {
            this.imgHeight = imgHeight;
            return this;
        }
        public Integer getImgHeight() {
            return this.imgHeight;
        }

        public DetectFaceAttributesResponseBodyData setImgWidth(Integer imgWidth) {
            this.imgWidth = imgWidth;
            return this;
        }
        public Integer getImgWidth() {
            return this.imgWidth;
        }

    }

}
