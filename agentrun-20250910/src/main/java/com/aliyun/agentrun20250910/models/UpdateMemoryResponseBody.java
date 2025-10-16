// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateMemoryResponseBody extends TeaModel {
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
     * <p>C0595DB0-D1EE-55C3-8DDD-790872C7EC2F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryResponseBody self = new UpdateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
