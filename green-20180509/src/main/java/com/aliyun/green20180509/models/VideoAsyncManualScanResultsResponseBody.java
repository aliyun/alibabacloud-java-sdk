// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncManualScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VideoAsyncManualScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncManualScanResultsResponseBody self = new VideoAsyncManualScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoAsyncManualScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
