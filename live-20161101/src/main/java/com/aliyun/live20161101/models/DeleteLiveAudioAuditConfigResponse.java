// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditConfigResponse self = new DeleteLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
