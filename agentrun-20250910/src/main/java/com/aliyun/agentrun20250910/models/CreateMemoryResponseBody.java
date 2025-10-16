// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryResponseBody extends TeaModel {
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
     * <p>0FB1162C-D50B-5DA7-AD04-3417ABBF133A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryResponseBody self = new CreateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
