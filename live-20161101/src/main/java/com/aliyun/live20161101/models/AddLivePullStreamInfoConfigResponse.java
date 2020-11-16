// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLivePullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLivePullStreamInfoConfigResponse self = new AddLivePullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLivePullStreamInfoConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
