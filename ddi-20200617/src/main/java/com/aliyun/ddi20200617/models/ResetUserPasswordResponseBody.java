// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordResponseBody self = new ResetUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
