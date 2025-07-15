// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterComponentsResponseBody extends TeaModel {
    /**
     * <p>The components.</p>
     */
    @NameInMap("Components")
    public DescribeCasterComponentsResponseBodyComponents components;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3be7ade8-d907-483c-b24a-0dad45******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeCasterComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterComponentsResponseBody self = new DescribeCasterComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterComponentsResponseBody setComponents(DescribeCasterComponentsResponseBodyComponents components) {
        this.components = components;
        return this;
    }
    public DescribeCasterComponentsResponseBodyComponents getComponents() {
        return this.components;
    }

    public DescribeCasterComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterComponentsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent extends TeaModel {
        /**
         * <p>The color of the text border.</p>
         * <p>Valid values: <strong>0x000000 to 0xffffff</strong>. If the value of this parameter is &quot;&quot;, this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0x000000</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The normalized value of the width of the text border. The value of this parameter equals the border width divided by the font size.</p>
         * <p>The maximum width of the text border is <strong>16</strong>, even if the border width calculated based on this parameter is greater than <strong>16</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidthNormalized")
        public Float borderWidthNormalized;

        /**
         * <p>The color of the text. Valid values: <strong>0x000000 to 0xffffff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0x000000</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The font of the text, which is specified by the system. Valid values:</p>
         * <ul>
         * <li><strong>KaiTi</strong></li>
         * <li><strong>AlibabaPuHuiTi-Regular</strong></li>
         * <li><strong>AlibabaPuHuiTi-Bold</strong></li>
         * <li><strong>NAlibabaPuHuiTi-Light</strong></li>
         * <li><strong>NotoSansHans-Regular</strong></li>
         * <li><strong>NotoSansHans-Bold</strong></li>
         * <li><strong>NotoSansHans-Light</strong></li>
         * </ul>
         * <hr>
         * 
         * <strong>example:</strong>
         * <p>KaiTi</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The line spacing, which indicates the interval between every two lines.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LineSpaceNormalized")
        public Float lineSpaceNormalized;

        /**
         * <p>The location ID of the component. If the value of the ComponentType parameter is caption, the LocationId parameter indicates the channel ID of the video source that is referenced by the component.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        /**
         * <p>The offset between the presentation timestamps (PTS) of the subtitles and the audio.</p>
         * <p>Valid values: <strong>-10000 to 10000</strong>. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PtsOffset")
        public Integer ptsOffset;

        /**
         * <p>Indicates whether the source language of the subtitles is displayed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The source language is displayed.</li>
         * <li><strong>false</strong>: The source language is not displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ShowSourceLan")
        public Boolean showSourceLan;

        /**
         * <p>The normalized value of the font size of the subtitles. The value of this parameter equals the font size divided by the output height.``</p>
         * <p>The maximum font size of the subtitles is <strong>1,024</strong>, even if the font size calculated based on this parameter is greater than <strong>1,024</strong>. If the value of this parameter is <strong>-1</strong>, this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("SizeNormalized")
        public Float sizeNormalized;

        /**
         * <p>The source language of the audio in the video source. Valid values:</p>
         * <ul>
         * <li><strong>en</strong>: English</li>
         * <li><strong>cn</strong>: Chinese</li>
         * <li><strong>es</strong>: Spanish</li>
         * <li><strong>ru</strong>: Russian</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("SourceLan")
        public String sourceLan;

        /**
         * <p>The target language of the audio in the video source. Valid values:</p>
         * <ul>
         * <li><strong>en</strong>: English</li>
         * <li><strong>cn</strong>: Chinese</li>
         * <li><strong>es</strong>: Spanish</li>
         * <li><strong>ru</strong>: Russian</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("TargetLan")
        public String targetLan;

        /**
         * <p>The maximum number of words displayed in each line.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("WordCountPerLine")
        public Integer wordCountPerLine;

        /**
         * <p>The word spacing, which indicates the interval between every two words.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WordSpaceNormalized")
        public Float wordSpaceNormalized;

        /**
         * <p>The number of words displayed on the component. The value of this parameter can be specified based on the font size.</p>
         * <p>Valid values: <strong>10 to 50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("WordsCount")
        public Integer wordsCount;

        public static DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent self = new DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setBorderWidthNormalized(Float borderWidthNormalized) {
            this.borderWidthNormalized = borderWidthNormalized;
            return this;
        }
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setLineSpaceNormalized(Float lineSpaceNormalized) {
            this.lineSpaceNormalized = lineSpaceNormalized;
            return this;
        }
        public Float getLineSpaceNormalized() {
            return this.lineSpaceNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setPtsOffset(Integer ptsOffset) {
            this.ptsOffset = ptsOffset;
            return this;
        }
        public Integer getPtsOffset() {
            return this.ptsOffset;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setShowSourceLan(Boolean showSourceLan) {
            this.showSourceLan = showSourceLan;
            return this;
        }
        public Boolean getShowSourceLan() {
            return this.showSourceLan;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setSizeNormalized(Float sizeNormalized) {
            this.sizeNormalized = sizeNormalized;
            return this;
        }
        public Float getSizeNormalized() {
            return this.sizeNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setSourceLan(String sourceLan) {
            this.sourceLan = sourceLan;
            return this;
        }
        public String getSourceLan() {
            return this.sourceLan;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setTargetLan(String targetLan) {
            this.targetLan = targetLan;
            return this;
        }
        public String getTargetLan() {
            return this.targetLan;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setWordCountPerLine(Integer wordCountPerLine) {
            this.wordCountPerLine = wordCountPerLine;
            return this;
        }
        public Integer getWordCountPerLine() {
            return this.wordCountPerLine;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setWordSpaceNormalized(Float wordSpaceNormalized) {
            this.wordSpaceNormalized = wordSpaceNormalized;
            return this;
        }
        public Float getWordSpaceNormalized() {
            return this.wordSpaceNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent setWordsCount(Integer wordsCount) {
            this.wordsCount = wordsCount;
            return this;
        }
        public Integer getWordsCount() {
            return this.wordsCount;
        }

    }

    public static class DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds extends TeaModel {
        @NameInMap("Position")
        public java.util.List<Float> position;

        public static DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds self = new DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds setPosition(java.util.List<Float> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Float> getPosition() {
            return this.position;
        }

    }

    public static class DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer extends TeaModel {
        /**
         * <p>The normalized value for heights of the elements in the layer. The widths of the elements are proportionally scaled based on this parameter.</p>
         * <p>If the value of this parameter is <strong>0</strong>, the elements in the layer are not scaled.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The normalized value of the position of the layer, in the format of <code>[x,y]</code>. Example: <code>[0,0]</code>.</p>
         * <blockquote>
         * <p> The values of x and y need to be normalized.</p>
         * </blockquote>
         */
        @NameInMap("PositionNormalizeds")
        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds positionNormalizeds;

        /**
         * <p>The reference coordinates of the layer. Valid values:</p>
         * <ul>
         * <li><strong>topLeft</strong>: the upper-left corner</li>
         * <li><strong>topRight</strong>: the upper-right corner</li>
         * <li><strong>bottomLeft</strong>: the lower-left corner</li>
         * <li><strong>bottomRight</strong>: the lower-right corner</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The transparency of the layer. Valid values: 0 to 255.</p>
         * <p>A value of <strong>0</strong> indicates that the layer is completely transparent. A value of <strong>255</strong> indicates that the layer is completely opaque.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Transparency")
        public Integer transparency;

        /**
         * <p>The normalized value for widths of the elements in the layer. The heights of the elements are proportionally scaled based on this parameter. If the value of this parameter is <strong>0</strong>, the elements in the layer are not scaled.</p>
         * <blockquote>
         * <p> This parameter conflicts with the HeightNormalized parameter. If both of them are specified, only the HeightNormalized parameter takes effect. If only one of them is specified, the latest specified value is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        public static DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer self = new DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer setPositionNormalizeds(DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds positionNormalizeds) {
            this.positionNormalizeds = positionNormalizeds;
            return this;
        }
        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds getPositionNormalizeds() {
            return this.positionNormalizeds;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer setTransparency(Integer transparency) {
            this.transparency = transparency;
            return this;
        }
        public Integer getTransparency() {
            return this.transparency;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

    }

    public static class DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent extends TeaModel {
        /**
         * <p>The ID of the material from the media library.</p>
         * 
         * <strong>example:</strong>
         * <p>6cf724c6ebfd4a59b5b3cec6f10d****</p>
         */
        @NameInMap("MaterialId")
        public String materialId;

        public static DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent self = new DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

    }

    public static class DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent extends TeaModel {
        /**
         * <p>The color of the text border. Valid values: <strong>0x000000 to 0xffffff</strong>. If the value of this parameter is <strong>&quot;&quot;</strong>, this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0x000000</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The normalized value of the width of the text border. The value of this parameter equals the border width divided by the font size.****</p>
         * <p>The maximum width of the text border is <strong>16</strong>, even if the border width calculated based on this parameter is greater than <strong>16</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidthNormalized")
        public Float borderWidthNormalized;

        /**
         * <p>The color of the text. Valid values: <strong>0x000000 to 0xffffff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0xff0000</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The font of the text, which is specified by the system. Valid values:</p>
         * <ul>
         * <li><strong>KaiTi</strong></li>
         * <li><strong>AlibabaPuHuiTi-Regular</strong></li>
         * <li><strong>AlibabaPuHuiTi-Bold</strong></li>
         * <li><strong>NAlibabaPuHuiTi-Light</strong></li>
         * <li><strong>NotoSansHans-Regular</strong></li>
         * <li><strong>NotoSansHans-Bold</strong></li>
         * <li><strong>NotoSansHans-Light</strong></li>
         * </ul>
         * <hr>
         * 
         * <strong>example:</strong>
         * <p>KaiTi</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The normalized value of the font size of the text.</p>
         * <p>The value of this parameter equals the font size divided by the output height.**** The maximum font size of the text is <strong>1,024</strong>, even if the font size calculated based on this parameter is greater than <strong>1,024</strong>. If the value of this parameter is <strong>-1</strong>, this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("SizeNormalized")
        public Float sizeNormalized;

        /**
         * <p>The content of the text.</p>
         * 
         * <strong>example:</strong>
         * <p>hello world</p>
         */
        @NameInMap("Text")
        public String text;

        public static DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent self = new DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent setBorderWidthNormalized(Float borderWidthNormalized) {
            this.borderWidthNormalized = borderWidthNormalized;
            return this;
        }
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent setSizeNormalized(Float sizeNormalized) {
            this.sizeNormalized = sizeNormalized;
            return this;
        }
        public Float getSizeNormalized() {
            return this.sizeNormalized;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class DescribeCasterComponentsResponseBodyComponentsComponent extends TeaModel {
        /**
         * <p>The information about the subtitle component.</p>
         */
        @NameInMap("CaptionLayerContent")
        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent captionLayerContent;

        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>72d2ec7a-4cd7-4a01-974b-7cd53947****</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The information about the component layer, such as the size and layout.</p>
         */
        @NameInMap("ComponentLayer")
        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer componentLayer;

        /**
         * <p>The name of the component. By default, the name is the ID of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>component_name</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The type of the component. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: a text component</li>
         * <li><strong>image</strong>: an image component</li>
         * <li><strong>caption</strong>: a caption component</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The display effect for the component. Valid values:</p>
         * <ul>
         * <li><strong>none</strong></li>
         * <li><strong>animateH</strong>: horizontal scrolling</li>
         * <li><strong>animateV</strong>: vertical scrolling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>animateV</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The information about the image component. This parameter is returned only for image components.</p>
         */
        @NameInMap("ImageLayerContent")
        public DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent imageLayerContent;

        /**
         * <p>The location ID of the component.</p>
         * <p>Each location ID can be assigned to only one component and must be in the RC[Number] format. The values of this parameter are in ascending order, for example, from RC01 to RC12.</p>
         * 
         * <strong>example:</strong>
         * <p>RC01</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        /**
         * <p>The information about the text component. This parameter is returned only for text components.</p>
         */
        @NameInMap("TextLayerContent")
        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent textLayerContent;

        public static DescribeCasterComponentsResponseBodyComponentsComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponentsComponent self = new DescribeCasterComponentsResponseBodyComponentsComponent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setCaptionLayerContent(DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent captionLayerContent) {
            this.captionLayerContent = captionLayerContent;
            return this;
        }
        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent getCaptionLayerContent() {
            return this.captionLayerContent;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setComponentLayer(DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer componentLayer) {
            this.componentLayer = componentLayer;
            return this;
        }
        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer getComponentLayer() {
            return this.componentLayer;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setImageLayerContent(DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent imageLayerContent) {
            this.imageLayerContent = imageLayerContent;
            return this;
        }
        public DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent getImageLayerContent() {
            return this.imageLayerContent;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeCasterComponentsResponseBodyComponentsComponent setTextLayerContent(DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent textLayerContent) {
            this.textLayerContent = textLayerContent;
            return this;
        }
        public DescribeCasterComponentsResponseBodyComponentsComponentTextLayerContent getTextLayerContent() {
            return this.textLayerContent;
        }

    }

    public static class DescribeCasterComponentsResponseBodyComponents extends TeaModel {
        @NameInMap("Component")
        public java.util.List<DescribeCasterComponentsResponseBodyComponentsComponent> component;

        public static DescribeCasterComponentsResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseBodyComponents self = new DescribeCasterComponentsResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseBodyComponents setComponent(java.util.List<DescribeCasterComponentsResponseBodyComponentsComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<DescribeCasterComponentsResponseBodyComponentsComponent> getComponent() {
            return this.component;
        }

    }

}
