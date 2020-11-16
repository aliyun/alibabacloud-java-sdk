// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveLazyPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetLiveLazyPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveLazyPullStreamInfoConfigResponse self = new SetLiveLazyPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveLazyPullStreamInfoConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
