// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static CreateBlockchainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainResponseBody self = new CreateBlockchainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBlockchainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
