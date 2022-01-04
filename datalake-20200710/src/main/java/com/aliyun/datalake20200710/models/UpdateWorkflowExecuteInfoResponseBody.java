// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkflowExecuteInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static UpdateWorkflowExecuteInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowExecuteInfoResponseBody self = new UpdateWorkflowExecuteInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowExecuteInfoResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateWorkflowExecuteInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkflowExecuteInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
