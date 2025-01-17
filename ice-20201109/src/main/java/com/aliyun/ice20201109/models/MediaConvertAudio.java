// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertAudio extends TeaModel {
    @NameInMap("Bitrate")
    public Long bitrate;

    @NameInMap("Channels")
    public Long channels;

    @NameInMap("Codec")
    public String codec;

    @NameInMap("Profile")
    public String profile;

    @NameInMap("Remove")
    public Boolean remove;

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
