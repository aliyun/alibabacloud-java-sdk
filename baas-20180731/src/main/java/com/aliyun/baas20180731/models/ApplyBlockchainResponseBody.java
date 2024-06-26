// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyBlockchainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ApplyBlockchainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyBlockchainResponseBody self = new ApplyBlockchainResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyBlockchainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyBlockchainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
