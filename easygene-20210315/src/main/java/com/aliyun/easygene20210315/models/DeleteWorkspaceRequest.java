// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    public static DeleteWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRequest self = new DeleteWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
