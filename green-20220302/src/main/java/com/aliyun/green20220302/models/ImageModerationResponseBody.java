// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
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

    public static class ImageModerationResponseBodyDataExtCustomImage extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("LibId")
        public String libId;

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

    public static class ImageModerationResponseBodyDataExtLogoDataLocation extends TeaModel {
        @NameInMap("H")
        public Integer h;

        @NameInMap("W")
        public Integer w;

        @NameInMap("X")
        public Integer x;

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
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Label")
        public String label;

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
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtLogoDataLocation location;

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
        @NameInMap("H")
        public Integer h;

        @NameInMap("W")
        public Integer w;

        @NameInMap("X")
        public Integer x;

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
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtOcrResultLocation location;

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

    public static class ImageModerationResponseBodyDataExtPublicFigure extends TeaModel {
        @NameInMap("FigureId")
        public String figureId;

        @NameInMap("FigureName")
        public String figureName;

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

    }

    public static class ImageModerationResponseBodyDataExtRecognition extends TeaModel {
        @NameInMap("Classification")
        public String classification;

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
        @NameInMap("KeyWords")
        public String keyWords;

        @NameInMap("LibId")
        public String libId;

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
        @NameInMap("H")
        public Integer h;

        @NameInMap("W")
        public Integer w;

        @NameInMap("X")
        public Integer x;

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
        @NameInMap("Location")
        public ImageModerationResponseBodyDataExtTextInImageOcrResultLocation location;

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
        @NameInMap("CustomText")
        public java.util.List<ImageModerationResponseBodyDataExtTextInImageCustomText> customText;

        @NameInMap("OcrResult")
        public java.util.List<ImageModerationResponseBodyDataExtTextInImageOcrResult> ocrResult;

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

    public static class ImageModerationResponseBodyDataExt extends TeaModel {
        @NameInMap("CustomImage")
        public java.util.List<ImageModerationResponseBodyDataExtCustomImage> customImage;

        @NameInMap("LogoData")
        public java.util.List<ImageModerationResponseBodyDataExtLogoData> logoData;

        @NameInMap("OcrResult")
        public java.util.List<ImageModerationResponseBodyDataExtOcrResult> ocrResult;

        @NameInMap("PublicFigure")
        public java.util.List<ImageModerationResponseBodyDataExtPublicFigure> publicFigure;

        @NameInMap("Recognition")
        public java.util.List<ImageModerationResponseBodyDataExtRecognition> recognition;

        @NameInMap("TextInImage")
        public ImageModerationResponseBodyDataExtTextInImage textInImage;

        public static ImageModerationResponseBodyDataExt build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyDataExt self = new ImageModerationResponseBodyDataExt();
            return TeaModel.build(map, self);
        }

        public ImageModerationResponseBodyDataExt setCustomImage(java.util.List<ImageModerationResponseBodyDataExtCustomImage> customImage) {
            this.customImage = customImage;
            return this;
        }
        public java.util.List<ImageModerationResponseBodyDataExtCustomImage> getCustomImage() {
            return this.customImage;
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

    }

    public static class ImageModerationResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

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

        public ImageModerationResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ImageModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fb5ffab1-993b-449f-b8d6-b97d5e3331f2</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Ext")
        public ImageModerationResponseBodyDataExt ext;

        @NameInMap("Result")
        public java.util.List<ImageModerationResponseBodyDataResult> result;

        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageModerationResponseBodyData self = new ImageModerationResponseBodyData();
            return TeaModel.build(map, self);
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
