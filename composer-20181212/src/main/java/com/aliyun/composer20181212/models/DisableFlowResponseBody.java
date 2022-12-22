// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class DisableFlowResponseBody extends TeaModel {
    // The status of the workflow.
    // 
    // *   **Enabled**: The workflow is enabled.
    // *   **Disabled**: The workflow is disabled.
    @NameInMap("FlowStatus")
    public String flowStatus;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the operation was successful.
    // 
    // *   **true**: The operation was successful.
    // *   **false**: The operation failed.
    @NameInMap("Success")
    public Boolean success;

    public static DisableFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowResponseBody self = new DisableFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableFlowResponseBody setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

    public DisableFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
