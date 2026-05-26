// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteClientSecretResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
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
