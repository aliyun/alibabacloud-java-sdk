// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VodAsyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VodAsyncScanResponseBody self = new VodAsyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public VodAsyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
