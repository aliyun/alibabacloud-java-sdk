// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLivePullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePullStreamInfoConfigResponse self = new DeleteLivePullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePullStreamInfoConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
