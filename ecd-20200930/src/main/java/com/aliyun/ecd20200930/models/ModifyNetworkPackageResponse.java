// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageResponse self = new ModifyNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
