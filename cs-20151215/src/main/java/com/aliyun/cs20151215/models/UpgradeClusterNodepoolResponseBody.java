// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeClusterNodepoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterNodepoolResponseBody self = new UpgradeClusterNodepoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterNodepoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
