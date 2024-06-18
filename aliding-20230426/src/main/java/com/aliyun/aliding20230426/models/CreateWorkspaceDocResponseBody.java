// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateWorkspaceDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>QoJGq7xxx</p>
     */
    @NameInMap("docKey")
    public String docKey;

    /**
     * <strong>example:</strong>
     * <p>YRBGv0Ye</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx/workspaceId/docs/nodeId">https://xxx/workspaceId/docs/nodeId</a></p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>YRBGvy</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateWorkspaceDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceDocResponseBody self = new CreateWorkspaceDocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceDocResponseBody setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public CreateWorkspaceDocResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateWorkspaceDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceDocResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateWorkspaceDocResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
