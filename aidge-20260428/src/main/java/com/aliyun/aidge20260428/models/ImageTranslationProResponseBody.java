// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationProResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. For other response codes, see the error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The translation result data. ResultList contains the URL of the translation result. GenFiles contains EditInfo with the recognized text information.</p>
     */
    @NameInMap("Data")
    public ImageTranslationProResponseBodyData data;

    /**
     * <p>The error message. &quot;Success&quot; is returned for successful calls. A specific error message is returned for failed calls, such as &quot;The content contains sensitive data. Try other input.&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>61785C32-80C2-19A3-9E55-2C3702C84B40</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageTranslationProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationProResponseBody self = new ImageTranslationProResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationProResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationProResponseBody setData(ImageTranslationProResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationProResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationProResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationProResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationProResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects extends TeaModel {
        /**
         * <p>The rotation angle of the text box in degrees. A value less than 1 indicates a horizontal text box.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Degree")
        public Integer degree;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The left coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <p>The top coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects self = new ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects setDegree(Integer degree) {
            this.degree = degree;
            return this;
        }
        public Integer getDegree() {
            return this.degree;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect extends TeaModel {
        /**
         * <p>The rotation angle of the text box in degrees. A value less than 1 indicates a horizontal text box.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Degree")
        public Integer degree;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>54</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The left coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <p>The top coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>418</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect self = new ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect setDegree(Integer degree) {
            this.degree = degree;
            return this;
        }
        public Integer getDegree() {
            return this.degree;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect extends TeaModel {
        /**
         * <p>The rotation angle of the text box in degrees. A value less than 1 indicates a horizontal text box.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Degree")
        public Integer degree;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The left coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <p>The top coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>488</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect self = new ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect setDegree(Integer degree) {
            this.degree = degree;
            return this;
        }
        public Integer getDegree() {
            return this.degree;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts extends TeaModel {
        /**
         * <p>The color of the translated text.</p>
         * 
         * <strong>example:</strong>
         * <p>#515151</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The font size of the translated text.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Fontsize")
        public Integer fontsize;

        /**
         * <p>The horizontal layout. Valid values: center, left, right.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("HorizontalLayout")
        public String horizontalLayout;

        /**
         * <p>The coordinates of the image repair area.</p>
         */
        @NameInMap("ImageRect")
        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect imageRect;

        /**
         * <p>The target language code for translation.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The number of lines in the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LineCount")
        public Integer lineCount;

        /**
         * <p>The Ovis model error message and execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>| ovis time: 0.748</p>
         */
        @NameInMap("OvisErrMsg")
        public String ovisErrMsg;

        /**
         * <p>The coordinates of the text box area.</p>
         */
        @NameInMap("TextRect")
        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect textRect;

        /**
         * <p>Indicates whether the TextItem is valid. The item is invalid if this value does not exist or is false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Valid")
        public Boolean valid;

        /**
         * <p>The translated text content.</p>
         * 
         * <strong>example:</strong>
         * <p>Adorable Design · Crisp Bell Sound</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The vertical layout. Valid values: center, top, down.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("VerticalLayout")
        public String verticalLayout;

        public static ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts self = new ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setFontsize(Integer fontsize) {
            this.fontsize = fontsize;
            return this;
        }
        public Integer getFontsize() {
            return this.fontsize;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setHorizontalLayout(String horizontalLayout) {
            this.horizontalLayout = horizontalLayout;
            return this;
        }
        public String getHorizontalLayout() {
            return this.horizontalLayout;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setImageRect(ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect imageRect) {
            this.imageRect = imageRect;
            return this;
        }
        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsImageRect getImageRect() {
            return this.imageRect;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setLineCount(Integer lineCount) {
            this.lineCount = lineCount;
            return this;
        }
        public Integer getLineCount() {
            return this.lineCount;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setOvisErrMsg(String ovisErrMsg) {
            this.ovisErrMsg = ovisErrMsg;
            return this;
        }
        public String getOvisErrMsg() {
            return this.ovisErrMsg;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setTextRect(ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect textRect) {
            this.textRect = textRect;
            return this;
        }
        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTextsTextRect getTextRect() {
            return this.textRect;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts setVerticalLayout(String verticalLayout) {
            this.verticalLayout = verticalLayout;
            return this;
        }
        public String getVerticalLayout() {
            return this.verticalLayout;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas extends TeaModel {
        /**
         * <p>The text color, such as #ffffff.</p>
         * 
         * <strong>example:</strong>
         * <p>#515151</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The original text before translation.</p>
         * 
         * <strong>example:</strong>
         * <p>萌趣造型·清脆响铃</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Fontsize")
        public Integer fontsize;

        /**
         * <p>The horizontal layout. Valid values: center, left, right.</p>
         * 
         * <strong>example:</strong>
         * <p>left</p>
         */
        @NameInMap("HorizontalLayout")
        public String horizontalLayout;

        /**
         * <p>The number of lines in the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LineCount")
        public Integer lineCount;

        /**
         * <p>The list of translated texts. Each element corresponds to the translation result for a target language.</p>
         */
        @NameInMap("Texts")
        public java.util.List<ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts> texts;

        /**
         * <p>The vertical layout. Valid values: center, top, down.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("VerticalLayout")
        public String verticalLayout;

        public static ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas self = new ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setFontsize(Integer fontsize) {
            this.fontsize = fontsize;
            return this;
        }
        public Integer getFontsize() {
            return this.fontsize;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setHorizontalLayout(String horizontalLayout) {
            this.horizontalLayout = horizontalLayout;
            return this;
        }
        public String getHorizontalLayout() {
            return this.horizontalLayout;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setLineCount(Integer lineCount) {
            this.lineCount = lineCount;
            return this;
        }
        public Integer getLineCount() {
            return this.lineCount;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setTexts(java.util.List<ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreasTexts> getTexts() {
            return this.texts;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas setVerticalLayout(String verticalLayout) {
            this.verticalLayout = verticalLayout;
            return this;
        }
        public String getVerticalLayout() {
            return this.verticalLayout;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFilesEditInfo extends TeaModel {
        /**
         * <p>The list of font types.</p>
         */
        @NameInMap("Font")
        public java.util.List<String> font;

        /**
         * <p>The coordinate information of the product bounding box area.</p>
         */
        @NameInMap("GoodsRects")
        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects goodsRects;

        /**
         * <p>The list of target languages for translation.</p>
         */
        @NameInMap("Languages")
        public java.util.List<String> languages;

        /**
         * <p>The URL of the image with all text removed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/repaired.png">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/repaired.png</a></p>
         */
        @NameInMap("RepairedUrl")
        public String repairedUrl;

        /**
         * <p>The collection of global IDs of translated images.</p>
         */
        @NameInMap("ResultImageIds")
        public java.util.List<String> resultImageIds;

        /**
         * <p>The list of text boxes, which contains information about all recognized text areas.</p>
         */
        @NameInMap("TextAreas")
        public java.util.List<ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas> textAreas;

        public static ImageTranslationProResponseBodyDataGenFilesEditInfo build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesEditInfo self = new ImageTranslationProResponseBodyDataGenFilesEditInfo();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfo setFont(java.util.List<String> font) {
            this.font = font;
            return this;
        }
        public java.util.List<String> getFont() {
            return this.font;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfo setGoodsRects(ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects goodsRects) {
            this.goodsRects = goodsRects;
            return this;
        }
        public ImageTranslationProResponseBodyDataGenFilesEditInfoGoodsRects getGoodsRects() {
            return this.goodsRects;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfo setLanguages(java.util.List<String> languages) {
            this.languages = languages;
            return this;
        }
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfo setRepairedUrl(String repairedUrl) {
            this.repairedUrl = repairedUrl;
            return this;
        }
        public String getRepairedUrl() {
            return this.repairedUrl;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfo setResultImageIds(java.util.List<String> resultImageIds) {
            this.resultImageIds = resultImageIds;
            return this;
        }
        public java.util.List<String> getResultImageIds() {
            return this.resultImageIds;
        }

        public ImageTranslationProResponseBodyDataGenFilesEditInfo setTextAreas(java.util.List<ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas> textAreas) {
            this.textAreas = textAreas;
            return this;
        }
        public java.util.List<ImageTranslationProResponseBodyDataGenFilesEditInfoTextAreas> getTextAreas() {
            return this.textAreas;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFilesResultList extends TeaModel {
        /**
         * <p>The URL of the translated image file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The target language for translation.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        public static ImageTranslationProResponseBodyDataGenFilesResultList build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFilesResultList self = new ImageTranslationProResponseBodyDataGenFilesResultList();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFilesResultList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ImageTranslationProResponseBodyDataGenFilesResultList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class ImageTranslationProResponseBodyDataGenFiles extends TeaModel {
        /**
         * <p>The editor information, which contains recognized information such as text areas, product areas, and fonts.</p>
         */
        @NameInMap("EditInfo")
        public ImageTranslationProResponseBodyDataGenFilesEditInfo editInfo;

        /**
         * <p>The collection of translation results.</p>
         */
        @NameInMap("ResultList")
        public java.util.List<ImageTranslationProResponseBodyDataGenFilesResultList> resultList;

        /**
         * <p>The URL of the original image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg">https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg</a></p>
         */
        @NameInMap("SrcImage")
        public String srcImage;

        public static ImageTranslationProResponseBodyDataGenFiles build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataGenFiles self = new ImageTranslationProResponseBodyDataGenFiles();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataGenFiles setEditInfo(ImageTranslationProResponseBodyDataGenFilesEditInfo editInfo) {
            this.editInfo = editInfo;
            return this;
        }
        public ImageTranslationProResponseBodyDataGenFilesEditInfo getEditInfo() {
            return this.editInfo;
        }

        public ImageTranslationProResponseBodyDataGenFiles setResultList(java.util.List<ImageTranslationProResponseBodyDataGenFilesResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<ImageTranslationProResponseBodyDataGenFilesResultList> getResultList() {
            return this.resultList;
        }

        public ImageTranslationProResponseBodyDataGenFiles setSrcImage(String srcImage) {
            this.srcImage = srcImage;
            return this;
        }
        public String getSrcImage() {
            return this.srcImage;
        }

    }

    public static class ImageTranslationProResponseBodyDataResultList extends TeaModel {
        /**
         * <p>The URL of the image translation result image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The target language for image translation.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        public static ImageTranslationProResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyDataResultList self = new ImageTranslationProResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyDataResultList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ImageTranslationProResponseBodyDataResultList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class ImageTranslationProResponseBodyData extends TeaModel {
        /**
         * <p>The editor protocol, which contains the translation result files and editing information.</p>
         */
        @NameInMap("GenFiles")
        public java.util.List<ImageTranslationProResponseBodyDataGenFiles> genFiles;

        /**
         * <p>The list of image translation results.</p>
         */
        @NameInMap("ResultList")
        public java.util.List<ImageTranslationProResponseBodyDataResultList> resultList;

        /**
         * <p>The asynchronous task ID. This is not returned for synchronous calls.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123-task-id</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage information, including the number of processed images.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static ImageTranslationProResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationProResponseBodyData self = new ImageTranslationProResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationProResponseBodyData setGenFiles(java.util.List<ImageTranslationProResponseBodyDataGenFiles> genFiles) {
            this.genFiles = genFiles;
            return this;
        }
        public java.util.List<ImageTranslationProResponseBodyDataGenFiles> getGenFiles() {
            return this.genFiles;
        }

        public ImageTranslationProResponseBodyData setResultList(java.util.List<ImageTranslationProResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<ImageTranslationProResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public ImageTranslationProResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImageTranslationProResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
