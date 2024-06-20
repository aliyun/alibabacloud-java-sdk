// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class FreezeAntChainAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9F862442-F6AD-4B5F-8969-CE23DE1413CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
