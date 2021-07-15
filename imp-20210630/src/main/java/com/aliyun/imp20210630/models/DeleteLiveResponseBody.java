// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveResponseBody self = new DeleteLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
