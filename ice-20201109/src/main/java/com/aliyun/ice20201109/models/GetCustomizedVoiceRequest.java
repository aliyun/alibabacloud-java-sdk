// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceRequest extends TeaModel {
    @NameInMap("VoiceId")
    public String voiceId;

    public static GetCustomizedVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceRequest self = new GetCustomizedVoiceRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
