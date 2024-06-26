// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class FreezeAntChainAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static FreezeAntChainAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FreezeAntChainAccountResponseBody self = new FreezeAntChainAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public FreezeAntChainAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FreezeAntChainAccountResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
