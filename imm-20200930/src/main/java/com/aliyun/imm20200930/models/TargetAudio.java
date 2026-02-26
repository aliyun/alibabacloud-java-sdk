// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TargetAudio extends TeaModel {
    /**
     * <p>Specifies whether to disable audio stream generation. Valid values:</p>
     * <ul>
     * <li>true: disables audio stream generation. No audio stream is included in the output file.</li>
     * <li>false: does not disable audio stream generation. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableAudio")
    public Boolean disableAudio;

    /**
     * <p>The audio processing settings. This parameter is invalid if <strong>TranscodeAudio</strong> is left empty or <strong>TranscodeAudio.Codec</strong> is set to copy.</p>
     * <blockquote>
     * <p> This parameter is not available to the GenerateVideoPlaylist operation.</p>
     * </blockquote>
     */
    @NameInMap("FilterAudio")
    public TargetAudioFilterAudio filterAudio;

    /**
     * <p>The index numbers of audio streams. If you do not specify this parameter, the first audio stream (the one with the smallest index number) is processed. If the array contains an element greater than 100, all audio streams are processed.</p>
     * <ul>
     * <li>For example, you can set the parameter to <code>[0,1]</code> to process audio streams with index numbers 0 and 1, <code>[1]</code> to process only the audio stream with the index number 1, or <code>[101]</code> to process all audio streams.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify an index number but no audio stream with the index number is found, the index number is ignored.</p>
     * </blockquote>
     */
    @NameInMap("Stream")
    public java.util.List<Long> stream;

    /**
     * <p>The audio transcoding settings. If you do not specify this parameter, no audio streams are included in the output file.</p>
     * <blockquote>
     * <p> We recommend that you do not use this parameter to disable audio stream generation.</p>
     * </blockquote>
     */
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
        /**
         * <p>Specifies whether to mix all sound tracks into a single track. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>The bitrate of the audio stream. Unit: bit/s. This parameter and the <strong>Quality</strong> parameter are mutually exclusive. Valid values: 1000 to 10000000.</p>
         * 
         * <strong>example:</strong>
         * <p>64000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The audio bitrate option. Valid values:</p>
         * <ul>
         * <li>fixed: always uses the target bitrate.</li>
         * <li>adaptive: uses the source bitrate when the source bitrate is smaller than the target bitrate.</li>
         * <li>fall: returns a failure when the source bitrate is smaller than the target bitrate.</li>
         * </ul>
         * <p>Default values:</p>
         * <ul>
         * <li>fixed for the CreateMediaConvert operation.</li>
         * <li>adaptive for the GenerateVideoPlaylist operation.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter must be used in conjunction with the <strong>Bitrate</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("BitrateOption")
        public String bitrateOption;

        /**
         * <p>The audio bit depth. Valid values: 16 and 24.</p>
         * <blockquote>
         * <p> This parameter takes effect only when Codec is set to flac.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("BitsPerSample")
        public Integer bitsPerSample;

        /**
         * <p>The number of sound channels. By default, the audio stream has the same number of sound channels as the source audio. Valid values: [1,8].</p>
         * <blockquote>
         * <p> The number of sound channels varies with audio formats: one or two for MP3, up to six for AC3 5.1, and one for AMR.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channel")
        public Integer channel;

        /**
         * <p>The codec. Valid values:</p>
         * <ul>
         * <li>copy, mp3, vorbis, aac, flac, ac3, opus, and amr for the CreateMediaConvert operation. The default value is copy.</li>
         * <li>aac for the GenerateVideoPlaylist operation. The default value is aac.</li>
         * </ul>
         * <blockquote>
         * <p> When you set the parameter to copy, the audio stream is directly copied into the output file and all other parameters in <strong>TranscodeAudio</strong> do not take effect. The copy value is commonly used in container format conversion scenarios. You cannot use this value in audio merging scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The audio quality. Valid values: 0 to 100. The greater the value, the higher the quality. This parameter and the <strong>Bitrate</strong> parameter are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Quality")
        public Integer quality;

        /**
         * <p>The sampling rate option. Unit: Hz. By default, the source sampling rate is used. Valid values: 8000, 12025, 12000, 16000, 22050, 24000, 32000, 44100, 48000, 64000, 88200, and 96000.</p>
         * <blockquote>
         * <p> Supported sampling rates vary with formats: 48 kHz and lower for MP3, 8 kHz, 12 kHz, 16 kHz, 24 kHz, and 48 kHz for Opus, 32 kHz, 44.1 kHz, and 48 kHz for AC3, and 8 kHz and 16 kHz for AMR.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12050</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        /**
         * <p>The sampling rate option. Valid values:</p>
         * <ul>
         * <li>fixed: always uses the target sampling rate.</li>
         * <li>adaptive: uses the source sampling rate when the source sampling rate is smaller than the target sampling rate.</li>
         * <li>fall: returns a failure when the source sampling rate is smaller than the target sampling rate.</li>
         * </ul>
         * <p>Default values:</p>
         * <ul>
         * <li>fixed for the CreateMediaConvert operation.</li>
         * <li>adaptive for the GenerateVideoPlaylist operation.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter must be used in conjunction with the <strong>SampleRate</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
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
