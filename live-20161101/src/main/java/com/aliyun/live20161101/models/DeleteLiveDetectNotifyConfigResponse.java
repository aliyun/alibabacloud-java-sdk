// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDetectNotifyConfigResponse self = new DeleteLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDetectNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
