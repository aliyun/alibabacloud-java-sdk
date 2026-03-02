// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindVerificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindVerificationResponseBody self = new UnbindVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
