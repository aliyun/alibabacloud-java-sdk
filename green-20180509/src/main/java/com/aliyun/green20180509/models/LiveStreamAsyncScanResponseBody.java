// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static LiveStreamAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamAsyncScanResponseBody self = new LiveStreamAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public LiveStreamAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
