// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobFeature extends TeaModel {
    @NameInMap("Clip")
    public MediaConvertJobFeatureClip clip;

    @NameInMap("Metadata")
    public java.util.Map<String, String> metadata;

    @NameInMap("Watermarks")
    public java.util.List<MediaConvertJobFeatureWatermarks> watermarks;

    public static MediaConvertJobFeature build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertJobFeature self = new MediaConvertJobFeature();
        return TeaModel.build(map, self);
    }

    public MediaConvertJobFeature setClip(MediaConvertJobFeatureClip clip) {
        this.clip = clip;
        return this;
    }
    public MediaConvertJobFeatureClip getClip() {
        return this.clip;
    }

    public MediaConvertJobFeature setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public MediaConvertJobFeature setWatermarks(java.util.List<MediaConvertJobFeatureWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<MediaConvertJobFeatureWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class MediaConvertJobFeatureClipTimeSpan extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("End")
        public String end;

        @NameInMap("Seek")
        public String seek;

        public static MediaConvertJobFeatureClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobFeatureClipTimeSpan self = new MediaConvertJobFeatureClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobFeatureClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public MediaConvertJobFeatureClipTimeSpan setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public MediaConvertJobFeatureClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class MediaConvertJobFeatureClip extends TeaModel {
        @NameInMap("ConfigToClipFirstPart")
        public String configToClipFirstPart;

        @NameInMap("TimeSpan")
        public MediaConvertJobFeatureClipTimeSpan timeSpan;

        public static MediaConvertJobFeatureClip build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobFeatureClip self = new MediaConvertJobFeatureClip();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobFeatureClip setConfigToClipFirstPart(String configToClipFirstPart) {
            this.configToClipFirstPart = configToClipFirstPart;
            return this;
        }
        public String getConfigToClipFirstPart() {
            return this.configToClipFirstPart;
        }

        public MediaConvertJobFeatureClip setTimeSpan(MediaConvertJobFeatureClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public MediaConvertJobFeatureClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class MediaConvertJobFeatureWatermarks extends TeaModel {
        @NameInMap("Adaptive")
        public String adaptive;

        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidth")
        public String borderWidth;

        @NameInMap("Content")
        public String content;

        @NameInMap("FontAlpha")
        public String fontAlpha;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSize")
        public String fontSize;

        @NameInMap("Height")
        public String height;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public String width;

        @NameInMap("X")
        public String x;

        @NameInMap("Y")
        public String y;

        public static MediaConvertJobFeatureWatermarks build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobFeatureWatermarks self = new MediaConvertJobFeatureWatermarks();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobFeatureWatermarks setAdaptive(String adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public String getAdaptive() {
            return this.adaptive;
        }

        public MediaConvertJobFeatureWatermarks setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public MediaConvertJobFeatureWatermarks setBorderWidth(String borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public String getBorderWidth() {
            return this.borderWidth;
        }

        public MediaConvertJobFeatureWatermarks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public MediaConvertJobFeatureWatermarks setFontAlpha(String fontAlpha) {
            this.fontAlpha = fontAlpha;
            return this;
        }
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        public MediaConvertJobFeatureWatermarks setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public MediaConvertJobFeatureWatermarks setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public MediaConvertJobFeatureWatermarks setFontSize(String fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public String getFontSize() {
            return this.fontSize;
        }

        public MediaConvertJobFeatureWatermarks setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public MediaConvertJobFeatureWatermarks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public MediaConvertJobFeatureWatermarks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MediaConvertJobFeatureWatermarks setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public MediaConvertJobFeatureWatermarks setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public MediaConvertJobFeatureWatermarks setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

}
