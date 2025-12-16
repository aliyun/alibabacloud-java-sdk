// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppImageSecretResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEdgeContainerAppImageSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppImageSecretResponseBody self = new CreateEdgeContainerAppImageSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppImageSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
