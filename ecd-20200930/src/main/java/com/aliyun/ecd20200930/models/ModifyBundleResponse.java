// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBundleResponse self = new ModifyBundleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBundleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
