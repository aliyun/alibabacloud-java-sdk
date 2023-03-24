// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DisableElasticPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableElasticPlanResponseBody self = new DisableElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
