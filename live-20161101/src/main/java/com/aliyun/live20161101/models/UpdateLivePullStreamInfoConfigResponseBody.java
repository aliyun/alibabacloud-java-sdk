// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLivePullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePullStreamInfoConfigResponseBody self = new UpdateLivePullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
