// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the workflow.</p>
     * <blockquote>
     * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
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
