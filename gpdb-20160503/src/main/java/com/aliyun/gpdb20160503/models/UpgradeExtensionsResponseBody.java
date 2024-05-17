// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeExtensionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeExtensionsResponseBody self = new UpgradeExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
