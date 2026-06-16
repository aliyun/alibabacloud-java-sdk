// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetMem0MemoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <strong>example:</strong>
     * <p>{&quot;filters&quot;:{&quot;AND&quot;:[{&quot;user_id&quot;:&quot;alice&quot;}]}}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <strong>example:</strong>
     * <p>cs-0001</p>
     */
    @NameInMap("context_store_id")
    public String contextStoreId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_graph")
    public Boolean enableGraph;

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

    public static GetMem0MemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMem0MemoriesRequest self = new GetMem0MemoriesRequest();
        return TeaModel.build(map, self);
    }

    public GetMem0MemoriesRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetMem0MemoriesRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public GetMem0MemoriesRequest setContextStoreId(String contextStoreId) {
        this.contextStoreId = contextStoreId;
        return this;
    }
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    public GetMem0MemoriesRequest setEnableGraph(Boolean enableGraph) {
        this.enableGraph = enableGraph;
        return this;
    }
    public Boolean getEnableGraph() {
        return this.enableGraph;
    }

    public GetMem0MemoriesRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetMem0MemoriesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
