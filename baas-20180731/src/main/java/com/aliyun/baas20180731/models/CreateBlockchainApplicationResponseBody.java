// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static CreateBlockchainApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainApplicationResponseBody self = new CreateBlockchainApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBlockchainApplicationResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
