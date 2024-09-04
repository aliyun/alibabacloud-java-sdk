// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ImageAsyncManualScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanResponseBody self = new ImageAsyncManualScanResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
