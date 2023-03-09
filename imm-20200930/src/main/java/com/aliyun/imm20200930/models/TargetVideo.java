// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetVideo extends TeaModel {
    @NameInMap("DisableVideo")
    public Boolean disableVideo;

    @NameInMap("FilterVideo")
    public TargetVideoFilterVideo filterVideo;

    @NameInMap("Stream")
    public java.util.List<Integer> stream;

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
        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Dx")
        public Float dx;

        @NameInMap("Dy")
        public Float dy;

        @NameInMap("Height")
        public Float height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("StartTime")
        public Double startTime;

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

    public static class TargetVideoFilterVideoWatermarks extends TeaModel {
        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidth")
        public Integer borderWidth;

        @NameInMap("Content")
        public String content;

        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Dx")
        public Float dx;

        @NameInMap("Dy")
        public Float dy;

        @NameInMap("FontApha")
        public Float fontApha;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("Height")
        public Float height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("StartTime")
        public Double startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("URI")
        public String URI;

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
        @NameInMap("Delogos")
        public java.util.List<TargetVideoFilterVideoDelogos> delogos;

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

        public TargetVideoFilterVideo setWatermarks(java.util.List<TargetVideoFilterVideoWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<TargetVideoFilterVideoWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

    public static class TargetVideoTranscodeVideo extends TeaModel {
        @NameInMap("AdaptiveResolutionDirection")
        public Boolean adaptiveResolutionDirection;

        @NameInMap("BFrames")
        public Integer BFrames;

        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("BitrateOption")
        public String bitrateOption;

        @NameInMap("BufferSize")
        public Integer bufferSize;

        @NameInMap("CRF")
        public Float CRF;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("FrameRate")
        public Float frameRate;

        @NameInMap("FrameRateOption")
        public String frameRateOption;

        @NameInMap("GOPSize")
        public Integer GOPSize;

        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        @NameInMap("PixelFormat")
        public String pixelFormat;

        @NameInMap("Refs")
        public Integer refs;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("ResolutionOption")
        public String resolutionOption;

        @NameInMap("Rotation")
        public Integer rotation;

        @NameInMap("ScaleType")
        public String scaleType;

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

    }

}
