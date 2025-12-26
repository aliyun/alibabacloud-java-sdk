// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetTTSVoiceByIdCustomRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>M1ScGtY****PBFEJHdUV1thQ</p>
     */
    @NameInMap("voiceId")
    public String voiceId;

    public static GetTTSVoiceByIdCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTTSVoiceByIdCustomRequest self = new GetTTSVoiceByIdCustomRequest();
        return TeaModel.build(map, self);
    }

    public GetTTSVoiceByIdCustomRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
