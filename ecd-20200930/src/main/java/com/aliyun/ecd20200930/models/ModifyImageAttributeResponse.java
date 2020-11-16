// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyImageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeResponse self = new ModifyImageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
