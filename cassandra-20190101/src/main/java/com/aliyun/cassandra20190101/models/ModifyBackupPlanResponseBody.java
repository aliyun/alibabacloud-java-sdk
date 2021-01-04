// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanResponseBody self = new ModifyBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
