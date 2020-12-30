// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupPlanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanConfigResponseBody self = new ModifyBackupPlanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
