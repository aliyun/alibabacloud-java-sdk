// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class MigrateDBClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0983B43-B2EC-536A-8791-142B5CF1E9B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBClusterResponseBody self = new MigrateDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
