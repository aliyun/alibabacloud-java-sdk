// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoStream extends TeaModel {
    /**
     * <p>The average frame rate of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>25/1</p>
     */
    @NameInMap("AverageFrameRate")
    public String averageFrameRate;

    /**
     * <p>The bit depth.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("BitDepth")
    public Long bitDepth;

    /**
     * <p>The bitrate. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5407765</p>
     */
    @NameInMap("Bitrate")
    public Long bitrate;

    /**
     * <p>The full name of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
     */
    @NameInMap("CodecLongName")
    public String codecLongName;

    /**
     * <p>The abbreviated name of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("CodecName")
    public String codecName;

    /**
     * <p>The tag of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>0x31637661</p>
     */
    @NameInMap("CodecTag")
    public String codecTag;

    /**
     * <p>The description of the codec tag.</p>
     * 
     * <strong>example:</strong>
     * <p>avc1</p>
     */
    @NameInMap("CodecTagString")
    public String codecTagString;

    /**
     * <p>The time base of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>1373627/83160000</p>
     */
    @NameInMap("CodecTimeBase")
    public String codecTimeBase;

    /**
     * <p>The primary colors.</p>
     * 
     * <strong>example:</strong>
     * <p>bt709</p>
     */
    @NameInMap("ColorPrimaries")
    public String colorPrimaries;

    /**
     * <p>The color range.</p>
     * 
     * <strong>example:</strong>
     * <p>tv</p>
     */
    @NameInMap("ColorRange")
    public String colorRange;

    /**
     * <p>The color space.</p>
     * 
     * <strong>example:</strong>
     * <p>bt709</p>
     */
    @NameInMap("ColorSpace")
    public String colorSpace;

    /**
     * <p>The color transfer function.</p>
     * 
     * <strong>example:</strong>
     * <p>bt709</p>
     */
    @NameInMap("ColorTransfer")
    public String colorTransfer;

    /**
     * <p>The display aspect ratio of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>16:9</p>
     */
    @NameInMap("DisplayAspectRatio")
    public String displayAspectRatio;

    /**
     * <p>The duration of the video stream. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>22.88</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>The number of frames.</p>
     * 
     * <strong>example:</strong>
     * <p>572</p>
     */
    @NameInMap("FrameCount")
    public Long frameCount;

    /**
     * <p>The frame rate of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>25/1</p>
     */
    @NameInMap("FrameRate")
    public String frameRate;

    /**
     * <p>Specifies whether the video stream contains B frames.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HasBFrames")
    public Long hasBFrames;

    /**
     * <p>The image height of the video stream. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Height")
    public Long height;

    /**
     * <p>The index number of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Index")
    public Long index;

    /**
     * <p>The language used in the video stream. The language is indicated by using a BCP 47 language tag.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The level.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The pixel format of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>yuv420p</p>
     */
    @NameInMap("PixelFormat")
    public String pixelFormat;

    /**
     * <p>The profile.</p>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The image rotation angle of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Rotate")
    public String rotate;

    /**
     * <p>The sampling aspect ratio of the video stream.</p>
     * 
     * <strong>example:</strong>
     * <p>1:1</p>
     */
    @NameInMap("SampleAspectRatio")
    public String sampleAspectRatio;

    /**
     * <p>The start time of the video stream. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0.000000</p>
     */
    @NameInMap("StartTime")
    public Double startTime;

    /**
     * <p>The time base.</p>
     * 
     * <strong>example:</strong>
     * <p>1/12800</p>
     */
    @NameInMap("TimeBase")
    public String timeBase;

    /**
     * <p>The image width of the video stream. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Width")
    public Long width;

    public static VideoStream build(java.util.Map<String, ?> map) throws Exception {
        VideoStream self = new VideoStream();
        return TeaModel.build(map, self);
    }

    public VideoStream setAverageFrameRate(String averageFrameRate) {
        this.averageFrameRate = averageFrameRate;
        return this;
    }
    public String getAverageFrameRate() {
        return this.averageFrameRate;
    }

    public VideoStream setBitDepth(Long bitDepth) {
        this.bitDepth = bitDepth;
        return this;
    }
    public Long getBitDepth() {
        return this.bitDepth;
    }

    public VideoStream setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public VideoStream setCodecLongName(String codecLongName) {
        this.codecLongName = codecLongName;
        return this;
    }
    public String getCodecLongName() {
        return this.codecLongName;
    }

    public VideoStream setCodecName(String codecName) {
        this.codecName = codecName;
        return this;
    }
    public String getCodecName() {
        return this.codecName;
    }

    public VideoStream setCodecTag(String codecTag) {
        this.codecTag = codecTag;
        return this;
    }
    public String getCodecTag() {
        return this.codecTag;
    }

    public VideoStream setCodecTagString(String codecTagString) {
        this.codecTagString = codecTagString;
        return this;
    }
    public String getCodecTagString() {
        return this.codecTagString;
    }

    public VideoStream setCodecTimeBase(String codecTimeBase) {
        this.codecTimeBase = codecTimeBase;
        return this;
    }
    public String getCodecTimeBase() {
        return this.codecTimeBase;
    }

    public VideoStream setColorPrimaries(String colorPrimaries) {
        this.colorPrimaries = colorPrimaries;
        return this;
    }
    public String getColorPrimaries() {
        return this.colorPrimaries;
    }

    public VideoStream setColorRange(String colorRange) {
        this.colorRange = colorRange;
        return this;
    }
    public String getColorRange() {
        return this.colorRange;
    }

    public VideoStream setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
        return this;
    }
    public String getColorSpace() {
        return this.colorSpace;
    }

    public VideoStream setColorTransfer(String colorTransfer) {
        this.colorTransfer = colorTransfer;
        return this;
    }
    public String getColorTransfer() {
        return this.colorTransfer;
    }

    public VideoStream setDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
        return this;
    }
    public String getDisplayAspectRatio() {
        return this.displayAspectRatio;
    }

    public VideoStream setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
        return this.duration;
    }

    public VideoStream setFrameCount(Long frameCount) {
        this.frameCount = frameCount;
        return this;
    }
    public Long getFrameCount() {
        return this.frameCount;
    }

    public VideoStream setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public VideoStream setHasBFrames(Long hasBFrames) {
        this.hasBFrames = hasBFrames;
        return this;
    }
    public Long getHasBFrames() {
        return this.hasBFrames;
    }

    public VideoStream setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public VideoStream setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public VideoStream setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public VideoStream setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public VideoStream setPixelFormat(String pixelFormat) {
        this.pixelFormat = pixelFormat;
        return this;
    }
    public String getPixelFormat() {
        return this.pixelFormat;
    }

    public VideoStream setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public VideoStream setRotate(String rotate) {
        this.rotate = rotate;
        return this;
    }
    public String getRotate() {
        return this.rotate;
    }

    public VideoStream setSampleAspectRatio(String sampleAspectRatio) {
        this.sampleAspectRatio = sampleAspectRatio;
        return this;
    }
    public String getSampleAspectRatio() {
        return this.sampleAspectRatio;
    }

    public VideoStream setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
        return this.startTime;
    }

    public VideoStream setTimeBase(String timeBase) {
        this.timeBase = timeBase;
        return this;
    }
    public String getTimeBase() {
        return this.timeBase;
    }

    public VideoStream setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
