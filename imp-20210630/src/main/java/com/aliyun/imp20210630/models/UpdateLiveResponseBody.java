// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveResponseBody self = new UpdateLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
