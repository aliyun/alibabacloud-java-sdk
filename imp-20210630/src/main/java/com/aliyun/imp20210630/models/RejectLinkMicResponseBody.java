// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RejectLinkMicResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static RejectLinkMicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectLinkMicResponseBody self = new RejectLinkMicResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectLinkMicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
