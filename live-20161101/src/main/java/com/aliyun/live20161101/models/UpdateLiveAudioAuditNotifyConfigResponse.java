// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAudioAuditNotifyConfigResponse self = new UpdateLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAudioAuditNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
