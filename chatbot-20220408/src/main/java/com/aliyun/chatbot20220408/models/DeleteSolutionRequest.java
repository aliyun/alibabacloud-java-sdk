// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSolutionRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SolutionId")
    public Long solutionId;

    public static DeleteSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionRequest self = new DeleteSolutionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteSolutionRequest setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

}
