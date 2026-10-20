// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the DataStudio workflow.</p>
     * <blockquote>
     * <p>Notice: This field is of the Long type before SDK 8.0.0 and of the String type in SDK 8.0.0 and later. <strong>This change does not affect the normal use of the SDK, and the parameter is still returned based on the type defined in the SDK</strong>. The type change may cause project compilation failures only when you upgrade the SDK across version 8.0.0. In this case, you must manually correct the data type.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>463497880880954XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0EF298E5-0940-5AC7-9CB0-6502507****</p>
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
