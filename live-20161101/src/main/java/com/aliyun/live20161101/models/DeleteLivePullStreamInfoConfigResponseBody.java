// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLivePullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePullStreamInfoConfigResponseBody self = new DeleteLivePullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
