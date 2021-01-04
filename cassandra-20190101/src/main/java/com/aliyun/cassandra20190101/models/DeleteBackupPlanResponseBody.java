// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteBackupPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPlanResponseBody self = new DeleteBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
