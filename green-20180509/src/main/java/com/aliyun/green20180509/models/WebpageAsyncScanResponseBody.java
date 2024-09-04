// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WebpageAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebpageAsyncScanResponseBody self = new WebpageAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public WebpageAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
