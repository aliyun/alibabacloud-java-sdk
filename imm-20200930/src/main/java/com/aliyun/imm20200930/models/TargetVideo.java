// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetVideo extends TeaModel {
    /**
     * <p>Specifies whether to disable video stream generation. Valid values:</p>
     * <ul>
     * <li>true: disables video stream generation. No video stream is included in the output file.</li>
     * <li>false: does not disable video stream generation. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableVideo")
    public Boolean disableVideo;

    /**
     * <p>The video processing parameters. This parameter is invalid if <strong>TranscodeVideo</strong> is left empty or <strong>TranscodeVideo.Codec</strong> is set to copy.</p>
     * <blockquote>
     * <p>This parameter is not available to the GenerateVideoPlaylist operation.</p>
     * </blockquote>
     */
    @NameInMap("FilterVideo")
    public TargetVideoFilterVideo filterVideo;

    /**
     * <p>The index numbers of video streams. If you do not specify this parameter, the first video stream (the one with the smallest index number) is processed. If the array contains an element greater than 100, all video streams are processed.</p>
     * <ul>
     * <li>For example, you can set the parameter to <code>[0,1]</code> to process video streams with index numbers 0 and 1, <code>[1]</code> to process only the video stream with the index number 1, and <code>[101]</code> to process all video streams.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify an index number but no video stream with the index number is found, the index number is ignored.</p>
     * </blockquote>
     */
    @NameInMap("Stream")
    public java.util.List<Integer> stream;

    /**
     * <p>The video transcoding parameters. If you do not specify this parameter, no video streams are included in the output file.</p>
     * <blockquote>
     * <p>We recommend that you do not use this parameter to disable video stream generation.</p>
     * </blockquote>
     */
    @NameInMap("TranscodeVideo")
    public TargetVideoTranscodeVideo transcodeVideo;

    public static TargetVideo build(java.util.Map<String, ?> map) throws Exception {
        TargetVideo self = new TargetVideo();
        return TeaModel.build(map, self);
    }

    public TargetVideo setDisableVideo(Boolean disableVideo) {
        this.disableVideo = disableVideo;
        return this;
    }
    public Boolean getDisableVideo() {
        return this.disableVideo;
    }

    public TargetVideo setFilterVideo(TargetVideoFilterVideo filterVideo) {
        this.filterVideo = filterVideo;
        return this;
    }
    public TargetVideoFilterVideo getFilterVideo() {
        return this.filterVideo;
    }

    public TargetVideo setStream(java.util.List<Integer> stream) {
        this.stream = stream;
        return this;
    }
    public java.util.List<Integer> getStream() {
        return this.stream;
    }

    public TargetVideo setTranscodeVideo(TargetVideoTranscodeVideo transcodeVideo) {
        this.transcodeVideo = transcodeVideo;
        return this;
    }
    public TargetVideoTranscodeVideo getTranscodeVideo() {
        return this.transcodeVideo;
    }

    public static class TargetVideoFilterVideoDelogos extends TeaModel {
        /**
         * <p>The duration of the blur in seconds. By default, the blur lasts until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>0: indicates that both the offset in pixels and the ratio of the horizontal offset relative to the height of the target resolution are 0. This is the default value.</li>
         * <li>An integer: the offset in pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio of the horizontal offset relative to the height of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dx")
        public Float dx;

        /**
         * <p>Default value: 0. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>0: indicates that both the offset in pixels and the ratio of the vertical offset relative to the height of the target resolution are 0. This is the default value.</li>
         * <li>An integer: the offset in pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio of the vertical offset relative to the height of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dy")
        public Float dy;

        /**
         * <p>The height of the blur. The default value is 1.0, which specifies that the blur is as high as the video. The value can be a decimal or an integer.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the height of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The reference position of the blur. Valid values:</p>
         * <ul>
         * <li>topleft: the upper-left corner. This is the default value.</li>
         * <li>topright: the upper-right corner.</li>
         * <li>bottomright: the lower-right corner.</li>
         * <li>bottomleft: the lower-left corner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The start time of blurring (in seconds). By default, the blur begins at the start time of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The width of the blur. The default value is 1.0, which specifies that the blur is as wide as the video. The value can be a decimal or an integer.</p>
         * <ul>
         * <li>An integer: the number of pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the width of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Float width;

        public static TargetVideoFilterVideoDelogos build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoDelogos self = new TargetVideoFilterVideoDelogos();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoDelogos setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public TargetVideoFilterVideoDelogos setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public TargetVideoFilterVideoDelogos setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public TargetVideoFilterVideoDelogos setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public TargetVideoFilterVideoDelogos setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public TargetVideoFilterVideoDelogos setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public TargetVideoFilterVideoDelogos setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class TargetVideoFilterVideoDesensitizationFace extends TeaModel {
        /**
         * <p>The minimum confidence threshold. Valid values: 0 to 1. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>This parameter does not take effect if the width or height of the bounding box of a face falls below the specified minimum threshold. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        public static TargetVideoFilterVideoDesensitizationFace build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoDesensitizationFace self = new TargetVideoFilterVideoDesensitizationFace();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoDesensitizationFace setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public TargetVideoFilterVideoDesensitizationFace setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

    }

    public static class TargetVideoFilterVideoDesensitizationLicensePlate extends TeaModel {
        /**
         * <p>The minimum confidence threshold. Valid values: 0 to 1. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The minimum threshold for license plate size. This parameter does not take effect if the width or height of the bounding box of a license plate falls below the specified minimum threshold. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        public static TargetVideoFilterVideoDesensitizationLicensePlate build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoDesensitizationLicensePlate self = new TargetVideoFilterVideoDesensitizationLicensePlate();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoDesensitizationLicensePlate setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public TargetVideoFilterVideoDesensitizationLicensePlate setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

    }

    public static class TargetVideoFilterVideoDesensitization extends TeaModel {
        /**
         * <p>The settings for face anonymization.</p>
         */
        @NameInMap("Face")
        public TargetVideoFilterVideoDesensitizationFace face;

        /**
         * <p>The settings for license plate anonymization.</p>
         */
        @NameInMap("LicensePlate")
        public TargetVideoFilterVideoDesensitizationLicensePlate licensePlate;

        public static TargetVideoFilterVideoDesensitization build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoDesensitization self = new TargetVideoFilterVideoDesensitization();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoDesensitization setFace(TargetVideoFilterVideoDesensitizationFace face) {
            this.face = face;
            return this;
        }
        public TargetVideoFilterVideoDesensitizationFace getFace() {
            return this.face;
        }

        public TargetVideoFilterVideoDesensitization setLicensePlate(TargetVideoFilterVideoDesensitizationLicensePlate licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }
        public TargetVideoFilterVideoDesensitizationLicensePlate getLicensePlate() {
            return this.licensePlate;
        }

    }

    public static class TargetVideoFilterVideoWatermarks extends TeaModel {
        /**
         * <p>The color of the text watermark border. You can specify a color name, such as &quot;red&quot; or &quot;green&quot;, or an RGB color code. The default color is #000000.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The width of the text watermark border. Unit: pixels. The value must be an integer within the [0,4096] range. Default value: 0.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>The content of the text watermark. By default, this parameter is left empty.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The duration of watermarking (in seconds). By default, the watermark lasts until the video ends.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>0: indicates that both the offset in pixels and the ratio of the horizontal offset relative to the height of the target resolution are 0. This is the default value.</li>
         * <li>An integer: the offset in pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio of the horizontal offset relative to the height of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dx")
        public Float dx;

        /**
         * <p>The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>0: indicates that both the offset in pixels and the ratio of the vertical offset relative to the height of the target resolution are 0. This is the default value.</li>
         * <li>An integer: the offset in pixels. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio of the vertical offset relative to the height of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dy")
        public Float dy;

        /**
         * <p>The font transparency of the text watermark. Valid values: (0,1]. Default value: 1, which specifies that the text watermark is fully opaque.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("FontApha")
        public Float fontApha;

        /**
         * <p>The color of the text watermark. You can specify a color name, such as &quot;red&quot; or &quot;green&quot;, or an RGB color code. The default color is #000000.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font of the text watermark. Valid values:</p>
         * <ul>
         * <li>SourceHanSans-Regular (default)</li>
         * <li>SourceHanSans-Bold</li>
         * <li>SourceHanSerif-Regular</li>
         * <li>SourceHanSerif-Bold</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SourceHanSans-Bold</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The size of the text watermark. Default value: 16. The value must be an integer within the (4,120) range.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to text.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The height of the image watermark. By default, the height is the same as the height of the original watermark file. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels excluding the height of the logo. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the height of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The reference position for adding the watermark. Valid values:</p>
         * <ul>
         * <li>topleft: the upper-left corner. This is the default value.</li>
         * <li>topright: the upper-right corner.</li>
         * <li>bottomright: the lower-right corner.</li>
         * <li>bottomleft: the lower-left corner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The start time of watermarking (in seconds). By default, the watermark begins at the start time of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li>text: a text watermark. This is the default value.</li>
         * <li>file: a still or animated image watermark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The Object Storage Service (OSS) URI of the watermark file. The watermark file can be a PNG or MOV file.</p>
         * <p>The URI is in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the Type parameter is set to file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/watermark</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The width of the image watermark. By default, the width is the same as the width of the original watermark file. The value of the parameter can be an integer or a decimal.</p>
         * <ul>
         * <li>An integer: the number of pixels excluding the width of the logo. Valid values: [1,4096].</li>
         * <li>A decimal: the ratio relative to the width of the target resolution. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Width")
        public Float width;

        public static TargetVideoFilterVideoWatermarks build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoWatermarks self = new TargetVideoFilterVideoWatermarks();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoWatermarks setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public TargetVideoFilterVideoWatermarks setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public TargetVideoFilterVideoWatermarks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TargetVideoFilterVideoWatermarks setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public TargetVideoFilterVideoWatermarks setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public TargetVideoFilterVideoWatermarks setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public TargetVideoFilterVideoWatermarks setFontApha(Float fontApha) {
            this.fontApha = fontApha;
            return this;
        }
        public Float getFontApha() {
            return this.fontApha;
        }

        public TargetVideoFilterVideoWatermarks setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public TargetVideoFilterVideoWatermarks setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public TargetVideoFilterVideoWatermarks setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public TargetVideoFilterVideoWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public TargetVideoFilterVideoWatermarks setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public TargetVideoFilterVideoWatermarks setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public TargetVideoFilterVideoWatermarks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public TargetVideoFilterVideoWatermarks setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public TargetVideoFilterVideoWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class TargetVideoFilterVideo extends TeaModel {
        /**
         * <p>The configurations for blurring a rectangular area of the video. This parameter is used to remove logos from videos, such as TV channel logos.</p>
         */
        @NameInMap("Delogos")
        public java.util.List<TargetVideoFilterVideoDelogos> delogos;

        /**
         * <p>The video anonymization settings.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter only applies to the CreateMediaConvertTask operation.</li>
         * </ul>
         */
        @NameInMap("Desensitization")
        public TargetVideoFilterVideoDesensitization desensitization;

        /**
         * <p>The video playback speed. Valid values: [0.5,1.0]. Default value: 1.0.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter specifies the ratio of the playback speed of the output media file to the default playback speed of the source media file. It does not indicate transcoding acceleration.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter only applies to the CreateMediaConvertTask operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>The video watermarks.</p>
         */
        @NameInMap("Watermarks")
        public java.util.List<TargetVideoFilterVideoWatermarks> watermarks;

        public static TargetVideoFilterVideo build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideo self = new TargetVideoFilterVideo();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideo setDelogos(java.util.List<TargetVideoFilterVideoDelogos> delogos) {
            this.delogos = delogos;
            return this;
        }
        public java.util.List<TargetVideoFilterVideoDelogos> getDelogos() {
            return this.delogos;
        }

        public TargetVideoFilterVideo setDesensitization(TargetVideoFilterVideoDesensitization desensitization) {
            this.desensitization = desensitization;
            return this;
        }
        public TargetVideoFilterVideoDesensitization getDesensitization() {
            return this.desensitization;
        }

        public TargetVideoFilterVideo setSpeed(Float speed) {
            this.speed = speed;
            return this;
        }
        public Float getSpeed() {
            return this.speed;
        }

        public TargetVideoFilterVideo setWatermarks(java.util.List<TargetVideoFilterVideoWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<TargetVideoFilterVideoWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

    public static class TargetVideoTranscodeVideo extends TeaModel {
        /**
         * <p>Specifies whether to enable adaptation to resolution based on long and short sides. Valid values:</p>
         * <ul>
         * <li>true: The format of the <strong>Resolution</strong> parameter is <code>LongSide×ShortSide</code>. This is the default value.</li>
         * <li>false: The format of the <strong>Resolution</strong> parameter is <code>Width×Height</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdaptiveResolutionDirection")
        public Boolean adaptiveResolutionDirection;

        /**
         * <p>The number of consecutive B frames. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BFrames")
        public Integer BFrames;

        /**
         * <p>The bitrate of the video stream. Unit: bit/s.</p>
         * <blockquote>
         * <p>This parameter and the <strong>CRF</strong> parameter are mutually exclusive. If you leave both the parameters empty, the <strong>CRF</strong> parameter with a value of 23 applies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The video bitrate option. Valid values:</p>
         * <ul>
         * <li>fixed: always uses the target bitrate.</li>
         * <li>adaptive: uses the source bitrate when the source bitrate is less than the target bitrate.</li>
         * <li>fall: returns a failure when the source bitrate is less than the target bitrate.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>fixed for the CreateMediaConvert operation.</li>
         * <li>adaptive for the GenerateVideoPlaylist operation.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be used together with the <strong>Bitrate</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("BitrateOption")
        public String bitrateOption;

        /**
         * <p>The size of the buffer for decoding when the dynamic bitrate is used. Unit: bit/s.</p>
         * <blockquote>
         * <p>This parameter must be used together with the <strong>CRF</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("BufferSize")
        public Integer bufferSize;

        /**
         * <p>The constant rate factor (CRF) of the video. The value of this parameter falls within the [0,51] range. A greater indicates lower quality. We recommend that you specify a value within the [18,38] range. This parameter and the <strong>Bitrate</strong> parameter are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("CRF")
        public Float CRF;

        /**
         * <p>The video coding format. Valid values:</p>
         * <ul>
         * <li><p>copy, h264, h265, and vp9 for the CreateMediaConvert operation. The default value is copy.</p>
         * <p>**</p>
         * <p>**Warning **When you set the parameter to copy, the video stream is directly copied into the output file and all other parameters in TranscodeVideo do not take effect. The copy value is commonly used in container format conversion scenarios. You cannot use this value in video merging scenarios.</p>
         * </li>
         * <li><p>h264 and h265 for the GenerateVideoPlaylist operation. The default value is h264.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The target frame rate. By default, the target frame rate is the same as the source frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FrameRate")
        public Float frameRate;

        /**
         * <p>The frame rate option. Valid values:</p>
         * <ul>
         * <li>fixed: always uses the target frame rate.</li>
         * <li>adaptive: uses the source frame rate when the source frame rate is less than the target frame rate.</li>
         * <li>fall: returns a failure if the source frame rate is less than the target frame rate.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>fixed for the CreateMediaConvert operation.</li>
         * <li>adaptive for the GenerateVideoPlaylist operation.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be used together with the <strong>FrameRate</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("FrameRateOption")
        public String frameRateOption;

        /**
         * <p>The keyframe interval. Default value: 150.</p>
         * <blockquote>
         * <p>This parameter is not available to the GenerateVideoPlaylist operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GOPSize")
        public Integer GOPSize;

        /**
         * <p>The maximum bitrate when the dynamic bitrate is used. If you specify this parameter, you must also specify the BufferSize parameter.</p>
         * <blockquote>
         * <p>This parameter must be used together with the <strong>CRF</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The pixel format. By default, the pixel format matches that of the source video. Valid values:</p>
         * <ul>
         * <li>yuv420p</li>
         * <li>yuv422p</li>
         * <li>yuv444p</li>
         * <li>yuv420p10le</li>
         * <li>yuv422p10le</li>
         * <li>yuv444p10le</li>
         * <li>yuva420p</li>
         * </ul>
         * <blockquote>
         * <p>You can set the parameter to yuva420p only when you call the CreateMediaConvert operation and set the <strong>Codec</strong> parameter to vp9.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixelFormat")
        public String pixelFormat;

        /**
         * <p>The number of reference frames. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Refs")
        public Integer refs;

        /**
         * <p>The target resolution in the <code>WidthxHeight</code> format. By default, the target resolution is the same as the source resolution. You can specify both width and height, or only one of them. You can use this parameter together with the <strong>AdaptiveResolutionDirection</strong> parameter to set both the long side and short side or one of them. The value of each side falls within the range of (0,4096].</p>
         * <ul>
         * <li>Example 1: If <strong>AdaptiveResolutionDirection</strong> is set to false, <code>1280x720</code> specifies a width of 1280 pixels and a height of 720 pixels, <code>1280x</code> specifies a width of 1280 pixels and the same height as the source video, and <code>x720</code> specifies a height of 720 pixels and the same width as the source video.</li>
         * <li>Example 2: If <strong>AdaptiveResolutionDirection</strong> is set to true, <code>1280x720</code> specifies a long side of 1280 pixels and a short side of 720 pixels, <code>1280x</code> specifies a long side of 1280 pixels and the same short side as the source video, and <code>x720</code> specifies a short side of 720 pixels and the same long side as the source video.</li>
         * </ul>
         * <blockquote>
         * <p>If the source video contains rotation information, the width, height, long side, and short side depend on the frame after rotation (the playback resolution).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>640x480</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The resolution option. Valid values:</p>
         * <ul>
         * <li>fixed: always uses the target video resolution.</li>
         * <li>adaptive: uses the source video resolution when the source video resolution is less than the target video resolution.</li>
         * <li>fall: returns a failure when the source video resolution is less than the target video resolution.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>fixed for the CreateMediaConvert operation.</li>
         * <li>adaptive for the GenerateVideoPlaylist operation.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be used together with the <strong>Resolution</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("ResolutionOption")
        public String resolutionOption;

        /**
         * <p>The degrees to rotate the video clockwise. Valid values:</p>
         * <ul>
         * <li>0 (default)</li>
         * <li>90</li>
         * <li>180</li>
         * <li>270</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotation")
        public Integer rotation;

        /**
         * <p>The resizing mode. Valid values:</p>
         * <ul>
         * <li>stretch: forcibly stretches the video based on the specified width and height or long side and short side to fill any remaining space. This is the default value.</li>
         * <li>crop: proportionally resizes the video to the minimum resolution outside the rectangular shape based on the specified width and height or long side and short side, and crops the parts beyond the rectangular shape from the center.</li>
         * <li>fill: proportionally resizes the video to the maximum resolution within the rectangular shape based on the specified width and height or long side and short side, and fills empty space with black from the center.</li>
         * <li>fit: proportionally resizes the video to the maximum resolution that fits within the specified width and height or long side and short side.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be used together with the <strong>Resolution</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("VideoSlim")
        public Integer videoSlim;

        public static TargetVideoTranscodeVideo build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoTranscodeVideo self = new TargetVideoTranscodeVideo();
            return TeaModel.build(map, self);
        }

        public TargetVideoTranscodeVideo setAdaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
            this.adaptiveResolutionDirection = adaptiveResolutionDirection;
            return this;
        }
        public Boolean getAdaptiveResolutionDirection() {
            return this.adaptiveResolutionDirection;
        }

        public TargetVideoTranscodeVideo setBFrames(Integer BFrames) {
            this.BFrames = BFrames;
            return this;
        }
        public Integer getBFrames() {
            return this.BFrames;
        }

        public TargetVideoTranscodeVideo setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public TargetVideoTranscodeVideo setBitrateOption(String bitrateOption) {
            this.bitrateOption = bitrateOption;
            return this;
        }
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        public TargetVideoTranscodeVideo setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public TargetVideoTranscodeVideo setCRF(Float CRF) {
            this.CRF = CRF;
            return this;
        }
        public Float getCRF() {
            return this.CRF;
        }

        public TargetVideoTranscodeVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public TargetVideoTranscodeVideo setFrameRate(Float frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Float getFrameRate() {
            return this.frameRate;
        }

        public TargetVideoTranscodeVideo setFrameRateOption(String frameRateOption) {
            this.frameRateOption = frameRateOption;
            return this;
        }
        public String getFrameRateOption() {
            return this.frameRateOption;
        }

        public TargetVideoTranscodeVideo setGOPSize(Integer GOPSize) {
            this.GOPSize = GOPSize;
            return this;
        }
        public Integer getGOPSize() {
            return this.GOPSize;
        }

        public TargetVideoTranscodeVideo setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public TargetVideoTranscodeVideo setPixelFormat(String pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }
        public String getPixelFormat() {
            return this.pixelFormat;
        }

        public TargetVideoTranscodeVideo setRefs(Integer refs) {
            this.refs = refs;
            return this;
        }
        public Integer getRefs() {
            return this.refs;
        }

        public TargetVideoTranscodeVideo setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public TargetVideoTranscodeVideo setResolutionOption(String resolutionOption) {
            this.resolutionOption = resolutionOption;
            return this;
        }
        public String getResolutionOption() {
            return this.resolutionOption;
        }

        public TargetVideoTranscodeVideo setRotation(Integer rotation) {
            this.rotation = rotation;
            return this;
        }
        public Integer getRotation() {
            return this.rotation;
        }

        public TargetVideoTranscodeVideo setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public TargetVideoTranscodeVideo setVideoSlim(Integer videoSlim) {
            this.videoSlim = videoSlim;
            return this;
        }
        public Integer getVideoSlim() {
            return this.videoSlim;
        }

    }

}
