// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayFlowRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGatewayFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFlowRuleResponseBody self = new CreateGatewayFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFlowRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateGatewayFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
