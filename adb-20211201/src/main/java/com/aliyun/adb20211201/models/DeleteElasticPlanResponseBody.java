// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteElasticPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticPlanResponseBody self = new DeleteElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
