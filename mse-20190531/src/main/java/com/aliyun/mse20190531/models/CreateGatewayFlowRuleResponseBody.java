// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayFlowRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>608</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>72FC625E-9629-591B-9C01-3F0BFDAB****</p>
     */
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
