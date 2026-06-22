// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetVideo extends TeaModel {
    /**
     * <p>Specifies whether to disable video stream generation. Valid values:</p>
     * <ul>
     * <li><p>true: Disables video stream generation. The output file will not contain a video stream.</p>
     * </li>
     * <li><p>false (default): Enables video stream generation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableVideo")
    public Boolean disableVideo;

    /**
     * <p>The video processing parameters. This parameter is invalid if <strong>TranscodeVideo</strong> is empty or if <strong>TranscodeVideo.Codec</strong> is set to copy.</p>
     * <blockquote>
     * <p>You cannot set this parameter for the GenerateVideoPlaylist API.</p>
     * </blockquote>
     */
    @NameInMap("FilterVideo")
    public TargetVideoFilterVideo filterVideo;

    /**
     * <p>A list of index numbers for the source video streams to process. If you leave this parameter empty (default), the system processes the video stream with the smallest index number (the first video stream). If you set the index number to a value greater than 100, the system processes all video streams.</p>
     * <ul>
     * <li>Example: <code>[0,1]</code> processes video streams with index numbers 0 and 1. <code>[1]</code> processes the video stream with index number 1. <code>[101]</code> processes all video streams.</li>
     * </ul>
     * <blockquote>
     * <p>The system only processes video streams with existing index numbers. If a video stream corresponding to an index number does not exist, the system ignores that index number.</p>
     * </blockquote>
     */
    @NameInMap("Stream")
    public java.util.List<Integer> stream;

    /**
     * <p>The video transcoding parameters. An empty value disables video processing. The output file will not contain a video stream.</p>
     * <blockquote>
     * <p>Do not disable video processing by leaving this parameter empty.</p>
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
         * <p>The duration for which the mosaic is displayed, in seconds (s). By default, the mosaic is displayed until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>0 (default): The pixel offset is 0. The ratio of the horizontal offset to the output video width is also 0.</p>
         * </li>
         * <li><p>Integer: The offset in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the horizontal offset to the output video width. The value ranges from (0, 1).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dx")
        public Float dx;

        /**
         * <p>The default value is 0. The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>0 (default): The pixel offset is 0. The ratio of the vertical offset to the output video height is also 0.</p>
         * </li>
         * <li><p>Integer: The offset in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the vertical offset to the output video height. The value ranges from (0, 1).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dy")
        public Float dy;

        /**
         * <p>The height of the mosaic. The default value is the decimal 1.0, which means it fills the entire height of the output video. The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>Integer: The height in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the mosaic height to the output video height. The value ranges from (0, 1).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The reference position for adding the mosaic. Valid values:</p>
         * <ul>
         * <li><p>topleft (default): The top-left corner.</p>
         * </li>
         * <li><p>topright: The top-right corner.</p>
         * </li>
         * <li><p>bottomright: The bottom-right corner.</p>
         * </li>
         * <li><p>bottomleft: The bottom-left corner.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The start time for adding the mosaic, in seconds (s). By default, the mosaic is added from the beginning of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The width of the mosaic. The default value is the decimal 1.0, which means it fills the entire width of the output video. The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>Integer: The width in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the mosaic width to the output video width. The value ranges from (0, 1).</p>
         * </li>
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
         * <p>The confidence threshold for facial recognition. This sets the lower limit for the confidence level. If the confidence level of a detected face is below this threshold, the face is not desensitized.</p>
         * <ul>
         * <li><p>Value range: 0.0 to 1.0.</p>
         * </li>
         * <li><p>Default value: 0.0 (no confidence filtering).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The minimum face size threshold. This sets the minimum size for a face to be desensitized. If the width or height of a detected face is smaller than this threshold, the face is not desensitized. The unit is pixels. The default value is 0, which means there is no restriction on face size.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
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
         * <p>The confidence threshold for license plate recognition. This sets the lower limit for the confidence level. If the confidence level of a detected license plate is below this threshold, the license plate is not desensitized.</p>
         * <ul>
         * <li><p>Value range: 0.0 to 1.0.</p>
         * </li>
         * <li><p>Default value: 0.0 (no confidence filtering).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The minimum license plate size threshold. This sets the minimum size for a license plate to be desensitized. If the width or height of a detected license plate is smaller than this threshold, the license plate is not desensitized. The unit is pixels. The default value is 0, which means there is no restriction on license plate size.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
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
         * <p>The facial desensitization configuration.</p>
         * <blockquote>
         * <p>This feature is in public preview. If you have any questions, join the DingTalk group for feedback. For the DingTalk group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</p>
         * </blockquote>
         */
        @NameInMap("Face")
        public TargetVideoFilterVideoDesensitizationFace face;

        /**
         * <p>The license plate desensitization configuration.</p>
         * <blockquote>
         * <p>This feature is in public preview. If you have any questions, join the DingTalk group for feedback. For the DingTalk group number, see <a href="https://help.aliyun.com/document_detail/84454.html">Contact us</a>.</p>
         * </blockquote>
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
         * <p>The outline color of the watermark text. The format is #RRGGBB. The default value is #000000. You can also enter values such as &quot;red&quot; or &quot;green&quot;.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The outline width for the text watermark, in pixels (px). The value must be an integer from 0 to 4096. The default value is 0.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>The content of the text watermark. The default value is empty.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The duration for which the watermark is displayed, in seconds (s). By default, the watermark is displayed until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>0 (default): The pixel offset is 0. The ratio of the horizontal offset to the output video width is also 0.</p>
         * </li>
         * <li><p>Integer: The offset in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the horizontal offset to the output video width. The value ranges from (0, 1).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dx")
        public Float dx;

        /**
         * <p>The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>0 (default): The pixel offset is 0. The ratio of the vertical offset to the output video height is also 0.</p>
         * </li>
         * <li><p>Integer: The offset in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the vertical offset to the output video height. The value ranges from (0, 1).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dy")
        public Float dy;

        /**
         * <p>The font opacity of the text watermark. The value ranges from (0, 1]. The default value is 1, which means fully opaque.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("FontApha")
        public Float fontApha;

        /**
         * <p>The font color of the watermark text. The format is #RRGGBB. The default value is #000000. You can also enter values such as &quot;red&quot; or &quot;green&quot;.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font name for the text watermark. Valid values:</p>
         * <ul>
         * <li><p>SourceHanSans-Regular (default)</p>
         * </li>
         * <li><p>SourceHanSans-Bold</p>
         * </li>
         * <li><p>SourceHanSerif-Regular</p>
         * </li>
         * <li><p>SourceHanSerif-Bold</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceHanSans-Bold</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The font size for the text watermark. The default value is 16. The value must be an integer in the range (4, 120).</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>text</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The height of the watermark image. By default, this is the height of the original watermark image. The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>Integer: The height of the watermark in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the watermark height to the output video height. The value ranges from (0, 1).</p>
         * </li>
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
         * <li><p>topleft (default): The top-left corner.</p>
         * </li>
         * <li><p>topright: The top-right corner.</p>
         * </li>
         * <li><p>bottomright: The bottom-right corner.</p>
         * </li>
         * <li><p>bottomleft: The bottom-left corner.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The start time for adding the watermark, in seconds (s). By default, the watermark is added from the beginning of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li><p>text (default): A text watermark.</p>
         * </li>
         * <li><p>file: An image or animated image watermark.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The OSS URL of the watermark file. Supported formats are PNG and MOV.</p>
         * <p>The OSS URL must follow the format <code>oss://&lt;bucket&gt;/&lt;object&gt;</code>, where <code>&lt;bucket&gt;</code> is the name of an OSS bucket in the same region as the current project, and <code>&lt;object&gt;</code> is the full path of the file, including the file name extension.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is effective only when the <code>Type</code> parameter is set to <code>file</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/watermark.jpg</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The width of the watermark image. By default, this is the width of the original watermark image. The meaning of this parameter varies depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>Integer: The width of the watermark in pixels (px). The value ranges from 1 to 4096.</p>
         * </li>
         * <li><p>Decimal: The ratio of the watermark width to the output video width. The value ranges from (0, 1).</p>
         * </li>
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
         * <p>Blurs a rectangular area of the video to remove logos, station icons, and other elements.</p>
         */
        @NameInMap("Delogos")
        public java.util.List<TargetVideoFilterVideoDelogos> delogos;

        /**
         * <p>The video desensitization configuration.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>This parameter applies only to the CreateMediaConvertTask API.</li>
         * </ul>
         */
        @NameInMap("Desensitization")
        public TargetVideoFilterVideoDesensitization desensitization;

        /**
         * <p>The video playback speed setting. The value ranges from 0.5 to 1.0. The default value is 1.0.</p>
         * <blockquote>
         * <ul>
         * <li>This is the ratio of the default playback speed of the transcoded media file to that of the source media file. This is not a high-speed transcoding feature.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>This parameter applies only to the CreateMediaConvertTask API.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>A list of video watermarks.</p>
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
         * <p>Specifies whether to enable adaptive resolution for long and short edges. Valid values:</p>
         * <ul>
         * <li><p>true: Yes. In this case, the format for the <strong>Resolution</strong> parameter is <code>long edge × short edge</code>.</p>
         * </li>
         * <li><p>false (default): No. In this case, the format for the <strong>Resolution</strong> parameter is <code>width × height</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdaptiveResolutionDirection")
        public Boolean adaptiveResolutionDirection;

        /**
         * <p>The number of consecutive B-frames. The default value is 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BFrames")
        public Integer BFrames;

        /**
         * <p>The video stream bitrate in bits per second (bit/s).</p>
         * <blockquote>
         * <p>This parameter is mutually exclusive with <strong>CRF</strong>. If both this parameter and the <strong>CRF</strong> parameter are empty, the system encodes the video with a CRF value of 23.</p>
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
         * <li><p>fixed: Always uses the specified target video bitrate.</p>
         * </li>
         * <li><p>adaptive: Uses the source video bitrate if it is lower than the specified target video bitrate.</p>
         * </li>
         * <li><p>fall: The task fails if the source video bitrate is lower than the specified target video bitrate.</p>
         * </li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li><p>For the CreateMediaConvert API, the default value is fixed.</p>
         * </li>
         * <li><p>For the GenerateVideoPlaylist API, the default value is adaptive.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be set together with the <strong>Bitrate</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("BitrateOption")
        public String bitrateOption;

        /**
         * <p>The size of the decoding buffer for dynamic bitrate, in bits per second (bps).</p>
         * <blockquote>
         * <p>This parameter is effective only when used with the <strong>CRF</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("BufferSize")
        public Integer bufferSize;

        /**
         * <p>Specifies the Constant Rate Factor (CRF) mode. This parameter is mutually exclusive with <strong>Bitrate</strong>. The value ranges from 0 to 51. A larger value indicates lower image quality. A value from 18 to 38 is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("CRF")
        public Float CRF;

        /**
         * <p>The video encoding format. Valid values:</p>
         * <ul>
         * <li><p>For the CreateMediaConvert API: copy (default), h264, h265, and vp9.</p>
         * <blockquote>
         * <p>Warning: </p>
         * </blockquote>
         * <p>If you set this parameter to copy, the system directly copies the video stream to the output file. In this case, the other parameters under <strong>TranscodeVideo</strong> are invalid. The copy value cannot be used for video concatenation and is typically used for container format conversion.</p>
         * </li>
         * <li><p>For the GenerateVideoPlaylist API: h264 (default) and h265.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The video frame rate. By default, this is the same as the source video.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FrameRate")
        public Float frameRate;

        /**
         * <p>The frame rate option. Valid values:</p>
         * <ul>
         * <li><p>fixed: Always uses the specified target video frame rate.</p>
         * </li>
         * <li><p>adaptive: Uses the source video frame rate if it is lower than the specified target video frame rate.</p>
         * </li>
         * <li><p>fall: The task fails if the source video frame rate is lower than the specified target video frame rate.</p>
         * </li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li><p>For the CreateMediaConvert API, the default value is fixed.</p>
         * </li>
         * <li><p>For the GenerateVideoPlaylist API, the default value is adaptive.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be set together with the <strong>FrameRate</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("FrameRateOption")
        public String frameRateOption;

        /**
         * <p>The size of the Group of Pictures (GOP) in frames. The default value is 150.</p>
         * <blockquote>
         * <p>This parameter is not supported by the GenerateVideoPlaylist API.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GOPSize")
        public Integer GOPSize;

        /**
         * <p>The maximum bitrate limit for dynamic bitrate. When you use this parameter, you must also specify the BufferSize parameter.</p>
         * <blockquote>
         * <p>This parameter is effective only when used with the <strong>CRF</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The pixel format. By default, this is the same as the source video. Valid values:</p>
         * <ul>
         * <li><p>yuv420p</p>
         * </li>
         * <li><p>yuv422p</p>
         * </li>
         * <li><p>yuv444p</p>
         * </li>
         * <li><p>yuv420p10le</p>
         * </li>
         * <li><p>yuv422p10le</p>
         * </li>
         * <li><p>yuv444p10le</p>
         * </li>
         * <li><p>yuva420p</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The yuva420p value is available only for the CreateMediaConvert API, and the <strong>Codec</strong> parameter must be set to vp9.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixelFormat")
        public String pixelFormat;

        /**
         * <p>The number of reference frames. The default value is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Refs")
        public Integer refs;

        /**
         * <p>The resolution of the output video in the format of <code>width × height</code>. By default, this is the same as the playback resolution of the source video. You can configure both width and height, or only width or height. You can also use this parameter with the <strong>AdaptiveResolutionDirection</strong> parameter to configure both the long and short edges, or only the long or short edge. The value for a single edge ranges from (0, 4096].</p>
         * <ul>
         * <li><p>Example 1: If <strong>AdaptiveResolutionDirection</strong> is set to false, <code>1280x720</code> sets the width to 1280 and the height to 720. <code>1280x</code> sets the width to 1280 and keeps the height the same as the source video. <code>x720</code> sets the height to 720 and keeps the width the same as the source video.</p>
         * </li>
         * <li><p>Example 2: If <strong>AdaptiveResolutionDirection</strong> is set to true, <code>1280x720</code> sets the long edge to 1280 and the short edge to 720. <code>1280x</code> sets the long edge to 1280 and keeps the short edge the same as the source video. <code>x720</code> sets the short edge to 720 and keeps the long edge the same as the source video.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the source video contains rotation information, the width, height, long edge, and short edge are determined based on the rotated video, which means the playback resolution is used.</p>
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
         * <li><p>fixed: Always uses the specified target video resolution.</p>
         * </li>
         * <li><p>adaptive: Uses the source video resolution if its area is smaller than the area of the specified target video resolution.</p>
         * </li>
         * <li><p>fall: The task fails if the area of the source video resolution is smaller than the area of the specified target video resolution.</p>
         * </li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li><p>For the CreateMediaConvert API, the default value is fixed.</p>
         * </li>
         * <li><p>For the GenerateVideoPlaylist API, the default value is adaptive.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be set together with the <strong>Resolution</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("ResolutionOption")
        public String resolutionOption;

        /**
         * <p>The clockwise rotation angle of the video in degrees. Valid values:</p>
         * <ul>
         * <li><p>0 (default)</p>
         * </li>
         * <li><p>90</p>
         * </li>
         * <li><p>180</p>
         * </li>
         * <li><p>270</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotation")
        public Integer rotation;

        /**
         * <p>The scaling mode. Valid values:</p>
         * <ul>
         * <li><p>stretch (default): Fixes the width and height or the long and short edges, and forces scaling to stretch and fill any blank areas.</p>
         * </li>
         * <li><p>crop: Scales the video proportionally to the minimum resolution that extends beyond the specified rectangle (defined by width/height or long/short edges), and then center-crops the excess parts.</p>
         * </li>
         * <li><p>fill: Scales the video proportionally to the maximum resolution that fits within the specified rectangle (defined by width/height or long/short edges), and then center-fills any blank areas with black.</p>
         * </li>
         * <li><p>fit: Scales the video proportionally to the maximum resolution that fits within the specified rectangle (defined by width/height or long/short edges).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be set together with the <strong>Resolution</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("ScaleType")
        public String scaleType;

        /**
         * <p>Enables the Narrowband HD mode. Set the value as follows:</p>
         * <p>0: The default value. Disables the mode.</p>
         * <p>1: Enables transcoding in Narrowband HD mode.</p>
         * <blockquote>
         * <p>For best results, use the officially recommended Bitrate or CRF parameters for video transcoding and encoding in Narrowband HD mode.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>Narrowband HD only supports the h.264/h.265 format, yuv420p, and an 8-bit depth. It does not support transcoding output for multiple target videos or video concatenation. For more information, see <a href="https://help.aliyun.com/document_detail/2984556.html">Introduction to Narrowband HD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
