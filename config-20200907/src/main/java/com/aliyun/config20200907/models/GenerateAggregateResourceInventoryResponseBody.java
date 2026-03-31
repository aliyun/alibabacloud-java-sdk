// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateResourceInventoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5111CBA6-6485-57EB-BCDD-85D8BB31E7A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAggregateResourceInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateResourceInventoryResponseBody self = new GenerateAggregateResourceInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateResourceInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
