// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VodAsyncScanResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VodAsyncScanResultsResponseBody self = new VodAsyncScanResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public VodAsyncScanResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
