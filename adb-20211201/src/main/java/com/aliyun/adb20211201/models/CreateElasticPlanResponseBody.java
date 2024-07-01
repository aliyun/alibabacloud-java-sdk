// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateElasticPlanResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
     */
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
