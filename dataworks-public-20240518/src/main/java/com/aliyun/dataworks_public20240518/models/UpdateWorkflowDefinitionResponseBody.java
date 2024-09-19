// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20BF7E80-668A-5620-8AD8-879B8FEAXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDefinitionResponseBody self = new UpdateWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkflowDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
