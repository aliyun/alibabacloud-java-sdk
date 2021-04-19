// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLorneTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateLorneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateLorneTaskStatusResponseBody self = new OperateLorneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateLorneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
