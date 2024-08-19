// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteSecurityProxyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7447795A-39AB-52CB-8F92-128DF4898F36</p>
     */
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
