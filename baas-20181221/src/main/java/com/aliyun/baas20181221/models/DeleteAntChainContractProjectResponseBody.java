// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainContractProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4FAC5F05-FDF0-4599-9522-0120525F0145</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static DeleteAntChainContractProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainContractProjectResponseBody self = new DeleteAntChainContractProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainContractProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAntChainContractProjectResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
