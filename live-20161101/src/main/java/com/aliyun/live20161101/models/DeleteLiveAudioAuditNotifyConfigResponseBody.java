// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveAudioAuditNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditNotifyConfigResponseBody self = new DeleteLiveAudioAuditNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
