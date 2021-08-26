// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AudioStream extends TeaModel {
    // Index
    @NameInMap("Index")
    public Long index;

    // Language
    @NameInMap("Language")
    public String language;

    // CodecName
    @NameInMap("CodecName")
    public String codecName;

    // CodecLongName
    @NameInMap("CodecLongName")
    public String codecLongName;

    // CodecTimeBase
    @NameInMap("CodecTimeBase")
    public String codecTimeBase;

    // CodecTagString
    @NameInMap("CodecTagString")
    public String codecTagString;

    // CodecTag
    @NameInMap("CodecTag")
    public String codecTag;

    // SampleFormat
    @NameInMap("SampleFormat")
    public String sampleFormat;

    // SampleRate
    @NameInMap("SampleRate")
    public Long sampleRate;

    // Channels
    @NameInMap("Channels")
    public Long channels;

    // ChannelLayout
    @NameInMap("ChannelLayout")
    public String channelLayout;

    // TimeBase
    @NameInMap("TimeBase")
    public String timeBase;

    // StartTime
    @NameInMap("StartTime")
    public Float startTime;

    // Duration
    @NameInMap("Duration")
    public Float duration;

    // Bitrate
    @NameInMap("Bitrate")
    public Long bitrate;

    // Lyric
    @NameInMap("Lyric")
    public String lyric;

    public static AudioStream build(java.util.Map<String, ?> map) throws Exception {
        AudioStream self = new AudioStream();
        return TeaModel.build(map, self);
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

    public AudioStream setCodecName(String codecName) {
        this.codecName = codecName;
        return this;
    }
    public String getCodecName() {
        return this.codecName;
    }

    public AudioStream setCodecLongName(String codecLongName) {
        this.codecLongName = codecLongName;
        return this;
    }
    public String getCodecLongName() {
        return this.codecLongName;
    }

    public AudioStream setCodecTimeBase(String codecTimeBase) {
        this.codecTimeBase = codecTimeBase;
        return this;
    }
    public String getCodecTimeBase() {
        return this.codecTimeBase;
    }

    public AudioStream setCodecTagString(String codecTagString) {
        this.codecTagString = codecTagString;
        return this;
    }
    public String getCodecTagString() {
        return this.codecTagString;
    }

    public AudioStream setCodecTag(String codecTag) {
        this.codecTag = codecTag;
        return this;
    }
    public String getCodecTag() {
        return this.codecTag;
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

    public AudioStream setChannels(Long channels) {
        this.channels = channels;
        return this;
    }
    public Long getChannels() {
        return this.channels;
    }

    public AudioStream setChannelLayout(String channelLayout) {
        this.channelLayout = channelLayout;
        return this;
    }
    public String getChannelLayout() {
        return this.channelLayout;
    }

    public AudioStream setTimeBase(String timeBase) {
        this.timeBase = timeBase;
        return this;
    }
    public String getTimeBase() {
        return this.timeBase;
    }

    public AudioStream setStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }
    public Float getStartTime() {
        return this.startTime;
    }

    public AudioStream setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public AudioStream setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public AudioStream setLyric(String lyric) {
        this.lyric = lyric;
        return this;
    }
    public String getLyric() {
        return this.lyric;
    }

}
