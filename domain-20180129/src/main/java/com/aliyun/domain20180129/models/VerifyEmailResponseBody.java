// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyEmailResponseBody self = new VerifyEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
