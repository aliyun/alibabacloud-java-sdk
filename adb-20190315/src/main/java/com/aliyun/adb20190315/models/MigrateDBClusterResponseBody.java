// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class MigrateDBClusterResponseBody extends TeaModel {
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
