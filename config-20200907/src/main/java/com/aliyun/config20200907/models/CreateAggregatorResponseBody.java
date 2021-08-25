// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static CreateAggregatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregatorResponseBody self = new CreateAggregatorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAggregatorResponseBody setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
