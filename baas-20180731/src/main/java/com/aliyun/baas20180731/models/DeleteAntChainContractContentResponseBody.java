// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteAntChainContractContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DeleteAntChainContractContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainContractContentResponseBody self = new DeleteAntChainContractContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainContractContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAntChainContractContentResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
