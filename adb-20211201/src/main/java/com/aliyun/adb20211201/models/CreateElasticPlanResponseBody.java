// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateElasticPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanResponseBody self = new CreateElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
