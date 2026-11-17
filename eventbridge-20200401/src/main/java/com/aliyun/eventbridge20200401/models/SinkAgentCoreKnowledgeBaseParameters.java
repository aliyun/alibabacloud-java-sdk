// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkAgentCoreKnowledgeBaseParameters extends TeaModel {
    /**
     * <p>The AgentCore knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-123</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The AgentCore knowledge base role name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kbRole</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The AgentCore workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kws-123</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SinkAgentCoreKnowledgeBaseParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkAgentCoreKnowledgeBaseParameters self = new SinkAgentCoreKnowledgeBaseParameters();
        return TeaModel.build(map, self);
    }

    public SinkAgentCoreKnowledgeBaseParameters setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public SinkAgentCoreKnowledgeBaseParameters setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public SinkAgentCoreKnowledgeBaseParameters setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
