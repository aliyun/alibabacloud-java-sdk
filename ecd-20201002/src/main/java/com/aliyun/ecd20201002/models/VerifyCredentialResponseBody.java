// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class VerifyCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCredentialResponseBody self = new VerifyCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
