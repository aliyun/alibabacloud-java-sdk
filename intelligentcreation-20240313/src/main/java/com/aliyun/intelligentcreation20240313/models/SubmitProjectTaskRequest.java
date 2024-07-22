// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitProjectTaskRequest extends TeaModel {
    /**
     * <p>frame</p>
     */
    @NameInMap("frames")
    public java.util.List<SubmitProjectTaskRequestFrames> frames;

    /**
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("scaleType")
    public String scaleType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("subtitleTag")
    public Integer subtitleTag;

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

    public static class SubmitProjectTaskRequestFramesLayersMaterial extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>video/mp4</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>38863</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p><a href="https://meeting.dingtalk.com/j/1COFppy0POR">https://meeting.dingtalk.com/j/1COFppy0POR</a></p>
         */
        @NameInMap("url")
        public String url;

        public static SubmitProjectTaskRequestFramesLayersMaterial build(java.util.Map<String, ?> map) throws Exception {
            SubmitProjectTaskRequestFramesLayersMaterial self = new SubmitProjectTaskRequestFramesLayersMaterial();
            return TeaModel.build(map, self);
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

        public SubmitProjectTaskRequestFramesLayersMaterial setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SubmitProjectTaskRequestFramesLayers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("material")
        public SubmitProjectTaskRequestFramesLayersMaterial material;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("positionX")
        public Integer positionX;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("positionY")
        public Integer positionY;

        /**
         * <strong>example:</strong>
         * <p>ANCHOR</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>BottomLeft</p>
         */
        @NameInMap("alignment")
        public String alignment;

        /**
         * <strong>example:</strong>
         * <p>#ffffff</p>
         */
        @NameInMap("backgroundColor")
        public String backgroundColor;

        /**
         * <strong>example:</strong>
         * <p>SimSun</p>
         */
        @NameInMap("font")
        public String font;

        /**
         * <strong>example:</strong>
         * <p>#ffffff</p>
         */
        @NameInMap("fontColor")
        public String fontColor;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("fontSize")
        public Integer fontSize;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("maxCharLength")
        public Integer maxCharLength;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("positionX")
        public Integer positionX;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("positionY")
        public Integer positionY;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("textHeight")
        public Integer textHeight;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://meeting.dingtalk.com/j/1COFppy0POR">https://meeting.dingtalk.com/j/1COFppy0POR</a></p>
         */
        @NameInMap("audioUrl")
        public String audioUrl;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("speedRate")
        public String speedRate;

        @NameInMap("textContent")
        public String textContent;

        /**
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("voiceTemplateId")
        public Long voiceTemplateId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
