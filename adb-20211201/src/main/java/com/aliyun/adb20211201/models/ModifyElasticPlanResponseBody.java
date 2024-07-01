// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
     */
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
