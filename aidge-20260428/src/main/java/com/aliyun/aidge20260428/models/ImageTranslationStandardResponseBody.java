// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationStandardResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates a successful call. For other response codes, refer to the error code information.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The translation result data, including the translated image URL and usage information.</p>
     */
    @NameInMap("Data")
    public ImageTranslationStandardResponseBodyData data;

    /**
     * <p>The error message. Returns &quot;Success&quot; for successful calls, and returns specific error information for failed calls.</p>
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
     * <p>1CEC4D94-905A-1ED1-A7B4-1BFEFFB3D850</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageTranslationStandardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationStandardResponseBody self = new ImageTranslationStandardResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationStandardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationStandardResponseBody setData(ImageTranslationStandardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationStandardResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationStandardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationStandardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationStandardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationStandardResponseBodyDataEditInfoGoodsRects extends TeaModel {
        /**
         * <p>The rotation angle.</p>
         */
        @NameInMap("Degree")
        public Integer degree;

        /**
         * <p>The height.</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The left coordinate.</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <p>The top coordinate.</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <p>The width.</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageTranslationStandardResponseBodyDataEditInfoGoodsRects build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyDataEditInfoGoodsRects self = new ImageTranslationStandardResponseBodyDataEditInfoGoodsRects();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects setDegree(Integer degree) {
            this.degree = degree;
            return this;
        }
        public Integer getDegree() {
            return this.degree;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect extends TeaModel {
        /**
         * <p>The rotation angle.</p>
         */
        @NameInMap("Degree")
        public Integer degree;

        /**
         * <p>The height.</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The left coordinate.</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <p>The top coordinate.</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <p>The width.</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect self = new ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect setDegree(Integer degree) {
            this.degree = degree;
            return this;
        }
        public Integer getDegree() {
            return this.degree;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect extends TeaModel {
        /**
         * <p>The rotation angle.</p>
         */
        @NameInMap("Degree")
        public Integer degree;

        /**
         * <p>The height.</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The left coordinate.</p>
         */
        @NameInMap("Left")
        public Integer left;

        /**
         * <p>The top coordinate.</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <p>The width.</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect self = new ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect setDegree(Integer degree) {
            this.degree = degree;
            return this;
        }
        public Integer getDegree() {
            return this.degree;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts extends TeaModel {
        /**
         * <p>The color.</p>
         * 
         * <strong>example:</strong>
         * <p>#9d7746</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Fontsize")
        public Integer fontsize;

        /**
         * <p>The horizontal layout.</p>
         * 
         * <strong>example:</strong>
         * <p>left</p>
         */
        @NameInMap("HorizontalLayout")
        public String horizontalLayout;

        /**
         * <p>The image area.</p>
         */
        @NameInMap("ImageRect")
        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect imageRect;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The line count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LineCount")
        public Integer lineCount;

        /**
         * <p>The text area.</p>
         */
        @NameInMap("TextRect")
        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect textRect;

        /**
         * <p>Indicates whether the text is valid.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Valid")
        public Boolean valid;

        /**
         * <p>The text value.</p>
         * 
         * <strong>example:</strong>
         * <p>Solid Wood Wardrobe.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The vertical layout.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("VerticalLayout")
        public String verticalLayout;

        public static ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts self = new ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setFontsize(Integer fontsize) {
            this.fontsize = fontsize;
            return this;
        }
        public Integer getFontsize() {
            return this.fontsize;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setHorizontalLayout(String horizontalLayout) {
            this.horizontalLayout = horizontalLayout;
            return this;
        }
        public String getHorizontalLayout() {
            return this.horizontalLayout;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setImageRect(ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect imageRect) {
            this.imageRect = imageRect;
            return this;
        }
        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsImageRect getImageRect() {
            return this.imageRect;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setLineCount(Integer lineCount) {
            this.lineCount = lineCount;
            return this;
        }
        public Integer getLineCount() {
            return this.lineCount;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setTextRect(ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect textRect) {
            this.textRect = textRect;
            return this;
        }
        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTextsTextRect getTextRect() {
            return this.textRect;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts setVerticalLayout(String verticalLayout) {
            this.verticalLayout = verticalLayout;
            return this;
        }
        public String getVerticalLayout() {
            return this.verticalLayout;
        }

    }

    public static class ImageTranslationStandardResponseBodyDataEditInfoTextAreas extends TeaModel {
        /**
         * <p>The color.</p>
         * 
         * <strong>example:</strong>
         * <p>#000000</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>SOLIDWOOD WARDROBE</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("Fontsize")
        public Integer fontsize;

        /**
         * <p>The horizontal layout.</p>
         * 
         * <strong>example:</strong>
         * <p>left</p>
         */
        @NameInMap("HorizontalLayout")
        public String horizontalLayout;

        /**
         * <p>The line count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LineCount")
        public Integer lineCount;

        /**
         * <p>The list of texts.</p>
         */
        @NameInMap("Texts")
        public java.util.List<ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts> texts;

        /**
         * <p>The vertical layout.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("VerticalLayout")
        public String verticalLayout;

        public static ImageTranslationStandardResponseBodyDataEditInfoTextAreas build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyDataEditInfoTextAreas self = new ImageTranslationStandardResponseBodyDataEditInfoTextAreas();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setFontsize(Integer fontsize) {
            this.fontsize = fontsize;
            return this;
        }
        public Integer getFontsize() {
            return this.fontsize;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setHorizontalLayout(String horizontalLayout) {
            this.horizontalLayout = horizontalLayout;
            return this;
        }
        public String getHorizontalLayout() {
            return this.horizontalLayout;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setLineCount(Integer lineCount) {
            this.lineCount = lineCount;
            return this;
        }
        public Integer getLineCount() {
            return this.lineCount;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setTexts(java.util.List<ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<ImageTranslationStandardResponseBodyDataEditInfoTextAreasTexts> getTexts() {
            return this.texts;
        }

        public ImageTranslationStandardResponseBodyDataEditInfoTextAreas setVerticalLayout(String verticalLayout) {
            this.verticalLayout = verticalLayout;
            return this;
        }
        public String getVerticalLayout() {
            return this.verticalLayout;
        }

    }

    public static class ImageTranslationStandardResponseBodyDataEditInfo extends TeaModel {
        /**
         * <p>The list of fonts used.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;NotoSansSC-Bold&quot;]</p>
         */
        @NameInMap("Font")
        public java.util.List<String> font;

        /**
         * <p>The product area rectangles.</p>
         */
        @NameInMap("GoodsRects")
        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects goodsRects;

        /**
         * <p>The product image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xiuxiu-pro.meitudata.com/posters/34d78f9157e5560a4d612949ca6f6485.jpg">https://xiuxiu-pro.meitudata.com/posters/34d78f9157e5560a4d612949ca6f6485.jpg</a></p>
         */
        @NameInMap("GoodsUrl")
        public String goodsUrl;

        /**
         * <p>The list of target languages.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;zh&quot;]</p>
         */
        @NameInMap("Languages")
        public java.util.List<String> languages;

        /**
         * <p>The original image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xiuxiu-pro.meitudata.com/posters/34d78f9157e5560a4d612949ca6f6485.jpg">https://xiuxiu-pro.meitudata.com/posters/34d78f9157e5560a4d612949ca6f6485.jpg</a></p>
         */
        @NameInMap("PictUrl")
        public String pictUrl;

        /**
         * <p>The repaired image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.png">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.png</a></p>
         */
        @NameInMap("RepairedUrl")
        public String repairedUrl;

        /**
         * <p>The list of repaired image URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.png%22%5D">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.png&quot;]</a></p>
         */
        @NameInMap("RepairedUrls")
        public java.util.List<String> repairedUrls;

        /**
         * <p>The list of result image IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;c18ab570-81aa-11f1-a14a-5ee00dcfdc3c&quot;]</p>
         */
        @NameInMap("ResultImageIds")
        public java.util.List<String> resultImageIds;

        /**
         * <p>The list of result image URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg%22%5D">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg&quot;]</a></p>
         */
        @NameInMap("ResultUrls")
        public java.util.List<String> resultUrls;

        /**
         * <p>The list of text areas.</p>
         */
        @NameInMap("TextAreas")
        public java.util.List<ImageTranslationStandardResponseBodyDataEditInfoTextAreas> textAreas;

        public static ImageTranslationStandardResponseBodyDataEditInfo build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyDataEditInfo self = new ImageTranslationStandardResponseBodyDataEditInfo();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setFont(java.util.List<String> font) {
            this.font = font;
            return this;
        }
        public java.util.List<String> getFont() {
            return this.font;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setGoodsRects(ImageTranslationStandardResponseBodyDataEditInfoGoodsRects goodsRects) {
            this.goodsRects = goodsRects;
            return this;
        }
        public ImageTranslationStandardResponseBodyDataEditInfoGoodsRects getGoodsRects() {
            return this.goodsRects;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setGoodsUrl(String goodsUrl) {
            this.goodsUrl = goodsUrl;
            return this;
        }
        public String getGoodsUrl() {
            return this.goodsUrl;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setLanguages(java.util.List<String> languages) {
            this.languages = languages;
            return this;
        }
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setPictUrl(String pictUrl) {
            this.pictUrl = pictUrl;
            return this;
        }
        public String getPictUrl() {
            return this.pictUrl;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setRepairedUrl(String repairedUrl) {
            this.repairedUrl = repairedUrl;
            return this;
        }
        public String getRepairedUrl() {
            return this.repairedUrl;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setRepairedUrls(java.util.List<String> repairedUrls) {
            this.repairedUrls = repairedUrls;
            return this;
        }
        public java.util.List<String> getRepairedUrls() {
            return this.repairedUrls;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setResultImageIds(java.util.List<String> resultImageIds) {
            this.resultImageIds = resultImageIds;
            return this;
        }
        public java.util.List<String> getResultImageIds() {
            return this.resultImageIds;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setResultUrls(java.util.List<String> resultUrls) {
            this.resultUrls = resultUrls;
            return this;
        }
        public java.util.List<String> getResultUrls() {
            return this.resultUrls;
        }

        public ImageTranslationStandardResponseBodyDataEditInfo setTextAreas(java.util.List<ImageTranslationStandardResponseBodyDataEditInfoTextAreas> textAreas) {
            this.textAreas = textAreas;
            return this;
        }
        public java.util.List<ImageTranslationStandardResponseBodyDataEditInfoTextAreas> getTextAreas() {
            return this.textAreas;
        }

    }

    public static class ImageTranslationStandardResponseBodyData extends TeaModel {
        /**
         * <p>The edit information.</p>
         */
        @NameInMap("EditInfo")
        public ImageTranslationStandardResponseBodyDataEditInfo editInfo;

        /**
         * <p>The URL of the image generated after image translation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The usage information, including the number of images processed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static ImageTranslationStandardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationStandardResponseBodyData self = new ImageTranslationStandardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationStandardResponseBodyData setEditInfo(ImageTranslationStandardResponseBodyDataEditInfo editInfo) {
            this.editInfo = editInfo;
            return this;
        }
        public ImageTranslationStandardResponseBodyDataEditInfo getEditInfo() {
            return this.editInfo;
        }

        public ImageTranslationStandardResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ImageTranslationStandardResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
