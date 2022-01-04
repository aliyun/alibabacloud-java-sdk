// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ModifyWorkflowExecuteInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ModifyWorkflowExecuteInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWorkflowExecuteInfoResponseBody self = new ModifyWorkflowExecuteInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWorkflowExecuteInfoResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyWorkflowExecuteInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyWorkflowExecuteInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
