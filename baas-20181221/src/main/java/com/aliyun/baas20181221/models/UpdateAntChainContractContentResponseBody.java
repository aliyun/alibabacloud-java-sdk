// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>08CBD579-C430-4F1F-9011-C120FA1E9B97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static UpdateAntChainContractContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainContractContentResponseBody self = new UpdateAntChainContractContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainContractContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntChainContractContentResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
