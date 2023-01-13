// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceDeploymentResponseBody self = new ModifyInstanceDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
