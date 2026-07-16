// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetVideo extends TeaModel {
    /**
     * <p>Specifies whether to disable video stream generation. Valid values:</p>
     * <ul>
     * <li>true: Disabled. The output file does not contain a video stream.</li>
     * <li>false (default): Not disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableVideo")
    public Boolean disableVideo;

    /**
     * <p>The video filter parameters. This parameter does not take effect when <strong>TranscodeVideo</strong> is empty or <strong>TranscodeVideo.Codec</strong> is set to copy.</p>
     * <blockquote>
     * <p>This parameter is not supported for the GenerateVideoPlaylist API.</p>
     * </blockquote>
     */
    @NameInMap("FilterVideo")
    public TargetVideoFilterVideo filterVideo;

    /**
     * <p>The list of video stream index numbers to process from the source file. An empty value (default) indicates that the video stream with the smallest index number (the first video stream) is processed. An index number greater than 100 indicates that all video streams are processed.</p>
     * <ul>
     * <li>Example: <code>[0,1]</code> processes video streams with index numbers 0 and 1. <code>[1]</code> processes the video stream with index number 1. <code>[101]</code> processes all video streams.</li>
     * </ul>
     * <blockquote>
     * <p>Only video streams with existing index numbers are processed. If a video stream corresponding to an index number does not exist, that index number is ignored.</p>
     * </blockquote>
     */
    @NameInMap("Stream")
    public java.util.List<Integer> stream;

    /**
     * <p>The video transcoding parameters. An empty value indicates that video processing is disabled and the output file does not contain a video stream.</p>
     * <blockquote>
     * <p>Setting this parameter to an empty value to disable video processing is not recommended.</p>
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
         * <p>The duration for which the mosaic is applied, in seconds (s). The default value is until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>0 (default): Both the offset in pixels and the ratio of horizontal offset to the output resolution height are 0.</li>
         * <li>Integer: The offset in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio of horizontal offset to the output resolution height. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dx")
        public Float dx;

        /**
         * <p>Default value: 0. The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>0 (default): Both the offset in pixels and the ratio of vertical offset to the output resolution height are 0.</li>
         * <li>Integer: The offset in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio of vertical offset to the output resolution height. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dy")
        public Float dy;

        /**
         * <p>The height of the mosaic. The default value is the decimal 1.0, which fills the entire output video height. The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>Integer: The height in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio relative to the output video resolution height. Valid values: (0,1).</li>
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
         * <li>topleft (default): top-left corner</li>
         * <li>topright: top-right corner</li>
         * <li>bottomright: bottom-right corner</li>
         * <li>bottomleft: bottom-left corner</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The start time for adding the mosaic, in seconds (s). The default value is the start time of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The width of the mosaic. The default value is the decimal 1.0, which fills the entire output video width. The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>Integer: The width in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio relative to the output video resolution width. Valid values: (0,1).</li>
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
        @NameInMap("BlurRadius")
        public Integer blurRadius;

        /**
         * <p>The face confidence threshold, which sets the lower limit of confidence for face recognition. If the confidence value of a detected face is lower than this threshold, the face is not desensitized.</p>
         * <ul>
         * <li>Valid values: 0.0 to 1.0.</li>
         * <li>Default value: 0.0 (no confidence filtering is performed).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The minimum face size threshold, which sets the minimum size of faces to be desensitized. If the width or height of a detected face is smaller than this threshold, the face is not desensitized. Unit: pixels. Default value: 0, which indicates no size restriction on faces.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("ScaleRatio")
        public Float scaleRatio;

        @NameInMap("Transparency")
        public Float transparency;

        public static TargetVideoFilterVideoDesensitizationFace build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoDesensitizationFace self = new TargetVideoFilterVideoDesensitizationFace();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoDesensitizationFace setBlurRadius(Integer blurRadius) {
            this.blurRadius = blurRadius;
            return this;
        }
        public Integer getBlurRadius() {
            return this.blurRadius;
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

        public TargetVideoFilterVideoDesensitizationFace setScaleRatio(Float scaleRatio) {
            this.scaleRatio = scaleRatio;
            return this;
        }
        public Float getScaleRatio() {
            return this.scaleRatio;
        }

        public TargetVideoFilterVideoDesensitizationFace setTransparency(Float transparency) {
            this.transparency = transparency;
            return this;
        }
        public Float getTransparency() {
            return this.transparency;
        }

    }

    public static class TargetVideoFilterVideoDesensitizationLicensePlate extends TeaModel {
        @NameInMap("BlurRadius")
        public Integer blurRadius;

        /**
         * <p>The license plate confidence threshold, which sets the lower limit of confidence for license plate recognition. If the confidence value of a detected license plate is lower than this threshold, the license plate is not desensitized.</p>
         * <ul>
         * <li>Valid values: 0.0 to 1.0.</li>
         * <li>Default value: 0.0 (no confidence filtering is performed).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The minimum license plate size threshold, which sets the minimum size of license plates to be desensitized. If the width or height of a detected license plate is smaller than this threshold, the license plate is not desensitized. Unit: pixels. Default value: 0, which indicates no size restriction on license plates.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("ScaleRatio")
        public Float scaleRatio;

        @NameInMap("Transparency")
        public Float transparency;

        public static TargetVideoFilterVideoDesensitizationLicensePlate build(java.util.Map<String, ?> map) throws Exception {
            TargetVideoFilterVideoDesensitizationLicensePlate self = new TargetVideoFilterVideoDesensitizationLicensePlate();
            return TeaModel.build(map, self);
        }

        public TargetVideoFilterVideoDesensitizationLicensePlate setBlurRadius(Integer blurRadius) {
            this.blurRadius = blurRadius;
            return this;
        }
        public Integer getBlurRadius() {
            return this.blurRadius;
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

        public TargetVideoFilterVideoDesensitizationLicensePlate setScaleRatio(Float scaleRatio) {
            this.scaleRatio = scaleRatio;
            return this;
        }
        public Float getScaleRatio() {
            return this.scaleRatio;
        }

        public TargetVideoFilterVideoDesensitizationLicensePlate setTransparency(Float transparency) {
            this.transparency = transparency;
            return this;
        }
        public Float getTransparency() {
            return this.transparency;
        }

    }

    public static class TargetVideoFilterVideoDesensitization extends TeaModel {
        /**
         * <p>The face desensitization configuration.</p>
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
         * <p>The border color of the watermark text. The format is #RRGGBB. Default value: #000000. Values such as &quot;red&quot; and &quot;green&quot; are also supported.</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("BorderColor")
        public String borderColor;

        /**
         * <p>The border width of the text watermark, in pixels (px). The value must be an integer. Valid values: [0,4096]. Default value: 0.</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>The content of the text watermark. Default value: empty.</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The duration for which the watermark is displayed, in seconds (s). The default value is until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>0 (default): Both the offset in pixels and the ratio of horizontal offset to the output resolution height are 0.</li>
         * <li>Integer: The offset in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio of horizontal offset to the output resolution height. Valid values: (0,1).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dx")
        public Float dx;

        /**
         * <p>The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li><p>0 (default): Both the offset in pixels and the ratio of vertical offset to the output resolution height are 0.</p>
         * </li>
         * <li><p>Integer: The offset in pixels (px). Valid values: [1,4096].</p>
         * </li>
         * <li><p>Decimal: The ratio of vertical offset to the output resolution height. Valid values: (0,1).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dy")
        public Float dy;

        /**
         * <p>The font opacity of the text watermark. Valid values: (0,1]. Default value: 1, which indicates fully opaque.</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("FontApha")
        public Float fontApha;

        /**
         * <p>The font color of the watermark text. The format is #RRGGBB. Default value: #000000. Values such as &quot;red&quot; and &quot;green&quot; are also supported.</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font name of the text watermark. Valid values:</p>
         * <ul>
         * <li>SourceHanSans-Regular (default)</li>
         * <li>SourceHanSans-Bold</li>
         * <li>SourceHanSerif-Regular</li>
         * <li>SourceHanSerif-Bold</li>
         * </ul>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SourceHanSans-Bold</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The font size of the text watermark. Default value: 16. The value must be an integer. Valid values: (4,120).</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>text</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The height of the watermark image. The default value is the original height of the watermark image. The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>Integer: The height in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio relative to the output video resolution height. Valid values: (0,1).</li>
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
         * <li>topleft (default): top-left corner</li>
         * <li>topright: top-right corner</li>
         * <li>bottomright: bottom-right corner</li>
         * <li>bottomleft: bottom-left corner</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The start time for adding the watermark, in seconds (s). The default value is the start time of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The watermark type. Valid values:</p>
         * <ul>
         * <li>text (default): text watermark.</li>
         * <li>file: image or animated image watermark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The OSS URI of the watermark file. Supported formats are PNG and MOV.</p>
         * <p>The OSS URI format is <code>oss://&lt;bucket&gt;/&lt;object&gt;</code>, where <code>&lt;bucket&gt;</code> is the name of an OSS bucket in the same region as the current project, and <code>&lt;object&gt;</code> is the full path of the file including the file name extension.</p>
         * <blockquote>
         * <p>Notice:  This parameter takes effect only when the <code>Type</code> parameter is set to <code>file</code>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/watermark.jpg</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The width of the watermark image. The default value is the original width of the watermark image. The meanings differ depending on whether the value is an integer or a decimal:</p>
         * <ul>
         * <li>Integer: The width in pixels (px). Valid values: [1,4096].</li>
         * <li>Decimal: The ratio relative to the output video resolution width. Valid values: (0,1).</li>
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
         * <p>Applies mosaic processing to a rectangular area of the video to remove logos or station watermarks.</p>
         */
        @NameInMap("Delogos")
        public java.util.List<TargetVideoFilterVideoDelogos> delogos;

        /**
         * <p>The video desensitization configuration.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>This parameter is applicable only to the CreateMediaConvertTask API.</li>
         * </ul>
         */
        @NameInMap("Desensitization")
        public TargetVideoFilterVideoDesensitization desensitization;

        /**
         * <p>The video playback speed setting. Valid values: [0.5,1.0]. Default value: 1.0.</p>
         * <blockquote>
         * <ul>
         * <li>This is the ratio of the transcoded media file playback speed to the source media file default playback speed, not speed-up transcoding.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>This parameter is applicable only to the CreateMediaConvertTask API.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>The list of video watermarks.</p>
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
         * <p>Specifies whether to enable adaptive long/short side mode. Valid values:</p>
         * <ul>
         * <li>true: Enabled. The format of the <strong>Resolution</strong> parameter is <code>LongSide×ShortSide</code>.</li>
         * <li>false (default): Disabled. The format of the <strong>Resolution</strong> parameter is <code>Width×Height</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdaptiveResolutionDirection")
        public Boolean adaptiveResolutionDirection;

        /**
         * <p>The number of consecutive B-frames. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BFrames")
        public Integer BFrames;

        /**
         * <p>The video stream bitrate, in bits per second (bit/s).</p>
         * <blockquote>
         * <p>This parameter is mutually exclusive with <strong>CRF</strong>. If both this parameter and <strong>CRF</strong> are empty, encoding is performed with a <strong>CRF</strong> value of 23.</p>
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
         * <li>fixed: Always uses the specified target video bitrate.</li>
         * <li>adaptive: Uses the source video bitrate when it is lower than the specified target video bitrate.</li>
         * <li>fall: Returns a failure when the source video bitrate is lower than the specified target video bitrate.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>For the CreateMediaConvert API, the default value is fixed.</li>
         * <li>For the GenerateVideoPlaylist API, the default value is adaptive.</li>
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
         * <p>The decoding buffer size for variable bitrate, in bits per second (bps).</p>
         * <blockquote>
         * <p>This parameter takes effect only when used together with the <strong>CRF</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("BufferSize")
        public Integer bufferSize;

        /**
         * <p>Specifies the constant quality mode. This parameter is mutually exclusive with <strong>Bitrate</strong>. Valid values: [0,51]. A higher value results in lower quality. Recommended values: [18,38].</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("CRF")
        public Float CRF;

        /**
         * <p>The video encoding format. Valid values:</p>
         * <ul>
         * <li>For the CreateMediaConvert API: copy (default), h264, h265, vp9.
         * <warning>When this parameter is set to copy, the video streams to be processed are directly copied to the output file, and other parameters under <strong>TranscodeVideo</strong> do not take effect. copy cannot be used for video concatenation and is typically used for container format conversion scenarios.</warning></li>
         * <li>For the GenerateVideoPlaylist API: h264 (default), h265.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The video frame rate. The default value is the same as the source video.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FrameRate")
        public Float frameRate;

        /**
         * <p>The frame rate option. Valid values:</p>
         * <ul>
         * <li>fixed: Always uses the specified target video frame rate.</li>
         * <li>adaptive: Uses the source video frame rate when it is lower than the specified target video frame rate.</li>
         * <li>fall: Returns a failure when the source video frame rate is lower than the specified target video frame rate.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>For the CreateMediaConvert API, the default value is fixed.</li>
         * <li>For the GenerateVideoPlaylist API, the default value is adaptive.</li>
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
         * <p>The number of frames between keyframes. Default value: 150.</p>
         * <blockquote>
         * <p>This parameter is not supported for the GenerateVideoPlaylist API.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GOPSize")
        public Integer GOPSize;

        /**
         * <p>The maximum bitrate limit for variable bitrate. When using this parameter, you must specify the BufferSize parameter.</p>
         * <blockquote>
         * <p>This parameter takes effect only when used together with the <strong>CRF</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The pixel format. The default value is the same as the source video. Valid values:</p>
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
         * <p>yuva420p is available only for the CreateMediaConvert API, and the <strong>Codec</strong> parameter must be set to vp9.</p>
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
         * <p>The resolution of the output video in the format of <code>WidthxHeight</code>. The default value is the same as the playback resolution of the source video. You can configure both width and height, or configure only width or height. You can also use the <strong>AdaptiveResolutionDirection</strong> parameter to configure both long and short sides, or configure only the long side or short side. The value range for a single side is (0,4096].</p>
         * <ul>
         * <li>Example 1: If <strong>AdaptiveResolutionDirection</strong> is false, <code>1280x720</code> sets the width to 1280 and the height to 720. <code>1280x</code> sets the width to 1280 and keeps the height the same as the source video. <code>x720</code> sets the height to 720 and keeps the width the same as the source video.</li>
         * <li>Example 2: If <strong>AdaptiveResolutionDirection</strong> is true, <code>1280x720</code> sets the long side to 1280 and the short side to 720. <code>1280x</code> sets the long side to 1280 and keeps the short side the same as the source video. <code>x720</code> sets the short side to 720 and keeps the long side the same as the source video.</li>
         * </ul>
         * <blockquote>
         * <p>If the source video contains rotation information, the width/height and long/short side determination is based on the post-rotation state, which is the playback resolution.</p>
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
         * <li>fixed: Always uses the specified target video resolution.</li>
         * <li>adaptive: Uses the source video resolution when the source video resolution area is smaller than the specified target video resolution area.</li>
         * <li>fall: Returns a failure when the source video resolution area is smaller than the specified target video resolution area.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>For the CreateMediaConvert API, the default value is fixed.</li>
         * <li>For the GenerateVideoPlaylist API, the default value is adaptive.</li>
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
         * <p>The scaling mode. Valid values:</p>
         * <ul>
         * <li>stretch (default): Fixes the width/height or long/short sides and forcibly scales the video to fill the blank area by stretching.</li>
         * <li>crop: Scales proportionally to the minimum resolution that extends beyond the specified width/height or long/short side rectangle, and then center-crops the excess area.</li>
         * <li>fill: Scales proportionally to the maximum resolution within the specified width/height or long/short side rectangle, and then center-fills the blank area with black.</li>
         * <li>fit: Scales proportionally to the maximum resolution within the specified width/height or long/short side rectangle.</li>
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
         * <p>Enables the Narrowband HD mode. Valid values:</p>
         * <p>0: Default value. Disabled.</p>
         * <p>1: Uses the Narrowband HD mode for transcoding.</p>
         * <blockquote>
         * <p>For optimal results, use the officially recommended Bitrate or CRF parameters for video transcoding with Narrowband HD.</p>
         * <p>Notice: Narrowband HD supports only H.264/H.265 formats, only yuv420p, 8-bit depth, and does not support multi-target video transcoding output or video concatenation. For more information, see <a href="https://help.aliyun.com/document_detail/2984556.html">Narrowband HD overview</a>.</p>
         * </blockquote>
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
