// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    @NameInMap("body")
    public CreateWorkspaceInput body;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setBody(CreateWorkspaceInput body) {
        this.body = body;
        return this;
    }
    public CreateWorkspaceInput getBody() {
        return this.body;
    }

}
