// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    @NameInMap("body")
    public UpdateWorkspaceInput body;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setBody(UpdateWorkspaceInput body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceInput getBody() {
        return this.body;
    }

}
