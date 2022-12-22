// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class UpdateFlowResponseBody extends TeaModel {
    // The version ID of the workflow after the update.
    @NameInMap("CurrentVersionId")
    public Integer currentVersionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the operation was successful. Valid values:
    // 
    // *   **true**: The operation was successful.
    // *   **false**: The operation failed.
    @NameInMap("Success")
    public Boolean success;

    public static UpdateFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowResponseBody self = new UpdateFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlowResponseBody setCurrentVersionId(Integer currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }
    public Integer getCurrentVersionId() {
        return this.currentVersionId;
    }

    public UpdateFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
