// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The sequence number of the recording file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AudioRecordId")
    public Integer audioRecordId;

    /**
     * <p>The URL of the recording file.</p>
     * <blockquote>
     * <p>: The URL must be an Object Storage Service (OSS) URL within your Alibaba Cloud account. The OSS bucket must be in the same region in which IMS is activated.</p>
     * </blockquote>
     * <blockquote>
     * <p>: The audio file must be in the WAV or PCM format and must be a 16-bit mono audio file at 48000 Hz.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/record1.wav">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/record1.wav</a></p>
     */
    @NameInMap("RecordUrl")
    public String recordUrl;

    /**
     * <p>The voice ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaozhuan</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    public static DetectAudioForCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectAudioForCustomizedVoiceJobRequest self = new DetectAudioForCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public DetectAudioForCustomizedVoiceJobRequest setAudioRecordId(Integer audioRecordId) {
        this.audioRecordId = audioRecordId;
        return this;
    }
    public Integer getAudioRecordId() {
        return this.audioRecordId;
    }

    public DetectAudioForCustomizedVoiceJobRequest setRecordUrl(String recordUrl) {
        this.recordUrl = recordUrl;
        return this;
    }
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public DetectAudioForCustomizedVoiceJobRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
