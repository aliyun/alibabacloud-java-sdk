// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteFactAuditUrlRequest extends TeaModel {
    /**
     * <p>The URL of the audit information source you want to delete. The provided URL must match the result from GetFactAuditUrl for successful deletion.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. Get the <a href="https://help.aliyun.com/document_detail/2782167.html">workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteFactAuditUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFactAuditUrlRequest self = new DeleteFactAuditUrlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFactAuditUrlRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DeleteFactAuditUrlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
