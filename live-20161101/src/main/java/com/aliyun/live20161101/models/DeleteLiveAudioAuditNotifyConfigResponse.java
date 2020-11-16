// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditNotifyConfigResponse self = new DeleteLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
