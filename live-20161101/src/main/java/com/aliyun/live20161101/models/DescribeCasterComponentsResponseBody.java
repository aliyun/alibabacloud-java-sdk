// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterComponentsResponseBody extends TeaModel {
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
        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidthNormalized")
        public Float borderWidthNormalized;

        @NameInMap("Color")
        public String color;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("LineSpaceNormalized")
        public Float lineSpaceNormalized;

        @NameInMap("LocationId")
        public String locationId;

        @NameInMap("PtsOffset")
        public Integer ptsOffset;

        @NameInMap("ShowSourceLan")
        public Boolean showSourceLan;

        @NameInMap("SizeNormalized")
        public Float sizeNormalized;

        @NameInMap("SourceLan")
        public String sourceLan;

        @NameInMap("TargetLan")
        public String targetLan;

        @NameInMap("WordCountPerLine")
        public Integer wordCountPerLine;

        @NameInMap("WordSpaceNormalized")
        public Float wordSpaceNormalized;

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
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("PositionNormalizeds")
        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayerPositionNormalizeds positionNormalizeds;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("Transparency")
        public Integer transparency;

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
        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidthNormalized")
        public Float borderWidthNormalized;

        @NameInMap("Color")
        public String color;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("SizeNormalized")
        public Float sizeNormalized;

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
        @NameInMap("CaptionLayerContent")
        public DescribeCasterComponentsResponseBodyComponentsComponentCaptionLayerContent captionLayerContent;

        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentLayer")
        public DescribeCasterComponentsResponseBodyComponentsComponentComponentLayer componentLayer;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("Effect")
        public String effect;

        @NameInMap("ImageLayerContent")
        public DescribeCasterComponentsResponseBodyComponentsComponentImageLayerContent imageLayerContent;

        @NameInMap("LocationId")
        public String locationId;

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
