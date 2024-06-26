// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ProcessCloudIDEContractTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ProcessCloudIDEContractTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProcessCloudIDEContractTransactionResponseBody self = new ProcessCloudIDEContractTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public ProcessCloudIDEContractTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProcessCloudIDEContractTransactionResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
