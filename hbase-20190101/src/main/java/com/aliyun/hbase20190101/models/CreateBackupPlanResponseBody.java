// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateBackupPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPlanResponseBody self = new CreateBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
