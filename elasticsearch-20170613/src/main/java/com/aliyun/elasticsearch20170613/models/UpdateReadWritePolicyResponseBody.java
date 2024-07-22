// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateReadWritePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateReadWritePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReadWritePolicyResponseBody self = new UpdateReadWritePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReadWritePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateReadWritePolicyResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
