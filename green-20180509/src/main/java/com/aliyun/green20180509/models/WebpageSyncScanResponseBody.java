// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageSyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WebpageSyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebpageSyncScanResponseBody self = new WebpageSyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public WebpageSyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
