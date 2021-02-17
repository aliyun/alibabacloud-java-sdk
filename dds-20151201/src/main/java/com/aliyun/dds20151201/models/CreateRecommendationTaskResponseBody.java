// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateRecommendationTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecommendationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendationTaskResponseBody self = new CreateRecommendationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecommendationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
