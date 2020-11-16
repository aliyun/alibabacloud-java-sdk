// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditConfigResponse self = new AddLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
