// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateReadWritePolicyResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateReadWritePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReadWritePolicyResponseBody self = new UpdateReadWritePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReadWritePolicyResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateReadWritePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
