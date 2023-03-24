// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class EnableElasticPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableElasticPlanResponseBody self = new EnableElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
