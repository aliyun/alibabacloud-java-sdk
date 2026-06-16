// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateMem0MemoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <strong>example:</strong>
     * <p>{&quot;text&quot;:&quot;用户改成喜欢喝美式&quot;,&quot;metadata&quot;:{&quot;channel&quot;:&quot;app&quot;}}</p>
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

    public static UpdateMem0MemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMem0MemoryRequest self = new UpdateMem0MemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMem0MemoryRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public UpdateMem0MemoryRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public UpdateMem0MemoryRequest setContextStoreId(String contextStoreId) {
        this.contextStoreId = contextStoreId;
        return this;
    }
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    public UpdateMem0MemoryRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdateMem0MemoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
