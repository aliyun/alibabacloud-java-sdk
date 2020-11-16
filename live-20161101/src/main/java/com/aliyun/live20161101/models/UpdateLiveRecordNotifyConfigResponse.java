// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordNotifyConfigResponse self = new UpdateLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
