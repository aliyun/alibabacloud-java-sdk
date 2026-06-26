// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteTokenVaultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTokenVaultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTokenVaultResponseBody self = new DeleteTokenVaultResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTokenVaultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
