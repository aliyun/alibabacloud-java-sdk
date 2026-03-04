// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertAudio extends TeaModel {
    /**
     * <p>The audio bitrate of the output file.</p>
     * <ul>
     * <li>Unit: Kbps.</li>
     * <li>Valid values: [8,1000].</li>
     * <li>Default value: 128.</li>
     * <li>Common values: 64, 128, and 256.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("Bitrate")
    public Long bitrate;

    /**
     * <p>The number of audio channels.</p>
     * <ul>
     * <li><p>Valid values: 0, 1, 2, 4, 5, 6, and 8.</p>
     * <ul>
     * <li>If the Codec parameter is set to MP3 or OPUS, you can set this parameter to 0, 1, or 2.</li>
     * <li>If the Codec parameter is set to AAC or FLAC, you can set this parameter to 0, 1, 2, 4, 5, 6, or 8.</li>
     * <li>If the Codec parameter is set to VORBIS, you can set this parameter to 2.</li>
     * <li>If the Format parameter is set to MPD, you cannot set this parameter to 8.</li>
     * </ul>
     * </li>
     * <li><p>Default value: 2.</p>
     * </li>
     * <li><p>Set the value to 0 to preserve the original number of channels from the source file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Channels")
    public Long channels;

    /**
     * <p>The audio codec.</p>
     * <ul>
     * <li>Valid values: AAC, AC3, EAC3, MP2, MP3, FLAC, OPUS, VORBIS, WMA-V1, WMA-V2, and pcm_s16le.</li>
     * <li>Default value: AAC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAC</p>
     */
    @NameInMap("Codec")
    public String codec;

    /**
     * <p>The audio codec profile.</p>
     * <ul>
     * <li>This parameter takes effect only if the Codec parameter is set to AAC.</li>
     * <li>Valid values: aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</li>
     * <li>Default value: aac_low.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aac_low</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>Specifies whether to remove the audio stream from the output.</p>
     * <ul>
     * <li>true: deletes the audio stream. All other parameters in the Audio object are ignored.</li>
     * <li>false: retains the audio stream.</li>
     * <li>Default value: false.</li>
     * </ul>
     */
    @NameInMap("Remove")
    public Boolean remove;

    /**
     * <p>The sample rate.</p>
     * <ul>
     * <li>Unit: Hz</li>
     * <li>Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
     * <li>Default value: 44100.</li>
     * </ul>
     * <p>The supported sample rates vary depending on the container and codec format. For example, when the audio codec is MP3, a sample rate of 96000 is not supported. If the container format is FLV, only sample rates of 22050 and 44100 are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>44100</p>
     */
    @NameInMap("Samplerate")
    public String samplerate;

    public static MediaConvertAudio build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertAudio self = new MediaConvertAudio();
        return TeaModel.build(map, self);
    }

    public MediaConvertAudio setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public MediaConvertAudio setChannels(Long channels) {
        this.channels = channels;
        return this;
    }
    public Long getChannels() {
        return this.channels;
    }

    public MediaConvertAudio setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public MediaConvertAudio setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public MediaConvertAudio setRemove(Boolean remove) {
        this.remove = remove;
        return this;
    }
    public Boolean getRemove() {
        return this.remove;
    }

    public MediaConvertAudio setSamplerate(String samplerate) {
        this.samplerate = samplerate;
        return this;
    }
    public String getSamplerate() {
        return this.samplerate;
    }

}
