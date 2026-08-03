// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitProjectTaskRequest extends TeaModel {
    @NameInMap("frames")
    public java.util.List<SubmitProjectTaskRequestFrames> frames;

    @NameInMap("scaleType")
    public String scaleType;

    @NameInMap("subtitleTag")
    public Integer subtitleTag;

    @NameInMap("transparentBackground")
    public Integer transparentBackground;

    public static SubmitProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitProjectTaskRequest self = new SubmitProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitProjectTaskRequest setFrames(java.util.List<SubmitProjectTaskRequestFrames> frames) {
        this.frames = frames;
        return this;
    }
    public java.util.List<SubmitProjectTaskRequestFrames> getFrames() {
        return this.frames;
    }

    public SubmitProjectTaskRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public SubmitProjectTaskRequest setSubtitleTag(Integer subtitleTag) {
        this.subtitleTag = subtitleTag;
        return this;
    }
    public Integer getSubtitleTag() {
        return this.subtitleTag;
    }

    public SubmitProjectTaskRequest setTransparentBackground(Integer transparentBackground) {
        this.transparentBackground = transparentBackground;
        return this;
    }
    public Integer getTransparentBackground() {
        return this.transparentBackground;
    }

    public static class SubmitProjectTaskRequestFramesLayersMaterialMask extends TeaModel {
        @NameInMap("url")
        public String url;

        public static SubmitProjectTaskRequestFramesLayersMaterialMask build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFramesLayersMaterialMask self = new SubmitProjectTaskRequestFramesLayersMaterialMask();
            return TeaModel.build(map, self);
        }

        public SubmitProjectTaskRequestFramesLayersMaterialMask setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SubmitProjectTaskRequestFramesLayersMaterial extends TeaModel {
        @NameInMap("anchorStyleLevel")
        public String anchorStyleLevel;

        @NameInMap("format")
        public String format;

        @NameInMap("id")
        public String id;

        @NameInMap("mask")
        public SubmitProjectTaskRequestFramesLayersMaterialMask mask;

        @NameInMap("speed")
        public String speed;

        @NameInMap("url")
        public String url;

        @NameInMap("volume")
        public Integer volume;

        public static SubmitProjectTaskRequestFramesLayersMaterial build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFramesLayersMaterial self = new SubmitProjectTaskRequestFramesLayersMaterial();
            return TeaModel.build(map, self);
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setAnchorStyleLevel(String anchorStyleLevel) {
            this.anchorStyleLevel = anchorStyleLevel;
            return this;
        }
        public String getAnchorStyleLevel() {
            return this.anchorStyleLevel;
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setMask(SubmitProjectTaskRequestFramesLayersMaterialMask mask) {
            this.mask = mask;
            return this;
        }
        public SubmitProjectTaskRequestFramesLayersMaterialMask getMask() {
            return this.mask;
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public SubmitProjectTaskRequestFramesLayersMaterial setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class SubmitProjectTaskRequestFramesLayers extends TeaModel {
        @NameInMap("height")
        public Integer height;

        @NameInMap("index")
        public Integer index;

        @NameInMap("material")
        public SubmitProjectTaskRequestFramesLayersMaterial material;

        @NameInMap("positionX")
        public Integer positionX;

        @NameInMap("positionY")
        public Integer positionY;

        @NameInMap("type")
        public String type;

        @NameInMap("width")
        public Integer width;

        public static SubmitProjectTaskRequestFramesLayers build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFramesLayers self = new SubmitProjectTaskRequestFramesLayers();
            return TeaModel.build(map, self);
        }

        public SubmitProjectTaskRequestFramesLayers setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SubmitProjectTaskRequestFramesLayers setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SubmitProjectTaskRequestFramesLayers setMaterial(SubmitProjectTaskRequestFramesLayersMaterial material) {
            this.material = material;
            return this;
        }
        public SubmitProjectTaskRequestFramesLayersMaterial getMaterial() {
            return this.material;
        }

        public SubmitProjectTaskRequestFramesLayers setPositionX(Integer positionX) {
            this.positionX = positionX;
            return this;
        }
        public Integer getPositionX() {
            return this.positionX;
        }

        public SubmitProjectTaskRequestFramesLayers setPositionY(Integer positionY) {
            this.positionY = positionY;
            return this;
        }
        public Integer getPositionY() {
            return this.positionY;
        }

        public SubmitProjectTaskRequestFramesLayers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitProjectTaskRequestFramesLayers setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class SubmitProjectTaskRequestFramesSubtitle extends TeaModel {
        @NameInMap("alignment")
        public String alignment;

        @NameInMap("backgroundColor")
        public String backgroundColor;

        @NameInMap("font")
        public String font;

        @NameInMap("fontColor")
        public String fontColor;

        @NameInMap("fontSize")
        public Integer fontSize;

        @NameInMap("maxCharLength")
        public Integer maxCharLength;

        @NameInMap("positionX")
        public Integer positionX;

        @NameInMap("positionY")
        public Integer positionY;

        @NameInMap("textHeight")
        public Integer textHeight;

        @NameInMap("textWidth")
        public Integer textWidth;

        public static SubmitProjectTaskRequestFramesSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFramesSubtitle self = new SubmitProjectTaskRequestFramesSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitProjectTaskRequestFramesSubtitle setAlignment(String alignment) {
            this.alignment = alignment;
            return this;
        }
        public String getAlignment() {
            return this.alignment;
        }

        public SubmitProjectTaskRequestFramesSubtitle setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }
        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public SubmitProjectTaskRequestFramesSubtitle setFont(String font) {
            this.font = font;
            return this;
        }
        public String getFont() {
            return this.font;
        }

        public SubmitProjectTaskRequestFramesSubtitle setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public SubmitProjectTaskRequestFramesSubtitle setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public SubmitProjectTaskRequestFramesSubtitle setMaxCharLength(Integer maxCharLength) {
            this.maxCharLength = maxCharLength;
            return this;
        }
        public Integer getMaxCharLength() {
            return this.maxCharLength;
        }

        public SubmitProjectTaskRequestFramesSubtitle setPositionX(Integer positionX) {
            this.positionX = positionX;
            return this;
        }
        public Integer getPositionX() {
            return this.positionX;
        }

        public SubmitProjectTaskRequestFramesSubtitle setPositionY(Integer positionY) {
            this.positionY = positionY;
            return this;
        }
        public Integer getPositionY() {
            return this.positionY;
        }

        public SubmitProjectTaskRequestFramesSubtitle setTextHeight(Integer textHeight) {
            this.textHeight = textHeight;
            return this;
        }
        public Integer getTextHeight() {
            return this.textHeight;
        }

        public SubmitProjectTaskRequestFramesSubtitle setTextWidth(Integer textWidth) {
            this.textWidth = textWidth;
            return this;
        }
        public Integer getTextWidth() {
            return this.textWidth;
        }

    }

    public static class SubmitProjectTaskRequestFramesVideoScript extends TeaModel {
        @NameInMap("audioUrl")
        public String audioUrl;

        @NameInMap("emotion")
        public String emotion;

        @NameInMap("pitchRate")
        public String pitchRate;

        @NameInMap("speechOpen")
        public Boolean speechOpen;

        @NameInMap("speedRate")
        public String speedRate;

        @NameInMap("textContent")
        public String textContent;

        @NameInMap("type")
        public String type;

        @NameInMap("voiceLanguage")
        public String voiceLanguage;

        @NameInMap("voiceTemplateId")
        public Long voiceTemplateId;

        @NameInMap("volume")
        public Integer volume;

        public static SubmitProjectTaskRequestFramesVideoScript build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFramesVideoScript self = new SubmitProjectTaskRequestFramesVideoScript();
            return TeaModel.build(map, self);
        }

        public SubmitProjectTaskRequestFramesVideoScript setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public SubmitProjectTaskRequestFramesVideoScript setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public SubmitProjectTaskRequestFramesVideoScript setPitchRate(String pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public String getPitchRate() {
            return this.pitchRate;
        }

        public SubmitProjectTaskRequestFramesVideoScript setSpeechOpen(Boolean speechOpen) {
            this.speechOpen = speechOpen;
            return this;
        }
        public Boolean getSpeechOpen() {
            return this.speechOpen;
        }

        public SubmitProjectTaskRequestFramesVideoScript setSpeedRate(String speedRate) {
            this.speedRate = speedRate;
            return this;
        }
        public String getSpeedRate() {
            return this.speedRate;
        }

        public SubmitProjectTaskRequestFramesVideoScript setTextContent(String textContent) {
            this.textContent = textContent;
            return this;
        }
        public String getTextContent() {
            return this.textContent;
        }

        public SubmitProjectTaskRequestFramesVideoScript setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitProjectTaskRequestFramesVideoScript setVoiceLanguage(String voiceLanguage) {
            this.voiceLanguage = voiceLanguage;
            return this;
        }
        public String getVoiceLanguage() {
            return this.voiceLanguage;
        }

        public SubmitProjectTaskRequestFramesVideoScript setVoiceTemplateId(Long voiceTemplateId) {
            this.voiceTemplateId = voiceTemplateId;
            return this;
        }
        public Long getVoiceTemplateId() {
            return this.voiceTemplateId;
        }

        public SubmitProjectTaskRequestFramesVideoScript setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class SubmitProjectTaskRequestFrames extends TeaModel {
        @NameInMap("index")
        public Integer index;

        @NameInMap("layers")
        public java.util.List<SubmitProjectTaskRequestFramesLayers> layers;

        @NameInMap("subtitle")
        public SubmitProjectTaskRequestFramesSubtitle subtitle;

        @NameInMap("videoScript")
        public SubmitProjectTaskRequestFramesVideoScript videoScript;

        public static SubmitProjectTaskRequestFrames build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFrames self = new SubmitProjectTaskRequestFrames();
            return TeaModel.build(map, self);
        }

        public SubmitProjectTaskRequestFrames setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SubmitProjectTaskRequestFrames setLayers(java.util.List<SubmitProjectTaskRequestFramesLayers> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<SubmitProjectTaskRequestFramesLayers> getLayers() {
            return this.layers;
        }

        public SubmitProjectTaskRequestFrames setSubtitle(SubmitProjectTaskRequestFramesSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public SubmitProjectTaskRequestFramesSubtitle getSubtitle() {
            return this.subtitle;
        }

        public SubmitProjectTaskRequestFrames setVideoScript(SubmitProjectTaskRequestFramesVideoScript videoScript) {
            this.videoScript = videoScript;
            return this;
        }
        public SubmitProjectTaskRequestFramesVideoScript getVideoScript() {
            return this.videoScript;
        }

    }

}
