// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CancelMigrationInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelMigrationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrationInstancesResponseBody self = new CancelMigrationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMigrationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
