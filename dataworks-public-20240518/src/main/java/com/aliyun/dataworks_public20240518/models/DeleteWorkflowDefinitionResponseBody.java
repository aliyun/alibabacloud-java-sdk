// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B17730C0-D959-548A-AE23-E754177CXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowDefinitionResponseBody self = new DeleteWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkflowDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
