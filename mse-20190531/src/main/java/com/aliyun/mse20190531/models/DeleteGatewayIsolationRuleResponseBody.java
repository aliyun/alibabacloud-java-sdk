// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGatewayIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIsolationRuleResponseBody self = new DeleteGatewayIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIsolationRuleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteGatewayIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
