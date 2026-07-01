// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobFeature extends TeaModel {
    /**
     * <p>Clip settings.</p>
     */
    @NameInMap("Clip")
    public MediaConvertJobFeatureClip clip;

    /**
     * <p>Specifies the metadata for the output video container format, provided as JSON key-value pairs. Example: <code>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}</code>.</p>
     * <ul>
     * <li><p>Maximum key length: 64 characters.</p>
     * </li>
     * <li><p>Maximum value length: 512 characters.</p>
     * </li>
     * </ul>
     * <p>You can add a maximum of four metadata key-value pairs.</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, String> metadata;

    /**
     * <p>A list of watermark settings to overlay on the video. If specified, these settings override the corresponding parameters in the specified watermark template.</p>
     * <ul>
     * <li>You can add a maximum of four watermarks per transcoding job.</li>
     * </ul>
     */
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
        /**
         * <p>Specifies the duration of the clip, relative to the <code>Seek</code> time. By default, the clip extends to the end of the video. You can specify either <code>Duration</code> or <code>End</code>, but not both. If <code>End</code> is specified, <code>Duration</code> is ignored.</p>
         * <ul>
         * <li><p>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</p>
         * </li>
         * <li><p>Value range: <code>[00:00:00.000, 23:59:59.999]</code> or <code>[0.000, 86399.999]</code>.</p>
         * </li>
         * <li><p>Example: <code>00:01:59.999</code> or <code>180.30</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60.0</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Specifies the end time of the clip. You can specify either <code>End</code> or <code>Duration</code>, but not both. If <code>End</code> is specified, <code>Duration</code> is ignored.</p>
         * <ul>
         * <li><p>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</p>
         * </li>
         * <li><p>Value range: <code>[00:00:00.000, 23:59:59.999]</code> or <code>[0.000, 86399.999]</code>.</p>
         * </li>
         * <li><p>Example: <code>00:01:59.999</code> or <code>180.30</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>Specifies the start time of the clip. If this parameter is not set, the clip starts from the beginning of the video.</p>
         * <ul>
         * <li><p>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</p>
         * </li>
         * <li><p>Value range: <code>[00:00:00.000, 23:59:59.999]</code> or <code>[0.000, 86399.999]</code>.</p>
         * </li>
         * <li><p>Example: <code>00:01:59.999</code> or <code>180.30</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>180.30</p>
         */
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
        /**
         * <p>Specifies whether to clip the first segment before concatenation.</p>
         * <ul>
         * <li><p><code>true</code>: The system clips the first segment before concatenation and transcoding.</p>
         * </li>
         * <li><p><code>false</code>: The system first concatenates and transcodes the segments, and then clips the resulting video.</p>
         * </li>
         * <li><p>Default value: <code>false</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigToClipFirstPart")
        public String configToClipFirstPart;

        /**
         * <p>The time span for the clip.</p>
         */
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
        /**
         * <p>Specifies whether the font size of the text watermark adapts to the output video resolution.</p>
         * <ul>
         * <li><p><code>true</code>: The font size is adaptive.</p>
         * </li>
         * <li><p><code>false</code>: The font size is fixed.</p>
         * </li>
         * <li><p>Default value: <code>false</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Adaptive")
        public String adaptive;

        /**
         * <p>The border color of the text watermark.</p>
         * <ul>
         * <li>Default value: <code>black</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Black</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The border width of the text watermark.</p>
         * <ul>
         * <li><p>Unit: pixels.</p>
         * </li>
         * <li><p>Value range: [0, 4096].</p>
         * </li>
         * <li><p>Default value: <code>0</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidth")
        public String borderWidth;

        /**
         * <p>The content of the text watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>TextWatarmark</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The opacity of the font.</p>
         * <ul>
         * <li><p>Value range: (0, 1].</p>
         * </li>
         * <li><p>Default value: <code>1.0</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("FontAlpha")
        public String fontAlpha;

        /**
         * <p>The font color of the text watermark.</p>
         * <ul>
         * <li>Default value: <code>black</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font name for the text watermark.</p>
         * <ul>
         * <li>Default value: <code>SimSun</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SimSum</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The font size of the text watermark.</p>
         * <ul>
         * <li><p>Value range: (4, 120).</p>
         * </li>
         * <li><p>Default value: <code>16</code>.</p>
         * </li>
         * </ul>
         */
        @NameInMap("FontSize")
        public String fontSize;

        /**
         * <p>The height of the watermark. If specified, this value overrides the corresponding parameter in the watermark template. You can specify the value in two ways:</p>
         * <ul>
         * <li><p>As an integer, representing the height in pixels.</p>
         * <ul>
         * <li><p>Unit: pixels.</p>
         * </li>
         * <li><p>Value range: [8, 4096].</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>As a decimal, representing the ratio of the height to the height of the output video.</p>
         * <ul>
         * <li><p>Value range: (0, 1).</p>
         * </li>
         * <li><p>Supports up to four decimal places, such as <code>0.9999</code>. The system truncates additional digits.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>962e1332fa2d4e12bdfb76dd1402fcfa</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of the watermark.</p>
         * <ul>
         * <li><p><code>Text</code>: A text watermark. You must also set the text watermark parameters.</p>
         * </li>
         * <li><p><code>Image</code>: An image watermark. You must also set the image watermark parameters.</p>
         * </li>
         * </ul>
         * <p>Default value: The system automatically determines the type based on the watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of the watermark. If specified, this value overrides the corresponding parameter in the watermark template. You can specify the value in two ways:</p>
         * <ul>
         * <li><p>As an integer, representing the width in pixels.</p>
         * <ul>
         * <li><p>Unit: pixels.</p>
         * </li>
         * <li><p>Value range: [8, 4096].</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>As a decimal, representing the ratio of the width to the width of the output video.</p>
         * <ul>
         * <li><p>Value range: (0, 1).</p>
         * </li>
         * <li><p>Supports up to four decimal places, such as <code>0.9999</code>. The system truncates additional digits.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The horizontal offset of the watermark relative to the output video. If specified, this value overrides the corresponding parameter in the watermark template. You can specify the value in two ways:</p>
         * <ul>
         * <li><p>As an integer, representing the offset in pixels.</p>
         * <ul>
         * <li><p>Unit: pixels.</p>
         * </li>
         * <li><p>Value range: [8, 4096].</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>As a decimal, representing the ratio of the offset to the width of the output video.</p>
         * <ul>
         * <li><p>Value range: (0, 1).</p>
         * </li>
         * <li><p>Supports up to four decimal places, such as <code>0.9999</code>. The system truncates additional digits.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.08</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The vertical offset of the watermark relative to the output video. If specified, this value overrides the corresponding parameter in the watermark template. You can specify the value in two ways:</p>
         * <ul>
         * <li><p>As an integer, representing the offset in pixels.</p>
         * <ul>
         * <li><p>Unit: pixels.</p>
         * </li>
         * <li><p>Value range: [8, 4096].</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>As a decimal, representing the ratio of the offset to the height of the output video.</p>
         * <ul>
         * <li><p>Value range: (0, 1).</p>
         * </li>
         * <li><p>Supports up to four decimal places, such as <code>0.9999</code>. The system truncates additional digits.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.08</p>
         */
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
