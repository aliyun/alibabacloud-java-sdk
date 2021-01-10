// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveAudioAuditNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAudioAuditNotifyConfigResponseBody self = new UpdateLiveAudioAuditNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAudioAuditNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
