// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AudioStream extends TeaModel {
    @NameInMap("Bitrate")
    public Long bitrate;

    @NameInMap("ChannelLayout")
    public String channelLayout;

    @NameInMap("Channels")
    public Long channels;

    @NameInMap("CodecLongName")
    public String codecLongName;

    @NameInMap("CodecName")
    public String codecName;

    @NameInMap("CodecTag")
    public String codecTag;

    @NameInMap("CodecTagString")
    public String codecTagString;

    @NameInMap("CodecTimeBase")
    public String codecTimeBase;

    @NameInMap("Duration")
    public Double duration;

    @NameInMap("FrameCount")
    public Long frameCount;

    @NameInMap("Index")
    public Long index;

    @NameInMap("Language")
    public String language;

    @NameInMap("Lyric")
    public String lyric;

    @NameInMap("SampleFormat")
    public String sampleFormat;

    @NameInMap("SampleRate")
    public Long sampleRate;

    @NameInMap("StartTime")
    public Double startTime;

    @NameInMap("TimeBase")
    public String timeBase;

    public static AudioStream build(java.util.Map<String, ?> map) throws Exception {
        AudioStream self = new AudioStream();
        return TeaModel.build(map, self);
    }

    public AudioStream setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public AudioStream setChannelLayout(String channelLayout) {
        this.channelLayout = channelLayout;
        return this;
    }
    public String getChannelLayout() {
        return this.channelLayout;
    }

    public AudioStream setChannels(Long channels) {
        this.channels = channels;
        return this;
    }
    public Long getChannels() {
        return this.channels;
    }

    public AudioStream setCodecLongName(String codecLongName) {
        this.codecLongName = codecLongName;
        return this;
    }
    public String getCodecLongName() {
        return this.codecLongName;
    }

    public AudioStream setCodecName(String codecName) {
        this.codecName = codecName;
        return this;
    }
    public String getCodecName() {
        return this.codecName;
    }

    public AudioStream setCodecTag(String codecTag) {
        this.codecTag = codecTag;
        return this;
    }
    public String getCodecTag() {
        return this.codecTag;
    }

    public AudioStream setCodecTagString(String codecTagString) {
        this.codecTagString = codecTagString;
        return this;
    }
    public String getCodecTagString() {
        return this.codecTagString;
    }

    public AudioStream setCodecTimeBase(String codecTimeBase) {
        this.codecTimeBase = codecTimeBase;
        return this;
    }
    public String getCodecTimeBase() {
        return this.codecTimeBase;
    }

    public AudioStream setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
        return this.duration;
    }

    public AudioStream setFrameCount(Long frameCount) {
        this.frameCount = frameCount;
        return this;
    }
    public Long getFrameCount() {
        return this.frameCount;
    }

    public AudioStream setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public AudioStream setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AudioStream setLyric(String lyric) {
        this.lyric = lyric;
        return this;
    }
    public String getLyric() {
        return this.lyric;
    }

    public AudioStream setSampleFormat(String sampleFormat) {
        this.sampleFormat = sampleFormat;
        return this;
    }
    public String getSampleFormat() {
        return this.sampleFormat;
    }

    public AudioStream setSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Long getSampleRate() {
        return this.sampleRate;
    }

    public AudioStream setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
        return this.startTime;
    }

    public AudioStream setTimeBase(String timeBase) {
        this.timeBase = timeBase;
        return this;
    }
    public String getTimeBase() {
        return this.timeBase;
    }

}
