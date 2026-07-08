// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocInfoRequest extends TeaModel {
    /**
     * <p>The category where the document is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The document ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>The unique identifier of the workspace in Alibaba Cloud Model Studio. For instructions on how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDocInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocInfoRequest self = new GetDocInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDocInfoRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public GetDocInfoRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public GetDocInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
