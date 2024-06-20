// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9EBD381E-A19E-4875-8771-EDA08A0416D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static UpdateAntChainContractProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainContractProjectResponseBody self = new UpdateAntChainContractProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainContractProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntChainContractProjectResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
