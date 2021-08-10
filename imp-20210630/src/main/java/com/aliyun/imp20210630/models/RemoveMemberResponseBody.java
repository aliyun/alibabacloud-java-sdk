// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RemoveMemberResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMemberResponseBody self = new RemoveMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
