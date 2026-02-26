// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AudioStream extends TeaModel {
    /**
     * <p>The bitrate. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>320087</p>
     */
    @NameInMap("Bitrate")
    public Long bitrate;

    /**
     * <p>The sound channel layout.</p>
     * 
     * <strong>example:</strong>
     * <p>stereo</p>
     */
    @NameInMap("ChannelLayout")
    public String channelLayout;

    /**
     * <p>The number of sound channels.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Channels")
    public Long channels;

    /**
     * <p>The full name of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>AAC (Advanced Audio Coding)</p>
     */
    @NameInMap("CodecLongName")
    public String codecLongName;

    /**
     * <p>The abbreviated name of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>aac</p>
     */
    @NameInMap("CodecName")
    public String codecName;

    /**
     * <p>The tag of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>0x6134706d</p>
     */
    @NameInMap("CodecTag")
    public String codecTag;

    /**
     * <p>The description of the codec tag.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4a</p>
     */
    @NameInMap("CodecTagString")
    public String codecTagString;

    /**
     * <p>The time base of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>1/44100</p>
     */
    @NameInMap("CodecTimeBase")
    public String codecTimeBase;

    /**
     * <p>The duration of the audio stream in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3.690667</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>The number of frames.</p>
     * 
     * <strong>example:</strong>
     * <p>173</p>
     */
    @NameInMap("FrameCount")
    public Long frameCount;

    /**
     * <p>The index number of the audio stream.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Long index;

    /**
     * <p>The audio language in the BCP 47 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The lyric.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Lyric")
    public String lyric;

    /**
     * <p>The sample format.</p>
     * 
     * <strong>example:</strong>
     * <p>fltp</p>
     */
    @NameInMap("SampleFormat")
    public String sampleFormat;

    /**
     * <p>The sampling rate. Unit: Hz.</p>
     * 
     * <strong>example:</strong>
     * <p>48000</p>
     */
    @NameInMap("SampleRate")
    public Long sampleRate;

    /**
     * <p>The start time of the audio stream in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0235</p>
     */
    @NameInMap("StartTime")
    public Double startTime;

    /**
     * <p>The time base.</p>
     * 
     * <strong>example:</strong>
     * <p>1/48000</p>
     */
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
