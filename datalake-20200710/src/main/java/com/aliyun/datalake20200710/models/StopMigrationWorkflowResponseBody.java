// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopMigrationWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StopMigrationWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopMigrationWorkflowResponseBody self = new StopMigrationWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public StopMigrationWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopMigrationWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
