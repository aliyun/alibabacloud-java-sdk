// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The moderation results.</p>
     */
    @NameInMap("Data")
    public ImageModerationResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageModerationResponseBody self = new ImageModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageModerationResponseBody setData(ImageModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageModerationResponseBodyData getData() {
        return this.data;
    }

    public ImageModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ImageModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageModerationResponseBodyDataExtAigcDataAIGC extends TeaModel {
        @NameInMap("ContentProducer")
        public String contentProducer;

        @NameInMap("ContentPropagator")
        public String contentPropagator;

        @NameInMap("Label")
        public String label;

        @NameInMap("ProduceID")
        public String produceID;

        @NameInMap("PropagateID")
        public String propagateID;

        @NameInMap("ReservedCode1")
        public String reservedCode1;

        @NameInMap("ReservedCode2")
        public String reservedCode2;

        public static ImageModerationResponseBodyDataExtAigcDataAIGC build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtAigcDataAIGC self = new ImageModerationResponseBodyDataExtAigcDataAIGC();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setContentProducer(String contentProducer) {
            this.contentProducer = contentProducer;
            return this;
        }
        public String getContentProducer() {
            return this.contentProducer;
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setContentPropagator(String contentPropagator) {
            this.contentPropagator = contentPropagator;
            return this;
        }
        public String getContentPropagator() {
            return this.contentPropagator;
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setProduceID(String produceID) {
            this.produceID = produceID;
            return this;
        }
        public String getProduceID() {
            return this.produceID;
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setPropagateID(String propagateID) {
            this.propagateID = propagateID;
            return this;
        }
        public String getPropagateID() {
            return this.propagateID;
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setReservedCode1(String reservedCode1) {
            this.reservedCode1 = reservedCode1;
            return this;
        }
        public String getReservedCode1() {
            return this.reservedCode1;
        }

        public ImageModerationResponseBodyDataExtAigcDataAIGC setReservedCode2(String reservedCode2) {
            this.reservedCode2 = reservedCode2;
            return this;
        }
        public String getReservedCode2() {
            return this.reservedCode2;
        }

    }

    public static class ImageModerationResponseBodyDataExtAigcData extends TeaModel {
        @NameInMap("AIGC")
        public ImageModerationResponseBodyDataExtAigcDataAIGC AIGC;

        public static ImageModerationResponseBodyDataExtAigcData build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtAigcData self = new ImageModerationResponseBodyDataExtAigcData();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtAigcData setAIGC(ImageModerationResponseBodyDataExtAigcDataAIGC AIGC) {
            this.AIGC = AIGC;
            return this;
        }
        public ImageModerationResponseBodyDataExtAigcDataAIGC getAIGC() {
            return this.AIGC;
        }

    }

    public static class ImageModerationResponseBodyDataExtCustomImage extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lib_123456</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>The image library name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static ImageModerationResponseBodyDataExtCustomImage build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtCustomImage self = new ImageModerationResponseBodyDataExtCustomImage();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtCustomImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ImageModerationResponseBodyDataExtCustomImage setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ImageModerationResponseBodyDataExtCustomImage setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataBang extends TeaModel {
        /**
         * <p>The confidence level of the bang recognition result. Valid values: 0 to 100. A higher value indicates a more credible result.</p>
         * 
         * <strong>example:</strong>
         * <p>81.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>Indicates whether the recognition result of bangs is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Has</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageModerationResponseBodyDataExtFaceDataBang build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataBang self = new ImageModerationResponseBodyDataExtFaceDataBang();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataBang setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtFaceDataBang setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataGender extends TeaModel {
        /**
         * <p>The confidence level of the gender recognition result. Valid values: 0 to 100. A higher value indicates a more credible result.</p>
         * 
         * <strong>example:</strong>
         * <p>81.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The gender recognition result. Valid values:</p>
         * <ul>
         * <li><p>Male</p>
         * </li>
         * <li><p>FeMale</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FeMale</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageModerationResponseBodyDataExtFaceDataGender build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataGender self = new ImageModerationResponseBodyDataExtFaceDataGender();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataGender setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtFaceDataGender setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataHairstyle extends TeaModel {
        /**
         * <p>The confidence level of the hairstyle recognition result. Valid values: 0 to 100. A higher value indicates a more credible result.</p>
         * 
         * <strong>example:</strong>
         * <p>81.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The hairstyle recognition result. Valid values:</p>
         * <ul>
         * <li><p>Bald: bald head.</p>
         * </li>
         * <li><p>Long: Long hair.</p>
         * </li>
         * <li><p>Short: Short hair.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Short</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageModerationResponseBodyDataExtFaceDataHairstyle build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataHairstyle self = new ImageModerationResponseBodyDataExtFaceDataHairstyle();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataHairstyle setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtFaceDataHairstyle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataHat extends TeaModel {
        /**
         * <p>The confidence level of the result of wearing the hat. Valid values: 0 to 100. A higher value indicates a more credible result.</p>
         * 
         * <strong>example:</strong>
         * <p>88.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The recognition result of whether to wear the hat. Valid values:</p>
         * <ul>
         * <li><p>Wear: Wear a hat.</p>
         * </li>
         * <li><p>None: No hat.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wear</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageModerationResponseBodyDataExtFaceDataHat build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataHat self = new ImageModerationResponseBodyDataExtFaceDataHat();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataHat setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtFaceDataHat setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataLocation extends TeaModel {
        /**
         * <p>The height of the face area. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the face area. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The distance from the upper-left corner of the face area to the y-axis with the upper-left corner of the image as the coordinate origin. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The distance from the upper-left corner of the face area to the x-axis with the upper-left corner of the image as the coordinate origin. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageModerationResponseBodyDataExtFaceDataLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataLocation self = new ImageModerationResponseBodyDataExtFaceDataLocation();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageModerationResponseBodyDataExtFaceDataLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageModerationResponseBodyDataExtFaceDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageModerationResponseBodyDataExtFaceDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataMask extends TeaModel {
        /**
         * <p>The confidence level of the result of wearing the mask. Valid values: 0 to 100. A higher value indicates a more credible result.</p>
         * 
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The recognition result of whether to wear a mask. Valid values:</p>
         * <ul>
         * <li><p>Wear a mask.</p>
         * </li>
         * <li><p>None: No mask.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wear</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageModerationResponseBodyDataExtFaceDataMask build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataMask self = new ImageModerationResponseBodyDataExtFaceDataMask();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataMask setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtFaceDataMask setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataMustache extends TeaModel {
        /**
         * <p>The confidence level of the result of the beard. Valid values: 0 to 100. A higher value indicates a more credible result.</p>
         * 
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The identification result of whether there is a beard.Valid values:</p>
         * <ul>
         * <li><p>Has:have a beard.</p>
         * </li>
         * <li><p>None:No beard.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Has</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageModerationResponseBodyDataExtFaceDataMustache build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataMustache self = new ImageModerationResponseBodyDataExtFaceDataMustache();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataMustache setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtFaceDataMustache setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceDataQuality extends TeaModel {
        /**
         * <p>The blur of the face image. Valid values: 0 to 100. The higher the score, the more fuzzy it is.
         * Recommended values: 0 to 25.</p>
         * 
         * <strong>example:</strong>
         * <p>5.88</p>
         */
        @NameInMap("Blur")
        public Float blur;

        /**
         * <p>The integrity of the human face. Recommended values:80 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Integrity")
        public Float integrity;

        /**
         * <p>The head-up or head-down angle of the face.
         * Recommended values:-30 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>5.88</p>
         */
        @NameInMap("Pitch")
        public Float pitch;

        /**
         * <p>The plane rotation angle of the face.
         * Recommended values:-30 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>5.18</p>
         */
        @NameInMap("Roll")
        public Float roll;

        /**
         * <p>The left and right shaking angle of the human face.
         * Recommended values:-30 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>5.18</p>
         */
        @NameInMap("Yaw")
        public Float yaw;

        public static ImageModerationResponseBodyDataExtFaceDataQuality build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceDataQuality self = new ImageModerationResponseBodyDataExtFaceDataQuality();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceDataQuality setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public ImageModerationResponseBodyDataExtFaceDataQuality setIntegrity(Float integrity) {
            this.integrity = integrity;
            return this;
        }
        public Float getIntegrity() {
            return this.integrity;
        }

        public ImageModerationResponseBodyDataExtFaceDataQuality setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public ImageModerationResponseBodyDataExtFaceDataQuality setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public ImageModerationResponseBodyDataExtFaceDataQuality setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class ImageModerationResponseBodyDataExtFaceData extends TeaModel {
        /**
         * <p>The age recognition result.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Age")
        public Integer age;

        /**
         * <p>Indicates whether the recognition result of bangs is available.</p>
         */
        @NameInMap("Bang")
        public ImageModerationResponseBodyDataExtFaceDataBang bang;

        /**
         * <p>The gender recognition result.</p>
         */
        @NameInMap("Gender")
        public ImageModerationResponseBodyDataExtFaceDataGender gender;

        /**
         * <p>The recognition result of whether to wear glasses.</p>
         * <ul>
         * <li><p>None: No glasses.</p>
         * </li>
         * <li><p>Wear: Wear glasses.</p>
         * </li>
         * <li><p>Sunglass: Wear sunglasses.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("Glasses")
        public String glasses;

        /**
         * <p>The hairstyle recognition result.</p>
         */
        @NameInMap("Hairstyle")
        public ImageModerationResponseBodyDataExtFaceDataHairstyle hairstyle;

        /**
         * <p>The recognition result of whether to wear a hat.</p>
         */
        @NameInMap("Hat")
        public ImageModerationResponseBodyDataExtFaceDataHat hat;

        /**
         * <p>The location of the face.</p>
         */
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtFaceDataLocation location;

        /**
         * <p>The recognition result of whether to wear a mask.</p>
         */
        @NameInMap("Mask")
        public ImageModerationResponseBodyDataExtFaceDataMask mask;

        /**
         * <p>The identification result of whether there is a beard.</p>
         */
        @NameInMap("Mustache")
        public ImageModerationResponseBodyDataExtFaceDataMustache mustache;

        /**
         * <p>The quality information of the face image.</p>
         */
        @NameInMap("Quality")
        public ImageModerationResponseBodyDataExtFaceDataQuality quality;

        /**
         * <p>The smiling degree of the face.</p>
         * 
         * <strong>example:</strong>
         * <p>85.88</p>
         */
        @NameInMap("Smile")
        public Float smile;

        public static ImageModerationResponseBodyDataExtFaceData build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtFaceData self = new ImageModerationResponseBodyDataExtFaceData();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtFaceData setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public ImageModerationResponseBodyDataExtFaceData setBang(ImageModerationResponseBodyDataExtFaceDataBang bang) {
            this.bang = bang;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataBang getBang() {
            return this.bang;
        }

        public ImageModerationResponseBodyDataExtFaceData setGender(ImageModerationResponseBodyDataExtFaceDataGender gender) {
            this.gender = gender;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataGender getGender() {
            return this.gender;
        }

        public ImageModerationResponseBodyDataExtFaceData setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public ImageModerationResponseBodyDataExtFaceData setHairstyle(ImageModerationResponseBodyDataExtFaceDataHairstyle hairstyle) {
            this.hairstyle = hairstyle;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataHairstyle getHairstyle() {
            return this.hairstyle;
        }

        public ImageModerationResponseBodyDataExtFaceData setHat(ImageModerationResponseBodyDataExtFaceDataHat hat) {
            this.hat = hat;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataHat getHat() {
            return this.hat;
        }

        public ImageModerationResponseBodyDataExtFaceData setLocation(ImageModerationResponseBodyDataExtFaceDataLocation location) {
            this.location = location;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataLocation getLocation() {
            return this.location;
        }

        public ImageModerationResponseBodyDataExtFaceData setMask(ImageModerationResponseBodyDataExtFaceDataMask mask) {
            this.mask = mask;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataMask getMask() {
            return this.mask;
        }

        public ImageModerationResponseBodyDataExtFaceData setMustache(ImageModerationResponseBodyDataExtFaceDataMustache mustache) {
            this.mustache = mustache;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataMustache getMustache() {
            return this.mustache;
        }

        public ImageModerationResponseBodyDataExtFaceData setQuality(ImageModerationResponseBodyDataExtFaceDataQuality quality) {
            this.quality = quality;
            return this;
        }
        public ImageModerationResponseBodyDataExtFaceDataQuality getQuality() {
            return this.quality;
        }

        public ImageModerationResponseBodyDataExtFaceData setSmile(Float smile) {
            this.smile = smile;
            return this;
        }
        public Float getSmile() {
            return this.smile;
        }

    }

    public static class ImageModerationResponseBodyDataExtLogoDataLocation extends TeaModel {
        /**
         * <p>The height of the text area, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the text area, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The distance between the upper-left corner of the text area and the y-axis, using the upper-left corner of the image as the coordinate origin, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The distance between the upper left corner of the text area and the x-axis, with the upper left corner of the image as the coordinate origin, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageModerationResponseBodyDataExtLogoDataLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtLogoDataLocation self = new ImageModerationResponseBodyDataExtLogoDataLocation();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtLogoDataLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageModerationResponseBodyDataExtLogoDataLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageModerationResponseBodyDataExtLogoDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageModerationResponseBodyDataExtLogoDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageModerationResponseBodyDataExtLogoDataLogo extends TeaModel {
        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places. Some labels do not have scores of confidence levels.</p>
         * 
         * <strong>example:</strong>
         * <p>99.01</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>Logo category.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Logo name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ImageModerationResponseBodyDataExtLogoDataLogo build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtLogoDataLogo self = new ImageModerationResponseBodyDataExtLogoDataLogo();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtLogoDataLogo setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataExtLogoDataLogo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageModerationResponseBodyDataExtLogoDataLogo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImageModerationResponseBodyDataExtLogoData extends TeaModel {
        /**
         * <p>Location information.</p>
         */
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtLogoDataLocation location;

        /**
         * <p>Logo information.</p>
         */
        @NameInMap("Logo")
        public java.util.List<ImageModerationResponseBodyDataExtLogoDataLogo> logo;

        public static ImageModerationResponseBodyDataExtLogoData build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtLogoData self = new ImageModerationResponseBodyDataExtLogoData();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtLogoData setLocation(ImageModerationResponseBodyDataExtLogoDataLocation location) {
            this.location = location;
            return this;
        }
        public ImageModerationResponseBodyDataExtLogoDataLocation getLocation() {
            return this.location;
        }

        public ImageModerationResponseBodyDataExtLogoData setLogo(java.util.List<ImageModerationResponseBodyDataExtLogoDataLogo> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtLogoDataLogo> getLogo() {
            return this.logo;
        }

    }

    public static class ImageModerationResponseBodyDataExtOcrResultLocation extends TeaModel {
        /**
         * <p>The height of the text area, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the text area, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The distance between the upper-left corner of the text area and the y-axis, using the upper-left corner of the image as the coordinate origin, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The distance between the upper left corner of the text area and the x-axis, with the upper left corner of the image as the coordinate origin, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageModerationResponseBodyDataExtOcrResultLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtOcrResultLocation self = new ImageModerationResponseBodyDataExtOcrResultLocation();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtOcrResultLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageModerationResponseBodyDataExtOcrResultLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageModerationResponseBodyDataExtOcrResultLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageModerationResponseBodyDataExtOcrResultLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageModerationResponseBodyDataExtOcrResult extends TeaModel {
        /**
         * <p>Location information.</p>
         */
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtOcrResultLocation location;

        /**
         * <p>The text information in the recognized image.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        public static ImageModerationResponseBodyDataExtOcrResult build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtOcrResult self = new ImageModerationResponseBodyDataExtOcrResult();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtOcrResult setLocation(ImageModerationResponseBodyDataExtOcrResultLocation location) {
            this.location = location;
            return this;
        }
        public ImageModerationResponseBodyDataExtOcrResultLocation getLocation() {
            return this.location;
        }

        public ImageModerationResponseBodyDataExtOcrResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ImageModerationResponseBodyDataExtPublicFigureLocation extends TeaModel {
        /**
         * <p>The height</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The weight</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>X coordinate</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>Y coordinate</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageModerationResponseBodyDataExtPublicFigureLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtPublicFigureLocation self = new ImageModerationResponseBodyDataExtPublicFigureLocation();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtPublicFigureLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageModerationResponseBodyDataExtPublicFigureLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageModerationResponseBodyDataExtPublicFigureLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageModerationResponseBodyDataExtPublicFigureLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageModerationResponseBodyDataExtPublicFigure extends TeaModel {
        /**
         * <p>Identified person coding information.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FigureId")
        public String figureId;

        /**
         * <p>Identified person name information.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FigureName")
        public String figureName;

        /**
         * <p>the data array of location info</p>
         */
        @NameInMap("Location")
        public java.util.List<ImageModerationResponseBodyDataExtPublicFigureLocation> location;

        public static ImageModerationResponseBodyDataExtPublicFigure build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtPublicFigure self = new ImageModerationResponseBodyDataExtPublicFigure();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtPublicFigure setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

        public ImageModerationResponseBodyDataExtPublicFigure setFigureName(String figureName) {
            this.figureName = figureName;
            return this;
        }
        public String getFigureName() {
            return this.figureName;
        }

        public ImageModerationResponseBodyDataExtPublicFigure setLocation(java.util.List<ImageModerationResponseBodyDataExtPublicFigureLocation> location) {
            this.location = location;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtPublicFigureLocation> getLocation() {
            return this.location;
        }

    }

    public static class ImageModerationResponseBodyDataExtRecognition extends TeaModel {
        /**
         * <p>The category of image recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Classification")
        public String classification;

        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places. Some labels do not have scores of confidence levels.</p>
         * 
         * <strong>example:</strong>
         * <p>99.01</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        public static ImageModerationResponseBodyDataExtRecognition build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtRecognition self = new ImageModerationResponseBodyDataExtRecognition();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtRecognition setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ImageModerationResponseBodyDataExtRecognition setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class ImageModerationResponseBodyDataExtTextInImageCustomText extends TeaModel {
        /**
         * <p>Custom words, multiple words separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa,bbb</p>
         */
        @NameInMap("KeyWords")
        public String keyWords;

        /**
         * <p>Custom library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>Custom library name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static ImageModerationResponseBodyDataExtTextInImageCustomText build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtTextInImageCustomText self = new ImageModerationResponseBodyDataExtTextInImageCustomText();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtTextInImageCustomText setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ImageModerationResponseBodyDataExtTextInImageCustomText setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ImageModerationResponseBodyDataExtTextInImageCustomText setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ImageModerationResponseBodyDataExtTextInImageOcrResultLocation extends TeaModel {
        /**
         * <p>The height of the text area, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the text area, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The distance between the upper-left corner of the text area and the y-axis, using the upper-left corner of the image as the coordinate origin, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The distance between the upper left corner of the text area and the x-axis, with the upper left corner of the image as the coordinate origin, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageModerationResponseBodyDataExtTextInImageOcrResultLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtTextInImageOcrResultLocation self = new ImageModerationResponseBodyDataExtTextInImageOcrResultLocation();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageModerationResponseBodyDataExtTextInImageOcrResult extends TeaModel {
        /**
         * <p>Location information.</p>
         */
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation location;

        /**
         * <p>The text information in the recognized image.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        public static ImageModerationResponseBodyDataExtTextInImageOcrResult build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtTextInImageOcrResult self = new ImageModerationResponseBodyDataExtTextInImageOcrResult();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtTextInImageOcrResult setLocation(ImageModerationResponseBodyDataExtTextInImageOcrResultLocation location) {
            this.location = location;
            return this;
        }
        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation getLocation() {
            return this.location;
        }

        public ImageModerationResponseBodyDataExtTextInImageOcrResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ImageModerationResponseBodyDataExtTextInImage extends TeaModel {
        /**
         * <p>When a custom text library is hit, the custom library ID, custom library name, and custom word are returned.</p>
         */
        @NameInMap("CustomText")
        public java.util.List<ImageModerationResponseBodyDataExtTextInImageCustomText> customText;

        /**
         * <p>Returns the text information in the recognized image.</p>
         */
        @NameInMap("OcrResult")
        public java.util.List<ImageModerationResponseBodyDataExtTextInImageOcrResult> ocrResult;

        /**
         * <p>The risk words that are hit. Multiple words are separated by commas (,).</p>
         */
        @NameInMap("RiskWord")
        public java.util.List<String> riskWord;

        public static ImageModerationResponseBodyDataExtTextInImage build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtTextInImage self = new ImageModerationResponseBodyDataExtTextInImage();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtTextInImage setCustomText(java.util.List<ImageModerationResponseBodyDataExtTextInImageCustomText> customText) {
            this.customText = customText;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtTextInImageCustomText> getCustomText() {
            return this.customText;
        }

        public ImageModerationResponseBodyDataExtTextInImage setOcrResult(java.util.List<ImageModerationResponseBodyDataExtTextInImageOcrResult> ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtTextInImageOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        public ImageModerationResponseBodyDataExtTextInImage setRiskWord(java.util.List<String> riskWord) {
            this.riskWord = riskWord;
            return this;
        }
        public java.util.List<String> getRiskWord() {
            return this.riskWord;
        }

    }

    public static class ImageModerationResponseBodyDataExtVlContent extends TeaModel {
        /**
         * <p>the vl output content</p>
         * 
         * <strong>example:</strong>
         * <p>this is a cat</p>
         */
        @NameInMap("OutputText")
        public String outputText;

        public static ImageModerationResponseBodyDataExtVlContent build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExtVlContent self = new ImageModerationResponseBodyDataExtVlContent();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExtVlContent setOutputText(String outputText) {
            this.outputText = outputText;
            return this;
        }
        public String getOutputText() {
            return this.outputText;
        }

    }

    public static class ImageModerationResponseBodyDataExt extends TeaModel {
        @NameInMap("AigcData")
        public ImageModerationResponseBodyDataExtAigcData aigcData;

        /**
         * <p>If a custom image library is hit, information about the hit custom image library is returned.</p>
         */
        @NameInMap("CustomImage")
        public java.util.List<ImageModerationResponseBodyDataExtCustomImage> customImage;

        /**
         * <p>The returned face attribute information</p>
         */
        @NameInMap("FaceData")
        public java.util.List<ImageModerationResponseBodyDataExtFaceData> faceData;

        /**
         * <p>Logo information.</p>
         */
        @NameInMap("LogoData")
        public java.util.List<ImageModerationResponseBodyDataExtLogoData> logoData;

        /**
         * <p>Returns the text information in the recognized image.</p>
         */
        @NameInMap("OcrResult")
        public java.util.List<ImageModerationResponseBodyDataExtOcrResult> ocrResult;

        /**
         * <p>Person information list.</p>
         */
        @NameInMap("PublicFigure")
        public java.util.List<ImageModerationResponseBodyDataExtPublicFigure> publicFigure;

        /**
         * <p>The result of image recognition.</p>
         */
        @NameInMap("Recognition")
        public java.util.List<ImageModerationResponseBodyDataExtRecognition> recognition;

        /**
         * <p>Returns the text information in the hit image.</p>
         */
        @NameInMap("TextInImage")
        public ImageModerationResponseBodyDataExtTextInImage textInImage;

        /**
         * <p>the vl output content</p>
         */
        @NameInMap("VlContent")
        public ImageModerationResponseBodyDataExtVlContent vlContent;

        public static ImageModerationResponseBodyDataExt build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExt self = new ImageModerationResponseBodyDataExt();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExt setAigcData(ImageModerationResponseBodyDataExtAigcData aigcData) {
            this.aigcData = aigcData;
            return this;
        }
        public ImageModerationResponseBodyDataExtAigcData getAigcData() {
            return this.aigcData;
        }

        public ImageModerationResponseBodyDataExt setCustomImage(java.util.List<ImageModerationResponseBodyDataExtCustomImage> customImage) {
            this.customImage = customImage;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtCustomImage> getCustomImage() {
            return this.customImage;
        }

        public ImageModerationResponseBodyDataExt setFaceData(java.util.List<ImageModerationResponseBodyDataExtFaceData> faceData) {
            this.faceData = faceData;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtFaceData> getFaceData() {
            return this.faceData;
        }

        public ImageModerationResponseBodyDataExt setLogoData(java.util.List<ImageModerationResponseBodyDataExtLogoData> logoData) {
            this.logoData = logoData;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtLogoData> getLogoData() {
            return this.logoData;
        }

        public ImageModerationResponseBodyDataExt setOcrResult(java.util.List<ImageModerationResponseBodyDataExtOcrResult> ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        public ImageModerationResponseBodyDataExt setPublicFigure(java.util.List<ImageModerationResponseBodyDataExtPublicFigure> publicFigure) {
            this.publicFigure = publicFigure;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtPublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        public ImageModerationResponseBodyDataExt setRecognition(java.util.List<ImageModerationResponseBodyDataExtRecognition> recognition) {
            this.recognition = recognition;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtRecognition> getRecognition() {
            return this.recognition;
        }

        public ImageModerationResponseBodyDataExt setTextInImage(ImageModerationResponseBodyDataExtTextInImage textInImage) {
            this.textInImage = textInImage;
            return this;
        }
        public ImageModerationResponseBodyDataExtTextInImage getTextInImage() {
            return this.textInImage;
        }

        public ImageModerationResponseBodyDataExt setVlContent(ImageModerationResponseBodyDataExtVlContent vlContent) {
            this.vlContent = vlContent;
            return this;
        }
        public ImageModerationResponseBodyDataExtVlContent getVlContent() {
            return this.vlContent;
        }

    }

    public static class ImageModerationResponseBodyDataResult extends TeaModel {
        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places. Some labels do not have scores of confidence levels.</p>
         * 
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>no risk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The labels returned after the image moderation. Multiple risk labels and the corresponding scores of confidence levels may be returned for an image.</p>
         * 
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Risk Level</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageModerationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataResult self = new ImageModerationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageModerationResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImageModerationResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageModerationResponseBodyDataResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ImageModerationResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the moderated object.</p>
         * <blockquote>
         * <p> If you specify the dataId parameter in the request, the value of the dataId parameter is returned in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fb5ffab1-993b-449f-b8d6-b97d5e3331f2</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Auxiliary reference information.</p>
         */
        @NameInMap("Ext")
        public ImageModerationResponseBodyDataExt ext;

        @NameInMap("ManualTaskId")
        public String manualTaskId;

        /**
         * <p>The results of image moderation parameters such as the label parameter and the confidence parameter, which are an array structure.</p>
         */
        @NameInMap("Result")
        public java.util.List<ImageModerationResponseBodyDataResult> result;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyData self = new ImageModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ImageModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImageModerationResponseBodyData setExt(ImageModerationResponseBodyDataExt ext) {
            this.ext = ext;
            return this;
        }
        public ImageModerationResponseBodyDataExt getExt() {
            return this.ext;
        }

        public ImageModerationResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        public ImageModerationResponseBodyData setResult(java.util.List<ImageModerationResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ImageModerationResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
