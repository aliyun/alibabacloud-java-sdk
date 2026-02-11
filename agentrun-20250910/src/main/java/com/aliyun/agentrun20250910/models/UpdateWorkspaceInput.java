// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceInput extends TeaModel {
    @NameInMap("description")
    public String description;

    public static UpdateWorkspaceInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceInput self = new UpdateWorkspaceInput();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
