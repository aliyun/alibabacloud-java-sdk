// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ResizeNodeCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeNodeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeNodeCountResponseBody self = new ResizeNodeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeNodeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
