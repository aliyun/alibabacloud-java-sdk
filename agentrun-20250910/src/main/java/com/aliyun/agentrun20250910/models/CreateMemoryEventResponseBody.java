// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A8B33FA2-43F2-5E56-9032-51283F08018E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMemoryEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryEventResponseBody self = new CreateMemoryEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMemoryEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
