// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorResponseBody extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAggregatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregatorResponseBody self = new UpdateAggregatorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggregatorResponseBody setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
