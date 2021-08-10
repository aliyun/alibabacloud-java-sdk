// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelApplyLinkMicResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CancelApplyLinkMicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelApplyLinkMicResponseBody self = new CancelApplyLinkMicResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelApplyLinkMicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
