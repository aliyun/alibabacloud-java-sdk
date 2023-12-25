// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionResponseBody self = new UpgradeMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
