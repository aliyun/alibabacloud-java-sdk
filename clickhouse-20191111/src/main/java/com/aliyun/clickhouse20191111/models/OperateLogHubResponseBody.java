// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLogHubResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateLogHubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateLogHubResponseBody self = new OperateLogHubResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateLogHubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
