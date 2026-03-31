// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorResponseBody extends TeaModel {
    /**
     * <p>The account group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-dacf86d8314e00eb****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8195B664-9565-4685-89AC-8B5F04B44B92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAggregatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregatorResponseBody self = new CreateAggregatorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregatorResponseBody setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
