// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteSecurityProxyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityProxyResponseBody self = new DeleteSecurityProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
