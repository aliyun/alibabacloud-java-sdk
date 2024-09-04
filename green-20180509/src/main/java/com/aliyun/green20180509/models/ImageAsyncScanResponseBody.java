// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ImageAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncScanResponseBody self = new ImageAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
