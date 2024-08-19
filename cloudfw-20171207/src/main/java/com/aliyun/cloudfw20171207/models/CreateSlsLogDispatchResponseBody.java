// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSlsLogDispatchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6************00090125EEB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSlsLogDispatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsLogDispatchResponseBody self = new CreateSlsLogDispatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlsLogDispatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
