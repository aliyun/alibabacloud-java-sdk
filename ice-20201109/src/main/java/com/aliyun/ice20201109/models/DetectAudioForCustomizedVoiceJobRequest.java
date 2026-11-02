// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The audio sequence number corresponding to the RecordUrl parameter.</p>
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
     * <p>Notice: The URL must point to an Object Storage Service (OSS) object in your account, and the region of the OSS bucket must be the same as the region where the service is deployed when you call this operation.</notice>
     * Notice: Audio format requirements: The audio file must be in WAV or PCM format, and must be a mono audio file with a 16-bit sample depth and a sample rate of 48,000 Hz.</notice></p>
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
