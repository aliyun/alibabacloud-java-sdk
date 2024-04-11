// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayFlowRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGatewayFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayFlowRuleResponseBody self = new DeleteGatewayFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayFlowRuleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteGatewayFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
