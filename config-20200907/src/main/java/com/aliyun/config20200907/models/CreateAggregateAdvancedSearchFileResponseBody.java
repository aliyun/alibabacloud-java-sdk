// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateAdvancedSearchFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAggregateAdvancedSearchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateAdvancedSearchFileResponseBody self = new CreateAggregateAdvancedSearchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregateAdvancedSearchFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
