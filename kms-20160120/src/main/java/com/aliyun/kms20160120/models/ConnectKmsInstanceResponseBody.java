// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ConnectKmsInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d3eca5c8-a856-4347-8eb6-e1898c3fda2e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConnectKmsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConnectKmsInstanceResponseBody self = new ConnectKmsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConnectKmsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
