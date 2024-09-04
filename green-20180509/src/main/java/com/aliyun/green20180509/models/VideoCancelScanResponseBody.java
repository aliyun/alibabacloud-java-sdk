// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoCancelScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VideoCancelScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoCancelScanResponseBody self = new VideoCancelScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoCancelScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
