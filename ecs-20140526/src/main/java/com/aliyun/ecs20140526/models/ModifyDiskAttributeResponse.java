// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDiskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskAttributeResponse self = new ModifyDiskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
