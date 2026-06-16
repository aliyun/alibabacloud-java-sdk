// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    /**
     * <p>Complete configuration information required to create a workflow, including the workflow name, definition, and execution role.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateFlowInput body;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setBody(CreateFlowInput body) {
        this.body = body;
        return this;
    }
    public CreateFlowInput getBody() {
        return this.body;
    }

}
