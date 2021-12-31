// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ResetPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetPasswordResponseBody self = new ResetPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
