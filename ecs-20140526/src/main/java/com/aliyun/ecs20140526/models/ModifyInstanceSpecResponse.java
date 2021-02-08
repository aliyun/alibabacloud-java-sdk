// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecResponse self = new ModifyInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
