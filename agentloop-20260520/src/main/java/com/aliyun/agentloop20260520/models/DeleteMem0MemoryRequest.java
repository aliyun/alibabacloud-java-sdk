// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteMem0MemoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <strong>example:</strong>
     * <p>cs-0001</p>
     */
    @NameInMap("context_store_id")
    public String contextStoreId;

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

    public static DeleteMem0MemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMem0MemoryRequest self = new DeleteMem0MemoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMem0MemoryRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public DeleteMem0MemoryRequest setContextStoreId(String contextStoreId) {
        this.contextStoreId = contextStoreId;
        return this;
    }
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    public DeleteMem0MemoryRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DeleteMem0MemoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
