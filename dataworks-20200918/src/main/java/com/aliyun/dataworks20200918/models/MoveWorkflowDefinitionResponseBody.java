// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class MoveWorkflowDefinitionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MoveWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveWorkflowDefinitionResponseBody self = new MoveWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveWorkflowDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
