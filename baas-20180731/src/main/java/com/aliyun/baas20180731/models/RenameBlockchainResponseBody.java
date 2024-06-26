// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class RenameBlockchainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static RenameBlockchainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameBlockchainResponseBody self = new RenameBlockchainResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameBlockchainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenameBlockchainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
