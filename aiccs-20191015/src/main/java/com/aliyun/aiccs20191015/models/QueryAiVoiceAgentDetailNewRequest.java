// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiVoiceAgentDetailNewRequest extends TeaModel {
    /**
     * <p>The ID of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234***5678</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The ID of the branch. If you do not specify this parameter, the active branch is used.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The ID of the version. If you do not specify this parameter, the system uses the latest published version for the specified branch. You must specify BranchId when you use this parameter.</p>
     * 
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
