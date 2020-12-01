// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLorneTaskStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static OperateLorneTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateLorneTaskStatusResponse self = new OperateLorneTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public OperateLorneTaskStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
