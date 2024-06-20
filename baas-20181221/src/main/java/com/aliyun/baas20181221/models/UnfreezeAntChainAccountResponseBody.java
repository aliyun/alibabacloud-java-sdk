// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UnfreezeAntChainAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6ED983D3-C131-4104-8BDD-1F37992258E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static UnfreezeAntChainAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAntChainAccountResponseBody self = new UnfreezeAntChainAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UnfreezeAntChainAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnfreezeAntChainAccountResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
