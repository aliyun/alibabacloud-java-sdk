// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigrationPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMigrationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationPlanResponseBody self = new ModifyMigrationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
