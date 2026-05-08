// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
     */
    @NameInMap("contextId")
    public String contextId;

    /**
     * <strong>example:</strong>
     * <p>E5B1D3D4-BB28-5996-8AD2-***********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>deleted</p>
     */
    @NameInMap("status")
    public String status;

    public static DeleteContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextResponseBody self = new DeleteContextResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContextResponseBody setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }
    public String getContextId() {
        return this.contextId;
    }

    public DeleteContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteContextResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
