// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppCcuResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 自定义会话id
    @NameInMap("Timestamp")
    public String timestamp;

    public static GetAppCcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppCcuResponseBody self = new GetAppCcuResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppCcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppCcuResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
