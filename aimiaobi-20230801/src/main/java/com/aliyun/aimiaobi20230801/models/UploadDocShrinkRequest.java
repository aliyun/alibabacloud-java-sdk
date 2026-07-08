// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadDocShrinkRequest extends TeaModel {
    /**
     * <p>Folder where the document resides. If no value is provided, it defaults to &quot;default&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>Document</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Docs")
    public String docsShrink;

    /**
     * <p>Unique identifier (UUID) of the Alibaba Cloud Model Studio workspace: obtain the <a href="https://help.aliyun.com/document_detail/2587495.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-yigtrrjl377rcbab</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadDocShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocShrinkRequest self = new UploadDocShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UploadDocShrinkRequest setDocsShrink(String docsShrink) {
        this.docsShrink = docsShrink;
        return this;
    }
    public String getDocsShrink() {
        return this.docsShrink;
    }

    public UploadDocShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
