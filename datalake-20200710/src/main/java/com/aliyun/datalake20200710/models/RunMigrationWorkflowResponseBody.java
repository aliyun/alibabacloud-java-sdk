// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunMigrationWorkflowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FI-7193B85809CAD95C</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>A048EA8E-3519-5B18-B81E-EE3E0B6DBE0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunMigrationWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMigrationWorkflowResponseBody self = new RunMigrationWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMigrationWorkflowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RunMigrationWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunMigrationWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
