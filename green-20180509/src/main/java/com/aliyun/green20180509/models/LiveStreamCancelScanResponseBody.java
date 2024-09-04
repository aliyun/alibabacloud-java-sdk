// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamCancelScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static LiveStreamCancelScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamCancelScanResponseBody self = new LiveStreamCancelScanResponseBody();
        return TeaModel.build(map, self);
    }

    public LiveStreamCancelScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
