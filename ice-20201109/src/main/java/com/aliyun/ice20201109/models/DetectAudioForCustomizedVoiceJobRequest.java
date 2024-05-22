// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AudioRecordId")
    public Integer audioRecordId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordUrl")
    public String recordUrl;

    /**
     * <p>This parameter is required.</p>
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
