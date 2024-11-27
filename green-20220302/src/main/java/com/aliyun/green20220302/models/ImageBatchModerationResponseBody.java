// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageBatchModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageBatchModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageBatchModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageBatchModerationResponseBody self = new ImageBatchModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageBatchModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageBatchModerationResponseBody setData(ImageBatchModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageBatchModerationResponseBodyData getData() {
        return this.data;
    }

    public ImageBatchModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ImageBatchModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageBatchModerationResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        public static ImageBatchModerationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResult self = new ImageBatchModerationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageBatchModerationResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImageBatchModerationResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtCustomImage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1965304870002</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>1965304870002</p>
         */
        @NameInMap("LibId")
        public String libId;

        @NameInMap("LibName")
        public String libName;

        public static ImageBatchModerationResponseBodyDataResultsExtCustomImage build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtCustomImage self = new ImageBatchModerationResponseBodyDataResultsExtCustomImage();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtCustomImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ImageBatchModerationResponseBodyDataResultsExtCustomImage setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ImageBatchModerationResponseBodyDataResultsExtCustomImage setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation extends TeaModel {
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

        public static ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation self = new ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo extends TeaModel {
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

        @NameInMap("Name")
        public String name;

        public static ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo self = new ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtLogoData extends TeaModel {
        @NameInMap("Location")
        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation location;

        @NameInMap("Logo")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo> logo;

        public static ImageBatchModerationResponseBodyDataResultsExtLogoData build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtLogoData self = new ImageBatchModerationResponseBodyDataResultsExtLogoData();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoData setLocation(ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation location) {
            this.location = location;
            return this;
        }
        public ImageBatchModerationResponseBodyDataResultsExtLogoDataLocation getLocation() {
            return this.location;
        }

        public ImageBatchModerationResponseBodyDataResultsExtLogoData setLogo(java.util.List<ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtLogoDataLogo> getLogo() {
            return this.logo;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation extends TeaModel {
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

        public static ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation self = new ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtPublicFigure extends TeaModel {
        @NameInMap("FigureId")
        public String figureId;

        @NameInMap("FigureName")
        public String figureName;

        @NameInMap("Location")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation> location;

        public static ImageBatchModerationResponseBodyDataResultsExtPublicFigure build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtPublicFigure self = new ImageBatchModerationResponseBodyDataResultsExtPublicFigure();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigure setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigure setFigureName(String figureName) {
            this.figureName = figureName;
            return this;
        }
        public String getFigureName() {
            return this.figureName;
        }

        public ImageBatchModerationResponseBodyDataResultsExtPublicFigure setLocation(java.util.List<ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation> location) {
            this.location = location;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtPublicFigureLocation> getLocation() {
            return this.location;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText extends TeaModel {
        @NameInMap("KeyWords")
        public String keyWords;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("LibId")
        public String libId;

        @NameInMap("LibName")
        public String libName;

        public static ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText self = new ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation extends TeaModel {
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

        public static ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation self = new ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult extends TeaModel {
        @NameInMap("Location")
        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation location;

        /**
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Text")
        public String text;

        public static ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult self = new ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult setLocation(ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation location) {
            this.location = location;
            return this;
        }
        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResultLocation getLocation() {
            return this.location;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExtTextInImage extends TeaModel {
        @NameInMap("CustomText")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText> customText;

        @NameInMap("OcrResult")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult> ocrResult;

        @NameInMap("RiskWord")
        public java.util.List<String> riskWord;

        public static ImageBatchModerationResponseBodyDataResultsExtTextInImage build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExtTextInImage self = new ImageBatchModerationResponseBodyDataResultsExtTextInImage();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImage setCustomText(java.util.List<ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText> customText) {
            this.customText = customText;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtTextInImageCustomText> getCustomText() {
            return this.customText;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImage setOcrResult(java.util.List<ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult> ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtTextInImageOcrResult> getOcrResult() {
            return this.ocrResult;
        }

        public ImageBatchModerationResponseBodyDataResultsExtTextInImage setRiskWord(java.util.List<String> riskWord) {
            this.riskWord = riskWord;
            return this;
        }
        public java.util.List<String> getRiskWord() {
            return this.riskWord;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsExt extends TeaModel {
        @NameInMap("CustomImage")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtCustomImage> customImage;

        @NameInMap("LogoData")
        public ImageBatchModerationResponseBodyDataResultsExtLogoData logoData;

        @NameInMap("PublicFigure")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtPublicFigure> publicFigure;

        @NameInMap("TextInImage")
        public ImageBatchModerationResponseBodyDataResultsExtTextInImage textInImage;

        public static ImageBatchModerationResponseBodyDataResultsExt build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsExt self = new ImageBatchModerationResponseBodyDataResultsExt();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsExt setCustomImage(java.util.List<ImageBatchModerationResponseBodyDataResultsExtCustomImage> customImage) {
            this.customImage = customImage;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtCustomImage> getCustomImage() {
            return this.customImage;
        }

        public ImageBatchModerationResponseBodyDataResultsExt setLogoData(ImageBatchModerationResponseBodyDataResultsExtLogoData logoData) {
            this.logoData = logoData;
            return this;
        }
        public ImageBatchModerationResponseBodyDataResultsExtLogoData getLogoData() {
            return this.logoData;
        }

        public ImageBatchModerationResponseBodyDataResultsExt setPublicFigure(java.util.List<ImageBatchModerationResponseBodyDataResultsExtPublicFigure> publicFigure) {
            this.publicFigure = publicFigure;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsExtPublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        public ImageBatchModerationResponseBodyDataResultsExt setTextInImage(ImageBatchModerationResponseBodyDataResultsExtTextInImage textInImage) {
            this.textInImage = textInImage;
            return this;
        }
        public ImageBatchModerationResponseBodyDataResultsExtTextInImage getTextInImage() {
            return this.textInImage;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResultsResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        public static ImageBatchModerationResponseBodyDataResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResultsResult self = new ImageBatchModerationResponseBodyDataResultsResult();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResultsResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageBatchModerationResponseBodyDataResultsResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImageBatchModerationResponseBodyDataResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ImageBatchModerationResponseBodyDataResults extends TeaModel {
        @NameInMap("Ext")
        public ImageBatchModerationResponseBodyDataResultsExt ext;

        @NameInMap("Result")
        public java.util.List<ImageBatchModerationResponseBodyDataResultsResult> result;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("Service")
        public String service;

        public static ImageBatchModerationResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyDataResults self = new ImageBatchModerationResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyDataResults setExt(ImageBatchModerationResponseBodyDataResultsExt ext) {
            this.ext = ext;
            return this;
        }
        public ImageBatchModerationResponseBodyDataResultsExt getExt() {
            return this.ext;
        }

        public ImageBatchModerationResponseBodyDataResults setResult(java.util.List<ImageBatchModerationResponseBodyDataResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResultsResult> getResult() {
            return this.result;
        }

        public ImageBatchModerationResponseBodyDataResults setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ImageBatchModerationResponseBodyDataResults setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class ImageBatchModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Result")
        public java.util.List<ImageBatchModerationResponseBodyDataResult> result;

        @NameInMap("Results")
        public java.util.List<ImageBatchModerationResponseBodyDataResults> results;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageBatchModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageBatchModerationResponseBodyData self = new ImageBatchModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageBatchModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImageBatchModerationResponseBodyData setResult(java.util.List<ImageBatchModerationResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ImageBatchModerationResponseBodyData setResults(java.util.List<ImageBatchModerationResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImageBatchModerationResponseBodyDataResults> getResults() {
            return this.results;
        }

        public ImageBatchModerationResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
