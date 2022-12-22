// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class DeleteFlowResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the operation was successful. Valid values: **true**: The operation was successful. **false**: The operation failed.
    @NameInMap("Success")
    public Boolean success;

    public static DeleteFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowResponseBody self = new DeleteFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
