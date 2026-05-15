// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiVoiceAgentDetailNewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("BranchId")
    public Long branchId;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("VersionId")
    public Long versionId;

    public static QueryAiVoiceAgentDetailNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiVoiceAgentDetailNewRequest self = new QueryAiVoiceAgentDetailNewRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiVoiceAgentDetailNewRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public QueryAiVoiceAgentDetailNewRequest setBranchId(Long branchId) {
        this.branchId = branchId;
        return this;
    }
    public Long getBranchId() {
        return this.branchId;
    }

    public QueryAiVoiceAgentDetailNewRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
