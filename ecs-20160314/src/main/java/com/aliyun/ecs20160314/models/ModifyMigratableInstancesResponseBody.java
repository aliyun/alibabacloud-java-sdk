// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigratableInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMigratableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigratableInstancesResponseBody self = new ModifyMigratableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMigratableInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
