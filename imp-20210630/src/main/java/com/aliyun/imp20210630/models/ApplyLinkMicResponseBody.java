// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ApplyLinkMicResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyLinkMicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyLinkMicResponseBody self = new ApplyLinkMicResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyLinkMicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
