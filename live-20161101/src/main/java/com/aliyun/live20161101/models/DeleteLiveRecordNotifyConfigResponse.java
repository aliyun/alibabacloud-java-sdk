// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordNotifyConfigResponse self = new DeleteLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
