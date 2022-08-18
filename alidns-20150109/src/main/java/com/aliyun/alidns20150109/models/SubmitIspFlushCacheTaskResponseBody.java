// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SubmitIspFlushCacheTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitIspFlushCacheTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitIspFlushCacheTaskResponseBody self = new SubmitIspFlushCacheTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitIspFlushCacheTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
