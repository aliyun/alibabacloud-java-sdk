// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneAudioResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateCasterSceneAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneAudioResponse self = new UpdateCasterSceneAudioResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneAudioResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
