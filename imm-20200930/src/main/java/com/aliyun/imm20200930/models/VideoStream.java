// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoStream extends TeaModel {
    // AverageFrameRate
    @NameInMap("AverageFrameRate")
    public Float averageFrameRate;

    // Bitrate
    @NameInMap("Bitrate")
    public Long bitrate;

    // CodecLongName
    @NameInMap("CodecLongName")
    public String codecLongName;

    // CodecName
    @NameInMap("CodecName")
    public String codecName;

    // CodecTag
    @NameInMap("CodecTag")
    public String codecTag;

    // CodecTagString
    @NameInMap("CodecTagString")
    public String codecTagString;

    // CodecTimeBase
    @NameInMap("CodecTimeBase")
    public String codecTimeBase;

    // DisplayAspectRatio
    @NameInMap("DisplayAspectRatio")
    public String displayAspectRatio;

    // Duration
    @NameInMap("Duration")
    public Float duration;

    // FrameCount
    @NameInMap("FrameCount")
    public Long frameCount;

    // FrameRate
    @NameInMap("FrameRate")
    public Float frameRate;

    // HasBFrames
    @NameInMap("HasBFrames")
    public String hasBFrames;

    // Height
    @NameInMap("Height")
    public Long height;

    // Index
    @NameInMap("Index")
    public Long index;

    // Language
    @NameInMap("Language")
    public String language;

    // Level
    @NameInMap("Level")
    public Long level;

    // PixelFormat
    @NameInMap("PixelFormat")
    public String pixelFormat;

    // Profile
    @NameInMap("Profile")
    public String profile;

    // SampleAspectRatio
    @NameInMap("SampleAspectRatio")
    public String sampleAspectRatio;

    // StartTime
    @NameInMap("StartTime")
    public Float startTime;

    // TimeBase
    @NameInMap("TimeBase")
    public String timeBase;

    // Width
    @NameInMap("Width")
    public Long width;

    public static VideoStream build(java.util.Map<String, ?> map) throws Exception {
        VideoStream self = new VideoStream();
        return TeaModel.build(map, self);
    }

    public VideoStream setAverageFrameRate(Float averageFrameRate) {
        this.averageFrameRate = averageFrameRate;
        return this;
    }
    public Float getAverageFrameRate() {
        return this.averageFrameRate;
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

    public VideoStream setDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
        return this;
    }
    public String getDisplayAspectRatio() {
        return this.displayAspectRatio;
    }

    public VideoStream setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public VideoStream setFrameCount(Long frameCount) {
        this.frameCount = frameCount;
        return this;
    }
    public Long getFrameCount() {
        return this.frameCount;
    }

    public VideoStream setFrameRate(Float frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Float getFrameRate() {
        return this.frameRate;
    }

    public VideoStream setHasBFrames(String hasBFrames) {
        this.hasBFrames = hasBFrames;
        return this;
    }
    public String getHasBFrames() {
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

    public VideoStream setSampleAspectRatio(String sampleAspectRatio) {
        this.sampleAspectRatio = sampleAspectRatio;
        return this;
    }
    public String getSampleAspectRatio() {
        return this.sampleAspectRatio;
    }

    public VideoStream setStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }
    public Float getStartTime() {
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
