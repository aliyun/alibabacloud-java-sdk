// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateScaleStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    public static CreateScaleStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScaleStrategyResponseBody self = new CreateScaleStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScaleStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScaleStrategyResponseBody setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

}
