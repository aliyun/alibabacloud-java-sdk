// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiVoiceAgentDetailNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static QueryAiVoiceAgentDetailNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiVoiceAgentDetailNewRequest self = new QueryAiVoiceAgentDetailNewRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiVoiceAgentDetailNewRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryAiVoiceAgentDetailNewRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public QueryAiVoiceAgentDetailNewRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
