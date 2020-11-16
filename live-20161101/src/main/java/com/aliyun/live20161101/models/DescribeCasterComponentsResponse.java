// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterComponentsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Components")
    @Validation(required = true)
    public DescribeCasterComponentsResponseComponents components;

    public static DescribeCasterComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterComponentsResponse self = new DescribeCasterComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterComponentsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterComponentsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterComponentsResponse setComponents(DescribeCasterComponentsResponseComponents components) {
        this.components = components;
        return this;
    }
    public DescribeCasterComponentsResponseComponents getComponents() {
        return this.components;
    }

    public static class DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds extends TeaModel {
        // Position
        @NameInMap("Position")
        @Validation(required = true)
        public java.util.List<Float> position;

        public static DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds self = new DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds setPosition(java.util.List<Float> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Float> getPosition() {
            return this.position;
        }

    }

    public static class DescribeCasterComponentsResponseComponentsComponentComponentLayer extends TeaModel {
        @NameInMap("HeightNormalized")
        @Validation(required = true)
        public Float heightNormalized;

        @NameInMap("WidthNormalized")
        @Validation(required = true)
        public Float widthNormalized;

        @NameInMap("PositionRefer")
        @Validation(required = true)
        public String positionRefer;

        @NameInMap("Transparency")
        @Validation(required = true)
        public Integer transparency;

        @NameInMap("PositionNormalizeds")
        @Validation(required = true)
        public DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds positionNormalizeds;

        public static DescribeCasterComponentsResponseComponentsComponentComponentLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponentsComponentComponentLayer self = new DescribeCasterComponentsResponseComponentsComponentComponentLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponentsComponentComponentLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentComponentLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentComponentLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeCasterComponentsResponseComponentsComponentComponentLayer setTransparency(Integer transparency) {
            this.transparency = transparency;
            return this;
        }
        public Integer getTransparency() {
            return this.transparency;
        }

        public DescribeCasterComponentsResponseComponentsComponentComponentLayer setPositionNormalizeds(DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds positionNormalizeds) {
            this.positionNormalizeds = positionNormalizeds;
            return this;
        }
        public DescribeCasterComponentsResponseComponentsComponentComponentLayerPositionNormalizeds getPositionNormalizeds() {
            return this.positionNormalizeds;
        }

    }

    public static class DescribeCasterComponentsResponseComponentsComponentTextLayerContent extends TeaModel {
        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Color")
        @Validation(required = true)
        public String color;

        @NameInMap("FontName")
        @Validation(required = true)
        public String fontName;

        @NameInMap("SizeNormalized")
        @Validation(required = true)
        public Float sizeNormalized;

        @NameInMap("BorderWidthNormalized")
        @Validation(required = true)
        public Float borderWidthNormalized;

        @NameInMap("BorderColor")
        @Validation(required = true)
        public String borderColor;

        public static DescribeCasterComponentsResponseComponentsComponentTextLayerContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponentsComponentTextLayerContent self = new DescribeCasterComponentsResponseComponentsComponentTextLayerContent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent setSizeNormalized(Float sizeNormalized) {
            this.sizeNormalized = sizeNormalized;
            return this;
        }
        public Float getSizeNormalized() {
            return this.sizeNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent setBorderWidthNormalized(Float borderWidthNormalized) {
            this.borderWidthNormalized = borderWidthNormalized;
            return this;
        }
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

    }

    public static class DescribeCasterComponentsResponseComponentsComponentImageLayerContent extends TeaModel {
        @NameInMap("MaterialId")
        @Validation(required = true)
        public String materialId;

        public static DescribeCasterComponentsResponseComponentsComponentImageLayerContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponentsComponentImageLayerContent self = new DescribeCasterComponentsResponseComponentsComponentImageLayerContent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponentsComponentImageLayerContent setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

    }

    public static class DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent extends TeaModel {
        @NameInMap("LocationId")
        @Validation(required = true)
        public String locationId;

        @NameInMap("PtsOffset")
        @Validation(required = true)
        public Integer ptsOffset;

        @NameInMap("WordsCount")
        @Validation(required = true)
        public Integer wordsCount;

        @NameInMap("Color")
        @Validation(required = true)
        public String color;

        @NameInMap("FontName")
        @Validation(required = true)
        public String fontName;

        @NameInMap("SizeNormalized")
        @Validation(required = true)
        public Float sizeNormalized;

        @NameInMap("BorderWidthNormalized")
        @Validation(required = true)
        public Float borderWidthNormalized;

        @NameInMap("BorderColor")
        @Validation(required = true)
        public String borderColor;

        @NameInMap("WordCountPerLine")
        @Validation(required = true)
        public Integer wordCountPerLine;

        @NameInMap("WordSpaceNormalized")
        @Validation(required = true)
        public Float wordSpaceNormalized;

        @NameInMap("LineSpaceNormalized")
        @Validation(required = true)
        public Float lineSpaceNormalized;

        public static DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent self = new DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setPtsOffset(Integer ptsOffset) {
            this.ptsOffset = ptsOffset;
            return this;
        }
        public Integer getPtsOffset() {
            return this.ptsOffset;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setWordsCount(Integer wordsCount) {
            this.wordsCount = wordsCount;
            return this;
        }
        public Integer getWordsCount() {
            return this.wordsCount;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setSizeNormalized(Float sizeNormalized) {
            this.sizeNormalized = sizeNormalized;
            return this;
        }
        public Float getSizeNormalized() {
            return this.sizeNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setBorderWidthNormalized(Float borderWidthNormalized) {
            this.borderWidthNormalized = borderWidthNormalized;
            return this;
        }
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setWordCountPerLine(Integer wordCountPerLine) {
            this.wordCountPerLine = wordCountPerLine;
            return this;
        }
        public Integer getWordCountPerLine() {
            return this.wordCountPerLine;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setWordSpaceNormalized(Float wordSpaceNormalized) {
            this.wordSpaceNormalized = wordSpaceNormalized;
            return this;
        }
        public Float getWordSpaceNormalized() {
            return this.wordSpaceNormalized;
        }

        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent setLineSpaceNormalized(Float lineSpaceNormalized) {
            this.lineSpaceNormalized = lineSpaceNormalized;
            return this;
        }
        public Float getLineSpaceNormalized() {
            return this.lineSpaceNormalized;
        }

    }

    public static class DescribeCasterComponentsResponseComponentsComponent extends TeaModel {
        @NameInMap("ComponentId")
        @Validation(required = true)
        public String componentId;

        @NameInMap("ComponentName")
        @Validation(required = true)
        public String componentName;

        @NameInMap("LocationId")
        @Validation(required = true)
        public String locationId;

        @NameInMap("ComponentType")
        @Validation(required = true)
        public String componentType;

        @NameInMap("Effect")
        @Validation(required = true)
        public String effect;

        @NameInMap("ComponentLayer")
        @Validation(required = true)
        public DescribeCasterComponentsResponseComponentsComponentComponentLayer componentLayer;

        @NameInMap("TextLayerContent")
        @Validation(required = true)
        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent textLayerContent;

        @NameInMap("ImageLayerContent")
        @Validation(required = true)
        public DescribeCasterComponentsResponseComponentsComponentImageLayerContent imageLayerContent;

        @NameInMap("CaptionLayerContent")
        @Validation(required = true)
        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent captionLayerContent;

        public static DescribeCasterComponentsResponseComponentsComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponentsComponent self = new DescribeCasterComponentsResponseComponentsComponent();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponentsComponent setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeCasterComponentsResponseComponentsComponent setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeCasterComponentsResponseComponentsComponent setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeCasterComponentsResponseComponentsComponent setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeCasterComponentsResponseComponentsComponent setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public DescribeCasterComponentsResponseComponentsComponent setComponentLayer(DescribeCasterComponentsResponseComponentsComponentComponentLayer componentLayer) {
            this.componentLayer = componentLayer;
            return this;
        }
        public DescribeCasterComponentsResponseComponentsComponentComponentLayer getComponentLayer() {
            return this.componentLayer;
        }

        public DescribeCasterComponentsResponseComponentsComponent setTextLayerContent(DescribeCasterComponentsResponseComponentsComponentTextLayerContent textLayerContent) {
            this.textLayerContent = textLayerContent;
            return this;
        }
        public DescribeCasterComponentsResponseComponentsComponentTextLayerContent getTextLayerContent() {
            return this.textLayerContent;
        }

        public DescribeCasterComponentsResponseComponentsComponent setImageLayerContent(DescribeCasterComponentsResponseComponentsComponentImageLayerContent imageLayerContent) {
            this.imageLayerContent = imageLayerContent;
            return this;
        }
        public DescribeCasterComponentsResponseComponentsComponentImageLayerContent getImageLayerContent() {
            return this.imageLayerContent;
        }

        public DescribeCasterComponentsResponseComponentsComponent setCaptionLayerContent(DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent captionLayerContent) {
            this.captionLayerContent = captionLayerContent;
            return this;
        }
        public DescribeCasterComponentsResponseComponentsComponentCaptionLayerContent getCaptionLayerContent() {
            return this.captionLayerContent;
        }

    }

    public static class DescribeCasterComponentsResponseComponents extends TeaModel {
        @NameInMap("Component")
        @Validation(required = true)
        public java.util.List<DescribeCasterComponentsResponseComponentsComponent> component;

        public static DescribeCasterComponentsResponseComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterComponentsResponseComponents self = new DescribeCasterComponentsResponseComponents();
            return TeaModel.build(map, self);
        }

        public DescribeCasterComponentsResponseComponents setComponent(java.util.List<DescribeCasterComponentsResponseComponentsComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<DescribeCasterComponentsResponseComponentsComponent> getComponent() {
            return this.component;
        }

    }

}
