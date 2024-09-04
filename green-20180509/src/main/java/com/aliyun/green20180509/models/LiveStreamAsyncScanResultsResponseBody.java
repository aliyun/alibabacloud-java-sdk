// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamAsyncScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static LiveStreamAsyncScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamAsyncScanResultsResponseBody self = new LiveStreamAsyncScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public LiveStreamAsyncScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
