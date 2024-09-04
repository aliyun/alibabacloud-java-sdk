// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoSyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VideoSyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoSyncScanResponseBody self = new VideoSyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoSyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
