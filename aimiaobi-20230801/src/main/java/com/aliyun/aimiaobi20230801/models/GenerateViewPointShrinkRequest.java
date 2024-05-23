// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateViewPointShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ReferenceData")
    public String referenceDataShrink;

    public static GenerateViewPointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateViewPointShrinkRequest self = new GenerateViewPointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateViewPointShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateViewPointShrinkRequest setReferenceDataShrink(String referenceDataShrink) {
        this.referenceDataShrink = referenceDataShrink;
        return this;
    }
    public String getReferenceDataShrink() {
        return this.referenceDataShrink;
    }

}
