// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGatewayIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIsolationRuleResponseBody self = new CreateGatewayIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIsolationRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateGatewayIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
