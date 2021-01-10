// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ResetServerSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetServerSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetServerSecretResponseBody self = new ResetServerSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetServerSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
