// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetAudio extends TeaModel {
    @NameInMap("DisableAudio")
    public Boolean disableAudio;

    @NameInMap("FilterAudio")
    public TargetAudioFilterAudio filterAudio;

    @NameInMap("Stream")
    public java.util.List<Long> stream;

    @NameInMap("TranscodeAudio")
    public TargetAudioTranscodeAudio transcodeAudio;

    public static TargetAudio build(java.util.Map<String, ?> map) throws Exception {
        TargetAudio self = new TargetAudio();
        return TeaModel.build(map, self);
    }

    public TargetAudio setDisableAudio(Boolean disableAudio) {
        this.disableAudio = disableAudio;
        return this;
    }
    public Boolean getDisableAudio() {
        return this.disableAudio;
    }

    public TargetAudio setFilterAudio(TargetAudioFilterAudio filterAudio) {
        this.filterAudio = filterAudio;
        return this;
    }
    public TargetAudioFilterAudio getFilterAudio() {
        return this.filterAudio;
    }

    public TargetAudio setStream(java.util.List<Long> stream) {
        this.stream = stream;
        return this;
    }
    public java.util.List<Long> getStream() {
        return this.stream;
    }

    public TargetAudio setTranscodeAudio(TargetAudioTranscodeAudio transcodeAudio) {
        this.transcodeAudio = transcodeAudio;
        return this;
    }
    public TargetAudioTranscodeAudio getTranscodeAudio() {
        return this.transcodeAudio;
    }

    public static class TargetAudioFilterAudio extends TeaModel {
        @NameInMap("Mixing")
        public Boolean mixing;

        public static TargetAudioFilterAudio build(java.util.Map<String, ?> map) throws Exception {
            TargetAudioFilterAudio self = new TargetAudioFilterAudio();
            return TeaModel.build(map, self);
        }

        public TargetAudioFilterAudio setMixing(Boolean mixing) {
            this.mixing = mixing;
            return this;
        }
        public Boolean getMixing() {
            return this.mixing;
        }

    }

    public static class TargetAudioTranscodeAudio extends TeaModel {
        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("BitrateOption")
        public String bitrateOption;

        @NameInMap("BitsPerSample")
        public Integer bitsPerSample;

        @NameInMap("Channel")
        public Integer channel;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Quality")
        public Integer quality;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        @NameInMap("SampleRateOption")
        public String sampleRateOption;

        public static TargetAudioTranscodeAudio build(java.util.Map<String, ?> map) throws Exception {
            TargetAudioTranscodeAudio self = new TargetAudioTranscodeAudio();
            return TeaModel.build(map, self);
        }

        public TargetAudioTranscodeAudio setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public TargetAudioTranscodeAudio setBitrateOption(String bitrateOption) {
            this.bitrateOption = bitrateOption;
            return this;
        }
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        public TargetAudioTranscodeAudio setBitsPerSample(Integer bitsPerSample) {
            this.bitsPerSample = bitsPerSample;
            return this;
        }
        public Integer getBitsPerSample() {
            return this.bitsPerSample;
        }

        public TargetAudioTranscodeAudio setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }
        public Integer getChannel() {
            return this.channel;
        }

        public TargetAudioTranscodeAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public TargetAudioTranscodeAudio setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public TargetAudioTranscodeAudio setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public TargetAudioTranscodeAudio setSampleRateOption(String sampleRateOption) {
            this.sampleRateOption = sampleRateOption;
            return this;
        }
        public String getSampleRateOption() {
            return this.sampleRateOption;
        }

    }

}
