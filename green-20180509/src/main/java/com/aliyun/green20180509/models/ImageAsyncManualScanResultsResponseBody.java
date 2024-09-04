// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ImageAsyncManualScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanResultsResponseBody self = new ImageAsyncManualScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
