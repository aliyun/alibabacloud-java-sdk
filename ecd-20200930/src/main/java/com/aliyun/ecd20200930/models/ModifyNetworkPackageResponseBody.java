// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNetworkPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageResponseBody self = new ModifyNetworkPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
