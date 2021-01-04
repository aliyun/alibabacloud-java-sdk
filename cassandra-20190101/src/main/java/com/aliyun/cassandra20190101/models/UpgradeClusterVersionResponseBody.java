// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class UpgradeClusterVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeClusterVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterVersionResponseBody self = new UpgradeClusterVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
