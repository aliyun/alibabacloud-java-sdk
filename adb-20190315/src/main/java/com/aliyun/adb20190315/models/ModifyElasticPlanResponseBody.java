// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanResponseBody self = new ModifyElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
