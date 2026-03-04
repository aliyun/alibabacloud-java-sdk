// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobFeature extends TeaModel {
    /**
     * <p>Configuration for clipping from the source video.</p>
     */
    @NameInMap("Clip")
    public MediaConvertJobFeatureClip clip;

    /**
     * <p>A map of key-value pairs to be embedded as container-level metadata in the output file. Provided as a JSON string. Example: {&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}.</p>
     * <ul>
     * <li>Max key length: 64 characters.</li>
     * <li>Max value length: 512 characters.</li>
     * </ul>
     * <p>Max 4 key-value pairs.</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, String> metadata;

    /**
     * <p>Image or text watermarks to add to the video. These parameters override the corresponding settings from a specified watermark template.</p>
     * <ul>
     * <li>You can add up to four watermarks to a transcoding task.</li>
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
         * <p>The duration of the clip, starting from the Seek time. The default duration is from the Seek time to the end of the video. Duration and End are mutually exclusive. If End is set, Duration is ignored.</p>
         * <ul>
         * <li>Format: hh:mm:ss[.SSS] or sssss[.SSS].</li>
         * <li>Valid values: [00:00:00.000,23:59:59.999] or [0.000,86399.999].</li>
         * <li>Example: 00:01:59.99 or 180.30.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60.0</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Specifies a duration to trim from the end of the video. Duration and End are mutually exclusive. If End is set, Duration is ignored.</p>
         * <ul>
         * <li>Format: hh:mm:ss[.SSS] or sssss[.SSS].</li>
         * <li>Valid values: [00:00:00.000,23:59:59.999] or [0.000,86399.999].</li>
         * <li>Example: 00:01:59.99 or 180.30.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time of the clip. It defaults to the beginning of the video.</p>
         * <ul>
         * <li>Format: hh:mm:ss[.SSS] or sssss[.SSS].</li>
         * <li>Valid values: [00:00:00.000,23:59:59.999] or [0.000,86399.999].</li>
         * <li>Example: 00:01:59.99 or 180.30.</li>
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
         * <p>Specifies the order of operations when concatenating multiple files and clipping.</p>
         * <ul>
         * <li>true: Clips the first input file before it is concatenated.</li>
         * <li>false: Concatenates all input files first, then applies clipping.</li>
         * <li>Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigToClipFirstPart")
        public String configToClipFirstPart;

        /**
         * <p>The time range for the clip.</p>
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
         * <p>Specifies if the font size adapts to the output resolution. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * <li>Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Adaptive")
        public String adaptive;

        /**
         * <p>The color of the font border.</p>
         * <ul>
         * <li>Default value: Black.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Black</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The width of the font border.</p>
         * <ul>
         * <li>Unit: pixels.</li>
         * <li>Valid values: [0,4096].</li>
         * <li>Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderWidth")
        public String borderWidth;

        /**
         * <p>The text to be displayed as the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>TextWatarmark</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The font opacity.</p>
         * <ul>
         * <li>Valid values: (0,1].</li>
         * <li>Default value: 1.0.</li>
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
         * <li>Default value: black.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font of the text watermark.</p>
         * <ul>
         * <li>Default value: SimSum.</li>
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
         * <li>Valid values: (4,120).</li>
         * <li>Default value: 16.</li>
         * </ul>
         */
        @NameInMap("FontSize")
        public String fontSize;

        /**
         * <p>The height of the image watermark. This parameter overrides the corresponding setting from a specified watermark template. The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the watermark height.</p>
         * <ul>
         * <li></li>
         * <li>Valid values: [8,4096].</li>
         * </ul>
         * </li>
         * <li><p>Decimal: A decimal of the output video\&quot;s height.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
         * <p>The watermark type.</p>
         * <ul>
         * <li>Text: a text watermark. In this case, you must specify the parameters related to the text watermark.</li>
         * <li>Image: an image watermark. In this case, you must specify the parameters related to the image watermark.</li>
         * </ul>
         * <p>If not specified, the type is inferred from the TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of the image watermark. This parameter overrides the corresponding setting from a specified watermark template. The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the watermark width.</p>
         * <ul>
         * <li></li>
         * <li>Valid values: [8,4096].</li>
         * </ul>
         * </li>
         * <li><p>Decimal: A decimal of the output video\&quot;s width.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
         * <p>The horizontal offset of the image watermark relative to the output video. This parameter overrides the corresponding setting from a specified watermark template. The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the horizontal offset.</p>
         * <ul>
         * <li>Unit: pixels.</li>
         * <li>Valid values: [8,4096].</li>
         * </ul>
         * </li>
         * <li><p>Decimal: the ratio of the horizontal offset to the width of the output video.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
         * <p>The vertical offset of the image watermark relative to the output video. This parameter overrides the corresponding setting from a specified watermark template. The following value types are supported:</p>
         * <ul>
         * <li><p>Integer: the pixel value of the vertical offset.</p>
         * <ul>
         * <li>Unit: pixels.</li>
         * <li>Valid values: [8,4096].</li>
         * </ul>
         * </li>
         * <li><p>Decimal: the ratio of the vertical offset to the height of the output video.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
