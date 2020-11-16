// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditNotifyConfigResponse self = new AddLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
