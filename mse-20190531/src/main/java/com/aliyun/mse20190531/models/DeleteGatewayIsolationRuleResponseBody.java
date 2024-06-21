// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayIsolationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>94B12406-E44D-57C9-BF93-A8B35BFF****</p>
     */
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
