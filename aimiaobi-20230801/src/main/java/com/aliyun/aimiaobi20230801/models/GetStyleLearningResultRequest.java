// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetStyleLearningResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetStyleLearningResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStyleLearningResultRequest self = new GetStyleLearningResultRequest();
        return TeaModel.build(map, self);
    }

    public GetStyleLearningResultRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetStyleLearningResultRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
