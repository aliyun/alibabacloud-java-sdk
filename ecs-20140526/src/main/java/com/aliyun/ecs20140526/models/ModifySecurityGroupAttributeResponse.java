// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySecurityGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupAttributeResponse self = new ModifySecurityGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
