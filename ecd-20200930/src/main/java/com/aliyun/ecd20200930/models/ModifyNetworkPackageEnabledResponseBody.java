// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageEnabledResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNetworkPackageEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageEnabledResponseBody self = new ModifyNetworkPackageEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
