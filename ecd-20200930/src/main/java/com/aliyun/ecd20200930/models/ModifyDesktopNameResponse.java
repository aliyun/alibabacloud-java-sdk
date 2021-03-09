// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDesktopNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopNameResponse self = new ModifyDesktopNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
