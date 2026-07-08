// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitFactAuditUrlRequest extends TeaModel {
    /**
     * <p>The URL of the information source you want to use for factuality audit. After you add a source URL using this operation, MiaoBi retrieves audit information only from your configured list of URLs. If you do not add any URL, MiaoBi searches the entire web for audit information. You can configure up to 10 source URLs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. To get the workspace ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitFactAuditUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFactAuditUrlRequest self = new SubmitFactAuditUrlRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFactAuditUrlRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitFactAuditUrlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
