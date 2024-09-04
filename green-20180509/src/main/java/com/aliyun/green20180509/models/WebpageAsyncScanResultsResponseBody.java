// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageAsyncScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WebpageAsyncScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebpageAsyncScanResultsResponseBody self = new WebpageAsyncScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public WebpageAsyncScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
