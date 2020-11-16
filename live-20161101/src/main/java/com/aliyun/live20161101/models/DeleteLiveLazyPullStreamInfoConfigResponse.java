// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveLazyPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveLazyPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveLazyPullStreamInfoConfigResponse self = new DeleteLiveLazyPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
