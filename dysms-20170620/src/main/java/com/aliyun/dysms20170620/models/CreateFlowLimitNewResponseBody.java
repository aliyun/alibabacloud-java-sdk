// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateFlowLimitNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static CreateFlowLimitNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLimitNewResponseBody self = new CreateFlowLimitNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowLimitNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowLimitNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
