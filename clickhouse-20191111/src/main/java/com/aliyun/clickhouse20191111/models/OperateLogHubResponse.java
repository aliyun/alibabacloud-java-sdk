// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLogHubResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static OperateLogHubResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateLogHubResponse self = new OperateLogHubResponse();
        return TeaModel.build(map, self);
    }

    public OperateLogHubResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
