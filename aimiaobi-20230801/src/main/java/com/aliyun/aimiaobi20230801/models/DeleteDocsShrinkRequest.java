// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDocsShrinkRequest extends TeaModel {
    /**
     * <p>Document ID array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocIds")
    public String docIdsShrink;

    /**
     * <p>Unique identifier for the Alibaba Cloud Model Studio workspace. Get the <a href="https://help.aliyun.com/document_detail/2782167.html">workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDocsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocsShrinkRequest self = new DeleteDocsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocsShrinkRequest setDocIdsShrink(String docIdsShrink) {
        this.docIdsShrink = docIdsShrink;
        return this;
    }
    public String getDocIdsShrink() {
        return this.docIdsShrink;
    }

    public DeleteDocsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
