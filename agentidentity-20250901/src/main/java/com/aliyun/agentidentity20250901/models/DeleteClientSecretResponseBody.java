// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteClientSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClientSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientSecretResponseBody self = new DeleteClientSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClientSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
