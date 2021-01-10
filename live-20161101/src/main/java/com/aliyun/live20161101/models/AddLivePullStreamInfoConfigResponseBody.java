// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLivePullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLivePullStreamInfoConfigResponseBody self = new AddLivePullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLivePullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
