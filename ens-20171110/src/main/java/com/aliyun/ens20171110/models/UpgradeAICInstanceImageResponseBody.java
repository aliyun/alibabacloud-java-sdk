// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeAICInstanceImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeAICInstanceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAICInstanceImageResponseBody self = new UpgradeAICInstanceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeAICInstanceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
