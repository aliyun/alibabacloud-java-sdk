// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentModelAccessConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("consumerIds")
    public java.util.List<String> consumerIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelApiId")
    public String modelApiId;

    public static AgentModelAccessConfig build(java.util.Map<String, ?> map) throws Exception {
        AgentModelAccessConfig self = new AgentModelAccessConfig();
        return TeaModel.build(map, self);
    }

    public AgentModelAccessConfig setConsumerIds(java.util.List<String> consumerIds) {
        this.consumerIds = consumerIds;
        return this;
    }
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
    }

    public AgentModelAccessConfig setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

}
