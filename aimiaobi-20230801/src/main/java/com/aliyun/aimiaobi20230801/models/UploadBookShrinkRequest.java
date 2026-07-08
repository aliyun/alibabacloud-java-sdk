// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadBookShrinkRequest extends TeaModel {
    /**
     * <p>Folder ID</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>Documents</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Docs")
    public String docsShrink;

    /**
     * <p>Unique identifier of your Alibaba Cloud Model Studio workspace. <a href="https://help.aliyun.com/document_detail/2782167.html">Get your workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ipe7d81yq4sl5jmk</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadBookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBookShrinkRequest self = new UploadBookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadBookShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UploadBookShrinkRequest setDocsShrink(String docsShrink) {
        this.docsShrink = docsShrink;
        return this;
    }
    public String getDocsShrink() {
        return this.docsShrink;
    }

    public UploadBookShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
