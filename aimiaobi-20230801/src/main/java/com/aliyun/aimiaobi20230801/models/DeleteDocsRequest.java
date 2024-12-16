// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDocsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocIds")
    public java.util.List<String> docIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDocsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocsRequest self = new DeleteDocsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocsRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public DeleteDocsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
