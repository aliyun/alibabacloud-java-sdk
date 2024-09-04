// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ImageAsyncScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncScanResultsResponseBody self = new ImageAsyncScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageAsyncScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
