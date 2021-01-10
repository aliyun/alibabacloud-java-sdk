// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveLazyPullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveLazyPullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveLazyPullStreamInfoConfigResponseBody self = new DeleteLiveLazyPullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveLazyPullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
