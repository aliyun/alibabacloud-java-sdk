// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <p>The ID of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>463497880880954XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0EF298E5-0940-5AC7-9CB0-65025070XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowDefinitionResponseBody self = new CreateWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowDefinitionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
