// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowDefinitionResponseBody self = new CreateWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowDefinitionResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
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
