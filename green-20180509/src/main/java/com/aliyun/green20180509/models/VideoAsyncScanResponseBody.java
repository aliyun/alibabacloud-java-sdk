// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VideoAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncScanResponseBody self = new VideoAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
