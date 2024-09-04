// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncManualScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VideoAsyncManualScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncManualScanResponseBody self = new VideoAsyncManualScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoAsyncManualScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
