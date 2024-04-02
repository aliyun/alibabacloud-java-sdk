// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkWebsiteScanResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MarkWebsiteScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkWebsiteScanResultResponseBody self = new MarkWebsiteScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkWebsiteScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
