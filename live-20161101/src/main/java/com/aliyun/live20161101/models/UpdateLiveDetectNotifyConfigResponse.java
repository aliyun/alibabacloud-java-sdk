// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveDetectNotifyConfigResponse self = new UpdateLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveDetectNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
