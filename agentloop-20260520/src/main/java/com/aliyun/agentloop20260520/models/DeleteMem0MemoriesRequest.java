// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteMem0MemoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <strong>example:</strong>
     * <p>agent-001</p>
     */
    @NameInMap("agent_id")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>app-001</p>
     */
    @NameInMap("app_id")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>cs-0001</p>
     */
    @NameInMap("context_store_id")
    public String contextStoreId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;channel&quot;:&quot;app&quot;,&quot;locale&quot;:&quot;zh-CN&quot;}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>org-001</p>
     */
    @NameInMap("org_id")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>proj-001</p>
     */
    @NameInMap("project_id")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>run-001</p>
     */
    @NameInMap("run_id")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static DeleteMem0MemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMem0MemoriesRequest self = new DeleteMem0MemoriesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMem0MemoriesRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public DeleteMem0MemoriesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeleteMem0MemoriesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMem0MemoriesRequest setContextStoreId(String contextStoreId) {
        this.contextStoreId = contextStoreId;
        return this;
    }
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    public DeleteMem0MemoriesRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public DeleteMem0MemoriesRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DeleteMem0MemoriesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteMem0MemoriesRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public DeleteMem0MemoriesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
