// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetMem0MemoryRequest extends TeaModel {
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

    public static GetMem0MemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMem0MemoryRequest self = new GetMem0MemoryRequest();
        return TeaModel.build(map, self);
    }

    public GetMem0MemoryRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetMem0MemoryRequest setContextStoreId(String contextStoreId) {
        this.contextStoreId = contextStoreId;
        return this;
    }
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    public GetMem0MemoryRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetMem0MemoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
