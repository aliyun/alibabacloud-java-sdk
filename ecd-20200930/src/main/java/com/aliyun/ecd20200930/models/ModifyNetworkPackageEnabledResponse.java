// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageEnabledResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyNetworkPackageEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageEnabledResponse self = new ModifyNetworkPackageEnabledResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageEnabledResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
