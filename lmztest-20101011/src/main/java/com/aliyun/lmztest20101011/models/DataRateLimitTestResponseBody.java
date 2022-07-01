// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DataRateLimitTestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DataRateLimitTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DataRateLimitTestResponseBody self = new DataRateLimitTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DataRateLimitTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
