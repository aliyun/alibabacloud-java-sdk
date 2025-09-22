// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageQueueModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageQueueModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageQueueModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageQueueModerationResponseBody self = new ImageQueueModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageQueueModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageQueueModerationResponseBody setData(ImageQueueModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageQueueModerationResponseBodyData getData() {
        return this.data;
    }

    public ImageQueueModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ImageQueueModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageQueueModerationResponseBodyDataExtCustomImage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>图库123</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <strong>example:</strong>
         * <p>图库123</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static ImageQueueModerationResponseBodyDataExtCustomImage build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtCustomImage self = new ImageQueueModerationResponseBodyDataExtCustomImage();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtCustomImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ImageQueueModerationResponseBodyDataExtCustomImage setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ImageQueueModerationResponseBodyDataExtCustomImage setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataBang extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>Has</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageQueueModerationResponseBodyDataExtFaceDataBang build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataBang self = new ImageQueueModerationResponseBodyDataExtFaceDataBang();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataBang setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataBang setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataGender extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>FeMale</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageQueueModerationResponseBodyDataExtFaceDataGender build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataGender self = new ImageQueueModerationResponseBodyDataExtFaceDataGender();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataGender setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataGender setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataHairstyle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>Short</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageQueueModerationResponseBodyDataExtFaceDataHairstyle build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataHairstyle self = new ImageQueueModerationResponseBodyDataExtFaceDataHairstyle();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataHairstyle setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataHairstyle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataHat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>88.88</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>Wear</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageQueueModerationResponseBodyDataExtFaceDataHat build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataHat self = new ImageQueueModerationResponseBodyDataExtFaceDataHat();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataHat setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataHat setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>84</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageQueueModerationResponseBodyDataExtFaceDataLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataLocation self = new ImageQueueModerationResponseBodyDataExtFaceDataLocation();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataMask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>Wear</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageQueueModerationResponseBodyDataExtFaceDataMask build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataMask self = new ImageQueueModerationResponseBodyDataExtFaceDataMask();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataMask setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataMask setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataMustache extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>Has</p>
         */
        @NameInMap("Value")
        public String value;

        public static ImageQueueModerationResponseBodyDataExtFaceDataMustache build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataMustache self = new ImageQueueModerationResponseBodyDataExtFaceDataMustache();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataMustache setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataMustache setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceDataQuality extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5.88</p>
         */
        @NameInMap("Blur")
        public Float blur;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Integrity")
        public Float integrity;

        /**
         * <strong>example:</strong>
         * <p>5.88</p>
         */
        @NameInMap("Pitch")
        public Float pitch;

        /**
         * <strong>example:</strong>
         * <p>5.18</p>
         */
        @NameInMap("Roll")
        public Float roll;

        /**
         * <strong>example:</strong>
         * <p>5.18</p>
         */
        @NameInMap("Yaw")
        public Float yaw;

        public static ImageQueueModerationResponseBodyDataExtFaceDataQuality build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceDataQuality self = new ImageQueueModerationResponseBodyDataExtFaceDataQuality();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataQuality setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataQuality setIntegrity(Float integrity) {
            this.integrity = integrity;
            return this;
        }
        public Float getIntegrity() {
            return this.integrity;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataQuality setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataQuality setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public ImageQueueModerationResponseBodyDataExtFaceDataQuality setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtFaceData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Age")
        public Integer age;

        @NameInMap("Bang")
        public ImageQueueModerationResponseBodyDataExtFaceDataBang bang;

        @NameInMap("Gender")
        public ImageQueueModerationResponseBodyDataExtFaceDataGender gender;

        /**
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("Hairstyle")
        public ImageQueueModerationResponseBodyDataExtFaceDataHairstyle hairstyle;

        @NameInMap("Hat")
        public ImageQueueModerationResponseBodyDataExtFaceDataHat hat;

        @NameInMap("Location")
        public ImageQueueModerationResponseBodyDataExtFaceDataLocation location;

        @NameInMap("Mask")
        public ImageQueueModerationResponseBodyDataExtFaceDataMask mask;

        @NameInMap("Mustache")
        public ImageQueueModerationResponseBodyDataExtFaceDataMustache mustache;

        @NameInMap("Quality")
        public ImageQueueModerationResponseBodyDataExtFaceDataQuality quality;

        /**
         * <strong>example:</strong>
         * <p>85.88</p>
         */
        @NameInMap("Smile")
        public Float smile;

        public static ImageQueueModerationResponseBodyDataExtFaceData build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtFaceData self = new ImageQueueModerationResponseBodyDataExtFaceData();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setBang(ImageQueueModerationResponseBodyDataExtFaceDataBang bang) {
            this.bang = bang;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataBang getBang() {
            return this.bang;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setGender(ImageQueueModerationResponseBodyDataExtFaceDataGender gender) {
            this.gender = gender;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataGender getGender() {
            return this.gender;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setHairstyle(ImageQueueModerationResponseBodyDataExtFaceDataHairstyle hairstyle) {
            this.hairstyle = hairstyle;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataHairstyle getHairstyle() {
            return this.hairstyle;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setHat(ImageQueueModerationResponseBodyDataExtFaceDataHat hat) {
            this.hat = hat;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataHat getHat() {
            return this.hat;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setLocation(ImageQueueModerationResponseBodyDataExtFaceDataLocation location) {
            this.location = location;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataLocation getLocation() {
            return this.location;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setMask(ImageQueueModerationResponseBodyDataExtFaceDataMask mask) {
            this.mask = mask;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataMask getMask() {
            return this.mask;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setMustache(ImageQueueModerationResponseBodyDataExtFaceDataMustache mustache) {
            this.mustache = mustache;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataMustache getMustache() {
            return this.mustache;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setQuality(ImageQueueModerationResponseBodyDataExtFaceDataQuality quality) {
            this.quality = quality;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtFaceDataQuality getQuality() {
            return this.quality;
        }

        public ImageQueueModerationResponseBodyDataExtFaceData setSmile(Float smile) {
            this.smile = smile;
            return this;
        }
        public Float getSmile() {
            return this.smile;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtLogoDataLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>440</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <strong>example:</strong>
         * <p>330</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageQueueModerationResponseBodyDataExtLogoDataLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtLogoDataLocation self = new ImageQueueModerationResponseBodyDataExtLogoDataLocation();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtLogoDataLogo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99.1</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>logo_sns</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>钉钉</p>
         */
        @NameInMap("Name")
        public String name;

        public static ImageQueueModerationResponseBodyDataExtLogoDataLogo build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtLogoDataLogo self = new ImageQueueModerationResponseBodyDataExtLogoDataLogo();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLogo setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLogo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageQueueModerationResponseBodyDataExtLogoDataLogo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtLogoData extends TeaModel {
        @NameInMap("Location")
        public ImageQueueModerationResponseBodyDataExtLogoDataLocation location;

        @NameInMap("Logo")
        public java.util.List<ImageQueueModerationResponseBodyDataExtLogoDataLogo> logo;

        public static ImageQueueModerationResponseBodyDataExtLogoData build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtLogoData self = new ImageQueueModerationResponseBodyDataExtLogoData();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtLogoData setLocation(ImageQueueModerationResponseBodyDataExtLogoDataLocation location) {
            this.location = location;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtLogoDataLocation getLocation() {
            return this.location;
        }

        public ImageQueueModerationResponseBodyDataExtLogoData setLogo(java.util.List<ImageQueueModerationResponseBodyDataExtLogoDataLogo> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtLogoDataLogo> getLogo() {
            return this.logo;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtOcrResultLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageQueueModerationResponseBodyDataExtOcrResultLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtOcrResultLocation self = new ImageQueueModerationResponseBodyDataExtOcrResultLocation();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtOcrResultLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageQueueModerationResponseBodyDataExtOcrResultLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageQueueModerationResponseBodyDataExtOcrResultLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageQueueModerationResponseBodyDataExtOcrResultLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtOcrResult extends TeaModel {
        @NameInMap("Location")
        public ImageQueueModerationResponseBodyDataExtOcrResultLocation location;

        /**
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Text")
        public String text;

        public static ImageQueueModerationResponseBodyDataExtOcrResult build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtOcrResult self = new ImageQueueModerationResponseBodyDataExtOcrResult();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtOcrResult setLocation(ImageQueueModerationResponseBodyDataExtOcrResultLocation location) {
            this.location = location;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtOcrResultLocation getLocation() {
            return this.location;
        }

        public ImageQueueModerationResponseBodyDataExtOcrResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtPublicFigureLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>440</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <strong>example:</strong>
         * <p>330</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageQueueModerationResponseBodyDataExtPublicFigureLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtPublicFigureLocation self = new ImageQueueModerationResponseBodyDataExtPublicFigureLocation();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigureLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigureLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigureLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigureLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtPublicFigure extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx001</p>
         */
        @NameInMap("FigureId")
        public String figureId;

        /**
         * <strong>example:</strong>
         * <p>yzazhzou</p>
         */
        @NameInMap("FigureName")
        public String figureName;

        @NameInMap("Location")
        public java.util.List<ImageQueueModerationResponseBodyDataExtPublicFigureLocation> location;

        public static ImageQueueModerationResponseBodyDataExtPublicFigure build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtPublicFigure self = new ImageQueueModerationResponseBodyDataExtPublicFigure();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigure setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigure setFigureName(String figureName) {
            this.figureName = figureName;
            return this;
        }
        public String getFigureName() {
            return this.figureName;
        }

        public ImageQueueModerationResponseBodyDataExtPublicFigure setLocation(java.util.List<ImageQueueModerationResponseBodyDataExtPublicFigureLocation> location) {
            this.location = location;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtPublicFigureLocation> getLocation() {
            return this.location;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtRecognition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>办公大楼</p>
         */
        @NameInMap("Classification")
        public String classification;

        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        public static ImageQueueModerationResponseBodyDataExtRecognition build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtRecognition self = new ImageQueueModerationResponseBodyDataExtRecognition();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtRecognition setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ImageQueueModerationResponseBodyDataExtRecognition setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtTextInImageCustomText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>自定义词1,自定义词2</p>
         */
        @NameInMap("KeyWords")
        public String keyWords;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <strong>example:</strong>
         * <p>自定义库1</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static ImageQueueModerationResponseBodyDataExtTextInImageCustomText build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtTextInImageCustomText self = new ImageQueueModerationResponseBodyDataExtTextInImageCustomText();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageCustomText setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageCustomText setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageCustomText setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation self = new ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtTextInImageOcrResult extends TeaModel {
        @NameInMap("Location")
        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation location;

        /**
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Text")
        public String text;

        public static ImageQueueModerationResponseBodyDataExtTextInImageOcrResult build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtTextInImageOcrResult self = new ImageQueueModerationResponseBodyDataExtTextInImageOcrResult();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResult setLocation(ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation location) {
            this.location = location;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResultLocation getLocation() {
            return this.location;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImageOcrResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtTextInImage extends TeaModel {
        @NameInMap("CustomText")
        public java.util.List<ImageQueueModerationResponseBodyDataExtTextInImageCustomText> customText;

        @NameInMap("OcrResult")
        public java.util.List<ImageQueueModerationResponseBodyDataExtTextInImageOcrResult> ocrResult;

        @NameInMap("RiskWord")
        public java.util.List<String> riskWord;

        public static ImageQueueModerationResponseBodyDataExtTextInImage build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtTextInImage self = new ImageQueueModerationResponseBodyDataExtTextInImage();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtTextInImage setCustomText(java.util.List<ImageQueueModerationResponseBodyDataExtTextInImageCustomText> customText) {
            this.customText = customText;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtTextInImageCustomText> getCustomText() {
            return this.customText;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImage setOcrResult(java.util.List<ImageQueueModerationResponseBodyDataExtTextInImageOcrResult> ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtTextInImageOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        public ImageQueueModerationResponseBodyDataExtTextInImage setRiskWord(java.util.List<String> riskWord) {
            this.riskWord = riskWord;
            return this;
        }
        public java.util.List<String> getRiskWord() {
            return this.riskWord;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExtVlContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是一段描述</p>
         */
        @NameInMap("OutputText")
        public String outputText;

        public static ImageQueueModerationResponseBodyDataExtVlContent build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExtVlContent self = new ImageQueueModerationResponseBodyDataExtVlContent();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExtVlContent setOutputText(String outputText) {
            this.outputText = outputText;
            return this;
        }
        public String getOutputText() {
            return this.outputText;
        }

    }

    public static class ImageQueueModerationResponseBodyDataExt extends TeaModel {
        @NameInMap("CustomImage")
        public java.util.List<ImageQueueModerationResponseBodyDataExtCustomImage> customImage;

        @NameInMap("FaceData")
        public java.util.List<ImageQueueModerationResponseBodyDataExtFaceData> faceData;

        @NameInMap("LogoData")
        public java.util.List<ImageQueueModerationResponseBodyDataExtLogoData> logoData;

        @NameInMap("OcrResult")
        public java.util.List<ImageQueueModerationResponseBodyDataExtOcrResult> ocrResult;

        @NameInMap("PublicFigure")
        public java.util.List<ImageQueueModerationResponseBodyDataExtPublicFigure> publicFigure;

        @NameInMap("Recognition")
        public java.util.List<ImageQueueModerationResponseBodyDataExtRecognition> recognition;

        @NameInMap("TextInImage")
        public ImageQueueModerationResponseBodyDataExtTextInImage textInImage;

        @NameInMap("VlContent")
        public ImageQueueModerationResponseBodyDataExtVlContent vlContent;

        public static ImageQueueModerationResponseBodyDataExt build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataExt self = new ImageQueueModerationResponseBodyDataExt();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataExt setCustomImage(java.util.List<ImageQueueModerationResponseBodyDataExtCustomImage> customImage) {
            this.customImage = customImage;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtCustomImage> getCustomImage() {
            return this.customImage;
        }

        public ImageQueueModerationResponseBodyDataExt setFaceData(java.util.List<ImageQueueModerationResponseBodyDataExtFaceData> faceData) {
            this.faceData = faceData;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtFaceData> getFaceData() {
            return this.faceData;
        }

        public ImageQueueModerationResponseBodyDataExt setLogoData(java.util.List<ImageQueueModerationResponseBodyDataExtLogoData> logoData) {
            this.logoData = logoData;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtLogoData> getLogoData() {
            return this.logoData;
        }

        public ImageQueueModerationResponseBodyDataExt setOcrResult(java.util.List<ImageQueueModerationResponseBodyDataExtOcrResult> ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        public ImageQueueModerationResponseBodyDataExt setPublicFigure(java.util.List<ImageQueueModerationResponseBodyDataExtPublicFigure> publicFigure) {
            this.publicFigure = publicFigure;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtPublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        public ImageQueueModerationResponseBodyDataExt setRecognition(java.util.List<ImageQueueModerationResponseBodyDataExtRecognition> recognition) {
            this.recognition = recognition;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataExtRecognition> getRecognition() {
            return this.recognition;
        }

        public ImageQueueModerationResponseBodyDataExt setTextInImage(ImageQueueModerationResponseBodyDataExtTextInImage textInImage) {
            this.textInImage = textInImage;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtTextInImage getTextInImage() {
            return this.textInImage;
        }

        public ImageQueueModerationResponseBodyDataExt setVlContent(ImageQueueModerationResponseBodyDataExtVlContent vlContent) {
            this.vlContent = vlContent;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExtVlContent getVlContent() {
            return this.vlContent;
        }

    }

    public static class ImageQueueModerationResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageQueueModerationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataResult self = new ImageQueueModerationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImageQueueModerationResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageQueueModerationResponseBodyDataResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ImageQueueModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Ext")
        public ImageQueueModerationResponseBodyDataExt ext;

        /**
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("ManualTaskId")
        public String manualTaskId;

        @NameInMap("Result")
        public java.util.List<ImageQueueModerationResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageQueueModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyData self = new ImageQueueModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImageQueueModerationResponseBodyData setExt(ImageQueueModerationResponseBodyDataExt ext) {
            this.ext = ext;
            return this;
        }
        public ImageQueueModerationResponseBodyDataExt getExt() {
            return this.ext;
        }

        public ImageQueueModerationResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        public ImageQueueModerationResponseBodyData setResult(java.util.List<ImageQueueModerationResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ImageQueueModerationResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
